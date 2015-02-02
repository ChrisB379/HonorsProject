package view.BaseCase;

/**
 *  The results of the no base example is displayed.
 *  The users final answer is displayed along with the correct answer.
 *  A wrong answer will mean an explanation of the correct answer is emphasized as to how it came about.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

public class NoBaseCaseResult extends JPanel {


	private static final long serialVersionUID = 5862849225888560531L;

	/**
	 * Create the panel.
	 */
	public NoBaseCaseResult() {
		
		JLabel lblResults = new JLabel("Results");
		
		JTextArea txtrTheResultsFrom = new JTextArea();
		txtrTheResultsFrom.setText("The results from the previous two pages are as follows: "
				+ "\r\n\r\nThe algorithm worked on was noBaseCase(INSERTuserINPUThere)\r\n\r\n"
				+ "Your answer for noBaseCase(INSERTuserINPUThere) was : \r\n\r\n"
				+ "The correct answer for noBaseCase(INSERTuserINPUThere) is :\r\n\r\n"
				+ "We get to this answer by:\r\n\r\nInsert algorithim + variables here\r\n\r\n");
		
		txtrTheResultsFrom.setBackground(UIManager.getColor("Panel.background"));
		txtrTheResultsFrom.setWrapStyleWord(true);
		txtrTheResultsFrom.setLineWrap(true);
		txtrTheResultsFrom.setEditable(false);
		
		JTextArea txtrSummaryInThis = new JTextArea();
		txtrSummaryInThis.setText("\t\t\t\tSummary\r\n\r\n"
				+ "In this tutorial series, the importance of base cases in recursion were presented.\r\n\r\n"
				+ "A base case is vital in recursive statements as a way to control how many times a recursive call happens. It also prevents the recursive call falling into an infinite loop and thus creating a stack overflow, "
				+ "crashing any programing running the recursive call.\r\n\r\n"
				+ "The next pages will cover the second algorithm in the base series. This will be about convergence.");
		
		txtrSummaryInThis.setBackground(UIManager.getColor("Panel.background"));
		txtrSummaryInThis.setWrapStyleWord(true);
		txtrSummaryInThis.setLineWrap(true);
		txtrSummaryInThis.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(415)
							.addComponent(lblResults))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrSummaryInThis, GroupLayout.PREFERRED_SIZE, 853, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, 805, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResults)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtrSummaryInThis, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
