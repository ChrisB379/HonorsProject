package view.BaseCase;

/**
 * This is the GUI for the explanation of base cases, in this cause when there is no base case.
 * It will explain why its bad and why a base case is required.
 * The user will be able to pick a parameter for the algorithm in the next GUI screen.
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
import javax.swing.LayoutStyle.ComponentPlacement;

import view.JTextFieldLimit;

public class NoBaseCaseExample extends JPanel {

	private static final long serialVersionUID = -62914920035463994L;
	private JTextField txtParameterField;

	/**
	 * Create the panel.
	 */
	public NoBaseCaseExample() {
		
		JTextArea txtrTheFirstOf = new JTextArea();
		txtrTheFirstOf.setText("The first of the two algorithms on base case we are going to look at is the noBaseCase method. As the name suggests, this is a simple recursive call which has no base case.\r\n\r\nThe implications of not having a base case are that the recursive call will never stop and will instead go into an infinite loop until a stack overflow occurs causing a crash or failure.\r\n\r\nThe algorithm for this example is as follows:\r\n\r\n\r\n\tpublic int noBaseCase(int n) {\r\n\t\t\r\n\t\treturn noBaseCase(n-1) + n;\r\n\t}\r\n\r\nHow it works:\r\nThis is an extremely simple method and thus not much explanation is needed due to there only being one line of code.\r\n\r\nStep 1: There is only one line of code to be executed which is the recursive call. Thus no work is done, the return statement simply recursively calls itself.\r\n\r\nStep 2: This repeats until a stack overflow occurs.\r\n\r\n\r\n\r\nNext you will be working through your own example of this algorithm. Please enter a number in the field provided which will be the parameter for your algorithm. noBaseCase(n)");
		txtrTheFirstOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheFirstOf.setWrapStyleWord(true);
		txtrTheFirstOf.setLineWrap(true);
		txtrTheFirstOf.setEditable(false);
		
		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrTheFirstOf, GroupLayout.PREFERRED_SIZE, 897, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(txtrTheFirstOf, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(232, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
