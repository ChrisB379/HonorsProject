package view.WorkAfter.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.WorkAfter.WorkAfterView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WAAlgorithmButton extends JPanel {

	private JButton btnAdvance;
	
	private WorkAfterView wav;

	private static final long serialVersionUID = 8299992537400276824L;

	/**
	 * Create the panel.
	 */
	public WAAlgorithmButton(WorkAfterView wa) {
		
		wav = wa;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(37, 90, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Switches card panels
				wav.switchCards2();
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
