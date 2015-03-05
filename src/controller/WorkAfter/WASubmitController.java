package controller.WorkAfter;

/**
 * This is a controller for the submit button in WorkAfterAlgorithm
 * 
 * It checks if the two multiple choice questions are answered and throws a pop up if not
 * 
 * If both are answered then the visibility of components change to move the program forward
 * The chosen answers are send back to the model
 * 
 * @author Christopher Baillie
 * @version 1.2
 * @since 1.0
 */

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
		
		/*
		 * Input validation to ensure both questions are answered
		 */
		if(!view.question1Answered())
			JOptionPane.showMessageDialog(null, "Please select an option for question 1");

		if(!view.question2Answered())
			JOptionPane.showMessageDialog(null, "Please select an option for question 2");

		/*
		 * If both questions are answered then do this
		 */
		if(view.question1Answered() && view.question2Answered()){
			
			//Sets the users return value in the model
			model.setUserReturnValQ1(view.getRtrnValQ1());
			model.setUserReturnValQ2(view.getRtrnValQ2());

			//Manages visiblity of components
			view.setAfterReturnText();


		}

	}

}
