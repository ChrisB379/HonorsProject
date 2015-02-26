package model;

/**
 * An interface for the workAfter class
 * 
 * @author Christopher Baillie
 * @version 1.0
 */

public interface IWorkAfter extends IAlgorithms {

	public void workAfter(int n);
	public void addToArray(int nVal, int retVal);
	public int getParamArray(int n);
	public int getReturnVArray(int n);
	
	public String getUserReturnValQ1();
	public void setUserReturnValQ1(String s);
	
	public String getUserReturnValQ2();
	public void setUserReturnValQ2(String s);
	

}
