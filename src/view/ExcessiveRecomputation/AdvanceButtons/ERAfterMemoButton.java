package view.ExcessiveRecomputation.AdvanceButtons;

/**
 * The button for the second memoization page
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

import javax.swing.JPanel;

import view.ExcessiveRecomputation.ExcessiveRecompView;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class ERAfterMemoButton extends JPanel {

	private static final long serialVersionUID = 8753151140462745881L;
	
	private ExcessiveRecompView view;

	/**
	 * Create the panel.
	 */
	public ERAfterMemoButton(ExcessiveRecompView v) {
		setOpaque(false);
		
		/*
		 * Advance button
		 */
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(38, 175, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.advanceTut();
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
						view.advanceTut();
					}

				}
			}
		});
		
		/*
		 * Main Menu button
		 */
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnMainMenu.setBounds(38, 105, 127, 35);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.mainMenu();
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
						view.mainMenu();
					}

				}
			}
		});
		setLayout(null);
		add(btnMainMenu);
		add(btnAdvance);
		
		view = v;

	}

}
