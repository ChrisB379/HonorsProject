package controller;

import java.util.Observable;
import java.util.Observer;

import model.ReturnValue;;

/**
 * Controller for the return value between model and view. This may not be needed
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

public class ReturnValueController implements Observer {
	
	ReturnValue rv;

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

		System.out.println("This is in the controller");
	}

}
