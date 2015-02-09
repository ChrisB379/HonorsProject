package view.BaseCase;

/**
 * This is the GUI for convergence. It will explain what convergence is and how it effects
 * recursion.
 * The user can enter a parameter to be used in the next GUI screen.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.JTextFieldLimit;

import javax.swing.JTextPane;

public class ConvergenceExample extends JPanel {


	private static final long serialVersionUID = -2694986035472196268L;
	private JTextField txtParameterField;
	private int parameter;

	/**
	 * Create the panel.
	 */
	public ConvergenceExample() {

		JTextPane txtExample2 = new JTextPane();
		txtExample2.setContentType("text/html");
		txtExample2.setText("<html>\r\nThe second of the two algorithms on base case we are going to look at is the convergence method. \r\n<br>\r\n<br>This is an example of how recursive calls  must converge towards the base or face the same problem as a recursive call with no base i.e an infinite loop leading to a stack overflow error and the possibility of the program crashing.\r\n<br>\r\n<br>\r\n<br>The algorithm for this example is as follows:\r\n<br>\r\n<br> <code>\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> convergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> convergence(n+1) + 2*n;\r\n<br>\t}\r\n<br> </code>\r\n<br>How it works:\r\n<br>For this example, lets assume the value of n starts at the integer value 4.\r\n<br>\r\n<br>Step 1: The value of n is compared to the integer 1 in the if statement.  As our example uses the value 4 then this statement is not met and thus continues to the next line.\r\n<br>\r\n<br>Step 2: The return statement is a recursive call. However notice that it is calling convergence(n+1) and not convergence(n-1) like it should\r\n<br>\r\n<br>Step 3: Steps 1 and 2 repeat forever in a loop until a crash happens via a stack overflow error. The base case is never met due the value of n increasing and not decreasing.\r\n<br>\r\n<br>Due to the recursive call being convergence(n+1) and thus taking the value of n(originally 4) further away from the base case of 1, the base case will never be met. \r\n<br>While this is a simple fix to ensure that the recursive call converges towards the base case, it is important to remember that not doing so will likely cause your code to break and any program running it to crash.\r\n<br>\r\n<br>\r\n<br>Next you will be working through your own example of this algorithm. Please enter a number in the field provided which will be the parameter for your algorithm. convergence(n)\r\n</html>");
		txtExample2.setBackground(UIManager.getColor("Panel.background"));
		txtExample2.setEditable(false);

		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		txtParameterField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				int n = Integer.parseInt(txtParameterField.getText());
				setParameter(n);

			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(28)
										.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addContainerGap()
												.addComponent(txtExample2, GroupLayout.PREFERRED_SIZE, 868, GroupLayout.PREFERRED_SIZE)))
												.addContainerGap(20, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
						.addGap(10)
						.addComponent(txtExample2, GroupLayout.PREFERRED_SIZE, 704, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(17))
				);
		setLayout(groupLayout);

	}

	public void setParameter(int n){
		parameter = n;

	}

	public int getParameter(){
		return parameter;
	}

}
