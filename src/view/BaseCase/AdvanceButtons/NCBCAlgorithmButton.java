package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.BaseCase.BaseCaseView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NCBCAlgorithmButton extends JPanel {

	private static final long serialVersionUID = -8052047834087350997L;
	
	private JButton btnAdvance;
	
	private BaseCaseView view;

	/**
	 * Create the panel.
	 */
	public NCBCAlgorithmButton(BaseCaseView v) {
		
		view = v;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(10, 106, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards5();
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
