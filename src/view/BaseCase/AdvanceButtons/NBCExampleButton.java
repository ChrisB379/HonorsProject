package view.BaseCase.AdvanceButtons;

/**
 * This is the button panel for the No Base Case Example
 * It allows the user to go to advance to the algorithm page
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.BaseCase.NoBCParameterController;
import view.BaseCase.BaseCaseView;
import view.BaseCase.NoBaseCaseExample;
import model.IBaseCase;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class NBCExampleButton extends JPanel {

	private static final long serialVersionUID = -5868685404867196672L;
	
	private JButton btnAdvance;
	
	private IBaseCase model;
	private BaseCaseView view;
	private NoBaseCaseExample nbcExample;
	
	private NoBCParameterController nbpController;

	/**
	 * Create the panel.
	 */
	public NBCExampleButton(IBaseCase m, BaseCaseView v, NoBaseCaseExample nbce) {
		setOpaque(false);
		
		model = m;
		
		view = v;
		
		nbcExample = nbce;
		
		nbpController = new NoBCParameterController(model, nbcExample);
		
		/*
		 * Advance button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(10, 106, 127, 35);
		btnAdvance.addActionListener(nbpController);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
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
