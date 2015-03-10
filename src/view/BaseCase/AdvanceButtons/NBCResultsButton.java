package view.BaseCase.AdvanceButtons;

/**
 * This is the button panel for the No Base Case Results
 * 
 * It allows the user to advance to the non-covergence example
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

public class NBCResultsButton extends JPanel {

	private static final long serialVersionUID = -5066575417331492507L;
	
	private JButton btnAdvance;
	
	private BaseCaseView view;

	/**
	 * Create the panel.
	 */
	public NBCResultsButton(BaseCaseView v) {
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
				
				view.switchCards3();
				
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
						view.switchCards3();
					}

				}
			}
		});
		
		setLayout(null);
		add(btnAdvance);

	}

}
