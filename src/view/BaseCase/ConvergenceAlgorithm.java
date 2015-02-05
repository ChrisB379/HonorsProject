package view.BaseCase;

/**
 *  This is the second last GUI for the base case series. 
 *  It shows the algorithm used that lets the user work through it
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
import javax.swing.JButton;

import view.JTextFieldLimit;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class ConvergenceAlgorithm extends JPanel {


	private static final long serialVersionUID = 8043846668298510041L;
	private JTextField txtNVal;
	private JTextField txtRtrnVal;

	/**
	 * Create the panel.
	 */
	public ConvergenceAlgorithm() {
		
		JTextPane txtConvergence = new JTextPane();
		txtConvergence.setContentType("text/html");
		txtConvergence.setToolTipText("");
		txtConvergence.setBackground(UIManager.getColor("Panel.background"));
		txtConvergence.setEditable(false);
		txtConvergence.setText("<html>\r\n<code>\r\n<font color = rgb(127,0,85)> <b>public int</b> </font> convergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> convergence(n+1) + 2*n;\r\n<br>\t}\r\n</code>\r\n</html>");
		
		JTextArea txtVariables = new JTextArea();
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setEditable(false);
		txtVariables.setText("Insert variables here");
		
		JTextArea txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");
		
		JTextArea txtrTheReturnValue = new JTextArea();
		txtrTheReturnValue.setBackground(UIManager.getColor("Panel.background"));
		txtrTheReturnValue.setWrapStyleWord(true);
		txtrTheReturnValue.setLineWrap(true);
		txtrTheReturnValue.setEditable(false);
		txtrTheReturnValue.setText("The return value is :");
		
		txtNVal = new JTextField();
		txtNVal.setDocument(new JTextFieldLimit(2));
		txtNVal.setColumns(10);
		
		txtRtrnVal = new JTextField();
		txtRtrnVal.setDocument(new JTextFieldLimit(2));
		txtRtrnVal.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		
		JLabel lblExample = new JLabel("Example 2");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(484)
							.addComponent(lblExample))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(53)
									.addComponent(txtConvergence))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(90)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
											.addGap(31)
											.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))
							.addGap(195)
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblExample)
							.addGap(26)
							.addComponent(txtConvergence, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
					.addGap(65)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheReturnValue, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(112)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(278, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
