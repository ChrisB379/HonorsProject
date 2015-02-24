package view.BaseCase;

/**
 *  This is the second last GUI for the base case series. 
 *  It shows the algorithm used that lets the user work through it
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

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;
import view.BaseCase.AdvanceButtons.CBCAlgorithmButton;
import view.BaseCase.AdvanceButtons.NBCAlgorithmButton;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import model.IBaseCase;
import controller.BaseCase.ConvSubmitController;
import controller.BaseCase.NoBCSubmitController;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ConvergenceAlgorithm extends JPanel implements Observer {


	private static final long serialVersionUID = 8043846668298510041L;
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
	private JTextArea txtWorking;
	private JLabel lblInsertWorkingHere;


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
		txtConvergence.setContentType("text/html");
		txtConvergence.setToolTipText("");
		txtConvergence.setBackground(UIManager.getColor("Panel.background"));
		txtConvergence.setEditable(false);
		txtConvergence.setText("<html>\r\n<code>\r\n<font color = rgb(127,0,85)> <b>public int</b> </font> convergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> convergence(n+1) + 2*n;\r\n<br>\t}\r\n</code>\r\n</html>");

		txtVariables = new JTextArea();
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");

		txtrTheReturnValue = new JTextArea();
		txtrTheReturnValue.setBackground(UIManager.getColor("Panel.background"));
		txtrTheReturnValue.setWrapStyleWord(true);
		txtrTheReturnValue.setLineWrap(true);
		txtrTheReturnValue.setEditable(false);
		txtrTheReturnValue.setText("The return value is :");

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
		txtRtrnVal.addActionListener(convController);
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
		btnSubmit.addActionListener(convController);

		JLabel lblExample = new JLabel("Example 2");
		
		txtBaseCase = new JTextField();
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setVisible(false);
		
		txtWorking = new JTextArea();
		
		lblInsertWorkingHere = new JLabel("Insert working here:");
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(484)
							.addComponent(lblExample))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(53)
									.addComponent(txtConvergence, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(90)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtBaseCase, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE))
											.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
												.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
												.addGap(31)
												.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(117)
									.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
									.addComponent(txtWorking, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addContainerGap(71, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(810, Short.MAX_VALUE)
					.addComponent(lblInsertWorkingHere)
					.addGap(212))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblExample)
							.addGap(26)
							.addComponent(txtConvergence, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(59)
							.addComponent(txtBaseCase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(284, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblInsertWorkingHere)
							.addGap(18)
							.addComponent(txtWorking, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
							.addGap(160))))
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
			cbcButton.setVis();
	}

}
