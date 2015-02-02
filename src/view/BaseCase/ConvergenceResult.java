package view.BaseCase;

/**
 * This is the GUi after the convergence algorithm that the user has worked through.
 * Here they see what the final answer is, what their answer was and then an explanation of how
 * the answer was to the algorithm was found. If the user is wrong itll explain why.
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

public class ConvergenceResult extends JPanel {


	private static final long serialVersionUID = -6554799182952231997L;

	/**
	 * Create the panel.
	 */
	public ConvergenceResult() {
		
		JTextArea txtrTheResultsFrom = new JTextArea();
		txtrTheResultsFrom.setText("The results from the previous two pages are as follows: \r\n\r\nThe algorithm worked on was convergence(INSERTuserINPUThere)\r\n\r\nYour answer for convergence(INSERTuserINPUThere) was : \r\n\r\nThe correct answer for convergence(INSERTuserINPUThere) is :\r\n\r\nWe get to this answer by:\r\n\r\nInsert algorithim + variables here\r\n\r\n");
		txtrTheResultsFrom.setBackground(UIManager.getColor("Panel.background"));
		txtrTheResultsFrom.setWrapStyleWord(true);
		txtrTheResultsFrom.setLineWrap(true);
		txtrTheResultsFrom.setEditable(false);
		
		JTextArea txtrSummaryInThis = new JTextArea();
		txtrSummaryInThis.setText("\t\t\t\t\tSummary\r\n\r\nIn this tutorial series, the importance of base cases in recursion were presented.\r\n\r\nA base case is vital in recursive statements as a way to control how many times a recursive call happens. It also prevents the recursive call falling into an infinite loop and thus creating a stack overflow, crashing any programing running the recursive call.\r\n\r\nWithin the topic of bases, the idea of convergence was presented. Convergence plays an important part in bases cases, in that each recursive call must ensure that any variables being incremented/decremented should converge(get closer to) the base case. If this fails to happen then similar to what happens if there is no base case, the program can crash in an infinite loop which causes a stack overflow.\r\n\r\nThis is the end of tutortial series 1.");
		txtrSummaryInThis.setWrapStyleWord(true);
		txtrSummaryInThis.setLineWrap(true);
		txtrSummaryInThis.setBackground(UIManager.getColor("Panel.background"));
		txtrSummaryInThis.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrSummaryInThis, GroupLayout.PREFERRED_SIZE, 1022, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, 948, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(txtrTheResultsFrom, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtrSummaryInThis, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
