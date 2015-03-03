package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * This is used to show how the base case works in recursion
 * 
 * @author Christopher Baillie
 * @version 1.1
 * @since 1.0
 */

public class BaseCase extends Observable implements IBaseCase  {
	
	private int param;

	private String userRetVal,userRetVal2;
	
	private List<Integer> paramArray;
	private List<String> returnV;


	/**
	 * Returns an integer based on the recursive call each time.
	 * This will lead to an infinite loop since there is no base case to stop it going below n == 0
	 * This will cause a stack overflow eventually
	 * 
	 * There is no reason behind the algorithm/numbers used in the return statement.
	 * Its only purpose is to do a calculation which will loop forever or until a stack overflow.
	 * 
	 * @param n Any integer greater than 0 and less than 6
	 * @return the value of the recursive call using the value n
	 * @since 1.0
	 */
	@Override
	public int noBaseCase(int n) {

		return noBaseCase(n-1) + n;
	}



	/**
	 * This is an example of convergence or really, the lack thereof.
	 * Each recursive call takes n further away from the base case and so it is never reached
	 * causing a never ending loop. This will cause a stack overflow eventually.
	 * 
	 * The return statement has no real meaning and is a random calculation I chose.
	 * The base chase returning 5 is used so it is a different number from all others used, in order to avoid
	 * any possible confusion that may occur if the value 1 was used. The user may think returning
	 * 1 is linked to n+1 which would be false.
	 * 
	 * @param n Any integer greater than 0 and less than 6
	 * @return The value of the recursive call. 
	 * @since 1.0
	 */
	@Override
	public int nonConvergence(int n) {
		//Base case
		if(n == 1)
			return 5;
		else 
			return nonConvergence(n+1) + 2*n;
	}

	/**
	 * Just some basic tests. Will be removed later
	 * 
	 * 
	 * @since 1.0
	 */

	public static void main(String[] args){

		BaseCase bc = new BaseCase();

		int ex1 = bc.noBaseCase(3);
		int ex2 = bc.nonConvergence(3);

		System.out.println(ex1);
		System.out.println(ex2);

	}



	@Override
	public void setParam(int n) {
		param = n;
		setChanged();
		notifyObservers();
		
	}



	@Override
	public int getParam() {
		return param;
	}
	


	/**
	 * Returns the value stored that the user set as their return value by choosing
	 * radio buttons
	 * 
	 * @since 1.2
	 */
	@Override
	public String getUserReturnVal() {
		
		return userRetVal;
	}

	
	/**
	 * Sets userRetVal to that of the users return value that they picked.
	 * 
	 * @since 1.2
	 */
	@Override
	public void setUserReturnVal(String s) {
		userRetVal = s;
		setChanged();
		notifyObservers();
		
	}
	
	/**
	 * Returns the value stored that the user set as their return value in the second algorithm page.
	 * 
	 * @since 1.2
	 */
	@Override
	public String getUserReturnVal2() {
		// TODO Auto-generated method stub
		return userRetVal2;
	}
	
	/**
	 * Sets userRetVal to that of the users return value that they picked in the second algorithm page
	 * 
	 * @since 1.2
	 */
	@Override
	public void setUserReturnVal2(String s) {
		userRetVal2 = s;
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
	public void addToArray(int nVal, String retVal){
		
		if(paramArray == null)
			paramArray = new ArrayList<Integer>();
		
		if(returnV == null)
			returnV = new ArrayList<String>();
			
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
	public String getReturnVArray(int n){
		return returnV.get(n-1);
	}
	
}
