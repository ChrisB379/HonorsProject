package view.WorkAfter;

/**
 * Shows the results of the work after example algorithm.
 * Shows the users answer, the correct answer along with an explanation of how the answer was found.
 * This is emphasised if the user got an incorrect answer.
 * A brief summary of the topic is also included for what the user should have learned.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import model.IWorkAfter;
import javax.swing.JLabel;

public class WorkAfterResult extends JPanel implements Observer {


	private static final long serialVersionUID = -7033188402119066408L;
	
	private IWorkAfter model;
	
	private JTextArea txtResults;
	private JTextArea txtSummary;
	
	private String userRetQ1,userRetQ2;
	private int param;

	/**
	 * Create the panel.
	 */
	public WorkAfterResult(IWorkAfter m) {

		model = m;
		
		((Observable) m).addObserver(this);
		
		
		txtResults = new JTextArea();
		txtResults.setBounds(36, 36, 668, 421);
		txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was workAfter(" +getParam() +")\r\n\r\n"
				+ "Your answer for workAfter(" + getParam() +") was : " + getReturnValQ1() + "\r\n\r\n"
				+ "The correct answer for workAfter(" +getParam() +") is :" + "After the recursive call, showing the result of n*2 is 2" + "\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");
		
		txtResults.setBackground(UIManager.getColor("Panel.background"));
		txtResults.setEditable(false);
		txtResults.setLineWrap(true);
		txtResults.setWrapStyleWord(true);
		setLayout(null);

		txtSummary = new JTextArea();
		txtSummary.setBounds(36, 455, 668, 292);
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		txtSummary.setLineWrap(true);
		txtSummary.setWrapStyleWord(true);
		txtSummary.setEditable(false);
		txtSummary.setText("\t\t\t\t\t\t\t\t\t\t\tSummary\r\n\r\n"
				+ "In this tutorial series, the basics of doing work after a recursive call were presented.\r\n\r\n"
				+ "Recursive calls do not need to be the end of a method. In fact work can be done after a recursive call.\r\n\r\n"
				+ "For more releveant examples in this area and more challenging, please have a look for sorts and searches. A good example is Merge sort."
				+ " Merge sort will split a list in one and use recursion to sort each list. Once this recursive call has been completed, the work done after "
				+ "involves combining the two lists into one sorted list.");
		add(txtSummary);
		add(txtResults);
		
		JLabel lblResults = new JLabel("Results:");
		lblResults.setEnabled(false);
		lblResults.setBounds(339, 11, 79, 14);
		add(lblResults);

	}

	@Override
	public void update(Observable o, Object arg) {
		setReturnValQ1(model.getUserReturnValQ1());
		setReturnValQ2(model.getUserReturnValQ2());
		setParam(model.getParam());
		System.out.println("RetValResults " + getParam());
		setResultsText();
		
	}
	
	/**
	 * Sets the return value that the user selected for question 1
	 * 
	 * @param s a String representing the users selected answer for question 1
	 */
	public void setReturnValQ1(String s){
		userRetQ1 = s;
	}
	
	/**
	 *Gets and returns the string that the user selected for question 1
	 * 
	 * @return the String representing the users selected answer for question 1
	 */
	public String getReturnValQ1(){
		return userRetQ1;
	}
	
	/**
	 * Sets the return value that the user selected for question 2
	 * 
	 * @param s a String representing the users selected answer for question 2
	 */
	public void setReturnValQ2(String s){
		userRetQ2 = s;
	}
	
	/**
	 *Gets and returns the string that the user selected for question 2
	 * 
	 * @return the String representing the users selected answer for question 2
	 */
	public String getReturnValQ2(){
		return userRetQ2;
	}
	
	/**
	 * Gets the integer parameter that the user selected back in the WorkAfterExample
	 * 
	 * @return integer n representing the users input parameter value
	 */
	public int getParam(){
		return param;
	}
	
	/**
	 * Sets param as the integer parameter that the user selected back in the WorkAfterExample
	 * 
	 * @param n integer n representing the users input parameter value
	 */
	public void setParam(int n){
		param = n;
	}
	
	/**
	 * Sets the txtResults box to show the results based on which input parameter the user chose
	 * and also which answers they chose in the WorkAfterAlgorithm page
	 * 
	 */
	public void setResultsText(){
		if(getParam() == 1)
			txtResults.setText("The algorithm worked on was workAfter(" +getParam() +")\r\n\r\n"
					+ "Your answer for question 1 workAfter(" + getParam() +") was : " + getReturnValQ1() + "\r\n\r\n"
					+ "Your answer for question 2 workAfter(" + getParam() +") was : " + getReturnValQ1() + "\r\n\r\n"
					+ "The correct answer for question 1 workAfter(" +getParam() +") is :" + " \"Base case statement, showing the value of n is 1" + "\"\r\n\r\n"
					+ "The correct answer for question 2 workAfter(" +getParam() +") is :" + " \"After the recursive call, showing the result of n*2 is " + getParam()*2 + "\"\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "The base case will be printed first with it being met when n = 1 and thus the answer to the first question is\n"
					+ "\"Base case statement, showing the value of n is 1\" \n\n"
					+ "Once the base case has been met, each of the print statements after the recursive call will then be printed one by one, starting with: \"After the recursive call, showing the result of n*2 is 2\", with the value of n*2 being as during this call n = 2 \n\n"
					+ "As the input parameter matched the base case, this is the only output there will be \n\n"
					);	
		
		if(getParam() == 2)
			txtResults.setText("The algorithm worked on was workAfter(" +getParam() +")\r\n\r\n"
					+ "Your answer for question 1 workAfter(" + getParam() +") was : " + getReturnValQ1() + "\r\n\r\n"
					+ "Your answer for question 2 workAfter(" + getParam() +") was : " + getReturnValQ2() + "\r\n\r\n"
					+ "The correct answer for question 1 workAfter(" +getParam() +") is :" + " \"Base case statement, showing the value of n is 1" + "\"\r\n\r\n"
					+ "The correct answer for question 2 workAfter(" +getParam() +") is :" + " \"After the recursive call, showing the result of n*2 is " + getParam()*2 + "\"\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "The base case will be printed first with it being met when n = 1 and thus the answer to the first question is\n"
					+ "\"Base case statement, showing the value of n is 1\" \n\n"
					+ "Once the base case has been met, each of the print statements after the recursive call will then be printed one by one, starting with: \"After the recursive call, showing the result of n*2 is 2\", with the value of n*2 being as during this call n = 2 \n\n"
					+ "Next we have \"After the recursive call, showing the result of n*2 is 4\", with the value of n*2 being as during this call n = 2 \n\n"
					+ "This is the final print statement which is double the value of the original parameter which is : \n\n"
					+ "After the recursive call, showing the result of n*2 is " + getParam()*2
					);	
			
		
		
		if(getParam() > 2)
		txtResults.setText("The algorithm worked on was workAfter(" +getParam() +")\r\n\r\n"
				+ "Your answer for question 1 workAfter(" + getParam() +") was : " + getReturnValQ1() + "\r\n\r\n"
				+ "Your answer for question 2 workAfter(" + getParam() +") was : " + getReturnValQ2() + "\r\n\r\n"
				+ "The correct answer for question 1 workAfter(" +getParam() +") is :" + " \"Base case statement, showing the value of n is 1" + "\"\r\n\r\n"
				+ "The correct answer for question 2 workAfter(" +getParam() +") is :" + " \"After the recursive call, showing the result of n*2 is " + getParam()*2 + "\"\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "The base case will be printed first with it being met when n = 1 and thus the answer to the first question is\n"
				+ "\"Base case statement, showing the value of n is 1\" \n\n"
				+ "Once the base case has been met, each of the print statements after the recursive call will then be printed one by one, starting with: \"After the recursive call, showing the result of n*2 is 2\", with the value of n*2 being as during this call n = 2 \n\n"
				+ "Next we have \"After the recursive call, showing the result of n*2 is 4\", with the value of n*2 being as during this call n = 2 \n\n"
				+ "Subseqeunt print statements are similar with only the value of n*2 changing until we get to the final print statement which is double the value of the original parameter which is : \n\n"
				+ "After the recursive call, showing the result of n*2 is " + getParam()*2
				);
	}
}
