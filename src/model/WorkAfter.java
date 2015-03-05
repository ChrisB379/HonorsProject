package model;


/**
 * This will be used as an example to show that work can be done after a recursive call.
 * The recursive call doesn't have to be the last process of a method.
 * Algorithms here are made up and may need to be changed
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

import java.util.Observable;

public class WorkAfter extends Observable implements IWorkAfter {

	private int param;
	private String userRetValQ1, userRetValQ2;


	/**
	 * Simple example of work after. If the base is not met it recurses until it's met
	 * A print statement comes after the recursive call to show work being done after
	 * 
	 * @param n an integer greater than 0 and less than 11
	 * @since 1.1
	 */
	public void workAfter(int n){

		if(n == 1)
			System.out.println("Base case statement, showing the value of n is " + n);

		else{
			System.out.println("going into recursive call");
			workAfter(n-1);
		}

		System.out.println("After the recursive call, showing the result of n*2 is " + n*2);


	}


	/**
	 * Sets the parameter as chosen by the user. 
	 * Also notifies any observers
	 * 
	 * @param An int representing the users chosen parameter
	 */
	@Override
	public void setParam(int n) {
		param = n;
		setChanged();
		notifyObservers();

	}

	/**
	 * Returns the parameter
	 * 
	 * @return an integer representing the value of the users chosen parameter
	 */
	@Override
	public int getParam() {
		return param;
	}


	/**
	 * Returns the value stored that the user set as their return value
	 * 
	 * @return A String representing the users return value for question 1
	 * @since 1.2
	 */
	@Override
	public String getUserReturnValQ1() {

		return userRetValQ1;
	}


	/**
	 * Sets userRetVal to that of the users return value that they picked.
	 * Also notifies any observers
	 * 
	 * @param a String representing the users return value for question 1
	 * @since 1.2
	 */
	@Override
	public void setUserReturnValQ1(String s) {
		userRetValQ1 = s;
		setChanged();
		notifyObservers();

	}

	/**
	 * Returns the value stored that the user set as their return value
	 * 
	 * @return a String representing the users return value for question 2
	 * @since 1.2
	 */
	@Override
	public String getUserReturnValQ2() {

		return userRetValQ2;
	}


	/**
	 * Sets userRetVal to that of the users return value that they picked.
	 * Also notifies any observers
	 * 
	 * @param A String representing the users return value for question 2
	 * @since 1.2
	 */
	@Override
	public void setUserReturnValQ2(String s) {
		userRetValQ2 = s;
		setChanged();
		notifyObservers();

	}




}
