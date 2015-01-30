package view.ReturnValue;

/**
 * This GUI will be the second card example that the user will be able to work through.
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 * 
 */

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ReturnValueViewAlgorithm2 extends JPanel {


	private static final long serialVersionUID = 558449680019022130L;

	/**
	 * Create the panel.
	 */
	public ReturnValueViewAlgorithm2() {
		
		JLabel lblExample = new JLabel("Example 2");
		
		JTextArea txtrAsWithThe = new JTextArea();
		txtrAsWithThe.setText("As with the previous screen, you will be using the algorithim factorial(INSERTuserINPUThere)\r\n\r\nPlease fill out each text field with the value you think corresponds to each step in the recursive call.\r\n\r\nADD AN ALGORITHM TO AUTO GENERATE FORMAT DEPENDING ON THE INPUT PARAMETER VALUE");
		txtrAsWithThe.setBackground(UIManager.getColor("Panel.background"));
		txtrAsWithThe.setWrapStyleWord(true);
		txtrAsWithThe.setLineWrap(true);
		txtrAsWithThe.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(347)
							.addComponent(lblExample))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addComponent(txtrAsWithThe, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(253, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblExample)
					.addGap(83)
					.addComponent(txtrAsWithThe, GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
