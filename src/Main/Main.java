package Main;

/**
 * This is the main where the program will be ran from
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.awt.EventQueue;

import view.MainMenu;

public class Main {
	
	
	Main(){

	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					//Centres the GUI to the middle of the screen
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

//TODO Align all text boxes in GUIs to be in the same place to prevent the buttons from moving around
//TODO Align each tutorial. Going from 1 to 2 the windows are different size and the buttons do not line up
//TODO move the example tags to the left as it looks odd being in the middle of their panel but in the frame they are about 1/3rd in
//TODO Add a merge sort set of panels after work after, similar to memoization
//TODO link the new abstract class to the GUIs to get the value of n on each call so it is displayed
//TODO find more common methods to use between each algorithm class in the model
//TODO possibly a new method to get and set any variables used in the model e.g in factorial get the value of each return on the recursive calls to store for use in the GUI to compare with the users answer
//TODO have a section on iteration v recursion, when to use them, advantages of one over the other etc
//TODO add text to the example classes which states the parameter input must be between 1 and 10
//TODO change input validation on parameters to be > 0 < 11 and not whatever number is used in the example page
//TODO rename factorial algorithm to fact for the sake of ReturnValueAlgorithm2 class
//TODO set the parameter fields to all check for if the input .equals("") and if so then make a dialog box. If not then accent the input. This fixes the issue of focus listeners
//TODO change the switchCards internal commentary in the WorkAfterView so it doesnt say return value since its a copy and paste
//TODO excessive recomp advance buttons move A LOT, especially going into the example page,change this
//TODO rename convergence to non-convergence to ensure the user understands
//TODO use absolute poisiton to move boxes and also find out how big the advance button panels in each JFrame view are
//TODO Set a tab order, especially in returnvalue algorithm 2