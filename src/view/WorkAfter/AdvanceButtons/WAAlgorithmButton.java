package view.WorkAfter.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.WorkAfter.WorkAfterView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

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
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(37, 90, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Switches card panels
				wav.switchCards2();
			}
		});
		btnAdvance.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnAdvance.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						wav.switchCards2();
					}

				}
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
