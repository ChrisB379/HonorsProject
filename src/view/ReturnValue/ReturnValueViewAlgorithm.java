package view.ReturnValue;

/**
 *  Displays the factorial algorithm as the example the user can work through for the
 *  return value examples section.
 *  This is based on the parameter entered from the previous GUi screen.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ReturnValueViewAlgorithm extends JPanel {


	private static final long serialVersionUID = -6312065891931236710L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public ReturnValueViewAlgorithm() {
		setBorder(null);
		
		JTextArea txtrPublicStaticInt = new JTextArea();
		txtrPublicStaticInt.setBackground(UIManager.getColor("Panel.background"));
		txtrPublicStaticInt.setText("public static int factorial(int n) { \r\n   if (n == 1) \r\n\treturn 1; \r\n   return n * factorial(n-1); \r\n} \r\n");
		txtrPublicStaticInt.setWrapStyleWord(true);
		txtrPublicStaticInt.setLineWrap(true);
		txtrPublicStaticInt.setEditable(false);
		
		JTextArea txtrN = new JTextArea();
		txtrN.setBackground(UIManager.getColor("Panel.background"));
		txtrN.setWrapStyleWord(true);
		txtrN.setLineWrap(true);
		txtrN.setEditable(false);
		txtrN.setText("Variables will be inserted here");
		
		JTextArea txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		
		JTextArea txtrTheCurrent = new JTextArea();
		txtrTheCurrent.setBackground(UIManager.getColor("Panel.background"));
		txtrTheCurrent.setWrapStyleWord(true);
		txtrTheCurrent.setLineWrap(true);
		txtrTheCurrent.setEditable(false);
		txtrTheCurrent.setText("The current return value is :");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(81)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(635))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(txtrPublicStaticInt, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
								.addComponent(txtrN, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
								.addGap(43)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtrTheCurrent, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(126)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrPublicStaticInt, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrN, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheCurrent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(82)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(185, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
