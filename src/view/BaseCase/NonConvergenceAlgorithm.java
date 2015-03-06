package view.BaseCase;

/**
 *  This is the second last GUI for the base case series. 
 *  It shows the algorithm used and lets the user enter the parameter of the next recursive call.
 *  After a few iterations it gives the user a multiple choice question to answer
 * 
 * @author Christopher Baillie
 * @version 2.0
 * @since 1.0
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;
import view.BaseCase.AdvanceButtons.NCBCAlgorithmButton;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import model.IBaseCase;
import controller.BaseCase.NonConvSubmitController;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class NonConvergenceAlgorithm extends JPanel implements Observer, ActionListener {


	private static final long serialVersionUID = 8043846668298510041L;
	private JTextField txtNVal;
	private JTextField txtBaseCase;
	private JTextArea txtNValDescription;
	private JTextArea txtVariables;
	private JTextArea txtrTheValueOf;
	private JTextArea txtWorking;
	
	private JLabel lblInsertWorkingHere;

	private JButton btnSubmit;
	
	private JRadioButton rdbtnOption1;
	private JRadioButton rdbtnOption2;
	private JRadioButton rdbtnOption3;
	private JRadioButton rdbtnOption4;

	private int parameter;
	private int nVal;
	private int count;
	private int nonConvCount;
	
	private String RtrnVal;

	private IBaseCase model;

	private NonConvSubmitController convController;

	//Used for setting the Text Area with the values of variables
	private List<String> variableString = new ArrayList<String>();
	private String stringN = "n";
	private String space = " ";
	private String equals = "=";
	private String whole = stringN + space + equals + space;
	private String newLine = "\n";

	private NCBCAlgorithmButton cbcButton;

	private boolean alreadyExecuted;
	private boolean doOnce;
	
	private JScrollPane scrollPane;
	private JLabel lblParameterVariable;
	private JTextField txtWhatToDo;



	/**
	 * Create the panel.
	 */
	public NonConvergenceAlgorithm(IBaseCase m, NCBCAlgorithmButton but) {
		setFocusable(false);
		
		model = m;
		
		/*
		 * Sets the button invisible until it is needed
		 */
		cbcButton = but;
		cbcButton.setNotVis();
		
		((Observable) m).addObserver(this);

		convController = new NonConvSubmitController(model, this);

		JTextPane txtConvergence = new JTextPane();
		txtConvergence.setFocusable(false);
		txtConvergence.setBounds(53, 51, 287, 141);
		txtConvergence.setContentType("text/html");
		txtConvergence.setToolTipText("");
		txtConvergence.setBackground(UIManager.getColor("Panel.background"));
		txtConvergence.setEditable(false);
		txtConvergence.setText("<html>\r\n<code>\r\n"
				+ "<font color = rgb(127,0,85)> <b>public int</b> </font> nonConvergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t&nbsp "
				+ "<font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp"
				+ "<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>\t\t&nbsp"
				+ "<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp"
				+ "<font color = rgb(127,0,85)> <b>return</b> </font> nonConvergence(n+1) + 2*n;\r\n<br>\t}\r\n"
				+ "</code>\r\n</html>");

		txtVariables = new JTextArea();
		txtVariables.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtVariables.setFocusable(false);
		txtVariables.setBounds(468, 77, 63, 174);
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtrTheValueOf.setFocusable(false);
		txtrTheValueOf.setBounds(46, 285, 280, 28);
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n after the recursive call is :");
		
		/*
		 * The input field for the parameter value n
		 */
		txtNVal = new JTextField();
		txtNVal.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtNVal.setBounds(353, 286, 46, 20);
		txtNVal.setDocument(new JTextFieldLimit(2));
		txtNVal.setColumns(10);
		txtNVal.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				int n = Integer.parseInt(txtNVal.getText());
				setNVal(n);
				//Resets the input box once the input has been accepted
				txtNVal.setText("");
			}
			
			@Override
			public void focusGained(FocusEvent e) {}
		});
		
		txtBaseCase = new JTextField();
		txtBaseCase.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtBaseCase.setFocusable(false);
		txtBaseCase.setBounds(53, 537, 440, 14);
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to see your results.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setVisible(false);

		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnSubmit.setBounds(53, 584, 127, 35);
		btnSubmit.addActionListener(convController);

		JLabel lblExample = new JLabel("Example 2");
		lblExample.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblExample.setFocusable(false);
		lblExample.setBounds(473, 11, 147, 20);
		
		
		lblInsertWorkingHere = new JLabel("Insert working here:");
		lblInsertWorkingHere.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblInsertWorkingHere.setFocusable(false);
		lblInsertWorkingHere.setBounds(751, 51, 187, 14);
		setLayout(null);
		add(lblExample);
		add(txtConvergence);
		add(btnSubmit);
		add(txtBaseCase);
		add(txtrTheValueOf);
		add(txtNVal);
		add(txtVariables);
		
		/*
		 * A scrollpane for the working area so that the user cant type outwith the bounds of the box and thus
		 * not be able to see what they write
		 */
		scrollPane = new JScrollPane();
		scrollPane.setBounds(634, 76, 388, 227);
		add(scrollPane);
		
		/*
		 * A text field that a user can type into if they want to do any working
		 */
		txtWorking = new JTextArea();
		txtWorking.setFont(new Font("Calibri", Font.PLAIN, 15));
		scrollPane.setViewportView(txtWorking);
		add(lblInsertWorkingHere);
		
		/*
		 * The question presented once the user has finished the first part of the task
		 */
		txtNValDescription = new JTextArea();
		txtNValDescription.setVisible(false);
		txtNValDescription.setBackground(UIManager.getColor("Panel.background"));
		txtNValDescription.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtNValDescription.setFocusable(false);
		txtNValDescription.setEditable(false);
		txtNValDescription.setText("The value of n does not appear to be converging on the base case, what happens next?");
		txtNValDescription.setBounds(46, 332, 875, 20);
		add(txtNValDescription);
		txtNValDescription.setColumns(10);
		
		/*
		 * Radio buttons
		 * These are used for multiple choice questions
		 */
		
		ButtonGroup btnGroup = new ButtonGroup();
		
		rdbtnOption1 = new JRadioButton("The method returns the value 5 once the base case is met.");
		rdbtnOption1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption1.setBounds(53, 387, 529, 23);
		rdbtnOption1.setVisible(false);
		add(rdbtnOption1);
		
		rdbtnOption2 = new JRadioButton("The method will continue recursing until a stack overflow error halts the program.");
		rdbtnOption2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption2.setBounds(53, 413, 529, 23);
		rdbtnOption2.setVisible(false);
		add(rdbtnOption2);
		
		rdbtnOption3 = new JRadioButton("The method will continue recursing forever with the parameter n increasing each time with no errors.");
		rdbtnOption3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption3.setBounds(53, 439, 685, 23);
		rdbtnOption3.setVisible(false);
		add(rdbtnOption3);
		
		rdbtnOption4 = new JRadioButton("The method will recurse until the value of n is the maximum java allows an integer to be, before an Invalid Number Exception will halt the program.");
		rdbtnOption4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption4.setBounds(53, 465, 923, 23);
		rdbtnOption4.setVisible(false);
		add(rdbtnOption4);
		
		rdbtnOption1.addActionListener(this);
		rdbtnOption2.addActionListener(this);
		rdbtnOption3.addActionListener(this);
		rdbtnOption4.addActionListener(this);

		btnGroup.add(rdbtnOption1);
		btnGroup.add(rdbtnOption2);
		btnGroup.add(rdbtnOption3);
		btnGroup.add(rdbtnOption4);
		
		lblParameterVariable = new JLabel("Parameter Value");
		lblParameterVariable.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblParameterVariable.setBounds(449, 51, 117, 14);
		add(lblParameterVariable);
		
		/*
		 * descriptor text field
		 */
		txtWhatToDo = new JTextField();
		txtWhatToDo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtWhatToDo.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtWhatToDo.setEditable(false);
		txtWhatToDo.setText("Please insert what you believe the next value of n is below");
		txtWhatToDo.setBounds(43, 231, 379, 20);
		add(txtWhatToDo);
		txtWhatToDo.setColumns(10);
		
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		setParameter(model.getParam());
		//Only do this once to prevent the counter resetting multiple times
		if(!doOnce){
		count = model.getParam();
		nonConvCount = model.getParam();
		doOnce = true;
		}
		
		txtVariables.setText("n = " + getParameter());

	}

	public void setParameter(int n){
		parameter = n;

	}

	public int getParameter(){
		return parameter;

	}

	/**
	 * Sets the nVal to be the users input
	 * 
	 * @param n the users input for n
	 */
	public void setNVal(int n){
		nVal = n;
	}

	/**
	 * Returns the value of the txtNVal text field to be used by the controller
	 * 
	 * @return the value of the txtNVal text field
	 */
	public int getNVal(){
		return nVal;
	}

	/**
	 * Sets the RtrnVal to be the users input
	 * 
	 * @param n the users input for n
	 */
	public void setRtrnVal(String s){
		RtrnVal = s;
	}

	/**
	 * Returns the value of the txtRtrnVal text field to be used by the controller
	 * 
	 * @return the value of the txtRtrnVal text field
	 */
	public String getRtrnVal(){
		return RtrnVal;
	}


	/**
	 * Decrements the count for an if condition in the controller
	 * 
	 * @since 1.2
	 */
	public void decrementCount(){
		count--;
	}


	/**
	 * Gets the current count to check it against if statements in the controller
	 * These if statements trigger buttons/textfields changing/becoming visible
	 * 
	 * @return count integer which is a counter
	 * @since 1.2
	 */
	public int getCount(){
		return count;
	}
	
	/**
	 * Same as counter however it increments to show how the parameter gets further away from the base case
	 * 
	 * @return nonConvcount integer which is a counter
	 * @since 1.2
	 */
	public int getNonConvCount(){
		return nonConvCount;
	}
	
	/**
	 * Same as counter however it increments to show how the parameter gets further away from the base case
	 * 
	 * @return nonConvcount integer which is a counter
	 * @since 1.2
	 */
	public void setNonConvCount(int n){
		nonConvCount = n;
	}


	/**
	 * This is triggered at the "return statement"
	 * i.e when the final return value has been input by the user
	 * This hides all the other text and text boxes while adding a new one to tell the user what to do
	 * If the text boxes are not hidden, some errors will be thrown if the user were to focus and unfocus the text boxes
	 * 
	 * @since 1.2
	 */
	public void setAfterReturnText(){
		txtBaseCase.setVisible(true);
		txtrTheValueOf.setVisible(false);
		txtNVal.setVisible(false);
		txtWhatToDo.setVisible(false);
		btnSubmit.setVisible(false);
		cbcButton.setVis();
	}

	/**
	 * Sets the value of the text area.
	 * Fills it with the arraylist, replacing "[", "]" and "," with nothing so it looks better
	 * 
	 *@since 1.2 
	 */
	public void setTxtArea(){
		txtVariables.setText(variableString.toString().replace("[", "").replace("]", "").replace(",", ""));
	}


	/**
	 * Adds a string to the arraylist each time it is called.
	 * For one time only, the first line is set at count+1 as its the original parameter and we only want to add this one time
	 * After that, a new string is added each time. The count decrements so acts as the value of n decreasing with each recursive call.
	 * The if statement of count being greater than 0 stops it printing one line too many on the last submit button
	 * 
	 * @since 1.2
	 */
	public void addArrayString(){
		//Sourced idea from http://stackoverflow.com/questions/2665993/is-is-possible-to-make-a-method-execute-only-once
		//Simple boolean check, it starts false and once it has been done once then the boolean sets to true
		//This prevents it ever being used again
		if(!alreadyExecuted) {
			variableString.add(space + whole + (count+1) + newLine);
			alreadyExecuted = true;
		}

		if(count > 0){
			variableString.add(whole + (nonConvCount+1) + newLine);
			nonConvCount++;
		}

	}
	
	/**
	 * Adds the multiple choice question and hides the parameter question
	 */
	public void addQuestion(){
		txtNValDescription.setVisible(false);
		txtrTheValueOf.setVisible(false);
		txtNVal.setVisible(false);
		txtWhatToDo.setVisible(false);

		txtNValDescription.setVisible(true);
		rdbtnOption1.setVisible(true);
		rdbtnOption2.setVisible(true);
		rdbtnOption3.setVisible(true);
		rdbtnOption4.setVisible(true);
	}
	
	/**
	 * Checks the user has selected a radio button as an answer
	 * Returns true if one of the radio buttons are selected
	 * 
	 * Returns false if none are selected
	 * 
	 * @return a boolean true or false
	 */
	public boolean questionAnswered(){
		if(rdbtnOption1.isSelected()
				|| rdbtnOption2.isSelected()
				|| rdbtnOption3.isSelected()
				|| rdbtnOption4.isSelected())
			return true;
		else 
			return false;
	}
	
	/**
	 * Action performed listener for radio buttons
	 * It sets the return value depending on which button the user selected
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(rdbtnOption1.isSelected())
			setRtrnVal("The method returns the value 5 once the base case is met.");
		
		if(rdbtnOption2.isSelected())
			setRtrnVal("The method will continue recursing until a stack overflow error halts the program.");
		
		if(rdbtnOption3.isSelected())
			setRtrnVal("The method will continue recursing forever with the parameter n increasing each time with no errors.");
		
		if(rdbtnOption4.isSelected())
			setRtrnVal("The method will recurse until the value of n is the maximum java allows an integer to be, before an Invalid Number Exception will halt the program.");
		
		
	}
}
