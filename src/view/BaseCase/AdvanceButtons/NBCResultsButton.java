package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
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
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards3();
				
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(342, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(245, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
