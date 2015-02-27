package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;

import view.ExcessiveRecomputation.ExcessiveRecompView;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ERAfterMemoButton extends JPanel {

	private static final long serialVersionUID = 8753151140462745881L;
	
	private ExcessiveRecompView view;

	/**
	 * Create the panel.
	 */
	public ERAfterMemoButton(ExcessiveRecompView v) {
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(38, 175, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.advanceTut();
			}
		});
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setBounds(38, 105, 127, 35);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.mainMenu();
			}
		});
		setLayout(null);
		add(btnMainMenu);
		add(btnAdvance);
		
		view = v;

	}

}
