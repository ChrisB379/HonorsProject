package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;
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
		btnContinue.setBounds(38, 175, 127, 35);
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.memo2();
				
			}
		});
		setLayout(null);
		add(btnContinue);

	}

}
