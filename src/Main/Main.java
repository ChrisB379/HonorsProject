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
//TODO Limit input to > 1 && < 10
//TODO Observer Example
//TODO Change work after interactivity
//TODO Add a merge sort set of panels after work after, similar to memoization
//TODO create more of a hierarchy, an abstract class which gets the value of the input parameter n which is the super of all the classes in model to implement
//TODO link the new abstract class to the GUIs to get the value of n on each call so it is displayed
//TODO find more common methods to use between each algorithm class in the model
//TODO possibly a new method to get and set any variables used in the model e.g in factorial get the value of each return on the recursive calls to store for use in the GUI to compare with the users answer
//TODO Is parameters the right thing to do? Is it do able? If not then hard code each possible and display them that way?
//TODO figure out how to auto generate the factorial examples text boxes. Is hard code the best way?
//TODO change the example screen or add a new one to specific that this is the last recursive call before the base case and so ask the user what they think the final value will be. Make it clear that its the final call

