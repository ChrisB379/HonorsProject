package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import view.ExcessiveRecomputation.ExcessiveRecompView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ERMemoButton extends JPanel {


	private static final long serialVersionUID = -610672730586583239L;
	
	private ExcessiveRecompView view;

	/**
	 * Create the panel.
	 */
	public ERMemoButton(ExcessiveRecompView v) {
		
		view = v;
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.memo2();
				
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(btnContinue, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnContinue, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(205, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
