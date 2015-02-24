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
	/*
	 * A record of the users original input parameter. This value will not change
	 * unlike the param variable which will
	 */
	private int Oparam; 
	private int userRetVal, userRetVal2;
	
	private List<Integer> paramArray;
	private List<Integer> returnV;

	//TODO Deal with ensuring the limit on n is n>= 1 and n<= 10

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
	 * Just a test. Will remove later.
	 * 
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args){

		ReturnValue f = new ReturnValue();

		int ex1 = f.factorial(4);

		System.out.println(ex1);
	}

	@Override
	public void setParam(int n) {
		param = n;
		System.out.println("n in return value after set para is called " + n);
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getParam() {
		return param;
	}

	/**
	 * These will hold the value of the input parameter similar to the above two methods
	 * However during the execution, the above two methods parameters values will be changed.
	 * These two methods will hold the users original parameter value so that it can be used
	 * for loops.
	 * 
	 * @since 1.1
	 */
	@Override
	public void setOriginalParam(int n) {
		Oparam = n;
		
	}

	@Override
	public int getOriginalParam() {

		return Oparam;
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
	
	public List<Integer> retArr(){
		return returnV;
	}

	public List<Integer> paramArr(){
		return paramArray;
	}

	/**
	 * Returns the value stored that the user set as their return value in the first algorithm page.
	 * 
	 * @since 1.2
	 */
	@Override
	public int getUserReturnVal() {
		
		return userRetVal;
	}

	
	/**
	 * Sets userRetVal to that of the users return value that they picked in the first algorithm page.
	 * 
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
	 * @since 1.2
	 */
	@Override
	public int getUserReturnVal2() {
		// TODO Auto-generated method stub
		return userRetVal2;
	}
	
	/**
	 * Sets userRetVal to that of the users return value that they picked in the second algorithm page
	 * 
	 * @since 1.2
	 */
	@Override
	public void setUserReturnVal2(int n) {
		userRetVal2 = n;
		setChanged();
		notifyObservers();
		
	}

}
