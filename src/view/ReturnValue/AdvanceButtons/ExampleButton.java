package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.ReturnValue.RVParameterController;
import model.IReturnValue;
import view.ReturnValue.ReturnValueExample;
import view.ReturnValue.ReturnValueView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class ExampleButton extends JPanel {


	private static final long serialVersionUID = -6156974517525499165L;
	private ReturnValueView view;
	private IReturnValue model;
	private ReturnValueExample rve;
	
	private RVParameterController p;

	/**
	 * Create the panel.
	 */
	public ExampleButton(ReturnValueView v,IReturnValue m, ReturnValueExample reg) {
		
		view = v;
		
		model = m;
		
		rve = reg;
		
		p = new RVParameterController(model, rve);
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(55, 85, 127, 35);
		btnAdvance.addActionListener(p);
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
