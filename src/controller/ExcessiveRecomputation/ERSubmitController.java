package controller.ExcessiveRecomputation;

/**
 * This is a controller for the submit button in ExcessiveRecompAlgorithm
 * 
 * It controls the visiblity of buttons and text fields by decrementing a counter as the 
 * program progress'
 * 
 * Error handling is included in the form of dialog boxes and if statements to halt program progression
 * until valid inputs are used
 * 
 * @author Christopher Baillie
 * @version 2.0
 * @since 1.0
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.IExcessiveRecomp;
import view.ExcessiveRecomputation.ExcessiveRecompAlgorithm;


public class ERSubmitController implements ActionListener {

	private IExcessiveRecomp model;

	private ExcessiveRecompAlgorithm view;

	public ERSubmitController(IExcessiveRecomp m,ExcessiveRecompAlgorithm v) {

		model = m;

		view = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*
		 * Dialog boxes to handle input validation
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
		 * If all inputs are valid then do this
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
			
			//Adds the two values to an array in the model
			model.addToArray(view.getNVal(), view.getRtrnVal());

			//Adds the new line to the arraylist which is n = count -1
			//Then updates the text area to include this
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

