package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;

import view.ExcessiveRecomputation.ExcessiveRecompView;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
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
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.advanceTut();
			}
		});
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.mainMenu();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnMainMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAdvance, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(92, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnMainMenu, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(192, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		view = v;

	}

}
