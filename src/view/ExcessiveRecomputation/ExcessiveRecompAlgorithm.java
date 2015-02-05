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
import javax.swing.JTextPane;

public class ExcessiveRecompAlgorithm extends JPanel {

	private static final long serialVersionUID = 7616226097911941809L;
	private JTextField txtRtrnVal;
	private JTextField txtNval;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompAlgorithm() {
		
		JTextPane txtFibonacci = new JTextPane();
		txtFibonacci.setContentType("text/html");
		txtFibonacci.setText("<html>"
				+ "\r\n<code>"
				+ "\r\n<font color = rgb(127,0,85)> <b>public int</b> </font> fib(<font color = rgb(127,0,85)> <b>int </b> </font>n) {"
				+ "\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>"
				+ "\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b> </font> (n == 0 || n == 1)"
				+ "\r\n<br>\t\t  &nbsp&nbsp &nbsp&nbsp <font color = rgb(127,0,85)> <b>return </b> </font>1;"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>else</b> </font>"
				+ "\r\n<br>\t\t &nbsp&nbsp&nbsp&nbsp<font color = rgb(63,127,95)> //Recursive call</font>"
				+ "\r\n<br>\t\t   &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b> </font> fib(n-1) + fib(n-2);"
				+ "\r\n<br>\t}"
				+ "\r\n<br></code>"
				+ "\r\n</html>");
		
		txtFibonacci.setBackground(UIManager.getColor("Panel.background"));
		txtFibonacci.setEditable(false);
		
		JTextArea txtVariables = new JTextArea();
		txtVariables.setText("insert variables here");
		txtVariables.setWrapStyleWord(true);
		txtVariables.setLineWrap(true);
		txtVariables.setEditable(false);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		
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
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFibonacci, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtRtrnVal, 0, 0, Short.MAX_VALUE)
								.addComponent(txtNval, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
							.addGap(39))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(695, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtFibonacci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNval, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
									.addGap(72)
									.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(212))))
		);
		setLayout(groupLayout);

	}

}
