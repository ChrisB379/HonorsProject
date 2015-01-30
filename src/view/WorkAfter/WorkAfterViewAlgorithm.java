package view.WorkAfter;

/**
 * Showing the algorithm used for work after examples section which the user will work through.
 * This is based on the parameter entered from the previous GUI screen.
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.JTextFieldLimit;

public class WorkAfterViewAlgorithm extends JPanel {


	private static final long serialVersionUID = -1965751494479483614L;
	private JTextField txtNval;
	private JTextField txtRtrnVal;

	/**
	 * Create the panel.
	 */
	public WorkAfterViewAlgorithm() {
		
		JLabel lblExample = new JLabel("Example");
		
		JTextArea txtrDsfdsfs = new JTextArea();
		txtrDsfdsfs.setText("public void workAfter(int n){\r\n\tint x = 0;\r\n\t\t\r\n\tint[] numbers = new int[n];\r\n\t\t\r\n\t//Fills the numbers array from 0 to n and fills each \r\n        //space with the value n\r\n\tArrays.fill(numbers, 0, n, n);\r\n\t\t\r\n\t//Recursive call\r\n\tif(n > 1)\r\n\tworkAfter(n-1);\r\n\t\t\r\n\t//Base case\r\n\tif(n == 1){\r\n\tfor(int num : numbers)\r\n\t\tx = num + 5;\r\n\t\t\r\n\tSystem.out.println(\"Value of x is \" + x);\r\n\t\t\r\n\t\t\r\n\t}\r\n\t\t\r\n}");
		txtrDsfdsfs.setBackground(UIManager.getColor("Panel.background"));
		txtrDsfdsfs.setWrapStyleWord(true);
		txtrDsfdsfs.setLineWrap(true);
		txtrDsfdsfs.setEditable(false);
		
		JTextArea txtrAsdad = new JTextArea();
		txtrAsdad.setBackground(UIManager.getColor("Panel.background"));
		txtrAsdad.setEditable(false);
		txtrAsdad.setLineWrap(true);
		txtrAsdad.setWrapStyleWord(true);
		txtrAsdad.setText("Variables will be inserted here");
		
		JTextArea txtrTheValueOf = new JTextArea();
		txtrTheValueOf.setBackground(UIManager.getColor("Panel.background"));
		txtrTheValueOf.setWrapStyleWord(true);
		txtrTheValueOf.setLineWrap(true);
		txtrTheValueOf.setEditable(false);
		txtrTheValueOf.setText("The value of n is :");
		
		JTextArea txtrTheCurrentReturn = new JTextArea();
		txtrTheCurrentReturn.setBackground(UIManager.getColor("Panel.background"));
		txtrTheCurrentReturn.setWrapStyleWord(true);
		txtrTheCurrentReturn.setLineWrap(true);
		txtrTheCurrentReturn.setEditable(false);
		txtrTheCurrentReturn.setText("The current return value is :");
		
		txtNval = new JTextField();
		txtNval.setDocument(new JTextFieldLimit(7));
		txtNval.setColumns(10);
		
		txtRtrnVal = new JTextField();
		txtRtrnVal.setDocument(new JTextFieldLimit(7));
		txtRtrnVal.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(txtrDsfdsfs, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(txtrAsdad, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(374)
							.addComponent(lblExample))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtNval, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblExample)
							.addGap(33)
							.addComponent(txtrDsfdsfs, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addComponent(txtrAsdad, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNval, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(63, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
