package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import controller.ExcessiveRecomputation.ERParameterController;
import model.IExcessiveRecomp;
import view.ExcessiveRecomputation.ExcessiveRecompExample2;
import view.ExcessiveRecomputation.ExcessiveRecompView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ERExample2Button extends JPanel {

	private static final long serialVersionUID = 8583920237425750107L;
	
	private ExcessiveRecompView view;
	private IExcessiveRecomp model;
	private ExcessiveRecompExample2 ere2;
	
	private ERParameterController erpc;

	/**
	 * Create the panel.
	 */
	public ERExample2Button(ExcessiveRecompView v, IExcessiveRecomp m, ExcessiveRecompExample2 erex2) {
		
		model = m;
		view = v;
		ere2 = erex2;
		
		erpc = new ERParameterController(model, ere2);
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(erpc);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.switchCards2();
			}
		});
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(158, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
