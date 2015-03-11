package testing;

/**
 * This JUnit is to test that the algorithms work correctly
 * The algorithms being tested is noBaseCase and Conergence from BaseCase
 * 
 * @author Christopher Baillie
 */

import static org.junit.Assert.*;
import model.BaseCase;
import org.junit.Before;
import org.junit.Test;

public class BaseCaseTests {
	
	private BaseCase baseCase;
	
	/**
	 * Initialises variables, instances etc before each test
	 * 
	 */
    @Before
    public void initObjects() {
    	baseCase = new BaseCase();
    }
    
    /*
     * No Base Case Tests
     */
    
    /*
     * Testing the noBaseCase algorithm for value -1 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNoBaseCaseNeg1() {
		assertEquals(0,baseCase.noBaseCase(-1));
	}

    /*
     * Testing the noBaseCase algorithm for value 0 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNoBaseCase0() {
		assertEquals(0,baseCase.noBaseCase(0));
	}
	
    /*
     * Testing the noBaseCase algorithm for value 1 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNoBaseCase1() {
		assertEquals(0,baseCase.noBaseCase(1));
	}
	
    /*
     * Testing the noBaseCase algorithm for value 4 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNoBaseCase4() {
		assertEquals(0,baseCase.noBaseCase(4));
	}
	
    /*
     * Testing the noBaseCase algorithm for value 5 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNoBaseCase5() {
		assertEquals(0,baseCase.noBaseCase(5));
	}
	
    /*
     * Testing the noBaseCase algorithm for value 10 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNoBaseCase10() {
		assertEquals(0,baseCase.noBaseCase(10));
	}
	
    /*
     * Testing the noBaseCase algorithm for value 100 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNoBaseCase100() {
		assertEquals(0,baseCase.noBaseCase(100));
	}
	
	/*
	 * non-convergence tests
	 */
	
    /*
     * Testing the nonConvergence algorithm for value 0 to through a stack overflow error
     */
	@Test
	public void testNonConvNeg1() {
		assertEquals(5,baseCase.nonConvergence(-1));
	}
	
    /*
     * Testing the nonConvergence algorithm for value 0 to return 5
     */
	@Test
	public void testNonConv0() {
		assertEquals(5,baseCase.nonConvergence(0));
	}
	
    /*
     * Testing the nonConvergence algorithm for value 1 to return 5
     */
	@Test
	public void testNonConv1() {
		assertEquals(5,baseCase.nonConvergence(1));
	}
	
    /*
     * Testing the nonConvergence algorithm for value 4 to return 5
     */
	@Test(expected=StackOverflowError.class )
	public void testNonConv4() {
		assertEquals(5,baseCase.nonConvergence(4));
	}
	
    /*
     * Testing the nonConvergence algorithm for value 5 to return 5
     */
	@Test(expected=StackOverflowError.class )
	public void testNonConv5() {
		assertEquals(5,baseCase.nonConvergence(5));
	}
	
	
    /*
     * Testing the nonConvergence algorithm for value 10 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNonConv10() {
		assertEquals(0,baseCase.nonConvergence(10));
	}
	
    /*
     * Testing the nonConvergence algorithm for value 100 to through a stack overflow error
     */
	@Test(expected=StackOverflowError.class )
	public void testNonConv100() {
		assertEquals(0,baseCase.nonConvergence(100));
	}
	

}
