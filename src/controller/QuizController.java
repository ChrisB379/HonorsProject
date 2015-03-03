package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Quiz.QuizView;
import model.IQuiz;

/**
 * Will be used as a controller for the quiz view
 * 
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

public class QuizController implements ActionListener{
	
	private IQuiz model;
	
	private QuizView view;
	
	public QuizController(IQuiz m, QuizView v){
		model = m;
		
		view = v;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.setScore(view.getScore());
	}

}
