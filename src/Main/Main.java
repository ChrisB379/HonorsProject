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


//TODO find more common methods to use between each algorithm class in the model
//TODO add text to the example classes which states the parameter input must be between 1 and 10
//TODO change input validation on parameters to be > 0 < 11 and not whatever number is used in the example page
//TODO set the parameter fields to all check for if the input .equals("") and if so then make a dialog box. If not then accent the input. This fixes the issue of focus listeners
//TODO change the switchCards internal commentary in the WorkAfterView so it doesnt say return value since its a copy and paste
//TODO use absolute poisiton to move boxes and also find out how big the advance button panels in each JFrame view are
//TODO Set a tab order, especially in returnvalue algorithm 2
//TODO add key listeners to buttons to allow enter key use on focus