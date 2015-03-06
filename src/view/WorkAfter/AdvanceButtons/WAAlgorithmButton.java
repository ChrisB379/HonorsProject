package view.WorkAfter.AdvanceButtons;

/**
 * Button for the algorithm panel in work after
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

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
		
		/*
		 * Advance button
		 */
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
	
	/*
	 * Setters to make the button visible/invisible
	 */
	public void setNotVis(){
		btnAdvance.setVisible(false);
	}
	
	public void setVis(){
		btnAdvance.setVisible(true);
	}

}
