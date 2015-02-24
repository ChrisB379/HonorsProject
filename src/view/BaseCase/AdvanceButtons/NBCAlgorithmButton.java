package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import view.BaseCase.BaseCaseView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NBCAlgorithmButton extends JPanel {

	private static final long serialVersionUID = -9177244209308702350L;
	
	private JButton btnAdvance;
	
	private BaseCaseView view;


	/**
	 * Create the panel.
	 */
	public NBCAlgorithmButton(BaseCaseView v) {
		
		view = v;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards2();
				
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(331, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(244, Short.MAX_VALUE))
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
