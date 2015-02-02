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

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;

public class WorkAfterResult extends JPanel {


	private static final long serialVersionUID = -7033188402119066408L;

	/**
	 * Create the panel.
	 */
	public WorkAfterResult() {
		
		JTextArea txtrTheResultsFrom = new JTextArea();
		txtrTheResultsFrom.setText("The results from the previous two pages are as follows: \r\n\r\nThe algorithm worked on was workAfter(INSERTuserINPUThere)\r\n\r\nYour answer for workAfter(INSERTuserINPUThere) was : \r\n\r\nThe correct answer for workAfter(INSERTuserINPUThere) is :\r\n\r\nWe get to this answer by:\r\n\r\nInsert algorithim + variables here\r\n\r\n");
		txtrTheResultsFrom.setBackground(UIManager.getColor("Panel.background"));
		txtrTheResultsFrom.setEditable(false);
		txtrTheResultsFrom.setLineWrap(true);
		txtrTheResultsFrom.setWrapStyleWord(true);
		
		JTextArea txtrSummary = new JTextArea();
		txtrSummary.setBackground(UIManager.getColor("Panel.background"));
		txtrSummary.setLineWrap(true);
		txtrSummary.setWrapStyleWord(true);
		txtrSummary.setEditable(false);
		txtrSummary.setText("\t\t\t\t\t\t\t\t\t\t\tSummary\r\n\r\nIn this tutorial series, the basics of doing work after a recursive call were presented.\r\n\r\nRecursive calls do not need to be the end of a method. In fact work can be done after a recursive call.\r\n\r\nFor more releveant examples in this area and more challenging, please have a look for sorts and searches. A good example is Merge sort. Merge sort will split a list in one and use recursion to sort each list. Once this recursive call has been completed, the work done after involves combining the two lists into one sorted list.");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrSummary, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(272, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrSummary, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
