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
import javax.swing.JTextPane;
import java.awt.Color;

public class WorkAfterAlgorithm extends JPanel {


	private static final long serialVersionUID = -1965751494479483614L;
	private JTextField txtNval;
	private JTextField txtRtrnVal;

	/**
	 * Create the panel.
	 */
	public WorkAfterAlgorithm() {
		
		JLabel lblExample = new JLabel("Example");
		
		JTextPane txtAlgorithm = new JTextPane();
		txtAlgorithm.setContentType("text/html");
		txtAlgorithm.setText("<html>"
				+ "\r\n<code> \r\n"
				+ "<br>\t<font color = rgb(127,0,85)><b>public void</b></font> workAfterNew(<font color = rgb(127,0,85)><b>int</b> </font> n){"
				+ "\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)"
				+ "\r\n<br>\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>Base case statement</font> \" + n);"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>else</b> </font>"
				+ "\r\n<br>\t\t\t&nbsp&nbsp workAfterNew(n-1);"
				+ "\r\n<br>\t\t\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>After the recursive call</font> \" + n*2);"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>"
				+ "\t\t\r\n<br>"
				+ "\t}\r\n<br>"
				+ "</code> \r\n\r\n"
				+ "</html>");
		
		txtAlgorithm.setBackground(Color.WHITE);
		txtAlgorithm.setEditable(false);
		
		JTextArea txtVariables = new JTextArea();
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setEditable(false);
		txtVariables.setLineWrap(true);
		txtVariables.setWrapStyleWord(true);
		txtVariables.setText("Variables will be inserted here");
		
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
							.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(374)
							.addComponent(lblExample))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtNval, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblExample)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtVariables, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtAlgorithm, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
							.addGap(122)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrTheValueOf, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNval, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrTheCurrentReturn, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRtrnVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(48)
							.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(155, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
