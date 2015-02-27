package view.WorkAfter.AdvanceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.WorkAfter.WorkAfterView;

import javax.swing.JButton;

public class WAResultsButton extends JPanel {

	private static final long serialVersionUID = -1241254451190185805L;
	
	private WorkAfterView wav;

	/**
	 * Create the panel.
	 */
	public WAResultsButton(WorkAfterView w) {
		
		wav = w;
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(37, 90, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wav.advanceTut();
				
			}
		});
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setBounds(37, 21, 127, 35);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wav.mainMenu();
				
			}
		});
		setLayout(null);
		add(btnMainMenu);
		add(btnAdvance);
		

	}

}
