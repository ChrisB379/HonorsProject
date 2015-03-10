package view.BaseCase.AdvanceButtons;

/**
 * This is the button panel for the NonConvergence algorithm
 * It allows the user to advance to the results page
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.JButton;

import view.BaseCase.BaseCaseView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class NCBCAlgorithmButton extends JPanel {

	private static final long serialVersionUID = -8052047834087350997L;
	
	private JButton btnAdvance;
	
	private BaseCaseView view;

	/**
	 * Create the panel.
	 */
	public NCBCAlgorithmButton(BaseCaseView v) {
		setOpaque(false);
		
		view = v;
		
		/*
		 * Advance button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(10, 106, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards5();
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
						view.switchCards5();
					}

				}
			}
		});
		
		setLayout(null);
		add(btnAdvance);

	}
	
	/**
	 * Setters for the button
	 * 
	 * One sets the button visible, the other sets it not visible
	 */
	public void setNotVis(){
		btnAdvance.setVisible(false);
	}
	
	public void setVis(){
		btnAdvance.setVisible(true);
	}

}
