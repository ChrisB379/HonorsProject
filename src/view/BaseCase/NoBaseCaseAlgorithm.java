package view.BaseCase;

/**
 *  This displays the example of the no base case algorithm for the user to work through.
 *  It will be based on the parameter input from the previous GUI.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

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

public class NoBaseCaseAlgorithm extends JPanel implements Observer {

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



	/**
	 * Create the panel.
	 */
	public NoBaseCaseAlgorithm(IBaseCase m, NBCAlgorithmButton but) {

		model = m;

		nbcaButton = but;
		nbcaButton.setNotVis();


		((Observable) m).addObserver(this);

		nbcsController = new NoBCSubmitController(model, this);

		JTextPane txtAlgorithm = new JTextPane();
		txtAlgorithm.setBounds(37, 45, 252, 110);
		txtAlgorithm.setContentType("text/html");
		txtAlgorithm.setText("<html>"
				+ "\r\n<code>"
				+ "\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> noBaseCase(<font color = rgb(127,0,85)><b>int </b> </font> n) {"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> noBaseCase(n-1) + n;"
				+ "\r\n<br>"
				+ "\t}\r\n</code>\r\n"
				+ "</html>");

		txtAlgorithm.setBackground(UIManager.getColor("Panel.background"));
		txtAlgorithm.setEditable(false);

		txtVariables = new JTextArea();
		txtVariables.setBounds(443, 45, 101, 165);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBounds(37, 286, 203, 23);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");

		txtNVal = new JTextField();
		txtNVal.setBounds(243, 288, 46, 20);
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
		btnSubmit.setBounds(37, 596, 137, 35);
		btnSubmit.addActionListener(nbcsController);

		JLabel lblExample = new JLabel("Example 1");
		lblExample.setBounds(498, 11, 49, 14);

		txtBaseCase = new JTextField();
		txtBaseCase.setBounds(37, 546, 322, 14);
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setVisible(false);

		JTextArea txtWorking = new JTextArea();
		txtWorking.setBounds(682, 170, 344, 165);

		JLabel lblInsertWorkingHere = new JLabel("Insert working here: ");
		lblInsertWorkingHere.setBounds(780, 145, 101, 14);
		setLayout(null);
		add(txtAlgorithm);
		add(txtVariables);
		add(lblExample);
		add(txtBaseCase);
		add(txtrTheValueOf);
		add(btnSubmit);
		add(txtNVal);
		add(txtWorking);
		add(lblInsertWorkingHere);

		txtNValDescription = new JTextField();
		txtNValDescription.setEditable(false);
		txtNValDescription.setText("Please insert what you believe the next value of n is");
		txtNValDescription.setBounds(37, 244, 319, 20);
		add(txtNValDescription);
		txtNValDescription.setColumns(10);

		txtQuestion = new JTextArea();
		txtQuestion.setEditable(false);
		txtQuestion.setText("Now that the value of n == 1, what will happen next?");
		txtQuestion.setBounds(37, 330, 492, 20);
		add(txtQuestion);
		txtQuestion.setColumns(10);
		txtQuestion.setVisible(false);

		ButtonGroup btnGroup = new ButtonGroup();

		rdbtnOption1 = new JRadioButton("The method will return and stop recursing.");
		rdbtnOption1.setBounds(34, 384, 366, 23);
		rdbtnOption1.setVisible(false);
		add(rdbtnOption1);

		rdbtnOption2 = new JRadioButton("The method will continue recursing forever with the parameter n decreasing each time with no errors.");
		rdbtnOption2.setBounds(34, 410, 599, 23);
		rdbtnOption2.setVisible(false);
		add(rdbtnOption2);

		rdbtnOption3 = new JRadioButton("The method will continue recursing until a stack overflow error halts the program.");
		rdbtnOption3.setBounds(34, 436, 599, 23);
		rdbtnOption3.setVisible(false);
		add(rdbtnOption3);

		rdbtnOption4 = new JRadioButton("The method will recurse to where n == 0 and the program will crash due to a stack overflow error.");
		rdbtnOption4.setBounds(34, 462, 599, 23);
		rdbtnOption4.setVisible(false);
		add(rdbtnOption4);

		rdbtnOption5 = new JRadioButton("The method will recurse until the value of n is negative and an Invalid Number Exception will halt the program.");
		rdbtnOption5.setBounds(34, 488, 599, 23);
		rdbtnOption5.setVisible(false);
		add(rdbtnOption5);

		btnGroup.add(rdbtnOption1);
		btnGroup.add(rdbtnOption2);
		btnGroup.add(rdbtnOption3);
		btnGroup.add(rdbtnOption4);
		btnGroup.add(rdbtnOption5);

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
}
