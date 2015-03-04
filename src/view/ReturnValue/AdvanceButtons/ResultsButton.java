package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;

import view.ReturnValue.ReturnValueView;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ResultsButton extends JPanel {


	private static final long serialVersionUID = 8977803366756108247L;
	
	private ReturnValueView r;

	/**
	 * Create the panel.
	 */
	public ResultsButton(ReturnValueView rvv) {
		
		r = rvv;
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(55, 85, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r.advanceTut();
				
			}
		});
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnMainMenu.setBounds(55, 11, 127, 35);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r.mainMenu();
				
			}
		});
		setLayout(null);
		add(btnMainMenu);
		add(btnAdvance);
		
		

	}

}
