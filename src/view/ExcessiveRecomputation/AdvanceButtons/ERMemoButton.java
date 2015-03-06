package view.ExcessiveRecomputation.AdvanceButtons;

/**
 * The buttons for the memoization page
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

public class ERMemoButton extends JPanel {


	private static final long serialVersionUID = -610672730586583239L;
	
	private ExcessiveRecompView view;

	/**
	 * Create the panel.
	 */
	public ERMemoButton(ExcessiveRecompView v) {
		
		view = v;
		
		/*
		 * Continue button
		 */
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnContinue.setBounds(38, 175, 127, 35);
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.memo2();
				
			}
		});
		btnContinue.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnContinue.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						view.memo2();
					}

				}
			}
		});
		setLayout(null);
		add(btnContinue);

	}

}
