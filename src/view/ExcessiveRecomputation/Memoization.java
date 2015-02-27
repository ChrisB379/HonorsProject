package view.ExcessiveRecomputation;

/**
 * This is an optional panel that the user can come to if they choose to.
 * It describes memoization and it's benefits in recursion
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;

public class Memoization extends JPanel {


	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Memoization() {
		setFocusable(false);

		JTextPane txtMemoAlgorithm = new JTextPane();
		txtMemoAlgorithm.setFocusable(false);
		txtMemoAlgorithm.setContentType("text/html");
		txtMemoAlgorithm.setText("<html>\r\n<b>Memoization</b>\r\n<br>Memoization is the solution to excessive recomputation. It stores results of calculations in some way such as a list so when a calculation is repeated then the result can simply be fetched which is much faster and more efficient than recalculating eveytime. The first time a calculation is done, if it is not in the \"list\" then the calculation and result will be added to the list so it can be used later if needed.\r\n<br>\r\n<br> The algorithm for memoization in the fibonacci algorithm is as follows:\r\n<br><code>\r\n<br> \tint helperMemory[];\r\n<br>\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> fibMemoization(<font color = rgb(127,0,85)> <b>int</b> </font> n){\r\n<br>\t\t&nbsp&nbsp<font color = rgb(63,127,95)>//If there is no helper memory, then initialise it to the size of n</font>\r\n<br>\t\t&nbsp&nbsp<font color = rgb(127,0,85)> <b>if</b> </font>(<font color = rgb(0,0,192)>helperMemory</font> == <font color = rgb(127,0,85)> <b>null</b> </font>)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(0,0,192)>helperMemory</font> = <font color = rgb(127,0,85)> <b>new int</b></font>[n];\r\n<br>\t\t\r\n<br>\t\t&nbsp&nbsp<font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t   &nbsp&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 0 || n == 1)\r\n<br>\t        &nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b></font> 1;\r\n<br>\t    \r\n<br>\t      &nbsp&nbsp<font color = rgb(127,0,85)> <b>if</b></font>(<font color = rgb(0,0,192)>helperMemory</font>[n-1] != 0)\r\n<br>\t         &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b></font> <font color = rgb(0,0,192)>helperMemory</font>[n-1];\r\n<br>\t    \r\n<br>\t      &nbsp&nbsp<font color = rgb(127,0,85)> <b>else</b></font>\r\n<br>\t   &nbsp&nbsp  {\r\n<br>\t    \t&nbsp&nbsp&nbsp&nbsp<font color = rgb(63,127,95)>//Recursive call</font>\r\n<br>\t        &nbsp&nbsp&nbsp&nbsp<font color = rgb(0,0,192)>helperMemory</font>[n-1] = fibMemoization(n - 1) + fibMemoization(n - 2);\r\n<br>\t        &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b></font> <font color = rgb(0,0,192)>helperMemory</font>[n-1];\r\n<br>\t    &nbsp&nbsp }\r\n<br>\t}\r\n<br></code>\r\n<br>\r\n<br> The next page will describe how the algorithm works.\r\n</html>");

		txtMemoAlgorithm.setEditable(false);


		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtMemoAlgorithm, GroupLayout.PREFERRED_SIZE, 835, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(51, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtMemoAlgorithm, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}
}
