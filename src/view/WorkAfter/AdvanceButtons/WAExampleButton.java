package view.WorkAfter.AdvanceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.WorkAfter.WAParameterController;
import view.WorkAfter.WorkAfterExample;
import view.WorkAfter.WorkAfterView;
import model.IWorkAfter;
import java.awt.Font;

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
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(37, 90, 127, 35);
		btnAdvance.addActionListener(waPc);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				wav.switchCards1();
			}
		});
		setLayout(null);
		add(btnAdvance);

	}
}
