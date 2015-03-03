package controller.BaseCase;

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

		if(view.getNVal() > 5)
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5 for the value of n");
		
		if(view.getCount() == 2)
			view.addQuestion();
		
		if(view.questionAnswered())
			view.setAfterReturnText();
		
		if(!view.questionAnswered() && view.getCount() < 2)
			JOptionPane.showMessageDialog(null, "Please select one of the 4 answers");

		if(view.getNVal() != 0 && view.getNVal() < 6){
			System.out.println("getCount " + view.getCount());
			//Sets the users returnvalue in the model
			model.setUserReturnVal2(view.getRtrnVal());

			System.out.println("getCount before " + view.getCount());
			//Decrements the counter	
			view.decrementCount();
			System.out.println("getCount after " + view.getCount());

			model.addToArray(view.getNVal(), view.getRtrnVal());

			view.addArrayString();
			view.setTxtArea();
			


		}
	}

}
