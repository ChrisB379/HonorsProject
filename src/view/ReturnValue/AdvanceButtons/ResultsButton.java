package view.ReturnValue.AdvanceButtons;

/**
 * Buttons for the results page of return value
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

import javax.swing.JPanel;

import view.ReturnValue.ReturnValueView;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class ResultsButton extends JPanel {


	private static final long serialVersionUID = 8977803366756108247L;
	
	private ReturnValueView r;
	
	private JButton btnAdvance;
	private JButton btnMainMenu;

	/**
	 * Create the panel.
	 */
	public ResultsButton(ReturnValueView rvv) {
		setOpaque(false);
		
		r = rvv;
		
		/*
		 * Advance Button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(55, 85, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r.advanceTut();
				
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
		 * Main Menu Button
		 */
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnMainMenu.setBounds(55, 11, 127, 35);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r.mainMenu();
				
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
