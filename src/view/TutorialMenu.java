package view;

/**
 *  This is GUI for the examples and quiz. 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */


import java.awt.EventQueue;
import java.awt.Toolkit;

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
import model.IBaseCase;
import model.IExcessiveRecomp;
import model.IQuiz;
import model.IReturnValue;
import model.IWorkAfter;
import model.Quiz;
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
	
	private IReturnValue iModel;
	private IWorkAfter iWaModel;
	private IExcessiveRecomp iErModel;
	private IQuiz iQModel;


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
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-FrameIcon.png")));
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
				bcv.setResizable(false);
			}
		});
		btnBaseCase.setFont(new Font("Segoe UI", Font.PLAIN, 13));

		JButton btnNewButton = new JButton("Return Value");
		btnNewButton.setBounds(320, 160, 205, 27);
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				iModel = new ReturnValue();
				ReturnValueView rvv = new ReturnValueView(iModel);
				rvv.setVisible(true);
				rvv.setLocationRelativeTo(null);
				rvv.setResizable(false);
			}
		});

		JButton btnMultipleChoiceQuiz = new JButton("Multiple Choice Quiz");
		btnMultipleChoiceQuiz.setBounds(320, 286, 203, 27);
		btnMultipleChoiceQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				iQModel = new Quiz();
				QuizView qzv = new QuizView(iQModel);
				qzv.setVisible(true);
				qzv.setLocationRelativeTo(null);
				qzv.setResizable(false);
			}
		});
		btnMultipleChoiceQuiz.setFont(new Font("Segoe UI", Font.PLAIN, 13));

		JButton btnReturnValue = new JButton("Excessive Recomputation");
		btnReturnValue.setBounds(320, 198, 205, 27);
		btnReturnValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				iErModel = new ExcessiveRecomp();
				ExcessiveRecompView erv = new ExcessiveRecompView(iErModel);
				erv.setVisible(true);
				erv.setLocationRelativeTo(null);
				erv.setResizable(false);
			}
		});
		btnReturnValue.setFont(new Font("Segoe UI", Font.PLAIN, 13));

		JButton btnWorkAfter = new JButton("Work After");
		btnWorkAfter.setBounds(320, 241, 205, 27);
		btnWorkAfter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				iWaModel = new WorkAfter();
				WorkAfterView wav = new WorkAfterView(iWaModel);
				wav.setVisible(true);
				wav.setLocationRelativeTo(null);
				wav.setResizable(false);
			}
		});
		btnWorkAfter.setFont(new Font("Segoe UI", Font.PLAIN, 13));

		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBounds(187, 332, 182, 27);
		btnReturnToMain.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnReturnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
				m.setResizable(false);
			}
		});

		JLabel lblNewLabel = new JLabel("Tutorials");
		lblNewLabel.setBounds(223, 16, 129, 71);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 32));

		JLabel lblTutorial = new JLabel("Tutorial 1 : The Base Case");
		lblTutorial.setBounds(29, 115, 174, 18);
		lblTutorial.setFont(new Font("Cambria", Font.PLAIN, 15));

		JLabel lblTutorial_1 = new JLabel("Tutorial 2 : Return Values");
		lblTutorial_1.setBounds(29, 160, 164, 18);
		lblTutorial_1.setFont(new Font("Cambria", Font.PLAIN, 15));

		JLabel lblTutorialExcessive = new JLabel("Tutorial 3: Excessive Recomputation");
		lblTutorialExcessive.setBounds(29, 198, 238, 18);
		lblTutorialExcessive.setFont(new Font("Cambria", Font.PLAIN, 15));

		JLabel lblTutorialWork = new JLabel("Tutorial 4: Work After");
		lblTutorialWork.setBounds(29, 241, 164, 18);
		lblTutorialWork.setFont(new Font("Cambria", Font.PLAIN, 15));

		JLabel lblEndOfUnit = new JLabel("End of unit quiz");
		lblEndOfUnit.setBounds(29, 286, 100, 18);
		lblEndOfUnit.setFont(new Font("Cambria", Font.PLAIN, 15));
		
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
