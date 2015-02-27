package view.BaseCase.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.BaseCase.NoBCParameterController;
import view.BaseCase.BaseCaseView;
import view.BaseCase.NoBaseCaseExample;
import model.IBaseCase;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		model = m;
		
		view = v;
		
		nbcExample = nbce;
		
		nbpController = new NoBCParameterController(model, nbcExample);
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setBounds(10, 106, 115, 38);
		btnAdvance.addActionListener(nbpController);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				view.switchCards1();
				
			}
		});
		setLayout(null);
		add(btnAdvance);

	}
}
