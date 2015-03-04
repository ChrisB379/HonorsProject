package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.ExcessiveRecomputation.ExcessiveRecompView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ERExampleButton extends JPanel {

	private static final long serialVersionUID = -4738531129819420383L;
	
	private ExcessiveRecompView view;


	/**
	 * Create the panel.
	 */
	public ERExampleButton(ExcessiveRecompView v) {
		
		view = v;
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(38, 175, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards1();
			}
		});
		setLayout(null);
		add(btnAdvance);

	}

}
