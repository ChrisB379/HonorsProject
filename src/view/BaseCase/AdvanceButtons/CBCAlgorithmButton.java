package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import view.BaseCase.BaseCaseView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CBCAlgorithmButton extends JPanel {

	private static final long serialVersionUID = -8052047834087350997L;
	
	private JButton btnAdvance;
	
	private BaseCaseView view;

	/**
	 * Create the panel.
	 */
	public CBCAlgorithmButton(BaseCaseView v) {
		
		view = v;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards5();
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(333, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(250, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public void setNotVis(){
		btnAdvance.setVisible(false);
	}
	
	public void setVis(){
		btnAdvance.setVisible(true);
	}

}
