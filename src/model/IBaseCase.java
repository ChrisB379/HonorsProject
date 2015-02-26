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

	public void addToArray(int nVal, String retVal);
	public int getParamArray(int n);
	public String getReturnVArray(int n);
	
	public String getUserReturnVal();
	public void setUserReturnVal(String n);
	
	public String getUserReturnVal2();
	public void setUserReturnVal2(String n);
}
