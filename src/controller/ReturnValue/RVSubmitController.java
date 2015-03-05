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
		
		if(view.getNVal() < 1 && view.getRtrnVal() > 0)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the value of n");
		

		if(view.getNVal() > 10 && view.getRtrnVal() > 0)
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10 for the value of n");

		if(view.getRtrnVal() < 1 && view.getNVal() > 0 && view.getNVal() < 11)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the return value");
		
		if(view.getNVal() < 1 || view.getNVal() > 10 && view.getRtrnVal() < 1)
			JOptionPane.showMessageDialog(null, "Please enter a valid number for each input");
		
		if(view.getNVal() != 0 && view.getNVal() < 11 && view.getRtrnVal() != 0){

		//Sets the users returnvalue in the model
		model.setUserReturnVal(view.getRtrnVal());
			//Changes the text to tell the user to advance to the results page
			if(view.getCount() == 1 && view.getNVal() > 0 && view.getNVal() < 11 && view.getRtrnVal() > 0){
				view.setAfterReturnText();
			}
			
			//Changes the text to tell the user this will be the final return statement
			if(view.getCount() == 2 && view.getNVal() != 0 && view.getNVal() < 11 && view.getRtrnVal() != 0){
				view.setTextField();;
			}
		
		//Decrements the counter	
		view.decrementCount();

		
		model.addToArray(view.getNVal(), view.getRtrnVal());
		
		view.addArrayString();
		view.setTxtArea();
		
		view.clearInputs();
		
		
		}
		
		if(view.getCount() > 0 && view.getNVal() > 0 && view.getNVal() < 11 && view.getRtrnVal() > 0){
			view.setNVal(0);
			view.setRtrnVal(0);
	}
	}

}
