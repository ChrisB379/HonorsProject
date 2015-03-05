package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


/**
 *  This will be an example of excessive recomputation shown through the fibonacci algorithm
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

public class ExcessiveRecomp extends Observable implements IExcessiveRecomp {
	

	//TODO Deal with ensuring the limit on n is n>= 1 and n<= 10

	int helperMemory[];
	private int param;
	private int userRetVal;
	
	private List<Integer> paramArray;
	private List<Integer> returnV;

	/**
	 * This is the fibonacci algorithm which will be used to show excessive recomputation.
	 * With each recursive call e.g fib(8) then fib(6) and fib(7) is calculated.
	 * After the recursion n will then be 7 and will be returning fib(5) and fib(6).
	 * As you can see there is an overlap here where fib(6) is being calculated for a second time.
	 * This happens several times, with several calculations needlessly being recalculated and wasting
	 * processing time on calculations we should already have the result for.
	 * 
	 * @param n Any integer greater than 0 and less than 11.
	 * @return Returns the value of the nth fibonacci number
	 * @since 1.0
	 */
	@Override
	public int fib(int n) {
		//Base case
		if (n == 0 || n == 1)
			return 1;

		else
			//Recursive call
			return fib(n-1) + fib(n-2);
	}


	/** 
	 *  This code is based on and sourced from: http://stackoverflow.com/questions/7875380/recursive-fibonacci-memoization%20
	 *  
	 * This is just an example of how excessive recomputation can be solved by storing results of already 
	 * computed calculations to prevent them being calculated again. Instead the value is already known and simply
	 * fetched, in this case from the helperMemory array.
	 * 
	 * 
	 * @param n Any integer greater than 1 and less than 10.
	 * @return Returns the value of the nth fibonacci number
	 * @since 1.0
	 */
	@Override
	public int fibMemoization(int n){
		//If there is no helper memory, then initialise it to the size of n
		if(helperMemory == null)
			helperMemory = new int[n];

		//The base case
		if (n == 0 || n == 1)
			return 1;

		if(helperMemory[n-1] != 0)
			return helperMemory[n-1];

		else
		{
			//recursive call
			helperMemory[n-1] = fibMemoization(n - 1) + fibMemoization(n - 2);
			return helperMemory[n-1];
		}
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
	 * @return an integer holding the value of the users return value
	 * @since 1.2
	 */
	@Override
	public int getUserReturnVal() {
		
		return userRetVal;
	}

	
	/**
	 * Sets userRetVal to that of the users return value that they picked.
	 * Also notifies observers
	 * 
	 * @param an integer holding the value of the users return value
	 * @since 1.2
	 */
	@Override
	public void setUserReturnVal(int n) {
		userRetVal = n;
		setChanged();
		notifyObservers();
		
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

}
