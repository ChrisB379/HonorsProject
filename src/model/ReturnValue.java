package model;

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




}
