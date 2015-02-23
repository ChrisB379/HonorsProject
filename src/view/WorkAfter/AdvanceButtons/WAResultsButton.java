package view.WorkAfter.AdvanceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.WorkAfter.WorkAfterView;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
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
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wav.advanceTut();
				
			}
		});
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wav.mainMenu();
				
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnMainMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
						.addComponent(btnAdvance, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
					.addGap(49))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnMainMenu, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		

	}

}
