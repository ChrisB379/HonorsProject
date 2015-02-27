package view.ExcessiveRecomputation.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

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
		btnAdvance.setBounds(38, 175, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards3();
			}
		});
		setLayout(null);
		add(btnAdvance);

	}
	
	public void setNotVis(){
		btnAdvance.setVisible(false);
	}
	
	public void setVis(){
		btnAdvance.setVisible(true);
	}

}
