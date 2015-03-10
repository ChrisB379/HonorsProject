package view.BaseCase;

/**
 *  The results of the no base example is displayed.
 *  The users final answer is displayed along with the correct answer.
 *  
 *  A summary of no base case is also provided
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import model.IBaseCase;
import java.awt.Font;

public class NoBaseCaseResult extends JPanel implements Observer {


	private static final long serialVersionUID = 5862849225888560531L;
	
	private JTextArea txtResult;
	private JTextArea txtSummary;
	
	private IBaseCase model;
	
	private int param;
	private String userRet;

	private JLabel lblSummary;

	/**
	 * Create the panel.
	 */
	public NoBaseCaseResult(IBaseCase m) {
		setOpaque(false);
		setFocusable(false);
		
		model = m;
		
		((Observable) m).addObserver(this);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResults.setFocusable(false);
		lblResults.setBounds(415, 11, 77, 14);
		
		/*
		 * The results text field
		 */
		txtResult = new JTextArea();
		txtResult.setOpaque(false);
		txtResult.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtResult.setFocusable(false);
		txtResult.setBounds(28, 36, 805, 389);
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was noBaseCase(INSERTuserINPUThere)\r\n\r\n"
				+ "Your answer for noBaseCase(INSERTuserINPUThere) was : \r\n\r\n"
				+ "The correct answer for noBaseCase(INSERTuserINPUThere) is :\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");

		txtResult.setBackground(UIManager.getColor("Panel.background"));
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setEditable(false);

		/*
		 * The summary text field
		 */
		txtSummary = new JTextArea();
		txtSummary.setOpaque(false);
		txtSummary.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtSummary.setFocusable(false);
		txtSummary.setBounds(28, 453, 853, 218);
		txtSummary.setText("\r\n\r\nIn this tutorial series, the importance of base cases in recursion were presented.\r\n\r\n"
				+ "A base case is vital in recursive statements as a way to control how many times a recursive call happens. It also prevents the recursive call falling into an infinite loop "
				+ "and thus creating a stack overflow, crashing any programing running the recursive call.\r\n\r\n"
				+ "The next pages will cover the second algorithm in the base series. This will be about convergence.");

		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setEditable(false);
		setLayout(null);
		
		lblSummary = new JLabel("Summary");
		lblSummary.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSummary.setBounds(415, 452, 102, 18);
		add(lblSummary);
		add(lblResults);
		add(txtSummary);
		add(txtResult);

	}

	@Override
	public void update(Observable o, Object arg) {
		setReturnVal(model.getUserReturnVal());
		setParam(model.getParam());
		setResultsText();
		
	}
	
	/**
	 * Returns the users return value
	 * 
	 * @param s The string of the radio button the user chose
	 */
	public void setReturnVal(String s){
		userRet = s;
	}
	
	/**
	 * Gets the users return value
	 * 
	 * @return the String the user chose from the radio buttons
	 */
	public String getReturnVal(){
		return userRet;
	}
	
	/**
	 * Returns the parameter the user chose in NoBaseCaseExample
	 * 
	 * @return integer parameter
	 */
	public int getParam(){
		return param;
	}
	
	/**
	 * Sets the parameter the use chose in NoBaseCaseExample
	 * 
	 * @param n integer which is the users parameter
	 */
	public void setParam(int n){
		param = n;
	}
	
	

	
	/**
	 * Sets the results text field when called in the update method
	 * 
	 * It is in its own method to prevent the update method being cluttered
	 * 
	 */
	public void setResultsText(){
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was noBaseCase(" + getParam() + ")\r\n\r\n"
				+ "Your answer for noBaseCase(" + getParam() + ") was : "+ getReturnVal() +"\r\n\r\n"
				+ "The correct answer for noBaseCase(" + getParam() + ") is : The method will continue recursing until a stack overflow error halts the program. \r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "As there is no base case,the method constantly recurses reducing the value of n by 1 for each recursive call. \r\n\r\n"
				+ "Eventually so many recursive calls build up within the java runtime stack that the stack becomes full. \n\n"
				+ "This prevents anything else being added to the stack and causes a stack overflow error which will halt the program. \n\n"
				);

	}
}
