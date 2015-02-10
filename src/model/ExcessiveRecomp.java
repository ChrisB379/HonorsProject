package model;

import java.util.Observable;


/**
 *  This will be an example of excessive recomputation shown through the fibonacci algorithm
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

public class ExcessiveRecomp extends Observable implements IExcessiveRecomp {
	

	//TODO Deal with ensuring the limit on n is n>= 1 and n<= 10

	int helperMemory[];
	private int param;

	/**
	 * This is the fibonacci algorithm which will be used to show excessive recomputation.
	 * With each recursive call e.g fib(8) then fib(6) and fib(7) is calculated.
	 * After the recursion n will then be 7 and will be returning fib(5) and fib(6).
	 * As you can see there is an overlap here where fib(6) is being calculated for a second time.
	 * This happens several times, with several calculations needlessly being recalculated and wasting
	 * processing time on calculations we should already have the result for.
	 * 
	 * @param n Any integer greater than 1 and less than 10.
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
	 * Just some tests. Will be removed later.
	 * 
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args){

		ExcessiveRecomp f = new ExcessiveRecomp();

		int x = f.fib(10);
		int memo = f.fibMemoization(10);

		System.out.println(x);
		System.out.println(memo);

	}


	@Override
	public void setParam(int n) {
		param = n;
		
	}


	@Override
	public int getParam() {
		return param;
	}

}
