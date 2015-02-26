package model;

import java.util.List;


/**
 * An interface for the return value class
 * 
 * @author Christopher Baillie
 * @version 1.0
 */

public interface IReturnValue extends IAlgorithms  {

	public int factorial(int n);
	public void addToArray(int nVal, int retVal);
	public int getParamArray(int n);
	public int getReturnVArray(int n);
	public void clearArrays();
	
	public int getUserReturnVal();
	public void setUserReturnVal(int n);
	
	public int getUserReturnVal2();
	public void setUserReturnVal2(int n);
	
	//Testing arrays work
	public List<Integer> paramArr();
	public List<Integer> retArr();

}
