package view.ExcessiveRecomputation;

/**
 * This GUI will show and explain how the fibonacci algorithm works
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class ExcessiveRecompExample extends JPanel {

	private static final long serialVersionUID = 3170105316737825613L;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompExample() {
		
		JTextPane txtExample1 = new JTextPane();
		txtExample1.setContentType("text/html");
		txtExample1.setText("<html>"
				+ "\r\nThe algorithm is as follows: "
				+ "\r\n<br>"
				+ "\r\n<br><code>"
				+ "\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> fib(<font color = rgb(127,0,85)> <b>int </b> </font>n) {"
				+ "\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>"
				+ "\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b> </font> (n == 0 || n == 1)"
				+ "\r\n<br>\t\t  &nbsp&nbsp &nbsp&nbsp <font color = rgb(127,0,85)> <b>return </b> </font>1;"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>else</b> </font>"
				+ "\r\n<br>\t\t &nbsp&nbsp&nbsp&nbsp<font color = rgb(63,127,95)> //Recursive call</font>"
				+ "\r\n<br>\t\t   &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b> </font> fib(n-1) + fib(n-2);"
				+ "\r\n<br>"
				+ "\t}\r\n<br></code>"
				+ "\r\n<br>\r\n<br>How this algorithm works:"
				+ "\r\n<br>"
				+ "\r\n<br>Step 1:\tThe input parameter n is checked by the base case to see if it is either 0 or 1. \n\t(fibonacci 0 and 1 are both equal to 1)"
				+ "\r\n<br>\r\n<br>Step 2:\tIf the base case is not met then we go to the else statement which will be the recursive call"
				+ "\r\n<br>\r\n<br>Step 3:\tThe recursive call returns fib(n-1) + fib(n-2). These are the two numbers that came before n \n\tand is how n is calculated."
				+ "\r\n<br>\r\n<br>Step 4:\tThis repeats until the base case is met and 1 is returned."
				+ "\r\n<br>\r\n<br>Step 5:\tThe final calculation will then take place and return the result of fibonacci(n)\r\n"
				+ "</html>\r\n\r\n\r\n");
		
		txtExample1.setEditable(false);
		txtExample1.setBackground(UIManager.getColor("Panel.background"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(txtExample1, GroupLayout.PREFERRED_SIZE, 808, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(142, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtExample1, GroupLayout.PREFERRED_SIZE, 521, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(265, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
