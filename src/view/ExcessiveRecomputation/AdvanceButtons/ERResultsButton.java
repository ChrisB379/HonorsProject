package view.ExcessiveRecomputation.AdvanceButtons;

/**
 * The buttons for the Results page
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.JButton;

import view.ExcessiveRecomputation.ExcessiveRecompView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class ERResultsButton extends JPanel {

	private static final long serialVersionUID = -3383501131991740233L;
	
	private ExcessiveRecompView view;
	
	private JButton btnAdvance;
	private JButton btnMainMenu;
	private JButton btnMemoization;

	/**
	 * Create the panel.
	 */
	public ERResultsButton(ExcessiveRecompView erv) {
		setOpaque(false);
		
		view = erv;
		
		setLayout(null);
		
		/*
		 * Advance button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
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
						btnAdvance.doClick();
					}

				}
			}
		});
		btnAdvance.setBounds(38, 175, 127, 35);
		add(btnAdvance);
		
		/*
		 * Main menu button
		 */
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
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
						btnMainMenu.doClick();
					}

				}
			}
		});
		btnMainMenu.setBounds(38, 105, 127, 35);
		add(btnMainMenu);
		
		/*
		 * Memoization button
		 */
		btnMemoization = new JButton("Memoization");
		btnMemoization.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnMemoization.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.memo();
			}
		});
		btnMemoization.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnMemoization.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						btnMemoization.doClick();
					}

				}
			}
		});
		btnMemoization.setBounds(38, 35, 127, 35);
		add(btnMemoization);

	}

}
