package view.ReturnValue;

/**
 * This GUI will show an example of the factorial algorithm with a work through of how to calculate the final answer.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;

public class ReturnValueViewAlgorithmExample extends JPanel {


	private static final long serialVersionUID = -3578796091219375513L;

	/**
	 * Create the panel.
	 */
	public ReturnValueViewAlgorithmExample() {
		setBorder(null);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 818, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 587, Short.MAX_VALUE)
		);
		setLayout(groupLayout);

	}

}
