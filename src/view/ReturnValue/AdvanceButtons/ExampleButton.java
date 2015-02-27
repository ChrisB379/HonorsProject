package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;
import controller.ReturnValue.RVParameterController;
import model.IReturnValue;
import view.ReturnValue.ReturnValueExample;
import view.ReturnValue.ReturnValueView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btnAdvance.setBounds(55, 85, 127, 35);
		btnAdvance.addActionListener(p);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				view.switchCards1();
			}
		});
		setLayout(null);
		add(btnAdvance);

	}

}
