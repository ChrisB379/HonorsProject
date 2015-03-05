package model;

import java.util.Observable;

/**
 * Setting the multiple choice quiz score and answers
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

public class Quiz extends Observable implements IQuiz {
	
	private int score;
	
	private int question1Answer;
	private int question2Answer;
	private int question3Answer;
	private int question4Answer;
	private int question5Answer;
	private int question6Answer;
	private int question7Answer;
	private int question8Answer;

	/**
	 * Returns the users score
	 * 
	 * @return an integer representing the users score
	 */
	public int getScore(){
		return score;
	}
	
	/**
	 * Sets the users score
	 * Also notifies any observers
	 * 
	 * @param integer representing the users score
	 */
	public void setScore(int n){
		score = n;
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Gets an integer value for the users answer to question 1
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 1
	 */
	@Override
	public int getQ1Answer() {
		return question1Answer;
	}
	
	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 1
	 */
	@Override
	public void setQ1Answer(int n) {
		question1Answer = n;
		setChanged();
		notifyObservers();
		
	}

	/**
	 * Gets an integer value for the users answer to question 2
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 2
	 */
	@Override
	public int getQ2Answer() {
		return question2Answer;
	}

	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 2
	 */
	@Override
	public void setQ2Answer(int n) {
		question2Answer = n;
		setChanged();
		notifyObservers();
		
	}

	/**
	 * Gets an integer value for the users answer to question 3
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 3
	 */
	@Override
	public int getQ3Answer() {
		return question3Answer;
	}
	
	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 3
	 */
	@Override
	public void setQ3Answer(int n) {
		question3Answer = n;
		setChanged();
		notifyObservers();
		
	}

	/**
	 * Gets an integer value for the users answer to question 4
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 4
	 */
	@Override
	public int getQ4Answer() {
		return question4Answer;
	}
	
	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 4
	 */
	@Override
	public void setQ4Answer(int n) {
		question4Answer = n;
		setChanged();
		notifyObservers();
		
	}

	/**
	 * Gets an integer value for the users answer to question 5
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 5
	 */
	@Override
	public int getQ5Answer() {
		return question5Answer;
	}
	
	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 5
	 */
	@Override
	public void setQ5Answer(int n) {
		question5Answer = n;
		setChanged();
		notifyObservers();
		
	}

	/**
	 * Gets an integer value for the users answer to question 6
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 6
	 */
	@Override
	public int getQ6Answer() {
		return question6Answer;
	}

	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 6
	 */
	@Override
	public void setQ6Answer(int n) {
		question6Answer = n;
		setChanged();
		notifyObservers();
		
	}

	/**
	 * Gets an integer value for the users answer to question 7
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 7
	 */
	@Override
	public int getQ7Answer() {
		return question7Answer;
	}
	
	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 7
	 */
	@Override
	public void setQ7Answer(int n) {
		question7Answer = n;
		setChanged();
		notifyObservers();
		
	}

	/**
	 * Gets an integer value for the users answer to question 8
	 * The value 1-4 represents each radio button
	 * 
	 * @return an integer 1-4 representing the users answer to question 8
	 */
	@Override
	public int getQ8Answer() {
		return question8Answer;
	}
	
	/**
	 * Sets the users answer as an int from 1-4
	 * Also notifies any observers
	 * 
	 * @return an integer representing the users input for question 8
	 */
	@Override
	public void setQ8Answer(int n) {
		question8Answer = n;
		setChanged();
		notifyObservers();
		
	}

}
