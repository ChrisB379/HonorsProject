package view.ExcessiveRecomputation.AdvanceButtons;

/**
 * The buttons for the Example page
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

public class ERExampleButton extends JPanel {

	private static final long serialVersionUID = -4738531129819420383L;
	
	private ExcessiveRecompView view;


	/**
	 * Create the panel.
	 */
	public ERExampleButton(ExcessiveRecompView v) {
		setOpaque(false);
		
		view = v;
		
		/*
		 * Advance button
		 */
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(38, 175, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.switchCards1();
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
						view.switchCards1();
					}

				}
			}
		});
		setLayout(null);
		add(btnAdvance);

	}

}
