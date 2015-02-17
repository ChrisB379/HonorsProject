package controller.ReturnValue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ReturnValue.ReturnValueAlgorithm;
import model.IReturnValue;

/**
 * This is a controller for sending the users inputs back to the ReturnValue
 * in order to put them into an arraylist
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */

public class RVSubmitController implements ActionListener {
	
	private IReturnValue model;
	
	private ReturnValueAlgorithm view;
	
	public RVSubmitController(IReturnValue m,ReturnValueAlgorithm v) {
		
		model = m;
		
		view = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("getCount " + view.getCount());
			if(view.getCount() == 0){
				view.hideSubmit();
			}
		
		model.addToArray(view.getNVal(), view.getRtrnVal());
		view.setTxtVariables();
		
		System.out.println("Return array");
		for(int j = 0; j < model.retArr().size(); j++) {   
		    System.out.print(model.retArr().get(j));
		}
		System.out.println("");
		System.out.println("parameter n array");
		
		for(int k = 0; k < model.paramArr().size(); k++) {   
		    System.out.print(model.paramArr().get(k));
		}
		System.out.println("");
		
		view.decrementCount();
	}

}
