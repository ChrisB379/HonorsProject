package view.BaseCase;

/**
 *  This is the second last GUI for the base case series. 
 *  It shows the algorithm used that lets the user work through it
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
import view.BaseCase.AdvanceButtons.CBCAlgorithmButton;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import model.IBaseCase;
import controller.BaseCase.ConvSubmitController;

import javax.swing.JRadioButton;

public class ConvergenceAlgorithm extends JPanel implements Observer, ActionListener {


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
	
	private String RtrnVal;

	private IBaseCase model;

	private ConvSubmitController convController;

	//Used for setting the Text Area with the values of variables
	private List<String> variableString = new ArrayList<String>();
	private String stringN = "n";
	private String space = " ";
	private String equals = "=";
	private String whole = stringN + space + equals + space;
	private String newLine = "\n";

	private CBCAlgorithmButton cbcButton;

	private boolean alreadyExecuted;
	private boolean doOnce;





	/**
	 * Create the panel.
	 */
	public ConvergenceAlgorithm(IBaseCase m, CBCAlgorithmButton but) {
		
		model = m;
		
		cbcButton = but;
		cbcButton.setNotVis();
		
		((Observable) m).addObserver(this);

		convController = new ConvSubmitController(model, this);

		JTextPane txtConvergence = new JTextPane();
		txtConvergence.setBounds(53, 51, 251, 141);
		txtConvergence.setContentType("text/html");
		txtConvergence.setToolTipText("");
		txtConvergence.setBackground(UIManager.getColor("Panel.background"));
		txtConvergence.setEditable(false);
		txtConvergence.setText("<html>\r\n<code>\r\n<font color = rgb(127,0,85)> <b>public int</b> </font> convergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> convergence(n+1) + 2*n;\r\n<br>\t}\r\n</code>\r\n</html>");

		txtVariables = new JTextArea();
		txtVariables.setBounds(454, 51, 98, 256);
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBounds(46, 285, 203, 28);
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The next value of n is :");

		txtNVal = new JTextField();
		txtNVal.setBounds(294, 287, 46, 20);
		txtNVal.setDocument(new JTextFieldLimit(2));
		txtNVal.setColumns(10);
		txtNVal.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				int n = Integer.parseInt(txtNVal.getText());
				setNVal(n);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(53, 584, 127, 37);
		btnSubmit.addActionListener(convController);

		JLabel lblExample = new JLabel("Example 2");
		lblExample.setBounds(484, 11, 136, 14);
		
		txtBaseCase = new JTextField();
		txtBaseCase.setBounds(53, 537, 323, 14);
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to see your results.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setVisible(false);
		
		txtWorking = new JTextArea();
		txtWorking.setBounds(634, 76, 388, 227);
		
		lblInsertWorkingHere = new JLabel("Insert working here:");
		lblInsertWorkingHere.setBounds(751, 51, 187, 14);
		setLayout(null);
		add(lblExample);
		add(txtConvergence);
		add(btnSubmit);
		add(txtBaseCase);
		add(txtrTheValueOf);
		add(txtNVal);
		add(txtVariables);
		add(txtWorking);
		add(lblInsertWorkingHere);
		
		txtNValDescription = new JTextArea();
		txtNValDescription.setEditable(false);
		txtNValDescription.setText("The value of n does not appear to be converging on the base case, what happens next?");
		txtNValDescription.setBounds(46, 332, 875, 20);
		add(txtNValDescription);
		txtNValDescription.setColumns(10);
		
		ButtonGroup btnGroup = new ButtonGroup();
		
		rdbtnOption1 = new JRadioButton("The method returns the value 5 once the base case is met.");
		rdbtnOption1.setBounds(53, 387, 529, 23);
		rdbtnOption1.setVisible(false);
		add(rdbtnOption1);
		
		rdbtnOption2 = new JRadioButton("The method will continue recursing until a stack overflow error halts the program.");
		rdbtnOption2.setBounds(53, 413, 529, 23);
		rdbtnOption2.setVisible(false);
		add(rdbtnOption2);
		
		rdbtnOption3 = new JRadioButton("The method will continue recursing forever with the parameter n increasing each time with no errors.");
		rdbtnOption3.setBounds(53, 439, 685, 23);
		rdbtnOption3.setVisible(false);
		add(rdbtnOption3);
		
		rdbtnOption4 = new JRadioButton("The method will recurse until the value of n is the maximum java allows an integer to be, before an Invalid Number Exception will halt the program.");
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

	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		setParameter(model.getParam());
		System.out.println("rv " + model.getParam());

		if(!doOnce){
		count = model.getParam();
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
		txtNVal.setVisible(false);
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

		if(count > 0)
			variableString.add(whole + count + newLine);

	}
	
	public void addQuestion(){
		txtNValDescription.setVisible(false);
		txtrTheValueOf.setVisible(false);
		txtNVal.setVisible(false);

		txtNValDescription.setVisible(true);
		rdbtnOption1.setVisible(true);
		rdbtnOption2.setVisible(true);
		rdbtnOption3.setVisible(true);
		rdbtnOption4.setVisible(true);
	}

	public boolean questionAnswered(){
		if(rdbtnOption1.isSelected()
				|| rdbtnOption2.isSelected()
				|| rdbtnOption3.isSelected()
				|| rdbtnOption4.isSelected())
			return true;
		else 
			return false;
	}

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
