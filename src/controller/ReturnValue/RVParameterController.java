package controller.ReturnValue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IReturnValue;
import view.ReturnValue.ReturnValueExample;

/**
 * This is a controller for sending the parameter back from the ReturnValueExample class
 * 
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */

public class RVParameterController implements ActionListener {
	
	private IReturnValue model;
	
	private ReturnValueExample view;
	
	public RVParameterController(IReturnValue m, ReturnValueExample v){
		
		model = m;
		view = v;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.setParam(view.getParameter());
		
	}

}
