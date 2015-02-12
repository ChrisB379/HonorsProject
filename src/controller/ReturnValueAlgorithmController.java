package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ReturnValue;
import view.ReturnValue.ReturnValueAlgorithm;

/**
 * This will be used for pulling the value of n and displaying it
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */

public class ReturnValueAlgorithmController implements ActionListener {
	
	private ReturnValue model;
	
	private ReturnValueAlgorithm view;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		view.setParameter(model.getParam());
		
	}
	
	

}
