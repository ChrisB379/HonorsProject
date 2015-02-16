package controller.BaseCase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseCase;
import view.BaseCase.NoBaseCaseExample;

/**
 * This is a controller for sending the parameter back and forth from the NoBaseCaseExample class
 * 
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */


public class NoBCParameterController implements ActionListener {
	
	private BaseCase model;
	private NoBaseCaseExample view;
	
	
	public NoBCParameterController(BaseCase bc, NoBaseCaseExample nbce) {
		
		model = bc;
		
		view = nbce;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.setParam(view.getParameter());
		System.out.println("Parameter Controller model param shows " + model.getParam());
		
	}

}
