package controller.BaseCase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.BaseCase.ConvergenceExample;
import model.BaseCase;
import model.IBaseCase;

/**
 * This is a controller for sending the parameter back and forth from the ConvergenceExample class
 * 
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */


public class ConvParameterController implements ActionListener {
	
	private IBaseCase model;
	private ConvergenceExample view;
	
	public ConvParameterController(IBaseCase bc, ConvergenceExample convE) {

		model = bc;
		
		view = convE;

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.setParam(view.getParameter());
		System.out.println("Parameter Controller model param shows " + model.getParam());
		
	}

}
