package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import view.ReturnValue.ReturnValueView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlgorithmButton extends JPanel {


	private static final long serialVersionUID = 6390141844240166488L;
	private ReturnValueView r;

	/**
	 * Create the panel.
	 */
	public AlgorithmButton(ReturnValueView rvv) {
		
		r = rvv;
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r.switchCards2();
				
			}
		});
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(btnAdvance)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(70)
					.addComponent(btnAdvance)
					.addContainerGap(87, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
