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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.IWorkAfter;

public class WorkAfterResult extends JPanel implements Observer {


	private static final long serialVersionUID = -7033188402119066408L;
	
	private IWorkAfter model;
	
	private JTextArea txtResults;
	private JTextArea txtSummary;
	
	private String userRet;
	private int param;

	/**
	 * Create the panel.
	 */
	public WorkAfterResult(IWorkAfter m) {

		model = m;
		
		((Observable) m).addObserver(this);
		
		
		txtResults = new JTextArea();
		txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was workAfter(" +getParam() +")\r\n\r\n"
				+ "Your answer for workAfter(" + getParam() +") was : " + getReturnVal() + "\r\n\r\n"
				+ "The correct answer for workAfter(" +getParam() +") is :" + "After the recursive call, showing the result of n*2 is 2" + "\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");
		
		txtResults.setBackground(UIManager.getColor("Panel.background"));
		txtResults.setEditable(false);
		txtResults.setLineWrap(true);
		txtResults.setWrapStyleWord(true);

		txtSummary = new JTextArea();
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
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 629, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtResults, GroupLayout.PREFERRED_SIZE, 599, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(119, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(txtResults, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	@Override
	public void update(Observable o, Object arg) {
		setReturnVal(model.getUserReturnValQ1());
		setParam(model.getParam());
		System.out.println("RetValResults " + getParam());
		setResultsText();
		
	}
	
	public void setReturnVal(String s){
		userRet = s;
	}
	
	public String getReturnVal(){
		return userRet;
	}
	
	public int getParam(){
		return param;
	}
	
	public void setParam(int n){
		param = n;
	}

	public void setResultsText(){
		txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was workAfter(" +getParam() +")\r\n\r\n"
				+ "Your answer for workAfter(" + getParam() +") was : " + getReturnVal() + "\r\n\r\n"
				+ "The correct answer for workAfter(" +getParam() +") is :" + "After the recursive call, showing the result of n*2 is 2" + "\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");
	}
}
