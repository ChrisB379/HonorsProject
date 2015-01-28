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
import javax.swing.JLabel;

public class ReturnValueViewAlgorithm extends JPanel {


	private static final long serialVersionUID = -6312065891931236710L;

	/**
	 * Create the panel.
	 */
	public ReturnValueViewAlgorithm() {
		
		JLabel lblInsertAlgorithmHere = new JLabel("insert algorithm here");
		add(lblInsertAlgorithmHere);

	}

}
