package testing;

/**
 * This JUnit is to test that the algorithms work correctly
 * The algorithm being tested is factorial from Return Value
 * 
 * @author Christopher Baillie
 */

import static org.junit.Assert.*;
import model.ReturnValue;
import org.junit.Before;
import org.junit.Test;

public class ReturnValueTests {
	
	private ReturnValue retVal;
    

	/**
	 * Initialises variables, instances etc before each test
	 * 
	 */
    @Before
    public void initObjects() {
    	retVal = new ReturnValue();
    }
    

    
    /*
     * Testing the factorial algorithm for value 0 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testFactorialNeg1() {
		assertEquals(0,retVal.factorial(-1));
	}
	
    
    /*
     * Testing the factorial algorithm for value 0 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testFactorial0() {
		assertEquals(0,retVal.factorial(0));
	}
	
    /*
     * Testing the factorial algorithm for value 1 for the answer of 1
     */
	@Test
	public void testFactorial1() {
		assertEquals(1,retVal.factorial(1));
	}
    
    
    /*
     * Testing the factorial algorithm for value 4 for the answer of 24
     */
	@Test
	public void testFactorial4() {
		assertEquals(24,retVal.factorial(4));
	}
	
    /*
     * Testing the factorial algorithm for value 10 for the answer of 3628800
     */
	@Test
	public void testFactorial10() {
		assertEquals(3628800,retVal.factorial(10));
	}

}
