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

	
	public int getScore(){
		return score;
	}
	
	public void setScore(int n){
		score = n;
		setChanged();
		notifyObservers();
	}

	@Override
	public int getQ1Answer() {
		return question1Answer;
	}

	@Override
	public void setQ1Answer(int n) {
		question1Answer = n;
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getQ2Answer() {
		return question2Answer;
	}

	@Override
	public void setQ2Answer(int n) {
		question2Answer = n;
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getQ3Answer() {
		return question3Answer;
	}

	@Override
	public void setQ3Answer(int n) {
		question3Answer = n;
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getQ4Answer() {
		return question4Answer;
	}

	@Override
	public void setQ4Answer(int n) {
		question4Answer = n;
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getQ5Answer() {
		return question5Answer;
	}

	@Override
	public void setQ5Answer(int n) {
		question5Answer = n;
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getQ6Answer() {
		return question6Answer;
	}

	@Override
	public void setQ6Answer(int n) {
		question6Answer = n;
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getQ7Answer() {
		return question7Answer;
	}

	@Override
	public void setQ7Answer(int n) {
		question7Answer = n;
		setChanged();
		notifyObservers();
		
	}

	@Override
	public int getQ8Answer() {
		return question8Answer;
	}

	@Override
	public void setQ8Answer(int n) {
		question8Answer = n;
		setChanged();
		notifyObservers();
		
	}

}
