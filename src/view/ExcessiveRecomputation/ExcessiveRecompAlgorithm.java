package view.ExcessiveRecomputation;

/**
 * This is fourth GUI to excessive recomputation and will show the fibonacci algorithm.
 * The user will be able to work through it based on their parameter input from the previous screen.
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
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;

public class ExcessiveRecompAlgorithm extends JPanel {

	private static final long serialVersionUID = 7616226097911941809L;
	private JTextField txtRtrnVal;
	private JTextField txtNval;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompAlgorithm() {
		
		JTextArea txtrPublicIntFibint = new JTextArea();
		txtrPublicIntFibint.setText("\tpublic int fib(int n) {\r\n\t//Base case\r\n\tif (n == 0 || n == 1)\r\n\t\treturn 1;\r\n\t\t\r\n\telse\r\n\t\t//Recursive call\r\n\t\treturn fib(n-1) + fib(n-2);\r\n}");
		txtrPublicIntFibint.setBackground(UIManager.getColor("Panel.background"));
		txtrPublicIntFibint.setEditable(false);
		txtrPublicIntFibint.setLineWrap(true);
		txtrPublicIntFibint.setWrapStyleWord(true);
		
		JTextArea txtrInsertVariablesHere = new JTextArea();
		txtrInsertVariablesHere.setText("insert variables here");
		txtrInsertVariablesHere.setWrapStyleWord(true);
		txtrInsertVariablesHere.setLineWrap(true);
		txtrInsertVariablesHere.setEditable(false);
		txtrInsertVariablesHere.setBackground(UIManager.getColor("Panel.background"));
		
		JTextArea txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");
		
		JTextArea txtrTheCurrentReturn = new JTextArea();
		txtrTheCurrentReturn.setBackground(UIManager.getColor("Panel.background"));
		txtrTheCurrentReturn.setEditable(false);
		txtrTheCurrentReturn.setLineWrap(true);
		txtrTheCurrentReturn.setWrapStyleWord(true);
		txtrTheCurrentReturn.setText("The current return value is :");
		
		txtRtrnVal = new JTextField();
		//A limit of 2 should be enough as the 10th fibonacci number is 89 
		txtRtrnVal.setDocument(new JTextFieldLimit(2));
		txtRtrnVal.setColumns(10);
		
		txtNval = new JTextField();
		//A limit of 2 should be enough as the 10th fibonacci number is 89 
		txtNval.setDocument(new JTextFieldLimit(2));
		txtNval.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtrPublicIntFibint, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtrInsertVariablesHere, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE)
								.addComponent(txtNval, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrPublicIntFibint, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertVariablesHere, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNval, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(104)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
