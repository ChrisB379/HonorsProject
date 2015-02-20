package controller.ReturnValue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.IReturnValue;
import view.ReturnValue.ReturnValueAlgorithm2;


public class RVSubmitAlg2Controller implements ActionListener {
	
	private IReturnValue model;
	
	private ReturnValueAlgorithm2 view;
	
	public RVSubmitAlg2Controller(IReturnValue m, ReturnValueAlgorithm2 v){
	
	model = m;
	
	view = v;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*Checks each text field to ensure it is not empty
		 * It only checks text fields which are visible otherwise non-visible ones would catch the if statement
		 */
		
		//Checks all text boxes and if at least one contains nothing aka "" then a dialog box is shown
		view.checkUserInputs();
		
		//Checks if all text fields have an input and are not ""
		view.checkAllFieldsFilled();
		
		if(view.getUsersReturnValue() < 1){
			JOptionPane.showMessageDialog(null, "Please enter a value greater than 0 for the final return value.");
		}
		
		//Makes the Advance button visible and submit button not visible if all other conditions are met
		if(view.getFilled())
		view.setAdvButtonVis();
		
		//Sets the users return value in the model
		model.setUserRetVal2(view.getUsersReturnValue());

		
	}

}
