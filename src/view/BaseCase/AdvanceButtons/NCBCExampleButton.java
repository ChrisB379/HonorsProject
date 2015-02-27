package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.BaseCase.BaseCaseView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NCBCExampleButton extends JPanel {

	private static final long serialVersionUID = -8243988718005325L;
	
	private JButton btnAdvance;
	
	private BaseCaseView view;


	/**
	 * Create the panel.
	 */
	public NCBCExampleButton(BaseCaseView v) {
		
		view = v;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(10, 106, 115, 38);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards4();
			}
		});
		setLayout(null);
		add(btnAdvance);

	}

}
