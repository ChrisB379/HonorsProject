package model;

import java.util.Observable;

/**
 * Making the multiple choice quiz questions and answers
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

public class Quiz extends Observable implements IQuiz {
	
	private int score;

	//TODO make the questions and answers
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int n){
		score = n;
		setChanged();
		notifyObservers();
	}

}
