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


import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.JTextFieldLimit;

public class ConvergenceExample extends JPanel {


	private static final long serialVersionUID = -2694986035472196268L;
	private JTextField txtParameterField;

	/**
	 * Create the panel.
	 */
	public ConvergenceExample() {
		
		JTextArea txtrTheSecondOf = new JTextArea();
		txtrTheSecondOf.setText("The second of the two algorithms on base case we are going to look at is the convergence method. \r\n\r\nThis is an example of how recursive calls  must converge towards the base or face the same problem as a recursive call with no base i.e an infinite loop leading to a stack overflow error and the possibility of the program crashing.\r\n\r\n\r\nThe algorithm for this example is as follows:\r\n\r\n\r\n\tpublic int convergence(int n) {\r\n\t\t//Base case\r\n\t\tif(n == 1)\r\n\t\t\treturn 5;\r\n\t\telse \r\n\t\t\treturn convergence(n+1) + 2*n;\r\n\t}\r\n\r\nHow it works:\r\nFor this example, lets assume the value of n starts at the integer value 4.\r\n\r\nStep 1: The value of n is compared to the integer 1 in the if statement.  As our example uses the value 4 then this statement is not met and thus continues to the next line.\r\n\r\nStep 2: The return statement is a recursive call. However notice that it is calling convergence(n+1) and not convergence(n-1) like it should\r\n\r\nStep 3: Steps 1 and 2 repeat forever in a loop until a crash happens via a stack overflow error. The base case is never met due the value of n increasing and not decreasing.\r\n\r\nDue to the recursive call being convergence(n+1) and thus taking the value of n(originally 4) further away from the base case of 1, the base case will never be met. \r\nWhile this is a simple fix to ensure that the recursive call converges towards the base case, it is important to remember that not doing so will likely cause your code to break and any program running it to crash.\r\n\r\n\r\nNext you will be working through your own example of this algorithm. Please enter a number in the field provided which will be the parameter for your algorithm. convergence(n)");
		txtrTheSecondOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheSecondOf.setWrapStyleWord(true);
		txtrTheSecondOf.setLineWrap(true);
		txtrTheSecondOf.setEditable(false);
		
		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		
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
							.addComponent(txtrTheSecondOf, GroupLayout.PREFERRED_SIZE, 868, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrTheSecondOf, GroupLayout.PREFERRED_SIZE, 704, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(17))
		);
		setLayout(groupLayout);

	}

}
