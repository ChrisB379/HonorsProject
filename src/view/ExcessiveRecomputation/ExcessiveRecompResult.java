package view.ExcessiveRecomputation;

/**
 *  The results of the excessive recomputation example.
 *  The users answer to the example will be displayed along with the actual answer.
 *  There will be an explanation of how the answer was calculated and in the case of the user inputting
 *  an incorrect answer, an explanation of the correct answer is emphasized.
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

public class ExcessiveRecompResult extends JPanel {

	private static final long serialVersionUID = -5302119559920880728L;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompResult() {
		
		JTextArea txtrTheResultsFrom = new JTextArea();
		txtrTheResultsFrom.setWrapStyleWord(true);
		txtrTheResultsFrom.setLineWrap(true);
		txtrTheResultsFrom.setEditable(false);
		txtrTheResultsFrom.setBackground(UIManager.getColor("Panel.background"));
		txtrTheResultsFrom.setText("The results from the previous two pages are as follows: \r\n\r\nThe algorithm worked on was fib(INSERTuserINPUThere)\r\n\r\nYour answer for fib(INSERTuserINPUThere) was : \r\n\r\nThe correct answer for fib(INSERTuserINPUThere) is :\r\n\r\nWe get to this answer by:\r\n\r\nInsert algorithim + variables here\r\n\r\n");
		
		JTextArea txtrSummaryInThis = new JTextArea();
		txtrSummaryInThis.setText("\t\t\tSummary\r\n\r\n"
				+ "In this tutorial series, the issue of excessive recomputation was presented.\r\n\r\n"
				+ "Excessive recomputation occurs when the same calculation is done multiple times wasting CPU resources and time because after the first time a calculation is done, it shouldn't have to be done again.\r\n\r\n"
				+ "For more releveant examples in this area and more challenging, please have a look at memoization and fibonacci with memoization. \r\n\r\n"
				+ "Memoization is the solution to excessive recomputation. It stores results of calculations in some way such as a list so when a calculation is repeated then the result can simply be fetched which is much faster "
				+ "and more efficient than recalculating eveytime. The first time a calculation is done, if it is not in the \"list\" then the calculation and result will be added to the list so it can be used later if needed.");
		
		
		
		txtrSummaryInThis.setWrapStyleWord(true);
		txtrSummaryInThis.setLineWrap(true);
		txtrSummaryInThis.setEditable(false);
		txtrSummaryInThis.setBackground(UIManager.getColor("Panel.background"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrSummaryInThis, GroupLayout.PREFERRED_SIZE, 639, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(txtrSummaryInThis, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
