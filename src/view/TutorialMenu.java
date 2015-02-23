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

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import javax.swing.JLabel;

import model.IAlgorithms;
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
		btnBaseCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				BaseCaseView bcv = new BaseCaseView();
				bcv.setVisible(true);
				bcv.setLocationRelativeTo(null);
				//				new BaseCaseView().setVisible(true);
			}
		});
		btnBaseCase.setFont(new Font("Arial", Font.PLAIN, 15));

		JButton btnNewButton = new JButton("Return Value");
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
		btnReturnValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ExcessiveRecompView erv = new ExcessiveRecompView();
				erv.setVisible(true);
				erv.setLocationRelativeTo(null);
				//new ReturnValueView().setVisible(true);
			}
		});
		btnReturnValue.setFont(new Font("Arial", Font.PLAIN, 15));

		JButton btnWorkAfter = new JButton("Work After");
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
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 32));

		JLabel lblTutorial = new JLabel("Tutorial 1 : The Base Case");
		lblTutorial.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblTutorial_1 = new JLabel("Tutorial 2 : Return Values");
		lblTutorial_1.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblTutorialExcessive = new JLabel("Tutorial 3: Excessive Recomputation");
		lblTutorialExcessive.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblTutorialWork = new JLabel("Tutorial 4: Work After");
		lblTutorialWork.setFont(new Font("Arial", Font.PLAIN, 15));

		JLabel lblEndOfUnit = new JLabel("End of unit quiz");
		lblEndOfUnit.setFont(new Font("Arial", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(24)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTutorial)
								.addComponent(lblTutorialWork)
								.addComponent(lblEndOfUnit)
								.addComponent(lblTutorial_1)
								.addComponent(lblTutorialExcessive))
								.addGap(53)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnMultipleChoiceQuiz, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnWorkAfter, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnReturnValue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnBaseCase, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
										.addContainerGap(14, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(182)
												.addComponent(btnReturnToMain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(197))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGap(218)
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
														.addContainerGap(214, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addGap(28)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnBaseCase)
										.addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblTutorial_1)
												.addComponent(btnNewButton)))
												.addComponent(lblTutorial))
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(18)
																.addComponent(lblTutorialExcessive))
																.addGroup(gl_contentPane.createSequentialGroup()
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addComponent(btnReturnValue)))
																		.addGap(16)
																		.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
																				.addComponent(lblTutorialWork)
																				.addComponent(btnWorkAfter))
																				.addGap(18)
																				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
																						.addComponent(lblEndOfUnit)
																						.addComponent(btnMultipleChoiceQuiz))
																						.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
																						.addComponent(btnReturnToMain)
																						.addContainerGap())
				);
		contentPane.setLayout(gl_contentPane);
	}

}
