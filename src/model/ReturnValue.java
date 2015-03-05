package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;



/**
 * This will be used as an example of how return values work in recursion.
 * This is done through the factorial algorithm.
 * 
 * @author Christopher Baillie
 * @version 1.1
 * @since 1.0
 */

public class ReturnValue extends Observable implements IReturnValue {

	private int param;

	private int userRetVal, userRetVal2;

	private List<Integer> paramArray;
	private List<Integer> returnV;


	/**
	 * This is the factorial algorithm. It returns the product of an integer and all integers below it.
	 * When given a number such as 8, the factorial algorithm will 
	 * calculate the value of 1*2*3...etc up until whatever the value of n is, in this case 8.
	 * So the calculation would be 1*2*3*4*5*6*7*8
	 * 
	 * @param n Any integer greater than 0 and less than 11.
	 * @return Returns the product of n and all integers below it
	 * @since 1.0
	 */
	@Override
	public int factorial(int n) {
		//Base Case
		if(n == 1)
			return 1;
		else
			//Recursive call
			return n * factorial(n-1);

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
		System.out.println("n in return value after set para is called " + n);
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
	 * This adds user input to an arraylist. The data will be used later in the results page
	 * 
	 * 
	 * @param nVal the users answer to the value of n
	 * @param retVal the users answer to the value of the current return value 
	 * 
	 * @since 1.1
	 */
	public void addToArray(int nVal, int retVal){
		//Create arraylists if they are null/not already made
		if(paramArray == null)
			paramArray = new ArrayList<Integer>();

		if(returnV == null)
			returnV = new ArrayList<Integer>();

		paramArray.add(nVal);

		returnV.add(retVal);

	}

	/**
	 * Gets and returns the value stored in a position in the array
	 * 
	 * @param n the position of the element in the array to be fetched
	 * @return the value held at array position n-1
	 * @since 1.1
	 */

	public int getParamArray(int n){
		return paramArray.get(n-1);
	}

	/**
	 * Gets and returns the value stored in a position in the array
	 * 
	 * @param n the position of the element in the array to be fetched
	 * @return the value held at array position n-1
	 * @since 1.1
	 */
	public int getReturnVArray(int n){
		return returnV.get(n-1);
	}


	/**
	 * Will be used to clear the arrays after the tutorials have been completed
	 * This is just a safety measure in case the user finishes the tutorial and comes back to redo it,
	 * only to find the array still filled from their first try causing wrong results to display.
	 * 
	 * @since 1.1
	 */
	public void clearArrays(){
		paramArray.clear();
		returnV.clear();
	}


	/**
	 * Returns the value stored that the user set as their return value in the first algorithm page.
	 * 
	 * @return an integer representing the users return value from the first algorithm page
	 * @since 1.2
	 */
	@Override
	public int getUserReturnVal() {

		return userRetVal;
	}


	/**
	 * Sets userRetVal to that of the users return value that they picked in the first algorithm page.
	 * Also notifies any observers
	 * 
	 * @param an integer representing the users return value from the first algorithm page
	 * @since 1.2
	 */
	@Override
	public void setUserReturnVal(int n) {
		userRetVal = n;
		setChanged();
		notifyObservers();

	}


	/**
	 * Returns the value stored that the user set as their return value in the second algorithm page.
	 * 
	 * @return an integer representing the users return value from the second algorithm page
	 * @since 1.2
	 */
	@Override
	public int getUserReturnVal2() {
		return userRetVal2;
	}

	/**
	 * Sets userRetVal to that of the users return value that they picked in the second algorithm page
	 * Also notifies any observers
	 * 
	 * @param an integer representing the users return value from the second algorithm page
	 * @since 1.2
	 */
	@Override
	public void setUserReturnVal2(int n) {
		userRetVal2 = n;
		setChanged();
		notifyObservers();

	}

}
