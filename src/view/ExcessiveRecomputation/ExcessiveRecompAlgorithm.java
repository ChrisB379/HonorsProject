package view.ExcessiveRecomputation;

/**
 * This is fourth GUI to excessive recomputation and will show the fibonacci algorithm.
 * The user will be able to work through it based on their parameter input from the previous screen.
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

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;
import view.ExcessiveRecomputation.AdvanceButtons.ERAlgorithmButton;

import javax.swing.JTextPane;

import controller.ExcessiveRecomputation.ERSubmitController;
import model.IExcessiveRecomp;
import javax.swing.JLabel;

public class ExcessiveRecompAlgorithm extends JPanel implements Observer {

	private static final long serialVersionUID = 7616226097911941809L;
	
	private JTextField txtRtrnVal;
	private JTextField txtNval;
	private JTextField txtBaseCase;
	private JTextArea txtrTheValueOf;
	private JTextArea txtrTheCurrent;
	private JTextArea txtVariables;
	
	private JButton btnSubmit;
	
	private int parameter;
	private int nVal,RtrnVal;
	private int count;
	
	private IExcessiveRecomp model;
	private ERAlgorithmButton aBut;
	private ERSubmitController ersc;

	//Used for setting the Text Area with the values of variables
	private List<String> variableString = new ArrayList<String>();
	private String stringN = "n";
	private String space = " ";
	private String equals = "=";
	private String whole = stringN + space + equals + space;
	private String newLine = "\n";
	
	boolean alreadyExecuted,doOnce;
	private JTextArea textArea;
	private JLabel lblInsertWorkingHere;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompAlgorithm(IExcessiveRecomp m, ERAlgorithmButton ab) {
		
		model = m;
		
		aBut = ab;
		aBut.setNotVis();
		

		((Observable) m).addObserver(this);
		
		ersc = new ERSubmitController(model,this);
		

		JTextPane txtFibonacci = new JTextPane();
		txtFibonacci.setContentType("text/html");
		txtFibonacci.setText("<html>"
				+ "\r\n<code>"
				+ "\r\n<font color = rgb(127,0,85)> <b>public int</b> </font> fib(<font color = rgb(127,0,85)> <b>int </b> </font>n) {"
				+ "\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>"
				+ "\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b> </font> (n == 0 || n == 1)"
				+ "\r\n<br>\t\t  &nbsp&nbsp &nbsp&nbsp <font color = rgb(127,0,85)> <b>return </b> </font>1;"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>else</b> </font>"
				+ "\r\n<br>\t\t &nbsp&nbsp&nbsp&nbsp<font color = rgb(63,127,95)> //Recursive call</font>"
				+ "\r\n<br>\t\t   &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b> </font> fib(n-1) + fib(n-2);"
				+ "\r\n<br>\t}"
				+ "\r\n<br></code>"
				+ "\r\n</html>");

		txtFibonacci.setBackground(UIManager.getColor("Panel.background"));
		txtFibonacci.setEditable(false);

		txtVariables = new JTextArea();
		txtVariables.setText("insert variables here");
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setEditable(false);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");

		txtrTheCurrent = new JTextArea();
		txtrTheCurrent.setBackground(UIManager.getColor("Panel.background"));
		txtrTheCurrent.setEditable(false);
		txtrTheCurrent.setLineWrap(true);
		txtrTheCurrent.setWrapStyleWord(true);
		txtrTheCurrent.setText("The current return value is :");

		txtRtrnVal = new JTextField();
		//A limit of 2 should be enough as the 10th fibonacci number is 89 
		txtRtrnVal.setDocument(new JTextFieldLimit(2));
		txtRtrnVal.setColumns(10);
		txtRtrnVal.addActionListener(ersc);
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

		txtNval = new JTextField();
		//A limit of 2 should be enough as the 10th fibonacci number is 89 
		txtNval.setDocument(new JTextFieldLimit(2));
		txtNval.setColumns(10);
		txtNval.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				int n = Integer.parseInt(txtNval.getText());
				setNVal(n);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(ersc);
		
		txtBaseCase = new JTextField();
		txtBaseCase.setEditable(false);
		txtBaseCase.setColumns(10);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setVisible(false);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		textArea = new JTextArea();
		
		lblInsertWorkingHere = new JLabel("Insert Working here");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrTheCurrent, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFibonacci, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(154)
									.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE)
										.addComponent(txtNval, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBaseCase, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(90, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(648, Short.MAX_VALUE)
					.addComponent(lblInsertWorkingHere, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addGap(203))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtFibonacci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNval, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrTheCurrent, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addComponent(txtBaseCase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(212))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblInsertWorkingHere)
							.addGap(14)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		setLayout(groupLayout);

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
		txtNval.setVisible(false);
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
		
		if(count == 0)
			aBut.setVis();
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
		
		txtVariables.setText("n = " + getParameter());
		
	}

}
