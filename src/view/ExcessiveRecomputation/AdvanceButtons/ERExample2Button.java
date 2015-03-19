package view.ExcessiveRecomputation.AdvanceButtons;

/**
 * The buttons for the second example page
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.ExcessiveRecomputation.ERParameterController;
import model.IExcessiveRecomp;
import view.ExcessiveRecomputation.ExcessiveRecompExample2;
import view.ExcessiveRecomputation.ExcessiveRecompView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class ERExample2Button extends JPanel {

	private static final long serialVersionUID = 8583920237425750107L;
	
	private ExcessiveRecompView view;
	private IExcessiveRecomp model;
	private ExcessiveRecompExample2 ere2;
	
	private ERParameterController erpc;
	
	private JButton btnAdvance;

	/**
	 * Create the panel.
	 */
	public ERExample2Button(ExcessiveRecompView v, IExcessiveRecomp m, ExcessiveRecompExample2 erex2) {
		setOpaque(false);
		
		model = m;
		view = v;
		ere2 = erex2;
		
		erpc = new ERParameterController(model, ere2);
		
		/*
		 * Advance button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(38, 175, 127, 35);
		btnAdvance.addActionListener(erpc);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.switchCards2();
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
		setLayout(null);
		add(btnAdvance);

	}

}
