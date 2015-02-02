package view.BaseCase;

/**
 * This is the GUI for convergence. It will explain what convergence is and how it effects
 * recursion.
 * The user can enter a parameter to be used in the next GUI screen.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */


import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;

public class ConvergenceView extends JPanel {


	private static final long serialVersionUID = -2694986035472196268L;

	/**
	 * Create the panel.
	 */
	public ConvergenceView() {
		
		JTextArea textArea = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 761, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(114, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(108, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
