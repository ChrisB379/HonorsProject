package view;

/**
 *  This is GUI for the examples and quiz. 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;

import javax.swing.JLabel;

import model.BaseCase;
import model.ExcessiveRecomp;
import model.IAlgorithms;
import model.IBaseCase;
import model.IExcessiveRecomp;
import model.IReturnValue;
import model.IWorkAfter;
import model.ReturnValue;
import model.WorkAfter;
import view.BaseCase.BaseCaseView;
import view.ExcessiveRecomputation.ExcessiveRecompView;
import view.Quiz.QuizView;
import view.ReturnValue.ReturnValueView;
import view.WorkAfter.WorkAfterView;

public class TutorialMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5286626654727946318L;
	private JPanel contentPane;
	
	private IAlgorithms iFace;
	private IReturnValue iModel;
	private IWorkAfter iWaModel;
	private IExcessiveRecomp iErModel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorialMenu frame = new TutorialMenu();
					//Centres the GUI to the middle of the screen
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TutorialMenu() {
		setTitle("Tutorials");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnBaseCase = new JButton("Base Case");
		btnBaseCase.setBounds(320, 115, 205, 27);
		btnBaseCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IBaseCase iBModel = new BaseCase();
				BaseCaseView bcv = new BaseCaseView(iBModel);
				bcv.setVisible(true);
				bcv.setLocationRelativeTo(null);
				//				new BaseCaseView().setVisible(true);
			}
		});
		btnBaseCase.setFont(new Font("Arial", Font.PLAIN, 15));

		JButton btnNewButton = new JButton("Return Value");
		btnNewButton.setBounds(320, 160, 205, 27);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				iModel = new ReturnValue();
				ReturnValueView rvv = new ReturnValueView(iModel);
				rvv.setVisible(true);
				rvv.setLocationRelativeTo(null);
				//new ReturnValueView().setVisible(true);
			}
		});

		JButton btnMultipleChoiceQuiz = new JButton("Multiple Choice Quiz");
		btnMultipleChoiceQuiz.setBounds(320, 286, 203, 27);
		btnMultipleChoiceQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QuizView qzv = new QuizView();
				qzv.setVisible(true);
				qzv.setLocationRelativeTo(null);
				//new QuizView().setVisible(true);
			}
		});
		btnMultipleChoiceQuiz.setFont(new Font("Arial", Font.PLAIN, 15));

		JButton btnReturnValue = new JButton("Excessive Recomputation");
		btnReturnValue.setBounds(320, 198, 205, 27);
		btnReturnValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				iErModel = new ExcessiveRecomp();
				ExcessiveRecompView erv = new ExcessiveRecompView(iErModel);
				erv.setVisible(true);
				erv.setLocationRelativeTo(null);
				//new ReturnValueView().setVisible(true);
			}
		});
		btnReturnValue.setFont(new Font("Arial", Font.PLAIN, 15));

		JButton btnWorkAfter = new JButton("Work After");
		btnWorkAfter.setBounds(320, 241, 205, 27);
		btnWorkAfter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				iWaModel = new WorkAfter();
				WorkAfterView wav = new WorkAfterView(iWaModel);
				wav.setVisible(true);
				wav.setLocationRelativeTo(null);
				//				new WorkAfterView().setVisible(true);
			}
		});
		btnWorkAfter.setFont(new Font("Arial", Font.PLAIN, 15));

		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBounds(187, 332, 182, 27);
		btnReturnToMain.setFont(new Font("Arial", Font.PLAIN, 15));
		btnReturnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
				//new MainMenu().setVisible(true);
			}
		});

		JLabel lblNewLabel = new JLabel("Tutorials");
		lblNewLabel.setBounds(223, 16, 129, 71);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 32));

		JLabel lblTutorial = new JLabel("Tutorial 1 : The Base Case");
		lblTutorial.setBounds(29, 115, 174, 18);
		lblTutorial.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblTutorial_1 = new JLabel("Tutorial 2 : Return Values");
		lblTutorial_1.setBounds(29, 164, 164, 18);
		lblTutorial_1.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblTutorialExcessive = new JLabel("Tutorial 3: Excessive Recomputation");
		lblTutorialExcessive.setBounds(29, 205, 238, 18);
		lblTutorialExcessive.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblTutorialWork = new JLabel("Tutorial 4: Work After");
		lblTutorialWork.setBounds(29, 245, 137, 18);
		lblTutorialWork.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblEndOfUnit = new JLabel("End of unit quiz");
		lblEndOfUnit.setBounds(29, 290, 100, 18);
		lblEndOfUnit.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setLayout(null);
		contentPane.add(lblTutorial);
		contentPane.add(lblTutorialWork);
		contentPane.add(lblEndOfUnit);
		contentPane.add(lblTutorial_1);
		contentPane.add(lblTutorialExcessive);
		contentPane.add(btnMultipleChoiceQuiz);
		contentPane.add(btnWorkAfter);
		contentPane.add(btnReturnValue);
		contentPane.add(btnNewButton);
		contentPane.add(btnBaseCase);
		contentPane.add(btnReturnToMain);
		contentPane.add(lblNewLabel);
	}

}
