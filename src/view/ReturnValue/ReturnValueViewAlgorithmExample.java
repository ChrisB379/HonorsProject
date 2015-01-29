package view.ReturnValue;

/**
 * This GUI will show an example of the factorial algorithm with a work through of how to calculate the final answer.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ReturnValueViewAlgorithmExample extends JPanel {


	private static final long serialVersionUID = -3578796091219375513L;

	/**
	 * Create the panel.
	 */
	public ReturnValueViewAlgorithmExample() {
		setBorder(null);
		
		JTextArea txtrOnceAgainThis = new JTextArea();
		txtrOnceAgainThis.setBackground(UIManager.getColor("OptionPane.background"));
		txtrOnceAgainThis.setText("Once again this is the factorial algorithm:\r\n\r\npublic static int factorial(int n) { \r\n   if (n == 1) \r\n\treturn 1; \r\n   return n * factorial(n-1); \r\n} \r\n\r\nNow lets go through an example of how it works.\r\nFor our example, the value of the integer n will be 4. The execution of the method will be as follows.\r\n\r\nStep 1: fact(4);\r\nStep 2:\treturn fact(3) * 4;\r\nStep 3:\treturn fact(2) * 3 * 4;\r\nStep 4:\treturn fact(1) * 2 * 3 * 4;\r\nStep 5:\treturn 1 * 2 * 3 * 4 = return 24;\r\n\r\nNow a short explantion of how we come to this conclusion.\r\nStep 1:  We start with fact(4), the value we pass in as our parameter.\r\n\r\nStep 2:  Our passed in variable 4 is checked with the base case(if n equals 1). This is false so we move onto the next line. \r\nThis is our recursive call which will return our current value of n(which is 4) and multiply it by the factorial of n-1(which is 3). \r\n\r\nStep 3: The value of n being passed this time is 3 since the recursive call, calls fact(n-1).\r\nWe now repeat what we did in step 2. The value of n being 3 does not match the base case of n == 1. So we move onto the return statement and once again return n*fact(n-1). \r\nThe result of which is fact(2)*3 however we must also add the extra multiplication from step 2 so we get return fact(2)*3*4\r\n\r\nStep 4: As with above, the value of n has been decremented by 1 to now be n = 1. Repeating steps 2 and 3 we get fact(1)*2*3*4 since we must keep track of the values of n from previous recursive calls.\r\n\r\nStep 5:  Now that n is the value 1, our base case condition is met which returns 1 and stops the recursive call chain. Now that the recursive call finishes, the full calculation will be done. \r\nFrom the previous steps we have the final calculation being 1*2*3*4 which results in the value 24 and this is the answer which will be returned from calling fact(4).\r\n\r\n");
		txtrOnceAgainThis.setLineWrap(true);
		txtrOnceAgainThis.setWrapStyleWord(true);
		txtrOnceAgainThis.setEditable(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(txtrOnceAgainThis, GroupLayout.PREFERRED_SIZE, 841, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrOnceAgainThis, GroupLayout.PREFERRED_SIZE, 709, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
