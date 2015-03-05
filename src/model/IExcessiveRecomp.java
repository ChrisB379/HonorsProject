package model;

/**
 * An interface for the ExcessiveRecomp class
 * 
 * @author Christopher Baillie
 * @version 1.5
 * @since 1.0
 */

public interface IExcessiveRecomp extends IAlgorithms {

	public int fib(int n);
	public int fibMemoization(int n);
	public void addToArray(int nVal, int retVal);
	public int getParamArray(int n);
	public int getReturnVArray(int n);
	
	public int getUserReturnVal();
	public void setUserReturnVal(int n);

}
