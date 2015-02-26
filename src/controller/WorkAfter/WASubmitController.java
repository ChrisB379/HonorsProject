package controller.WorkAfter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.IWorkAfter;
import view.WorkAfter.WorkAfterAlgorithm;

public class WASubmitController implements ActionListener {

	private IWorkAfter model;

	private WorkAfterAlgorithm view;

	public WASubmitController(IWorkAfter m,WorkAfterAlgorithm v) {

		model = m;

		view = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(!view.question1Answered())
			JOptionPane.showMessageDialog(null, "Please select an option for question 1");

		if(!view.question2Answered())
			JOptionPane.showMessageDialog(null, "Please select an option for question 2");

		if(view.question1Answered() && view.question2Answered()){
			
			//Sets the users return value in the model
			model.setUserReturnValQ1(view.getRtrnValQ1());
			model.setUserReturnValQ2(view.getRtrnValQ2());

			view.setAfterReturnText();


		}

	}

}
