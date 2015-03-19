package view.WorkAfter.AdvanceButtons;

/**
 * Buttons for the results panel in work after
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import view.WorkAfter.WorkAfterView;

import javax.swing.JButton;

import java.awt.Font;

public class WAResultsButton extends JPanel {

	private static final long serialVersionUID = -1241254451190185805L;
	
	private WorkAfterView wav;
	private JButton btnAdvance;
	private JButton btnMainMenu;

	/**
	 * Create the panel.
	 */
	public WAResultsButton(WorkAfterView w) {
		setOpaque(false);
		
		wav = w;
		
		/*
		 * Advance button to go to the next tutorial
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(37, 90, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wav.advanceTut();
				
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
						btnAdvance.doClick();
					}

				}
			}
		});
		
		/*
		 * Main Menu button
		 */
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnMainMenu.setBounds(37, 21, 127, 35);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wav.mainMenu();
				
			}
		});
		btnMainMenu.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnMainMenu.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						btnMainMenu.doClick();
					}

				}
			}
		});
		setLayout(null);
		add(btnMainMenu);
		add(btnAdvance);
		

	}

}
