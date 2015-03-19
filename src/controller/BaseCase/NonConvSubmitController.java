package controller.BaseCase;
/**
 * This is a controller for the submit button in NonConvergenceAlgorithm
 * 
 * It handles errors in inputs with dialog boxes
 * 
 * if all input is correct then it decrements counters, adds strings to the arraylsit of parameter values
 * and will set text and buttons visible as invisible as needed as the program progresses
 * 
 * @author Christopher Baillie
 * @version 2.0
 * @since 1.0
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.IBaseCase;
import view.BaseCase.NonConvergenceAlgorithm;

public class NonConvSubmitController implements ActionListener {

	private IBaseCase model;

	private NonConvergenceAlgorithm view;

	public NonConvSubmitController(IBaseCase m,NonConvergenceAlgorithm v) {

		model = m;

		view = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(view.getNVal() == 0)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the value of n");

		if(view.getNVal() > 10)
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10 for the value of n");

		if(view.getCount() == 2  && view.getNVal() > 0 && view.getNVal() < 11)
			view.addQuestion();

		if(view.questionAnswered())
			view.setAfterReturnText();

		if(!view.questionAnswered() && view.getCount() < 2)
			JOptionPane.showMessageDialog(null, "Please select one of the 4 answers");

		// If all inputs are valid then do this
		if(view.getNVal() != 0 && view.getNVal() < 11){
			//Sets the users returnvalue in the model
			model.setUserReturnVal2(view.getRtrnVal());


			//Decrements the counter	
			view.decrementCount();


			model.addToArray(view.getNVal(), view.getRtrnVal());

			view.addArrayString();
			view.setTxtArea();
			view.setFocus();


		}
		
		/*
		 * Stops the value of n being set to 0 and thus wrongly triggering a pop up box on the final hit of submit
		 * 
		 * Setting n to 0 is used because when the text field is cleared, the NVal still holds the previous value and would
		 * otherwise just continue the program even though there is no input because getNVal will still hold the previous value which
		 * was accepted
		 */
		if(view.getCount() >  1)
			view.setNVal(0);
	}

}
