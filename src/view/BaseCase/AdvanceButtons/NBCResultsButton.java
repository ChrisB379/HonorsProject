package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.BaseCase.BaseCaseView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NBCResultsButton extends JPanel {

	private static final long serialVersionUID = -5066575417331492507L;
	
	private JButton btnAdvance;
	
	private BaseCaseView view;

	/**
	 * Create the panel.
	 */
	public NBCResultsButton(BaseCaseView v) {
		
		view = v;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(10, 106, 115, 38);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards3();
				
			}
		});
		setLayout(null);
		add(btnAdvance);

	}

}
