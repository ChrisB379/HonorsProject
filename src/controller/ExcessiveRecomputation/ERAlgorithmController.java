package controller.ExcessiveRecomputation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IExcessiveRecomp;
import view.ExcessiveRecomputation.ExcessiveRecompAlgorithm;

public class ERAlgorithmController implements ActionListener {
	
	private IExcessiveRecomp model;
	
	private ExcessiveRecompAlgorithm view;
	
	public ERAlgorithmController(IExcessiveRecomp m, ExcessiveRecompAlgorithm v) {
		
		model = m;
		
		view = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("models value is " + model.getParam());
		view.setParameter(model.getParam());
		System.out.println(view.getParameter());
		
	}

}
