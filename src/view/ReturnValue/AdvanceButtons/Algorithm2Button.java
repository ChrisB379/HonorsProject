package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import view.ReturnValue.ReturnValueView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Algorithm2Button extends JPanel {


	private static final long serialVersionUID = -5966632202862554863L;
	
	private ReturnValueView r;

	/**
	 * Create the panel.
	 */
	public Algorithm2Button(ReturnValueView rvv) {
		
		r = rvv;
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r.switchCards3();
			}
		});
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(70)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
