package controller.ExcessiveRecomputation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IExcessiveRecomp;
import view.ExcessiveRecomputation.ExcessiveRecompExample2;

/**
 * This is a controller for sending the parameter back and forth from the ExcessiveRecompExample2 class
 * 
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */


public class ERParameterController implements ActionListener {
	
	private IExcessiveRecomp model;
	private ExcessiveRecompExample2 view;
	
	
	public ERParameterController(IExcessiveRecomp er, ExcessiveRecompExample2 erEx) {
		
		model = er;
		
		view = erEx;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.setParam(view.getParameter());
		System.out.println("Parameter Controller model param shows " + model.getParam());
		
	}

}
