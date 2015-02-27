package view.ReturnValue;

/**
 *  Displays the factorial algorithm as the example the user can work through for the
 *  return value examples section.
 *  This is based on the parameter entered from the previous GUi screen.
 * 
 * @author Christopher Baillie
 * @version 1.2
 * @since 1.0
 */

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;
import view.ReturnValue.AdvanceButtons.AlgorithmButton;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import controller.ReturnValue.RVSubmitController;
import model.IReturnValue;

public class ReturnValueAlgorithm extends JPanel implements Observer {


	private static final long serialVersionUID = -6312065891931236710L;
	private JTextField txtNVal;
	private JTextField txtRtrnVal;
	private JTextArea txtrTheValueOf;
	private JTextArea txtrTheCurrent;
	
	private JButton btnSubmit;

	private int parameter;
	private int nVal,RtrnVal;
	private int count;

	private IReturnValue model;

//	private RVAlgorithmController rvac;
	private RVSubmitController rvsC;
	private JTextField txtBaseCase;
	private JTextArea textArea;
	
	//Used for setting the Text Area with the values of variables
	private List<String> variableString = new ArrayList<String>();
	private String stringN = "n";
	private String space = " ";
	private String equals = "=";
	private String whole = stringN + space + equals + space;
	private String newLine = "\n";
	boolean alreadyExecuted;
	
	private AlgorithmButton aBut;
	private JTextArea txtWorking;
	
	private boolean doOnce;

	/**
	 * Create the panel.
	 */
	public ReturnValueAlgorithm(IReturnValue r,AlgorithmButton ab) {

		model = r;
		
		//Setting the advance button not visible until the example is complete. Stops the user from advancing accidently
		aBut = ab;
		aBut.setNotVis();
		
		//this is causing a null pointer exception
		((Observable) r).addObserver(this);

//		rvac = new RVAlgorithmController(model, this);
		rvsC = new RVSubmitController(model, this);

		setBorder(null);
		//blue rgb value (0,0,192)
		//purple rgb value (127,0,85)

		JTextPane txtFactorial = new JTextPane();
		txtFactorial.setFocusable(false);
		txtFactorial.setBounds(60, 54, 272, 97);
		txtFactorial.setContentType("text/html");
		txtFactorial.setBorder(BorderFactory.createLineBorder(Color.black));
		txtFactorial.setBackground(Color.WHITE);
		txtFactorial.setText("<html> <code> <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   <br> <font color = rgb(127,0,85)><b>if</b></font> (n == 1) <br>&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br> <font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1); <br>} </code> </html>");
		txtFactorial.setEditable(false);

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setFocusable(false);
		txtrTheValueOf.setBounds(70, 352, 176, 30);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");

		txtNVal = new JTextField();
		txtNVal.setBounds(359, 354, 42, 20);
		//Setting a limit on how many digits can be entered.7 should suffice for this question as 10! = 3628800
		txtNVal.setDocument(new JTextFieldLimit(7));
		txtNVal.setColumns(10);
		txtNVal.setDocument(new JTextFieldLimit(2));
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
		btnSubmit.setBounds(60, 536, 127, 35);
		btnSubmit.addActionListener(rvsC);

			
		txtrTheCurrent = new JTextArea();
		txtrTheCurrent.setFocusable(false);
		txtrTheCurrent.setBounds(70, 422, 251, 22);
		txtrTheCurrent.setBackground(UIManager.getColor("Panel.background"));
		txtrTheCurrent.setWrapStyleWord(true);
		txtrTheCurrent.setLineWrap(true);
		txtrTheCurrent.setEditable(false);
		txtrTheCurrent.setText("The current return value is :");

		txtRtrnVal = new JTextField();
		txtRtrnVal.setBounds(358, 424, 43, 20);
		//Setting a limit on how many digits can be entered.7 should suffice for this question as 10! = 3628800
		txtRtrnVal.setDocument(new JTextFieldLimit(7));
		txtRtrnVal.setColumns(10);
		txtRtrnVal.setDocument(new JTextFieldLimit(2));
		txtRtrnVal.addActionListener(rvsC);
		txtRtrnVal.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(txtRtrnVal.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");
				
				if(!(txtRtrnVal.getText().equals(""))){
				int n = Integer.parseInt(txtRtrnVal.getText());
				
				setRtrnVal(n);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		JLabel lblExample = new JLabel("Example 1");
		lblExample.setFocusable(false);
		lblExample.setBounds(392, 11, 81, 14);
		
		txtBaseCase = new JTextField();
		txtBaseCase.setFocusable(false);
		txtBaseCase.setBounds(70, 481, 309, 14);
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setVisible(false);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		textArea = new JTextArea();
		textArea.setFocusable(false);
		textArea.setBounds(441, 54, 73, 180);
		textArea.setEditable(false);
		
		txtWorking = new JTextArea();
		txtWorking.setBounds(523, 339, 331, 184);
		
		
		JLabel lblInsertWorkingHere = new JLabel("Insert working here:");
		lblInsertWorkingHere.setFocusable(false);
		lblInsertWorkingHere.setBounds(640, 307, 141, 14);
		setLayout(null);
		add(txtFactorial);
		add(textArea);
		add(txtBaseCase);
		add(txtrTheValueOf);
		add(txtNVal);
		add(txtrTheCurrent);
		add(txtRtrnVal);
		add(txtWorking);
		add(btnSubmit);
		add(lblExample);
		add(lblInsertWorkingHere);

	}



	@Override
	public void update(Observable o, Object arg) {
		setParameter(model.getParam());
		System.out.println("rv " + model.getParam());
		//A count for the submit button to keep track of how many recursive calls there has been
		if(!doOnce){
		count = model.getParam();
		doOnce = true;
		}
		
		textArea.setText("n = " + getParameter());
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
	public void setRtrnVal(int n){
		RtrnVal = n;
	}
	
	/**
	 * Returns the value of the txtRtrnVal text field to be used by the controller
	 * 
	 * @return the value of the txtRtrnVal text field
	 */
	public int getRtrnVal(){
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
	 * Changes the value of the descriptor field for txtRtrnValue to indicate that this entry will be what the user
	 * thinks the final return value is and what their final answer will be
	 * 
	 * @since 1.2
	 */
	public void setTextField(){
		txtrTheCurrent.setText("The final return value is ");
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
		txtrTheCurrent.setVisible(false);
		txtNVal.setVisible(false);
		txtRtrnVal.setVisible(false);
		btnSubmit.setVisible(false);
	}
	
	/**
	 * Sets the value of the text area.
	 * Fills it with the arraylist, replacing "[", "]" and "," with nothing so it looks better
	 * 
	 *@since 1.2 
	 */
	public void setTxtArea(){
		textArea.setText(variableString.toString().replace("[", "").replace("]", "").replace(",", ""));
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
		
		if(count == 0)
			aBut.setVis();
	}
}
