package controller.ReturnValue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import model.ReturnValue;
import view.ReturnValue.ReturnValueExample;

/**
 * This is a controller for sending the parameter back and forth from the returnValueExample class
 * 
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */

public class RVParameterController implements ActionListener {
	
	private ReturnValue model;
	
	private ReturnValueExample view;
	
	public RVParameterController(ReturnValue m, ReturnValueExample v){
		
		model = m;
		view = v;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		model.setParam(view.getParameter());
		System.out.println("Parameter Controller model param shows " + model.getParam());
		
	}


//	@Override
//	public void focusGained(FocusEvent arg0) {
//		// TODO Auto-generated method stub
//		
//		model.setParam(view.getParameter());
//		System.out.println("focus gained " + view.getParameter());
//	}
//
//	@Override
//	public void focusLost(FocusEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("we get here");
//		System.out.println("focus lost " + view.getParameter());
//		model.setParam(view.getParameter());
//		System.out.println(model.getParam());
//		System.out.println(view.getParameter());
//		
//	}

}
