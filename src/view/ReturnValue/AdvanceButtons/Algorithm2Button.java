package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;
import view.ReturnValue.ReturnValueView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Algorithm2Button extends JPanel {


	private static final long serialVersionUID = -5966632202862554863L;
	
	private ReturnValueView r;
	
	private JButton btnAdvance;

	/**
	 * Create the panel.
	 */
	public Algorithm2Button(ReturnValueView rvv) {
		
		r = rvv;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(55, 85, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r.switchCards3();
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
