package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.ExcessiveRecomputation.ExcessiveRecompView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ERResultsButton extends JPanel {

	private static final long serialVersionUID = -3383501131991740233L;
	
	private ExcessiveRecompView view;

	/**
	 * Create the panel.
	 */
	public ERResultsButton(ExcessiveRecompView erv) {
		
		view = erv;
		
		setLayout(null);
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.advanceTut();
			}
		});
		btnAdvance.setBounds(10, 11, 138, 36);
		add(btnAdvance);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.mainMenu();
			}
		});
		btnMainMenu.setBounds(10, 58, 138, 36);
		add(btnMainMenu);
		
		JButton btnMemoization = new JButton("Memoization");
		btnMemoization.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.memo();
			}
		});
		btnMemoization.setBounds(10, 105, 138, 36);
		add(btnMemoization);

	}

}
