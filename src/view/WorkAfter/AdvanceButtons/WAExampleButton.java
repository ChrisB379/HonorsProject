package view.WorkAfter.AdvanceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.WorkAfter.WAParameterController;
import view.WorkAfter.WorkAfterExample;
import view.WorkAfter.WorkAfterView;
import model.IWorkAfter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class WAExampleButton extends JPanel {


	private static final long serialVersionUID = -7504370819823395036L;
	
	private WorkAfterView wav;
	private IWorkAfter iWa;
	private WorkAfterExample waE;
	
	private WAParameterController waPc;

	/**
	 * Create the panel.
	 */
	public WAExampleButton(WorkAfterView w, IWorkAfter iW, WorkAfterExample view) {
		
		wav = w;
		iWa = iW;
		waE = view;
		
		waPc = new WAParameterController(iWa, waE);
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(waPc);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				wav.switchCards1();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(29, Short.MAX_VALUE)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
