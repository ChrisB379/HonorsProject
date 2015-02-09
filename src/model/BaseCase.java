package model;

import java.util.Observable;

/**
 * This is used to show how the base case works in recursion
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

public class BaseCase extends Observable implements IBaseCase  {
	
	//TODO Deal with ensuring the limit on n is n>= 1 and n<= 10

	/**
	 * Returns an integer based on the recursive call each time.
	 * This will lead to an infinite loop since there is no base case to stop it going below n == 0
	 * This will cause a stack overflow eventually
	 * 
	 * There is no reason behind the algorithm/numbers used in the return statement.
	 * Its only purpose is to do a calculation which will loop forever or until a stack overflow.
	 * 
	 * @param n Any integer greater than 1 and less than 10
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
	 * @param n Any integer greater than 1 and less than 10
	 * @return The value of the recursive call. 
	 * @since 1.0
	 */
	@Override
	public int convergence(int n) {
		//Base case
		if(n == 1)
			return 5;
		else 
			return convergence(n+1) + 2*n;
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
		int ex2 = bc.convergence(3);
		
		System.out.println(ex1);
		System.out.println(ex2);
		
	}

}
