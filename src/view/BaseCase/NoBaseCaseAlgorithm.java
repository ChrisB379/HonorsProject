package view.BaseCase;

/**
 *  This displays the example of the no base case algorithm for the user to work through.
 *  It will be based on the parameter input from the previous GUI.
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

public class NoBaseCaseAlgorithm extends JPanel {

	private static final long serialVersionUID = 2183900996591652759L;
	private JTextField txtNVal;
	private JTextField txtRtrnVal;

	/**
	 * Create the panel.
	 */
	public NoBaseCaseAlgorithm() {
		
		JTextArea txtAlgorithm = new JTextArea();
		txtAlgorithm.setText("\r\n\tpublic int noBaseCase(int n) {\r\n\t\t\r\n\t\treturn noBaseCase(n-1) + n;\r\n\t}");
		txtAlgorithm.setBackground(UIManager.getColor("Panel.background"));
		txtAlgorithm.setWrapStyleWord(true);
		txtAlgorithm.setLineWrap(true);
		txtAlgorithm.setEditable(false);
		
		JTextArea txtrInsertVariablesHere = new JTextArea();
		txtrInsertVariablesHere.setBackground(UIManager.getColor("Panel.background"));
		txtrInsertVariablesHere.setWrapStyleWord(true);
		txtrInsertVariablesHere.setLineWrap(true);
		txtrInsertVariablesHere.setEditable(false);
		txtrInsertVariablesHere.setText("Insert variables here");
		
		JTextArea txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");
		
		JTextArea txtrTheReturnValue = new JTextArea();
		txtrTheReturnValue.setBackground(UIManager.getColor("Panel.background"));
		txtrTheReturnValue.setWrapStyleWord(true);
		txtrTheReturnValue.setLineWrap(true);
		txtrTheReturnValue.setEditable(false);
		txtrTheReturnValue.setText("The return value is : ");
		
		txtNVal = new JTextField();
		txtNVal.setColumns(10);
		
		txtRtrnVal = new JTextField();
		txtRtrnVal.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtrInsertVariablesHere, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE)
								.addComponent(txtNVal, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertVariablesHere, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(81)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(301, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
