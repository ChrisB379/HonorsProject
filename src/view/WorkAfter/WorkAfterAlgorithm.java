package view.WorkAfter;

/**
 * Showing the algorithm used for work after examples section which the user will work through.
 * This is based on the parameter entered from the previous GUI screen.
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;
import view.WorkAfter.AdvanceButtons.WAAlgorithmButton;

import javax.swing.JTextPane;

import controller.WorkAfter.WASubmitController;
import model.IWorkAfter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JRadioButton;

public class WorkAfterAlgorithm extends JPanel implements Observer,ActionListener {


	private static final long serialVersionUID = -1965751494479483614L;
	private JTextField txtNval;
	private JTextField txtRtrnVal;
	private JTextField txtBaseCase;
	private JTextArea txtrTheValueOf;
	private JTextArea txtrTheCurrent;
	private JTextArea txtVariables;
	
	private JRadioButton rdbtnOption1;
	private JRadioButton rdbtnOption2;
	private JRadioButton rdbtnOption3;
	private JRadioButton rdbtnOption4;
	
	private JButton btnSubmit;
	
	private IWorkAfter model;
	
	private WASubmitController wasc;
	
	private int parameter;
	private int nVal,RtrnVal;
	private int count;
	
	//Used for setting the Text Area with the values of variables
	private List<String> variableString = new ArrayList<String>();
	private String stringN = "n";
	private String space = " ";
	private String equals = "=";
	private String whole = stringN + space + equals + space;
	private String newLine = "\n";
	boolean alreadyExecuted;
	
	private WAAlgorithmButton aBut;
	
	private boolean doOnce;

	/**
	 * Create the panel.
	 */
	public WorkAfterAlgorithm(IWorkAfter m, WAAlgorithmButton ab) {
		
		model = m;
		
		aBut = ab;
		aBut.setNotVis();
		
		((Observable) m).addObserver(this);
		
		wasc = new WASubmitController(model,this);

		JLabel lblExample = new JLabel("Example");
		lblExample.setBounds(374, 11, 78, 14);

		JTextPane txtAlgorithm = new JTextPane();
		txtAlgorithm.setBounds(25, 58, 412, 268);
		txtAlgorithm.setContentType("text/html");
		txtAlgorithm.setText("<html>"
				+ "\r\n<code> \r\n"
				+ "<br>\t<font color = rgb(127,0,85)><b>public void</b></font> workAfterNew(<font color = rgb(127,0,85)><b>int</b> </font> n){"
				+ "\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)"
				+ "\r\n<br>\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>Base case statement</font> \" + n);"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>else</b> </font>"
				+ "\r\n<br>\t\t\t&nbsp&nbsp workAfterNew(n-1);"
				+ "\r\n<br>\t\t\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>After the recursive call</font> \" + n*2);"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>"
				+ "\t\t\r\n<br>"
				+ "\t}\r\n<br>"
				+ "</code> \r\n\r\n"
				+ "</html>");

		txtAlgorithm.setBackground(Color.WHITE);
		txtAlgorithm.setEditable(false);

		txtVariables = new JTextArea();
		txtVariables.setBounds(465, 58, 184, 259);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setEditable(false);
		txtVariables.setLineWrap(true);
		txtVariables.setWrapStyleWord(true);
		txtVariables.setText("Variables will be inserted here");

		txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBounds(49, 448, 170, 29);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");

		txtrTheCurrent = new JTextArea();
		txtrTheCurrent.setBounds(49, 511, 248, 26);
		txtrTheCurrent.setBackground(UIManager.getColor("Panel.background"));
		txtrTheCurrent.setWrapStyleWord(true);
		txtrTheCurrent.setLineWrap(true);
		txtrTheCurrent.setEditable(false);
		txtrTheCurrent.setText("The current return value is :");

		txtNval = new JTextField();
		txtNval.setBounds(312, 450, 47, 20);
		txtNval.setDocument(new JTextFieldLimit(7));
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

		txtRtrnVal = new JTextField();
		txtRtrnVal.setBounds(315, 513, 44, 20);
		txtRtrnVal.setDocument(new JTextFieldLimit(7));
		txtRtrnVal.setColumns(10);
		txtRtrnVal.addActionListener(wasc);
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

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(49, 613, 122, 45);
		btnSubmit.addActionListener(wasc);
		
		JTextArea textWorking = new JTextArea();
		textWorking.setBounds(454, 395, 341, 164);
		
		JLabel lblInsertYourWorking = new JLabel("Insert your working here:");
		lblInsertYourWorking.setBounds(551, 363, 123, 14);
		
		txtBaseCase = new JTextField();
		txtBaseCase.setBounds(49, 555, 377, 14);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setVisible(false);
		setLayout(null);
		add(lblExample);
		add(txtAlgorithm);
		add(txtVariables);
		add(lblInsertYourWorking);
		add(btnSubmit);
		add(txtBaseCase);
		add(txtrTheValueOf);
		add(txtNval);
		add(txtrTheCurrent);
		add(txtRtrnVal);
		add(textWorking);
		
		ButtonGroup btnGroup = new ButtonGroup();
		
		rdbtnOption1 = new JRadioButton("Base case statement 1");
		rdbtnOption1.setBounds(343, 624, 170, 23);
		add(rdbtnOption1);
		
		rdbtnOption2 = new JRadioButton("Base case statement 2");
		rdbtnOption2.setBounds(343, 650, 170, 23);
		add(rdbtnOption2);
		
		rdbtnOption3 = new JRadioButton("After the recursive call 2");
		rdbtnOption3.setBounds(343, 673, 170, 23);
		add(rdbtnOption3);
		
		rdbtnOption4 = new JRadioButton("After the recursive call 4");
		rdbtnOption4.setBounds(343, 699, 170, 23);
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
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		setParameter(model.getParam());
		System.out.println("rv " + model.getParam());
		//A count for the submit button to keep track of how many recursive calls there has been
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(rdbtnOption1.isSelected()){
			System.out.println("1");
		}
		if(rdbtnOption2.isSelected()){
			System.out.println("2");
		}
		if(rdbtnOption3.isSelected()){
			System.out.println("3");
		}
		if(rdbtnOption4.isSelected()){
			System.out.println("4");
		}
		
		
		
	}
}
