package view.WorkAfter;

/**
 * This GUI will give an example of how the algorithm used works.
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

import view.JTextFieldLimit;
import javax.swing.LayoutStyle.ComponentPlacement;

public class WorkAfterExample extends JPanel {


	private static final long serialVersionUID = -5040691956374882581L;
	private JTextField txtParameterField;

	public WorkAfterExample() {
		
		JTextArea txtrTheAlgorithmIs = new JTextArea();
		txtrTheAlgorithmIs.setText("The algorithm is as follows: \r\n\r\npublic void workAfter(int n){\r\n\tint x = 0;\r\n\t\t\r\n\tint[] numbers = new int[n];\r\n\t\t\r\n\t//Fills the numbers array from 0 to n and fills each space with the value n\r\n\tArrays.fill(numbers, 0, n, n);\r\n\t\t\r\n\t//Recursive call\r\n\tif(n > 1)\r\n\tworkAfter(n-1);\r\n\t\t\r\n\t//Base case\r\n\tif(n == 1){\r\n\tfor(int num : numbers)\r\n\t\tx = num + 5;\r\n\t\t\r\n\tSystem.out.println(\"Value of x is \" + x);\r\n\t\t\r\n\t\t\r\n\t}\r\n\t\t\r\n}\r\n\r\nHow this algorithm works:\r\n\r\nStep 1:\tA new array is initialised of length n (the integer input parameter)\r\nStep 2:\tThe array is then filled with the value n from index 0 to the size of the array(n)\r\nStep 3:\tRecursively this method is called until the array is size 1 and only holds the value 1\r\nStep 4:\tOnce this happens the if statement is met and 5 is added to every element in the array\r\nStep 5:\tThere is only one element so the sum will be 1+5\r\nStep 6:\tFinally we just print the value of x which will be 6\r\n\r\nNext you will be working through your own example of this algorithm. \r\nPlease enter a number in the field provided which will be the parameter for your algorithm workAfter(n) .");
		txtrTheAlgorithmIs.setBackground(UIManager.getColor("Panel.background"));
		txtrTheAlgorithmIs.setWrapStyleWord(true);
		txtrTheAlgorithmIs.setLineWrap(true);
		txtrTheAlgorithmIs.setEditable(false);
		
		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrTheAlgorithmIs, GroupLayout.PREFERRED_SIZE, 797, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrTheAlgorithmIs, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
