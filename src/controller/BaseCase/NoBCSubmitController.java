package controller.BaseCase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.IBaseCase;
import view.BaseCase.NoBaseCaseAlgorithm;

public class NoBCSubmitController implements ActionListener {

	private IBaseCase model;

	private NoBaseCaseAlgorithm view;

	public NoBCSubmitController(IBaseCase m,NoBaseCaseAlgorithm v) {

		model = m;

		view = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(view.getNVal() < 1)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the value of n");

		if(view.getNVal() > 5)
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5 for the value of n");
		
		if(view.getCount() == 2 && view.getNVal() > 0 && view.getNVal() < 6)
			view.addQuestion();
		
		if(view.questionAnswered())
			view.setAfterReturnText();
		
		if(!view.questionAnswered() && view.getCount() < 2)
			JOptionPane.showMessageDialog(null, "Please select one of the 5 answers");

		if(view.getNVal() > 0 && view.getNVal() < 6){

			//Sets the users returnvalue in the model
			model.setUserReturnVal(view.getRtrnVal());

			//Decrements the counter	
			view.decrementCount();

			model.addToArray(view.getNVal(), view.getRtrnVal());

			view.addArrayString();
			view.setTxtArea();
			


		}
		if(view.getCount() >  1)
		view.setNVal(0);
	}

}
