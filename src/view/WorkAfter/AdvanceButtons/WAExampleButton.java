package view.WorkAfter.AdvanceButtons;

/**
 * Button for the example panel in work after
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
import javax.swing.JButton;

import controller.WorkAfter.WAParameterController;
import view.WorkAfter.WorkAfterExample;
import view.WorkAfter.WorkAfterView;
import model.IWorkAfter;

import java.awt.Font;

public class WAExampleButton extends JPanel {


	private static final long serialVersionUID = -7504370819823395036L;
	
	private WorkAfterView wav;
	private IWorkAfter iWa;
	private WorkAfterExample waE;
	
	private WAParameterController waPc;

	/**
	 * Create the panel.
	 */
	public WAExampleButton(WorkAfterView w, IWorkAfter iW, WorkAfterExample view) {
		
		wav = w;
		iWa = iW;
		waE = view;
		
		waPc = new WAParameterController(iWa, waE);
		
		/*
		 * Advance button
		 */
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(37, 90, 127, 35);
		btnAdvance.addActionListener(waPc);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				wav.switchCards1();
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
						wav.switchCards1();
					}

				}
			}
		});
		setLayout(null);
		add(btnAdvance);

	}
}
