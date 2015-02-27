package controller.WorkAfter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IWorkAfter;
import view.WorkAfter.WorkAfterAlgorithm;

/**
 * This will be used for pulling the value of n and displaying it
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */

public class WAAlgorithmController implements ActionListener {
	
	private IWorkAfter model;
	
	private WorkAfterAlgorithm view;
	
	public WAAlgorithmController(IWorkAfter m, WorkAfterAlgorithm v) {
		
		model = m;
		
		view = v;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("models value is " + model.getParam());
		view.setParameter(model.getParam());
		System.out.println(view.getParameter());
		
	}
	
	

}
