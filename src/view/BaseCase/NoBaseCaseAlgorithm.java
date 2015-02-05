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

import view.JTextFieldLimit;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class NoBaseCaseAlgorithm extends JPanel {

	private static final long serialVersionUID = 2183900996591652759L;
	private JTextField txtNVal;
	private JTextField txtRtrnVal;

	/**
	 * Create the panel.
	 */
	public NoBaseCaseAlgorithm() {
		
		JTextPane txtAlgorithm = new JTextPane();
		txtAlgorithm.setContentType("text/html");
		txtAlgorithm.setText("<html>"
				+ "\r\n<code>"
				+ "\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> noBaseCase(<font color = rgb(127,0,85)><b>int </b> </font> n) {"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> noBaseCase(n-1) + n;"
				+ "\r\n<br>"
				+ "\t}\r\n</code>\r\n"
				+ "</html>");
		
		txtAlgorithm.setBackground(UIManager.getColor("Panel.background"));
		txtAlgorithm.setEditable(false);
		
		JTextArea txtVariables = new JTextArea();
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");
		
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
		txtNVal.setDocument(new JTextFieldLimit(2));
		txtNVal.setColumns(10);
		
		txtRtrnVal = new JTextField();
		txtRtrnVal.setDocument(new JTextFieldLimit(2));
		txtRtrnVal.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		
		JLabel lblExample = new JLabel("Example 1");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
							.addGap(154)
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE)
								.addComponent(txtNVal, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(498)
							.addComponent(lblExample)))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblExample)
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
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
