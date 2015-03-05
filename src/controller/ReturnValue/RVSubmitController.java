package controller.ReturnValue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.ReturnValue.ReturnValueAlgorithm;
import model.IReturnValue;

/**
 * This is a controller for the submit button in the ReturnValueAlgorithm
 * 
 * It deals with input validation 
 * 
 * If inputs are valid then it deals with the visibility of components in order to continue
 * the programs progression in a meaningful and clean way
 * 
 * @author Christopher Baillie
 * @version 2.0
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
		/*
		 * Input validation with dialog boxes
		 */
		if(view.getNVal() < 1 && view.getRtrnVal() > 0)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the value of n");
		

		if(view.getNVal() > 10 && view.getRtrnVal() > 0)
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10 for the value of n");

		if(view.getRtrnVal() < 1 && view.getNVal() > 0 && view.getNVal() < 11)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the return value");
		
		if(view.getNVal() < 1 || view.getNVal() > 10 && view.getRtrnVal() < 1)
			JOptionPane.showMessageDialog(null, "Please enter a valid number for each input");
		
		/*
		 * If the inputs are valid then do this
		 */
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

		//Adds the inputs into an array in the model
		model.addToArray(view.getNVal(), view.getRtrnVal());
		
		//Adds the new string to the arraylist and then updates the text area with this new string
		view.addArrayString();
		view.setTxtArea();
		
		view.clearInputs();
		
		
		}
		
		/*
		 * Stops the value of n being set to 0 and thus wrongly triggering a pop up box on the final hit of submit
		 * 
		 * Setting n to 0 is used because when the text field is cleared, the NVal still holds the previous value and would
		 * otherwise just continue the program even though there is no input because getNVal will still hold the previous value which
		 * was accepted
		 */
		if(view.getCount() > 0 && view.getNVal() > 0 && view.getNVal() < 11 && view.getRtrnVal() > 0){
			view.setNVal(0);
			view.setRtrnVal(0);
	}
	}

}
