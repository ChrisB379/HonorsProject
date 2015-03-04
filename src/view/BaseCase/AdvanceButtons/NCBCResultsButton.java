package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;
import view.BaseCase.BaseCaseView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class NCBCResultsButton extends JPanel {

	private static final long serialVersionUID = -5207892100204414732L;
	
	private JButton btnAdvance;
	private JButton btnMainMenu;
	
	private BaseCaseView view;

	/**
	 * Create the panel.
	 */
	public NCBCResultsButton(BaseCaseView v) {
		
		view = v;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(10, 106, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.advanceTut();
			}
		});
		
		
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnMainMenu.setBounds(10, 24, 127, 35);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.mainMenu();
				
			}
		});
		setLayout(null);
		add(btnMainMenu);
		add(btnAdvance);

	}

}
