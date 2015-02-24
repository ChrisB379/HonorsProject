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
import view.BaseCase.AdvanceButtons.NBCAlgorithmButton;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import controller.BaseCase.NoBCSubmitController;
import model.IBaseCase;

public class NoBaseCaseAlgorithm extends JPanel implements Observer {

	private static final long serialVersionUID = 2183900996591652759L;
	private JTextField txtNVal;
	private JTextField txtRtrnVal;
	private JTextField txtBaseCase;
	private JTextArea txtVariables;
	private JTextArea txtrTheValueOf;
	private JTextArea txtrTheReturnValue;

	private JButton btnSubmit;

	private int parameter;
	private int nVal,RtrnVal;
	private int count;

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
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");

		txtrTheReturnValue = new JTextArea();
		txtrTheReturnValue.setBackground(UIManager.getColor("Panel.background"));
		txtrTheReturnValue.setWrapStyleWord(true);
		txtrTheReturnValue.setLineWrap(true);
		txtrTheReturnValue.setEditable(false);
		txtrTheReturnValue.setText("The return value is : ");

		txtNVal = new JTextField();
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

		txtRtrnVal = new JTextField();
		txtRtrnVal.setDocument(new JTextFieldLimit(2));
		txtRtrnVal.setColumns(10);
		txtRtrnVal.addActionListener(nbcsController);
		txtRtrnVal.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(txtRtrnVal.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5");
				
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

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(nbcsController);

		JLabel lblExample = new JLabel("Example 1");

		txtBaseCase = new JTextField();
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setVisible(false);

		JTextArea txtWorking = new JTextArea();

		JLabel lblInsertWorkingHere = new JLabel("Insert working here: ");

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(37)
										.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
										.addGap(154)
										.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(498)
												.addComponent(lblExample)))
												.addContainerGap(357, Short.MAX_VALUE))
												.addGroup(groupLayout.createSequentialGroup()
														.addGap(80)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(txtBaseCase, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
																.addGroup(groupLayout.createSequentialGroup()
																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																				.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
																				.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
																				.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
																				.addPreferredGap(ComponentPlacement.RELATED)
																				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
																						.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE)
																						.addComponent(txtNVal, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))))
																						.addPreferredGap(ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
																						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
																										.addComponent(txtWorking, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
																										.addGap(73))
																										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
																												.addComponent(lblInsertWorkingHere)
																												.addGap(210))))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblExample)
						.addGap(20)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
														.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGap(32)
														.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																.addGap(50)
																.addComponent(txtBaseCase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
																.addGroup(groupLayout.createSequentialGroup()
																		.addGap(67)
																		.addComponent(lblInsertWorkingHere)
																		.addGap(18)
																		.addComponent(txtWorking, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)))
																		.addContainerGap(249, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

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
		txtrTheReturnValue.setText("The final return value is ");
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
		txtrTheReturnValue.setVisible(false);
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
			nbcaButton.setVis();
	}
}
