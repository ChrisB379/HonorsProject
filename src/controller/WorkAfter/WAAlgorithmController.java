package controller.WorkAfter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IWorkAfter;
import view.WorkAfter.WorkAfterAlgorithm;

/**
 * This will be used for pulling the value of n so it can be displayed
 * n being the value of the users chosen parameter
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 *
 */

public class WAAlgorithmController implements ActionListener {

	private IWorkAfter model;

	private WorkAfterAlgorithm view;

	public WAAlgorithmController(IWorkAfter m, WorkAfterAlgorithm v) {

		model = m;

		view = v;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		view.setParameter(model.getParam());


	}



}
