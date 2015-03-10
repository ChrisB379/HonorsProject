package view.BaseCase;

/**
 *  This displays the example of the no base case algorithm for the user to work through.
 *  It will be based on the parameter input from the previous GUI.
 * 
 * @author Christopher Baillie
 * @version 1.0
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
import view.BaseCase.AdvanceButtons.NBCAlgorithmButton;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import controller.BaseCase.NoBCSubmitController;
import model.IBaseCase;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Color;

public class NoBaseCaseAlgorithm extends JPanel implements Observer, ActionListener {

	private static final long serialVersionUID = 2183900996591652759L;
	private JTextField txtNVal;
	private JTextField txtBaseCase;
	private JTextArea txtVariables;
	private JTextArea txtrTheValueOf;

	private JButton btnSubmit;

	private int parameter;
	private int nVal;
	private int count;
	
	private String RtrnVal;

	private IBaseCase model;

	private NoBCSubmitController nbcsController;

	//Used for setting the Text Area with the values of variables
	private List<String> variableString = new ArrayList<String>();
	private String stringN = "n";
	private String space = " ";
	private String equals = "=";
	private String whole = stringN + space + equals + space;
	private String newLine = "\n";

	private NBCAlgorithmButton nbcaButton;

	private boolean alreadyExecuted;
	private boolean doOnce;
	private JTextField txtNValDescription;
	private JTextArea txtQuestion;
	
	private JRadioButton rdbtnOption1;
	private JRadioButton rdbtnOption2;
	private JRadioButton rdbtnOption3;
	private JRadioButton rdbtnOption4;
	private JRadioButton rdbtnOption5;
	private JScrollPane scrollPane;
	private JLabel lblParameterValue;



	/**
	 * Create the panel.
	 */
	public NoBaseCaseAlgorithm(IBaseCase m, NBCAlgorithmButton but) {
		setOpaque(false);
		setFocusable(false);

		model = m;

		nbcaButton = but;
		nbcaButton.setNotVis();


		((Observable) m).addObserver(this);

		nbcsController = new NoBCSubmitController(model, this);

		JTextPane txtNoBaseCase = new JTextPane();
		txtNoBaseCase.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtNoBaseCase.setFocusable(false);
		txtNoBaseCase.setBounds(37, 45, 252, 110);
		txtNoBaseCase.setContentType("text/html");
		txtNoBaseCase.setText("<html>"
				+ "\r\n<code>"
				+ "\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> noBaseCase(<font color = rgb(127,0,85)><b>int </b> </font> n) {"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> noBaseCase(n-1) + n;"
				+ "\r\n<br>"
				+ "\t}\r\n</code>\r\n"
				+ "</html>");

		txtNoBaseCase.setBackground(Color.WHITE);
		txtNoBaseCase.setEditable(false);
		
		/*
		 * Two descriptor text areas
		 */
		txtVariables = new JTextArea();
		txtVariables.setOpaque(false);
		txtVariables.setFocusable(false);
		txtVariables.setBounds(460, 81, 66, 165);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setOpaque(false);
		txtrTheValueOf.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtrTheValueOf.setFocusable(false);
		txtrTheValueOf.setBounds(37, 286, 266, 23);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n after the recursive call is :");
		
		/*
		 * The input field for the parameter
		 */
		txtNVal = new JTextField();
		txtNVal.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtNVal.setBounds(313, 288, 46, 20);
		txtNVal.setDocument(new JTextFieldLimit(2));
		txtNVal.setColumns(10);
		txtNVal.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				int n = Integer.parseInt(txtNVal.getText());
				setNVal(n);
				txtNVal.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {}
		});

		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnSubmit.setBounds(37, 596, 127, 35);
		btnSubmit.addActionListener(nbcsController);

		JLabel lblExample = new JLabel("Example 1");
		lblExample.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblExample.setFocusable(false);
		lblExample.setBounds(489, 11, 118, 23);

		txtBaseCase = new JTextField();
		txtBaseCase.setOpaque(false);
		txtBaseCase.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtBaseCase.setFocusable(false);
		txtBaseCase.setBounds(37, 546, 377, 14);
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setVisible(false);

		JLabel lblInsertWorkingHere = new JLabel("Insert working here: ");
		lblInsertWorkingHere.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblInsertWorkingHere.setFocusable(false);
		lblInsertWorkingHere.setBounds(780, 145, 177, 14);
		setLayout(null);
		add(txtNoBaseCase);
		add(txtVariables);
		add(lblExample);
		add(txtBaseCase);
		add(txtrTheValueOf);
		add(btnSubmit);
		add(txtNVal);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(682, 170, 344, 165);
		add(scrollPane);
		
				JTextArea txtWorking = new JTextArea();
				txtWorking.setFont(new Font("Calibri", Font.PLAIN, 15));
				scrollPane.setViewportView(txtWorking);
		add(lblInsertWorkingHere);

		/*
		 * Descriptor for the first question
		 */
		txtNValDescription = new JTextField();
		txtNValDescription.setOpaque(false);
		txtNValDescription.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtNValDescription.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtNValDescription.setFocusable(false);
		txtNValDescription.setEditable(false);
		txtNValDescription.setText("Please insert what you believe the next value of n is");
		txtNValDescription.setBounds(37, 244, 377, 20);
		add(txtNValDescription);
		txtNValDescription.setColumns(10);

		/*
		 * Descriptor for the multiple choice question
		 */
		txtQuestion = new JTextArea();
		txtQuestion.setOpaque(false);
		txtQuestion.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion.setBackground(UIManager.getColor("Panel.background"));
		txtQuestion.setFocusable(false);
		txtQuestion.setEditable(false);
		txtQuestion.setText("The value of n should now be n == 1, what will happen next?");
		txtQuestion.setBounds(37, 330, 492, 20);
		add(txtQuestion);
		txtQuestion.setColumns(10);
		txtQuestion.setVisible(false);
		
		/*
		 * Radio buttons for multiple choice questions
		 */

		ButtonGroup btnGroup = new ButtonGroup();

		rdbtnOption1 = new JRadioButton("The method will return and stop recursing.");
		rdbtnOption1.setOpaque(false);
		rdbtnOption1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption1.setBounds(34, 384, 366, 23);
		rdbtnOption1.setVisible(false);
		add(rdbtnOption1);

		rdbtnOption2 = new JRadioButton("The method will continue recursing forever with the parameter n decreasing each time with no errors.");
		rdbtnOption2.setOpaque(false);
		rdbtnOption2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption2.setBounds(34, 410, 737, 23);
		rdbtnOption2.setVisible(false);
		add(rdbtnOption2);

		rdbtnOption3 = new JRadioButton("The method will continue recursing until a stack overflow error halts the program.");
		rdbtnOption3.setOpaque(false);
		rdbtnOption3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption3.setBounds(34, 436, 599, 23);
		rdbtnOption3.setVisible(false);
		add(rdbtnOption3);

		rdbtnOption4 = new JRadioButton("The method will recurse to where n == 0 and the program will crash due to a stack overflow error.");
		rdbtnOption4.setOpaque(false);
		rdbtnOption4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption4.setBounds(34, 462, 737, 23);
		rdbtnOption4.setVisible(false);
		add(rdbtnOption4);

		rdbtnOption5 = new JRadioButton("The method will recurse until the value of n is negative and an Invalid Number Exception will halt the program.");
		rdbtnOption5.setOpaque(false);
		rdbtnOption5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		rdbtnOption5.setBounds(34, 488, 737, 23);
		rdbtnOption5.setVisible(false);
		add(rdbtnOption5);
		
		rdbtnOption1.addActionListener(this);
		rdbtnOption2.addActionListener(this);
		rdbtnOption3.addActionListener(this);
		rdbtnOption4.addActionListener(this);
		rdbtnOption5.addActionListener(this);

		btnGroup.add(rdbtnOption1);
		btnGroup.add(rdbtnOption2);
		btnGroup.add(rdbtnOption3);
		btnGroup.add(rdbtnOption4);
		btnGroup.add(rdbtnOption5);
		
		lblParameterValue = new JLabel("Current n Value");
		lblParameterValue.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblParameterValue.setBounds(449, 57, 118, 14);
		add(lblParameterValue);


	}

	@Override
	public void update(Observable arg0, Object arg1) {
		setParameter(model.getParam());

		if(!doOnce){
			count = model.getParam();
			doOnce = true;
		}

		txtVariables.setText("n = " + getParameter());

	}
	
	/**
	 * Sets the users parameter
	 * 
	 * @param n integer parameter set in NoBaseCaseExample
	 */
	public void setParameter(int n){
		parameter = n;

	}
	
	/**
	 * Gets the users parameter
	 * 
	 * @return the integer parameter
	 */
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
	 * Sets the RtrnVal to be the String of the button the user selected
	 * 
	 * @param s  the String of the button the user selected
	 */
	public void setRtrnVal(String s){
		RtrnVal = s;
	}

	/**
	 * Returns the String of the button the user selected to be used by the controller
	 * 
	 * @return the String of the button the user selected
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
	 * @since 1.2
	 */
	public int getCount(){
		return count;
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
		txtNValDescription.setVisible(false);
		txtNVal.setVisible(false);
		btnSubmit.setVisible(false);
		nbcaButton.setVis();
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
	 * The if statement of count being greater than 0 stops it printing one line too many on the last sibmit button
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

		if(count > 0)
			variableString.add(whole + count + newLine);

	}
	
	/**
	 * Makes the radio buttons visible for the multiple choice question
	 * Hides the first questions of asking for the next value of the parameter
	 */
	public void addQuestion(){
		txtNValDescription.setVisible(false);
		txtrTheValueOf.setVisible(false);
		txtNVal.setVisible(false);

		txtQuestion.setVisible(true);
		rdbtnOption1.setVisible(true);
		rdbtnOption2.setVisible(true);
		rdbtnOption3.setVisible(true);
		rdbtnOption4.setVisible(true);
		rdbtnOption5.setVisible(true);
	}
	
	/**
	 * Checks if the question has been answered
	 * 
	 * Returns true if atleast one button is selected
	 * 
	 * Returns false if no radio buttons are selected
	 * 
	 * @return true or false
	 */
	public boolean questionAnswered(){
		if(rdbtnOption1.isSelected()
				|| rdbtnOption2.isSelected()
				|| rdbtnOption3.isSelected()
				|| rdbtnOption4.isSelected()
				|| rdbtnOption5.isSelected())
			return true;
		else 
			return false;
	}

	/**
	 * Listener for the radio buttons
	 * 
	 * Sets the return value based on which radio button was chosen
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(rdbtnOption1.isSelected())
			setRtrnVal("The method will return and stop recursing.");
		
		if(rdbtnOption2.isSelected())
			setRtrnVal("The method will continue recursing forever with the parameter n decreasing each time with no errors.");
		
		if(rdbtnOption3.isSelected())
			setRtrnVal("The method will continue recursing until a stack overflow error halts the program.");
		
		if(rdbtnOption4.isSelected())
			setRtrnVal("The method will recurse to where n == 0 and the program will crash due to a stack overflow error.");
		
		if(rdbtnOption5.isSelected())
			setRtrnVal("The method will recurse until the value of n is negative and an Invalid Number Exception will halt the program.");
		
	}
}
