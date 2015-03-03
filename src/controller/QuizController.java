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
		
		model.setQ1Answer(view.question1Answer());
		model.setQ2Answer(view.question2Answer());
		model.setQ3Answer(view.question3Answer());
		model.setQ4Answer(view.question4Answer());
		model.setQ5Answer(view.question5Answer());
		model.setQ6Answer(view.question6Answer());
		model.setQ7Answer(view.question7Answer());
		model.setQ8Answer(view.question8Answer());
	}

}
