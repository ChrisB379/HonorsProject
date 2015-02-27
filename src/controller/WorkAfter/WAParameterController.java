package controller.WorkAfter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IWorkAfter;
import view.WorkAfter.WorkAfterExample;

/**
 * This is a controller for sending the parameter back and forth from the WorkAfterExample class
 * 
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */


public class WAParameterController implements ActionListener {
	
	private IWorkAfter model;
	private WorkAfterExample view;
	
	
	public WAParameterController(IWorkAfter wa, WorkAfterExample wae) {
		
		model = wa;
		
		view = wae;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.setParam(view.getParameter());
		System.out.println("Parameter Controller model param shows " + model.getParam());
		
	}

}
