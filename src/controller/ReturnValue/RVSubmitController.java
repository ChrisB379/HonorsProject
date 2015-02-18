package controller.ReturnValue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
		
		if(view.getNVal() == 0)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the value of n");
		
		if(view.getNVal() > 10)
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10 for the value of n");
		
		if(view.getRtrnVal() == 0)
			JOptionPane.showMessageDialog(null, "Please enter a number for the return value");
		
		if(view.getNVal() != 0 && view.getNVal() < 11 && view.getRtrnVal() != 0){
		System.out.println("getCount " + view.getCount());
			//Changes the text to tell the user to advance to the results page
			if(view.getCount() == 1){
				view.setAfterReturnText();
			}
			
			//Changes the text to tell the user this will be the final return statement
			if(view.getCount() == 2){
				view.setTextField();;
			}
		
		//Decrements the counter	
		view.decrementCount();
		
		
		model.addToArray(view.getNVal(), view.getRtrnVal());
		
		view.addArrayString();
		view.setTxtArea();
		
		System.out.println("Return array");
		for(int j = 0; j < model.retArr().size(); j++) {   
		    System.out.print(model.retArr().get(j) + ",");
		}
		System.out.println("");
		System.out.println("parameter n array");
		
		for(int k = 0; k < model.paramArr().size(); k++) {   
		    System.out.print(model.paramArr().get(k) + ",");
		}
		System.out.println("");
		
		}
	}

}
