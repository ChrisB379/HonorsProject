package view.BaseCase.AdvanceButtons;

/**
 * This is the button panel for the NonConvergence results
 * It allows the user to go to the main menu or advance to the next tutorial
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

public class NCBCResultsButton extends JPanel {

	private static final long serialVersionUID = -5207892100204414732L;
	
	private JButton btnAdvance;
	private JButton btnMainMenu;
	
	private BaseCaseView view;

	/**
	 * Create the panel.
	 */
	public NCBCResultsButton(BaseCaseView v) {
		setOpaque(false);
		
		view = v;
		
		/*
		 * Advance Button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(10, 106, 127, 35);
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
		 * Main Menu Button
		 */
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnMainMenu.setBounds(10, 24, 127, 35);
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

	}

}
