package testing;

/**
 * This JUnit is to test that the algorithms work correctly
 * The algorithm being tested is workAfter from WorkAfter
 * 
 * @author Christopher Baillie
 */

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import model.WorkAfter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WorkAfterTests {

	private WorkAfter workAft;

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	/*
	 * Sourced this code from
	 * setUpStreams and cleanUpStreams methods
	 * http://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
	 * It is used to check the console output to compare print statements
	 */
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	/**
	 * Initialises variables, instances etc before each test
	 * 
	 */
	@Before
	public void initObjects() {
		workAft = new WorkAfter();
	}


	/*
	 * Testing Work After with the value -1 for a stack overflow
	 */
	@Test(expected=StackOverflowError.class )
	public void testWorkAfterNeg1() {
		workAft.workAfter(-1);
	}

	/*
	 * Testing Work After with the value 0 for a stack overflow
	 */
	@Test(expected=StackOverflowError.class )
	public void testWorkAfter0() {
		workAft.workAfter(0);
	}

	/*
	 * Testing Work After with the value 1 for a specific output string
	 * The output strings actually match, I'm not sure why the test fails
	 * May be the fact that \n is needed to signal a new line?
	 */
	@Test
	public void testWorkAfter1() {
		workAft.workAfter(1);
		assertEquals("Base case statement, showing the value of n is 1\n"
				+ "After the recursive call, showing the result of n*2 is 2" , outContent.toString());
	}
	
	/*
	 * Testing Work After with the value 10 for a specific output string
	 * The output strings don't match but it doesnt really matter
	 * Printing on a different line is causing the output to not match anyway
	 * Unsure how to test it with new lines without using \n which wont match since its not really in the code
	 */
	@Test
	public void testWorkAfter10() {
		workAft.workAfter(10);
		assertEquals("going into recursive call" + "\n"
				+	"going into recursive call" 
				+	"going into recursive call\n"
				+	"going into recursive call\n"
				+	"going into recursive call\n"
				+	"going into recursive call\n"
				+ "After the recursive call, showing the result of n*2 is 2" , outContent.toString());
	}


}
