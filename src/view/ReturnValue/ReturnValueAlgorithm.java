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

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class ReturnValueAlgorithm extends JPanel {


	private static final long serialVersionUID = -6312065891931236710L;
	private JTextField txtNVal;
	private JTextField txtRtrnVal;
	

	/**
	 * Create the panel.
	 */
	public ReturnValueAlgorithm() {
		setBorder(null);
		//blue rgb value (0,0,192)
		//purple rgb value (127,0,85)

		JTextPane txtFactorial = new JTextPane();
		txtFactorial.setContentType("text/html");
		txtFactorial.setBorder(BorderFactory.createLineBorder(Color.black));
		txtFactorial.setBackground(Color.WHITE);
		txtFactorial.setText("<html> <code> <font color = rgb(127,0,85)> <b>public static</b> </font> int factorial(<font color = rgb(127,0,85)><b>int</b> </font> n) {   "
				+ "<br> <font color = rgb(127,0,85)><b>if</b></font> (n == 1) <br>&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; "
				+ "<br> <font color = rgb(127,0,85)><b>return</b></font> n * factorial(n-1); "
				+ "<br>} </code> </html>");
		txtFactorial.setEditable(false);
		
		JTextArea txtVariables = new JTextArea();
		txtVariables.setBorder(BorderFactory.createLineBorder(Color.black));
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setEditable(false);
		txtVariables.setText("Variables will be inserted here");
		
		JTextArea txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");
		
		txtNVal = new JTextField();
		//Setting a limit on how many digits can be entered.7 should suffice for this question as 10! = 3628800
		txtNVal.setDocument(new JTextFieldLimit(7));
		txtNVal.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		
		JTextArea txtrTheCurrent = new JTextArea();
		txtrTheCurrent.setBackground(UIManager.getColor("Panel.background"));
		txtrTheCurrent.setWrapStyleWord(true);
		txtrTheCurrent.setLineWrap(true);
		txtrTheCurrent.setEditable(false);
		txtrTheCurrent.setText("The current return value is :");
		
		txtRtrnVal = new JTextField();
		//Setting a limit on how many digits can be entered.7 should suffice for this question as 10! = 3628800
		txtRtrnVal.setDocument(new JTextFieldLimit(7));
		txtRtrnVal.setColumns(10);
		
		JLabel lblExample = new JLabel("Example 1");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(60)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtrTheCurrent, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
										.addComponent(txtFactorial, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
									.addGap(19)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(85)
											.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(5)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))))
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(392)
							.addComponent(lblExample)))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblExample)
							.addGap(19)
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addComponent(txtFactorial, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addGap(57)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheCurrent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(98)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(219, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	

}
