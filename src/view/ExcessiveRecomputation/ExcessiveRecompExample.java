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
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ExcessiveRecompExample extends JPanel {

	private static final long serialVersionUID = 3170105316737825613L;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompExample() {
		
		JTextArea txtrTheAlgorithmIs = new JTextArea();
		txtrTheAlgorithmIs.setText("The algorithm is as follows: \r\n\r\npublic int fib(int n) {\r\n\r\n\t//Base case\r\n\tif (n == 0 || n == 1)\r\n\t      return 1;\r\n\t\t\r\n\telse\t\r\n\t   //Recursive call\r\n\t   return fib(n-1) + fib(n-2);\r\n}\r\n\r\n\r\nHow this algorithm works:\r\n\r\nStep 1:\tThe input parameter n is checked by the base case to see if it is either 0 or 1. \n\t(fibonacci 0 and 1 are both equal to 1)\r\n\r\nStep 2:\tIf the base case is not met then we go to the else statement which will be the recursive call\r\n\r\nStep 3:\tThe recursive call returns fib(n-1) + fib(n-2). These are the two numbers that came before n \n\tand is how n is calculated.\r\n\r\nStep 4:\tThis repeats until the base case is met and 1 is returned.\r\n\r\nStep 5:\tThe final calculation will then take place and return the result of fibonacci(n)\r\n\r\n");
		
		txtrTheAlgorithmIs.setWrapStyleWord(true);
		txtrTheAlgorithmIs.setLineWrap(true);
		txtrTheAlgorithmIs.setEditable(false);
		txtrTheAlgorithmIs.setBackground(UIManager.getColor("Panel.background"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(txtrTheAlgorithmIs, GroupLayout.PREFERRED_SIZE, 710, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrTheAlgorithmIs, GroupLayout.PREFERRED_SIZE, 661, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(125, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
