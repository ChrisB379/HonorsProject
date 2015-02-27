package view.ExcessiveRecomputation;

/**
 * This will show how the memoization algorithm works
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class MemoizationDescription extends JPanel {


	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MemoizationDescription() {
		setFocusable(false);

		JTextPane txtMemoDesc = new JTextPane();
		txtMemoDesc.setFocusable(false);
		txtMemoDesc.setBackground(UIManager.getColor("Panel.background"));
		txtMemoDesc.setContentType("text/html");
		txtMemoDesc.setText("<code>\r\n<br> \tint helperMemory[];\r\n<br>\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> fibMemoization(<font color = rgb(127,0,85)> <b>int</b> </font> n){\r\n<br>\t\t&nbsp&nbsp<font color = rgb(63,127,95)>//If there is no helper memory, then initialise it to the size of n</font>\r\n<br>\t\t&nbsp&nbsp<font color = rgb(127,0,85)> <b>if</b> </font>(<font color = rgb(0,0,192)>helperMemory</font> == <font color = rgb(127,0,85)> <b>null</b> </font>)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(0,0,192)>helperMemory</font> = <font color = rgb(127,0,85)> <b>new int</b></font>[n];\r\n<br>\t\t\r\n<br>\t\t&nbsp&nbsp<font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t   &nbsp&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 0 || n == 1)\r\n<br>\t        &nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b></font> 1;\r\n<br>\t    \r\n<br>\t      &nbsp&nbsp<font color = rgb(127,0,85)> <b>if</b></font>(<font color = rgb(0,0,192)>helperMemory</font>[n-1] != 0)\r\n<br>\t         &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b></font> <font color = rgb(0,0,192)>helperMemory</font>[n-1];\r\n<br>\t    \r\n<br>\t      &nbsp&nbsp<font color = rgb(127,0,85)> <b>else</b></font>\r\n<br>\t   &nbsp&nbsp  {\r\n<br>\t    \t&nbsp&nbsp&nbsp&nbsp<font color = rgb(63,127,95)>//Recursive call</font>\r\n<br>\t        &nbsp&nbsp&nbsp&nbsp<font color = rgb(0,0,192)>helperMemory</font>[n-1] = fibMemoization(n - 1) + fibMemoization(n - 2);\r\n<br>\t        &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b></font> <font color = rgb(0,0,192)>helperMemory</font>[n-1];\r\n<br>\t    &nbsp&nbsp }\r\n<br>\t}\r\n<br></code>\r\n<br>This works very similarly to how the fibonacci algorithm worked , but with a few small changes as follows:\r\n<br>\r\n<br><b>Step 1</b>: Helper memory is set up if there is none yet. This is just an array which will hold results of calculations so they do not need to be computed again.\r\n<br>\r\n<br><b>Step 2</b>: The base case is checked.\r\n<br>\r\n<br><b>Step 3</b>: If the value in helperMemory position n-1 is not equal to 0 then return the value from that position as it has already been calculated.\r\n<br>\r\n<br><b>Step 4</b>: else set helperMemory(n-1) to be equal to fibMemoization(n-1) + fibMemoization(n-2). This is the recursive statement which helperMemory(n-1) is being set to.\r\n<br>\r\n<br><b>Step 5</b>: We then returh helperMemory(n-1) which has been set to the recursive statement. ");
		txtMemoDesc.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(25)
						.addComponent(txtMemoDesc, GroupLayout.PREFERRED_SIZE, 673, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(59, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtMemoDesc, GroupLayout.PREFERRED_SIZE, 713, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}

}
