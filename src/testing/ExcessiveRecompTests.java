package testing;

/**
 * This JUnit is to test that the algorithms work correctly
 * The algorithm being tested is fibonacci from Excessive recomputation
 * 
 * @author Christopher Baillie
 */

import static org.junit.Assert.*;
import model.ExcessiveRecomp;
import org.junit.Before;
import org.junit.Test;

public class ExcessiveRecompTests {
	
	private ExcessiveRecomp exRecomp;
	
	
	/**
	 * Initialises variables, instances etc before each test
	 * 
	 */
    @Before
    public void initObjects() {
    	exRecomp = new ExcessiveRecomp();
    }
	
    /*
     * Testing the fibonacci algorithm for value -1 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testFibonacciNeg1() {
		assertEquals(0,exRecomp.fib(-1));
	}
	
	/*
	 * Testing the fibonacci algorithm for value 0 for the answer of 1
	 */
	@Test
	public void testFibonacci0() {
		assertEquals(1, exRecomp.fib(0));
	}
	
	/*
	 * Testing the fibonacci algorithm for value 1 for the answer of 1
	 */
	@Test
	public void testFibonacci1() {
		assertEquals(1, exRecomp.fib(1));
	}
	
	/*
	 * Testing the fibonacci algorithm for value 7 for the answer of 21
	 */
	@Test
	public void testFibonacci7() {
		assertEquals(21, exRecomp.fib(7));
	}
	
	/*
	 * Testing the fibonacci algorithm for value 10 for the answer of 89
	 */
	@Test
	public void testFibonacci10() {
		assertEquals(89, exRecomp.fib(10));
	}
	
	/*
	 * Testing the fibonacci algorithm for value 40 for the answer of 165580141 
	 * Much higher and the integer becomes out of range for java as it is too large
	 */
	@Test
	public void testFibonacci40() {
		assertEquals(165580141  , exRecomp.fib(40));
	}



}
