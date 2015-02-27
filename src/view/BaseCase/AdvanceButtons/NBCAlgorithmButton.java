package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
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
		btnAdvance.setBounds(10, 106, 115, 38);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards2();
				
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
