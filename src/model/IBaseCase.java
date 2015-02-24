package model;

/**
 * An interface for the base case class
 * 
 * @author Christopher Baillie
 * @version 1.0
 */

public interface IBaseCase extends IAlgorithms {

	public int noBaseCase(int n);

	public int convergence(int n);

	public void addToArray(int nVal, int retVal);
	public int getParamArray(int n);
	public int getReturnVArray(int n);
	
	public int getUserReturnVal2();
	public void setUserReturnVal2(int n);
}
