package controller.ExcessiveRecomputation;

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


		if(view.getNVal() == 0)
			JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for the value of n");

		if(view.getNVal() > 10)
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10 for the value of n");

		if(view.getRtrnVal() == 0)
			JOptionPane.showMessageDialog(null, "Please enter a number for the return value");

		if(view.getNVal() != 0 && view.getNVal() < 11 && view.getRtrnVal() != 0){
			System.out.println("getCount " + view.getCount());
			
			//Sets the users returnvalue in the model
			model.setUserReturnVal(view.getRtrnVal());
			
			//Changes the text to tell the user to advance to the results page
			if(view.getCount() == 1){
				view.setAfterReturnText();
			}

			//Changes the text to tell the user this will be the final return statement
			if(view.getCount() == 2){
				view.setTextField();;
			}

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

