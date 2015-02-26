package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import view.ExcessiveRecomputation.ExcessiveRecompAlgorithm;
import view.ExcessiveRecomputation.ExcessiveRecompView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ERAlgorithmButton extends JPanel {

	private static final long serialVersionUID = -5875905436774095432L;
	
	private JButton btnAdvance;
	
	private ExcessiveRecompView view;

	/**
	 * Create the panel.
	 */
	public ERAlgorithmButton(ExcessiveRecompView v) {
		
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
					.addGap(18)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(124, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(198, Short.MAX_VALUE))
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