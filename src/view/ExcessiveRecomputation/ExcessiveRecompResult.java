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
		
		JTextArea txtResult = new JTextArea();
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setEditable(false);
		txtResult.setBackground(UIManager.getColor("Panel.background"));
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\nThe algorithm worked on was fib(INSERTuserINPUThere)\r\n\r\nYour answer for fib(INSERTuserINPUThere) was : \r\n\r\nThe correct answer for fib(INSERTuserINPUThere) is :\r\n\r\nWe get to this answer by:\r\n\r\nInsert algorithim + variables here\r\n\r\n");
		
		JTextArea txtSummary = new JTextArea();
		txtSummary.setText("\t\t\tSummary\r\n\r\nIn this tutorial series, the issue of excessive recomputation was presented.\r\n\r\nExcessive recomputation occurs when the same calculation is done multiple times wasting CPU resources and time because after the first time a calculation is done, it shouldn't have to be done again.\r\n\r\nFor more releveant examples in this area and more challenging, please have a look at memoization and fibonacci with memoization. \r\n\r\nYou can choose to do so now via the memoization button or you can continue to Tutorial 4 if you wish.\r\n\r\n");
		
		
		
		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setEditable(false);
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtResult, Alignment.LEADING)
						.addComponent(txtSummary, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
					.addContainerGap(175, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
