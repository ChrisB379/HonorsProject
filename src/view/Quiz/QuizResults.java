package view.Quiz;

/**
 * This page displays the results to the users answers to the quiz
 * Each question shows the correct answer and an explanation for that answer
 * A tick/cross is shown beside the users chosen answer to signify if it was correct or not
 * 
 * @author Christopher Baillie
 * @version 1.5
 */

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import model.IQuiz;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import java.awt.Font;
import java.awt.Color;

public class QuizResults extends JPanel implements Observer {


	private static final long serialVersionUID = 7791784374194178575L;

	private JTextArea txtDescription;
	private JTextField txtQuestion1;
	private JTextField txtQuestion2;
	private JTextField txtQuestion3;
	private JTextArea txtQuestion4;
	private JTextPane txtQuestion5;
	private JTextField txtQuestion6;
	private JTextPane txtQuestion7;
	private JTextField txtQuestion8;

	/*
	 *RADIO BUTTONS 
	 */
	private JRadioButton rdbtnQ1A1;
	private JRadioButton rdbtnQ1A2;
	private JRadioButton rdbtnQ1A3;
	private JRadioButton rdbtnQ1A4;

	private JRadioButton rdbtnQ2A1;
	private JRadioButton rdbtnQ2A2;
	private JRadioButton rdbtnQ2A3;
	private JRadioButton rdbtnQ2A4;

	private JRadioButton rdbtnQ3A1;
	private JRadioButton rdbtnQ3A2;
	private JRadioButton rdbtnQ3A3;
	private JRadioButton rdbtnQ3A4;

	private JRadioButton rdbtnQ4A1;
	private JRadioButton rdbtnQ4A2;
	private JRadioButton rdbtnQ4A3;
	private JRadioButton rdbtnQ4A4;

	private JRadioButton rdbtnQ5A1;
	private JRadioButton rdbtnQ5A2;
	private JRadioButton rdbtnQ5A3;
	private JRadioButton rdbtnQ5A4;

	private JRadioButton rdbtnQ6A1;
	private JRadioButton rdbtnQ6A2;
	private JRadioButton rdbtnQ6A3;
	private JRadioButton rdbtnQ6A4;

	private JRadioButton rdbtnQ7A1;
	private JRadioButton rdbtnQ7A2;
	private JRadioButton rdbtnQ7A3;
	private JRadioButton rdbtnQ7A4;

	private JRadioButton rdbtnQ8A1;
	private JRadioButton rdbtnQ8A2;
	private JRadioButton rdbtnQ8A3;
	private JRadioButton rdbtnQ8A4;

	/*
	 * TICKS AND CROSSES
	 */
	private JLabel lblCrossQ1A1;
	private JLabel lblTickQ1;
	private JLabel lblCrossQ1A4;
	private JLabel lblCrossQ1A2;

	private JLabel lblTickQ2;
	private JLabel lblCrossQ2A2;
	private JLabel lblCrossQ2A3;
	private JLabel lblCrossQ2A4;

	private JLabel lblTickQ3;
	private JLabel lblCrossQ3A2;
	private JLabel lblCrossQ3A3;
	private JLabel lblCrossQ3A1;

	private JLabel lblTickQ4;
	private JLabel lblCrossQ4A2;
	private JLabel lblCrossQ4A3;
	private JLabel lblCrossQ4A4;

	private JLabel lblTickQ5;
	private JLabel lblCrossQ5A1;
	private JLabel lblCrossQ5A3;
	private JLabel lblCrossQ5A4;

	private JLabel lblTickQ6;
	private JLabel lblCrossQ6A1;
	private JLabel lblCrossQ6A3;
	private JLabel lblCrossQ6A4;

	private JLabel lblTickQ7;
	private JLabel lblCrossQ7A1;
	private JLabel lblCrossQ7A3;
	private JLabel lblCrossQ7A4;

	private JLabel lblTickQ8;
	private JLabel lblCrossQ8A1;
	private JLabel lblCrossQ8A3;
	private JLabel lblCrossQ8A4;

	private IQuiz model;
	private JTextField txtAnswerQ1;
	private JTextField txtAnswerQ2;
	private JTextArea txtQ2Explanation;
	private JTextField txtAnswerQ3;
	private JTextArea txtQ3Explanation;
	private JTextField txtAnswerQ4;
	private JTextArea txtQ4Explanation;
	private JTextField txtAnswerQ5;
	private JTextArea txtQ5Explanation;
	private JTextField txtAnswerQ6;
	private JTextArea txtQ6Explanation;
	private JTextField txtAnswerQ7;
	private JTextArea txtQ7Explanation;
	private JTextField txtAnswerQ8;
	private JTextArea txtQ8Explanation;

	/*
	 * INTEGERS
	 */
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
	 * Create the panel.
	 */
	public QuizResults(IQuiz m) {
		setBackground(Color.WHITE);

		//View holds a reference to the Quiz model
		model = m;


		//register View as an observer to Quiz model
		((Observable) m).addObserver(this);

		setPreferredSize(new Dimension(867, 2300));
		setLayout(null);
		
		
		/*
		 * Radio buttons representing multiple choice questions
		 */
		ButtonGroup btnGroupQ1 = new ButtonGroup();
		ButtonGroup btnGroupQ2 = new ButtonGroup();
		ButtonGroup btnGroupQ3 = new ButtonGroup();
		ButtonGroup btnGroupQ4 = new ButtonGroup();
		ButtonGroup btnGroupQ5 = new ButtonGroup();
		ButtonGroup btnGroupQ6 = new ButtonGroup();
		ButtonGroup btnGroupQ7 = new ButtonGroup();
		ButtonGroup btnGroupQ8 = new ButtonGroup();


		rdbtnQ1A1 = new JRadioButton("Recursion is a class.");
		rdbtnQ1A1.setBackground(Color.WHITE);
		rdbtnQ1A1.setEnabled(false);
		rdbtnQ1A1.setBounds(48, 200, 150, 23);
		add(rdbtnQ1A1);


		rdbtnQ1A2 = new JRadioButton("Recursion is the process of defining a method that calls other methods repeatedly.");
		rdbtnQ1A2.setBackground(Color.WHITE);
		rdbtnQ1A2.setEnabled(false);
		rdbtnQ1A2.setBounds(48, 226, 508, 23);
		add(rdbtnQ1A2);

		rdbtnQ1A3 = new JRadioButton("Recursion is the process of defining a method that calls itself repeatedly.");
		rdbtnQ1A3.setBackground(Color.WHITE);
		rdbtnQ1A3.setEnabled(false);
		rdbtnQ1A3.setBounds(48, 252, 455, 23);
		add(rdbtnQ1A3);

		rdbtnQ1A4 = new JRadioButton("Recursion is the process of defining a method that calls other methods which in turn call again this method.");
		rdbtnQ1A4.setBackground(Color.WHITE);
		rdbtnQ1A4.setEnabled(false);
		rdbtnQ1A4.setBounds(48, 278, 658, 23);
		add(rdbtnQ1A4);

		/*
		 * Button Group for Question 1
		 */
		btnGroupQ1.add(rdbtnQ1A1);
		btnGroupQ1.add(rdbtnQ1A2);
		btnGroupQ1.add(rdbtnQ1A3);
		btnGroupQ1.add(rdbtnQ1A4);

		rdbtnQ2A1 = new JRadioButton("An infinite loop occurs");
		rdbtnQ2A1.setBackground(Color.WHITE);
		rdbtnQ2A1.setEnabled(false);
		rdbtnQ2A1.setBounds(48, 479, 171, 23);
		add(rdbtnQ2A1);

		rdbtnQ2A2 = new JRadioButton("The system stops the program after some time");
		rdbtnQ2A2.setBackground(Color.WHITE);
		rdbtnQ2A2.setEnabled(false);
		rdbtnQ2A2.setBounds(48, 505, 300, 23);
		add(rdbtnQ2A2);

		rdbtnQ2A3 = new JRadioButton("After 1000000 calls it will be automatically stopped.");
		rdbtnQ2A3.setBackground(Color.WHITE);
		rdbtnQ2A3.setEnabled(false);
		rdbtnQ2A3.setBounds(48, 531, 322, 23);
		add(rdbtnQ2A3);

		rdbtnQ2A4 = new JRadioButton("None of the above");
		rdbtnQ2A4.setBackground(Color.WHITE);
		rdbtnQ2A4.setEnabled(false);
		rdbtnQ2A4.setBounds(48, 557, 138, 23);
		add(rdbtnQ2A4);

		/*
		 * Button Group for Question 2
		 */
		btnGroupQ2.add(rdbtnQ2A1);
		btnGroupQ2.add(rdbtnQ2A2);
		btnGroupQ2.add(rdbtnQ2A3);
		btnGroupQ2.add(rdbtnQ2A4);


		rdbtnQ3A1 = new JRadioButton("A recursive method must have a base case.");
		rdbtnQ3A1.setBackground(Color.WHITE);
		rdbtnQ3A1.setEnabled(false);
		rdbtnQ3A1.setBounds(48, 709, 279, 23);
		add(rdbtnQ3A1);

		rdbtnQ3A2 = new JRadioButton("Recursion always uses a stack behind the scenes.");
		rdbtnQ3A2.setBackground(Color.WHITE);
		rdbtnQ3A2.setEnabled(false);
		rdbtnQ3A2.setBounds(48, 735, 320, 23);
		add(rdbtnQ3A2);

		rdbtnQ3A3 = new JRadioButton("Recursive methods are faster than a programmers written loop to call the function repeatedly using a stack.");
		rdbtnQ3A3.setBackground(Color.WHITE);
		rdbtnQ3A3.setEnabled(false);
		rdbtnQ3A3.setBounds(48, 761, 636, 23);
		add(rdbtnQ3A3);

		rdbtnQ3A4 = new JRadioButton("Memoization is a technique which makes recursion slower and less efficient.");
		rdbtnQ3A4.setBackground(Color.WHITE);
		rdbtnQ3A4.setEnabled(false);
		rdbtnQ3A4.setBounds(48, 787, 470, 23);
		add(rdbtnQ3A4);

		/*
		 * Button Group for Question 3
		 */
		btnGroupQ3.add(rdbtnQ3A1);
		btnGroupQ3.add(rdbtnQ3A2);
		btnGroupQ3.add(rdbtnQ3A3);
		btnGroupQ3.add(rdbtnQ3A4);


		rdbtnQ4A1 = new JRadioButton("n == 0 && n == 1");
		rdbtnQ4A1.setBackground(Color.WHITE);
		rdbtnQ4A1.setEnabled(false);
		rdbtnQ4A1.setBounds(48, 949, 120, 23);
		add(rdbtnQ4A1);

		rdbtnQ4A2 = new JRadioButton("n == 0 || n == 1");
		rdbtnQ4A2.setBackground(Color.WHITE);
		rdbtnQ4A2.setEnabled(false);
		rdbtnQ4A2.setBounds(48, 975, 110, 23);
		add(rdbtnQ4A2);

		rdbtnQ4A3 = new JRadioButton("n <= 1");
		rdbtnQ4A3.setBackground(Color.WHITE);
		rdbtnQ4A3.setEnabled(false);
		rdbtnQ4A3.setBounds(48, 1001, 60, 23);
		add(rdbtnQ4A3);

		rdbtnQ4A4 = new JRadioButton("None of the above");
		rdbtnQ4A4.setBackground(Color.WHITE);
		rdbtnQ4A4.setEnabled(false);
		rdbtnQ4A4.setBounds(48, 1025, 130, 23);
		add(rdbtnQ4A4);

		/*
		 * Button Group for Question 4
		 */

		btnGroupQ4.add(rdbtnQ4A1);
		btnGroupQ4.add(rdbtnQ4A2);
		btnGroupQ4.add(rdbtnQ4A3);
		btnGroupQ4.add(rdbtnQ4A4);

		rdbtnQ5A1 = new JRadioButton("1");
		rdbtnQ5A1.setBackground(Color.WHITE);
		rdbtnQ5A1.setEnabled(false);
		rdbtnQ5A1.setBounds(48, 1300, 35, 23);
		add(rdbtnQ5A1);

		rdbtnQ5A2 = new JRadioButton("24");
		rdbtnQ5A2.setBackground(Color.WHITE);
		rdbtnQ5A2.setEnabled(false);
		rdbtnQ5A2.setBounds(48, 1326, 40, 23);
		add(rdbtnQ5A2);

		rdbtnQ5A3 = new JRadioButton("120");
		rdbtnQ5A3.setBackground(Color.WHITE);
		rdbtnQ5A3.setEnabled(false);
		rdbtnQ5A3.setBounds(48, 1352, 50, 23);
		add(rdbtnQ5A3);

		rdbtnQ5A4 = new JRadioButton("720");
		rdbtnQ5A4.setBackground(Color.WHITE);
		rdbtnQ5A4.setEnabled(false);
		rdbtnQ5A4.setBounds(48, 1378, 50, 23);
		add(rdbtnQ5A4);

		/*
		 * Button Group for Question 5
		 */
		btnGroupQ5.add(rdbtnQ5A1);
		btnGroupQ5.add(rdbtnQ5A2);
		btnGroupQ5.add(rdbtnQ5A3);
		btnGroupQ5.add(rdbtnQ5A4);

		txtQuestion1 = new JTextField();
		txtQuestion1.setBackground(Color.WHITE);
		txtQuestion1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion1.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion1.setFocusable(false);
		txtQuestion1.setEditable(false);
		txtQuestion1.setText("Question 1: Which of these describes the most basic form of recursion in java?");
		txtQuestion1.setBounds(48, 160, 561, 20);
		add(txtQuestion1);
		txtQuestion1.setColumns(10);

		txtQuestion2 = new JTextField();
		txtQuestion2.setBackground(Color.WHITE);
		txtQuestion2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion2.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion2.setFocusable(false);
		txtQuestion2.setEditable(false);
		txtQuestion2.setText("Question 2:  Which of these will happen if a recursive method does not have a base case?");
		txtQuestion2.setBounds(48, 439, 561, 20);
		add(txtQuestion2);
		txtQuestion2.setColumns(10);

		txtQuestion3 = new JTextField();
		txtQuestion3.setBackground(Color.WHITE);
		txtQuestion3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion3.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion3.setFocusable(false);
		txtQuestion3.setEditable(false);
		txtQuestion3.setText("Question 3: Which of these is not a correct statement?");
		txtQuestion3.setBounds(48, 669, 561, 20);
		add(txtQuestion3);
		txtQuestion3.setColumns(10);

		txtQuestion4 = new JTextArea();
		txtQuestion4.setBackground(Color.WHITE);
		txtQuestion4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion4.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion4.setWrapStyleWord(true);
		txtQuestion4.setLineWrap(true);
		txtQuestion4.setFocusable(false);
		txtQuestion4.setEditable(false);
		txtQuestion4.setText("Question 4: Suppose you are going to write a method which calculates the nth number in the fibonacci sequence. fib(n) returns fib(n-1) + fib(n-2), where the fib(0) and fib(1) are both defined to be 1. What is NOT a suitable base case for this method?");
		txtQuestion4.setBounds(48, 899, 800, 35);
		add(txtQuestion4);
		txtQuestion4.setColumns(10);

		txtQuestion5 = new JTextPane();
		txtQuestion5.setContentType("text/html");
		txtQuestion5.setFocusable(false);
		txtQuestion5.setEditable(false);
		txtQuestion5.setText("<html><font face=\"calibri\", size = 4>\r\nQuestion 5: What is the output of this program if input value of n is 4?\r\n</font>\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</html>");
		txtQuestion5.setBounds(48, 1140, 420, 150);
		add(txtQuestion5);

		txtDescription = new JTextArea();
		txtDescription.setBackground(Color.WHITE);
		txtDescription.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtDescription.setFocusable(false);
		txtDescription.setWrapStyleWord(true);
		txtDescription.setLineWrap(true);
		txtDescription.setText("Congratulations, you scored X out of 8!");
		txtDescription.setEditable(false);
		txtDescription.setBounds(218, 11, 300, 101);
		add(txtDescription);
		
		/*
		 * Labels which icons are set to ticks and crosses for correct/incorrect answers
		 */
		lblCrossQ1A1 = new JLabel("");
		lblCrossQ1A1.setVisible(false);
		lblCrossQ1A1.setFocusable(false);
		lblCrossQ1A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ1A1.setBounds(204, 200, 27, 23);
		add(lblCrossQ1A1);

		lblTickQ1 = new JLabel("");
		lblTickQ1.setVisible(false);
		lblTickQ1.setFocusable(false);
		lblTickQ1.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ1.setBounds(521, 252, 27, 23);
		add(lblTickQ1);

		lblCrossQ1A4 = new JLabel("");
		lblCrossQ1A4.setVisible(false);
		lblCrossQ1A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ1A4.setFocusable(false);
		lblCrossQ1A4.setBounds(706, 278, 27, 23);
		add(lblCrossQ1A4);

		lblCrossQ1A2 = new JLabel("");
		lblCrossQ1A2.setVisible(false);
		lblCrossQ1A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ1A2.setFocusable(false);
		lblCrossQ1A2.setBounds(562, 226, 27, 23);
		add(lblCrossQ1A2);

		lblTickQ2 = new JLabel("");
		lblTickQ2.setVisible(false);
		lblTickQ2.setFocusable(false);
		lblTickQ2.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ2.setBounds(225, 479, 27, 23);
		add(lblTickQ2);

		lblCrossQ2A2 = new JLabel("");
		lblCrossQ2A2.setVisible(false);
		lblCrossQ2A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ2A2.setFocusable(false);
		lblCrossQ2A2.setBounds(354, 505, 27, 23);
		add(lblCrossQ2A2);

		lblCrossQ2A3 = new JLabel("");
		lblCrossQ2A3.setVisible(false);
		lblCrossQ2A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ2A3.setFocusable(false);
		lblCrossQ2A3.setBounds(376, 531, 27, 23);
		add(lblCrossQ2A3);

		lblCrossQ2A4 = new JLabel("");
		lblCrossQ2A4.setVisible(false);
		lblCrossQ2A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ2A4.setFocusable(false);
		lblCrossQ2A4.setBounds(192, 557, 27, 23);
		add(lblCrossQ2A4);

		lblTickQ3 = new JLabel("");
		lblTickQ3.setVisible(false);
		lblTickQ3.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ3.setFocusable(false);
		lblTickQ3.setBounds(524, 787, 27, 23);
		add(lblTickQ3);

		lblCrossQ3A2 = new JLabel("");
		lblCrossQ3A2.setVisible(false);
		lblCrossQ3A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ3A2.setFocusable(false);
		lblCrossQ3A2.setBounds(375, 735, 27, 23);
		add(lblCrossQ3A2);

		lblCrossQ3A3 = new JLabel("");
		lblCrossQ3A3.setVisible(false);
		lblCrossQ3A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ3A3.setFocusable(false);
		lblCrossQ3A3.setBounds(690, 761, 27, 23);
		add(lblCrossQ3A3);

		lblCrossQ3A1 = new JLabel("");
		lblCrossQ3A1.setVisible(false);
		lblCrossQ3A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ3A1.setFocusable(false);
		lblCrossQ3A1.setBounds(333, 709, 27, 23);
		add(lblCrossQ3A1);

		lblTickQ4 = new JLabel("");
		lblTickQ4.setVisible(false);
		lblTickQ4.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ4.setFocusable(false);
		lblTickQ4.setBounds(170, 949, 27, 23);
		add(lblTickQ4);

		lblCrossQ4A2 = new JLabel("");
		lblCrossQ4A2.setVisible(false);
		lblCrossQ4A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ4A2.setFocusable(false);
		lblCrossQ4A2.setBounds(160, 975, 27, 23);
		add(lblCrossQ4A2);

		lblCrossQ4A3 = new JLabel("");
		lblCrossQ4A3.setVisible(false);
		lblCrossQ4A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ4A3.setFocusable(false);
		lblCrossQ4A3.setBounds(110, 1001, 27, 23);
		add(lblCrossQ4A3);

		lblCrossQ4A4 = new JLabel("");
		lblCrossQ4A4.setVisible(false);
		lblCrossQ4A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ4A4.setFocusable(false);
		lblCrossQ4A4.setBounds(180, 1025, 27, 23);
		add(lblCrossQ4A4);

		lblTickQ5 = new JLabel("");
		lblTickQ5.setVisible(false);
		lblTickQ5.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ5.setFocusable(false);
		lblTickQ5.setBounds(100, 1326, 27, 23);
		add(lblTickQ5);

		lblCrossQ5A1 = new JLabel("");
		lblCrossQ5A1.setVisible(false);
		lblCrossQ5A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ5A1.setFocusable(false);
		lblCrossQ5A1.setBounds(90, 1300, 27, 23);
		add(lblCrossQ5A1);

		lblCrossQ5A3 = new JLabel("");
		lblCrossQ5A3.setVisible(false);
		lblCrossQ5A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ5A3.setFocusable(false);
		lblCrossQ5A3.setBounds(100, 1352, 27, 23);
		add(lblCrossQ5A3);

		lblCrossQ5A4 = new JLabel("");
		lblCrossQ5A4.setVisible(false);
		lblCrossQ5A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ5A4.setFocusable(false);
		lblCrossQ5A4.setBounds(100, 1378, 27, 23);
		add(lblCrossQ5A4);

		txtQuestion6 = new JTextField();
		txtQuestion6.setBackground(Color.WHITE);
		txtQuestion6.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion6.setFocusable(false);
		txtQuestion6.setEditable(false);
		txtQuestion6.setText("Question 6: Which of these data types is used by the operating system to manage recursion in Java?");
		txtQuestion6.setBounds(48, 1490, 650, 20);
		add(txtQuestion6);
		txtQuestion6.setColumns(10);

		rdbtnQ6A1 = new JRadioButton("Array");
		rdbtnQ6A1.setBackground(Color.WHITE);
		rdbtnQ6A1.setEnabled(false);
		rdbtnQ6A1.setBounds(48, 1530, 60, 23);
		add(rdbtnQ6A1);

		rdbtnQ6A2 = new JRadioButton("Stack");
		rdbtnQ6A2.setBackground(Color.WHITE);
		rdbtnQ6A2.setEnabled(false);
		rdbtnQ6A2.setBounds(48, 1556, 60, 23);
		add(rdbtnQ6A2);

		rdbtnQ6A3 = new JRadioButton("Queue");
		rdbtnQ6A3.setBackground(Color.WHITE);
		rdbtnQ6A3.setEnabled(false);
		rdbtnQ6A3.setBounds(48, 1582, 70, 23);
		add(rdbtnQ6A3);

		rdbtnQ6A4 = new JRadioButton("Tree");
		rdbtnQ6A4.setBackground(Color.WHITE);
		rdbtnQ6A4.setEnabled(false);
		rdbtnQ6A4.setBounds(48, 1608, 60, 23);
		add(rdbtnQ6A4);

		/*
		 * Button Group for Question 6
		 */
		btnGroupQ6.add(rdbtnQ6A1);
		btnGroupQ6.add(rdbtnQ6A2);
		btnGroupQ6.add(rdbtnQ6A3);
		btnGroupQ6.add(rdbtnQ6A4);

		txtQuestion7 = new JTextPane();
		txtQuestion7.setBackground(Color.WHITE);
		txtQuestion7.setEditable(false);
		txtQuestion7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion7.setContentType("text/html");
		txtQuestion7.setText("<html><font face=\"calibri\", size = 4>\r\nQuestion 7: What is the output of this program if input value of n is 1?\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</font>\r\n</html>");
		txtQuestion7.setBounds(48, 1730, 500, 150);
		add(txtQuestion7);

		rdbtnQ7A1 = new JRadioButton("0");
		rdbtnQ7A1.setBackground(Color.WHITE);
		rdbtnQ7A1.setEnabled(false);
		rdbtnQ7A1.setBounds(48, 1880, 40, 23);
		add(rdbtnQ7A1);

		rdbtnQ7A2 = new JRadioButton("1");
		rdbtnQ7A2.setBackground(Color.WHITE);
		rdbtnQ7A2.setEnabled(false);
		rdbtnQ7A2.setFocusable(false);
		rdbtnQ7A2.setBounds(48, 1906, 40, 23);
		add(rdbtnQ7A2);

		rdbtnQ7A3 = new JRadioButton("Stack overflow error");
		rdbtnQ7A3.setBackground(Color.WHITE);
		rdbtnQ7A3.setEnabled(false);
		rdbtnQ7A3.setBounds(48, 1932, 150, 23);
		add(rdbtnQ7A3);

		rdbtnQ7A4 = new JRadioButton("720");
		rdbtnQ7A4.setBackground(Color.WHITE);
		rdbtnQ7A4.setEnabled(false);
		rdbtnQ7A4.setBounds(48, 1958, 50, 23);
		add(rdbtnQ7A4);

		/*
		 * Button Group for Question 7
		 */
		btnGroupQ7.add(rdbtnQ7A1);
		btnGroupQ7.add(rdbtnQ7A2);
		btnGroupQ7.add(rdbtnQ7A3);
		btnGroupQ7.add(rdbtnQ7A4);

		txtQuestion8 = new JTextField();
		txtQuestion8.setBackground(Color.WHITE);
		txtQuestion8.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion8.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion8.setFocusable(false);
		txtQuestion8.setEditable(false);
		txtQuestion8.setText("Question 8: How many recursive calls are made when calculating the value of fact(3), excluding the initial call of fact(3).");
		txtQuestion8.setBounds(48, 2070, 750, 20);
		add(txtQuestion8);
		txtQuestion8.setColumns(10);

		rdbtnQ8A1 = new JRadioButton("1");
		rdbtnQ8A1.setBackground(Color.WHITE);
		rdbtnQ8A1.setEnabled(false);
		rdbtnQ8A1.setBounds(48, 2110, 40, 23);
		add(rdbtnQ8A1);

		rdbtnQ8A2 = new JRadioButton("2");
		rdbtnQ8A2.setBackground(Color.WHITE);
		rdbtnQ8A2.setEnabled(false);
		rdbtnQ8A2.setBounds(48, 2136, 40, 23);
		add(rdbtnQ8A2);

		rdbtnQ8A3 = new JRadioButton("3");
		rdbtnQ8A3.setBackground(Color.WHITE);
		rdbtnQ8A3.setEnabled(false);
		rdbtnQ8A3.setBounds(48, 2162, 40, 23);
		add(rdbtnQ8A3);

		rdbtnQ8A4 = new JRadioButton("4");
		rdbtnQ8A4.setBackground(Color.WHITE);
		rdbtnQ8A4.setEnabled(false);
		rdbtnQ8A4.setBounds(48, 2188, 40, 23);
		add(rdbtnQ8A4);

		/*
		 * Button Group for Question 8
		 */
		btnGroupQ8.add(rdbtnQ8A1);
		btnGroupQ8.add(rdbtnQ8A2);
		btnGroupQ8.add(rdbtnQ8A3);
		btnGroupQ8.add(rdbtnQ8A4);




		//Moves the caret to the top since text fields etc move it
		txtQuestion1.setCaretPosition(0);
		txtQuestion2.setCaretPosition(0);
		txtQuestion3.setCaretPosition(0);
		txtQuestion4.setCaretPosition(0);
		txtQuestion5.setCaretPosition(0);
		txtQuestion6.setCaretPosition(0);
		txtQuestion7.setCaretPosition(0);
		txtQuestion8.setCaretPosition(0);
		txtDescription.setCaretPosition(0);

		lblTickQ6 = new JLabel("");
		lblTickQ6.setVisible(false);
		lblTickQ6.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ6.setFocusable(false);
		lblTickQ6.setBounds(110, 1556, 27, 23);
		add(lblTickQ6);

		lblCrossQ6A1 = new JLabel("");
		lblCrossQ6A1.setVisible(false);
		lblCrossQ6A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ6A1.setFocusable(false);
		lblCrossQ6A1.setBounds(110, 1530, 27, 23);
		add(lblCrossQ6A1);

		lblCrossQ6A3 = new JLabel("");
		lblCrossQ6A3.setVisible(false);
		lblCrossQ6A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ6A3.setFocusable(false);
		lblCrossQ6A3.setBounds(120, 1582, 27, 23);
		add(lblCrossQ6A3);

		lblCrossQ6A4 = new JLabel("");
		lblCrossQ6A4.setVisible(false);
		lblCrossQ6A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ6A4.setFocusable(false);
		lblCrossQ6A4.setBounds(110, 1608, 27, 23);
		add(lblCrossQ6A4);

		lblTickQ7 = new JLabel("");
		lblTickQ7.setVisible(false);
		lblTickQ7.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ7.setFocusable(false);
		lblTickQ7.setBounds(90, 1906, 27, 23);
		add(lblTickQ7);

		lblCrossQ7A1 = new JLabel("");
		lblCrossQ7A1.setVisible(false);
		lblCrossQ7A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ7A1.setFocusable(false);
		lblCrossQ7A1.setBounds(90, 1880, 27, 23);
		add(lblCrossQ7A1);

		lblCrossQ7A3 = new JLabel("");
		lblCrossQ7A3.setVisible(false);
		lblCrossQ7A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ7A3.setFocusable(false);
		lblCrossQ7A3.setBounds(200, 1932, 27, 23);
		add(lblCrossQ7A3);

		lblCrossQ7A4 = new JLabel("");
		lblCrossQ7A4.setVisible(false);
		lblCrossQ7A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ7A4.setFocusable(false);
		lblCrossQ7A4.setBounds(100, 1958, 27, 23);
		add(lblCrossQ7A4);

		lblTickQ8 = new JLabel("");
		lblTickQ8.setVisible(false);
		lblTickQ8.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ8.setFocusable(false);
		lblTickQ8.setBounds(90, 2136, 27, 23);
		add(lblTickQ8);

		lblCrossQ8A1 = new JLabel("");
		lblCrossQ8A1.setVisible(false);
		lblCrossQ8A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ8A1.setFocusable(false);
		lblCrossQ8A1.setBounds(90, 2110, 27, 23);
		add(lblCrossQ8A1);

		lblCrossQ8A3 = new JLabel("");
		lblCrossQ8A3.setVisible(false);
		lblCrossQ8A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ8A3.setFocusable(false);
		lblCrossQ8A3.setBounds(90, 2162, 27, 23);
		add(lblCrossQ8A3);

		lblCrossQ8A4 = new JLabel("");
		lblCrossQ8A4.setVisible(false);
		lblCrossQ8A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ8A4.setFocusable(false);
		lblCrossQ8A4.setBounds(90, 2182, 27, 23);
		add(lblCrossQ8A4);
		
		/*
		 * text fields containing the answer to each question and then a seperate field for the explanations
		 */
		txtAnswerQ1 = new JTextField();
		txtAnswerQ1.setBackground(Color.WHITE);
		txtAnswerQ1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ1.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ1.setEditable(false);
		txtAnswerQ1.setFocusable(false);
		txtAnswerQ1.setText("Answer: Recursion is the process of defining a method that calls itself repeatedly.");
		txtAnswerQ1.setBounds(48, 308, 541, 20);
		add(txtAnswerQ1);
		txtAnswerQ1.setColumns(10);

		JTextArea txtQ1Explanation = new JTextArea();
		txtQ1Explanation.setBackground(Color.WHITE);
		txtQ1Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ1Explanation.setText("Explanation: Recursion is the process of defining something in terms of itself. It allows us to define a method that calls itself, possibly with different arguments.\r\n\r\nAnswer D is also a form of recursion known as Mutual Recursion, however it is not the most \"basic form\".");
		txtQ1Explanation.setFocusable(false);
		txtQ1Explanation.setWrapStyleWord(true);
		txtQ1Explanation.setLineWrap(true);
		txtQ1Explanation.setEditable(false);
		txtQ1Explanation.setBounds(48, 337, 730, 94);
		add(txtQ1Explanation);

		txtAnswerQ2 = new JTextField();
		txtAnswerQ2.setBackground(Color.WHITE);
		txtAnswerQ2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ2.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ2.setFocusable(false);
		txtAnswerQ2.setEditable(false);
		txtAnswerQ2.setText("Answer: An infinite loop occurs");
		txtAnswerQ2.setBounds(48, 588, 204, 20);
		add(txtAnswerQ2);
		txtAnswerQ2.setColumns(10);

		txtQ2Explanation = new JTextArea();
		txtQ2Explanation.setBackground(Color.WHITE);
		txtQ2Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ2Explanation.setText("Explanation: If a recursive method does not have a base case then it will recurse \"infinitely\" or until a stack overflow occurs and the program crashes. \r\n");
		txtQ2Explanation.setLineWrap(true);
		txtQ2Explanation.setWrapStyleWord(true);
		txtQ2Explanation.setFocusable(false);
		txtQ2Explanation.setEditable(false);
		txtQ2Explanation.setBounds(48, 617, 730, 44);
		add(txtQ2Explanation);

		txtAnswerQ3 = new JTextField();
		txtAnswerQ3.setBackground(Color.WHITE);
		txtAnswerQ3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ3.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ3.setText("Answer : Memoization is a technique which makes recursion slower and less efficient.");
		txtAnswerQ3.setFocusable(false);
		txtAnswerQ3.setEditable(false);
		txtAnswerQ3.setBounds(48, 817, 561, 20);
		add(txtAnswerQ3);
		txtAnswerQ3.setColumns(10);

		txtQ3Explanation = new JTextArea();
		txtQ3Explanation.setBackground(Color.WHITE);
		txtQ3Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ3Explanation.setText("Explanation : Memoization increases the speed of recursive functions by storing calculations and their results, thus removing the need to recalculate calculations.");
		txtQ3Explanation.setWrapStyleWord(true);
		txtQ3Explanation.setLineWrap(true);
		txtQ3Explanation.setFocusable(false);
		txtQ3Explanation.setEditable(false);
		txtQ3Explanation.setBounds(48, 849, 730, 44);
		add(txtQ3Explanation);

		txtAnswerQ4 = new JTextField();
		txtAnswerQ4.setBackground(Color.WHITE);
		txtAnswerQ4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ4.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ4.setText("Answer: n == 0 && n == 1");
		txtAnswerQ4.setFocusable(false);
		txtAnswerQ4.setEditable(false);
		txtAnswerQ4.setBounds(48, 1055, 279, 20);
		add(txtAnswerQ4);
		txtAnswerQ4.setColumns(10);

		txtQ4Explanation = new JTextArea();
		txtQ4Explanation.setBackground(Color.WHITE);
		txtQ4Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ4Explanation.setText("Explanation : The use of the logical AND(&&) means the base case will never be met as n cannot be both 0 and 1 at the same time.");
		txtQ4Explanation.setWrapStyleWord(true);
		txtQ4Explanation.setLineWrap(true);
		txtQ4Explanation.setFocusable(false);
		txtQ4Explanation.setEditable(false);
		txtQ4Explanation.setBounds(48, 1085, 730, 44);
		add(txtQ4Explanation);

		txtAnswerQ5 = new JTextField();
		txtAnswerQ5.setBackground(Color.WHITE);
		txtAnswerQ5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ5.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ5.setEditable(false);
		txtAnswerQ5.setFocusable(false);
		txtAnswerQ5.setText("Answer: 24");
		txtAnswerQ5.setBounds(48, 1412, 100, 20);
		add(txtAnswerQ5);
		txtAnswerQ5.setColumns(10);

		txtQ5Explanation = new JTextArea();
		txtQ5Explanation.setBackground(Color.WHITE);
		txtQ5Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ5Explanation.setText("Explanation: Factorial is the product of all positive integers less than or equal to n. Thus, fact(4) can be broken down to 4*3*2*1 = 24");
		txtQ5Explanation.setWrapStyleWord(true);
		txtQ5Explanation.setLineWrap(true);
		txtQ5Explanation.setFocusable(false);
		txtQ5Explanation.setEditable(false);
		txtQ5Explanation.setBounds(48, 1442, 720, 20);
		add(txtQ5Explanation);

		txtAnswerQ6 = new JTextField();
		txtAnswerQ6.setBackground(Color.WHITE);
		txtAnswerQ6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ6.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ6.setText("Answer: Stack");
		txtAnswerQ6.setFocusable(false);
		txtAnswerQ6.setEditable(false);
		txtAnswerQ6.setBounds(48, 1638, 120, 20);
		add(txtAnswerQ6);
		txtAnswerQ6.setColumns(10);

		txtQ6Explanation = new JTextArea();
		txtQ6Explanation.setBackground(Color.WHITE);
		txtQ6Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ6Explanation.setText("Explanation: Recursion is always managed through use of a stack");
		txtQ6Explanation.setWrapStyleWord(true);
		txtQ6Explanation.setLineWrap(true);
		txtQ6Explanation.setFocusable(false);
		txtQ6Explanation.setEditable(false);
		txtQ6Explanation.setBounds(48, 1668, 500, 20);
		add(txtQ6Explanation);

		txtAnswerQ7 = new JTextField();
		txtAnswerQ7.setBackground(Color.WHITE);
		txtAnswerQ7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ7.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ7.setText("Answer: 1\r\n");
		txtAnswerQ7.setFocusable(false);
		txtAnswerQ7.setEditable(false);
		txtAnswerQ7.setBounds(48, 1988, 110, 20);
		add(txtAnswerQ7);
		txtAnswerQ7.setColumns(10);

		txtQ7Explanation = new JTextArea();
		txtQ7Explanation.setBackground(Color.WHITE);
		txtQ7Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ7Explanation.setText("Explanation: Factorial is the product of all positive integers less than or equal to n. Thus, fact(4) can be broken down to 4*3*2*1 = 24");
		txtQ7Explanation.setWrapStyleWord(true);
		txtQ7Explanation.setLineWrap(true);
		txtQ7Explanation.setFocusable(false);
		txtQ7Explanation.setEditable(false);
		txtQ7Explanation.setBounds(48, 2018, 723, 20);
		add(txtQ7Explanation);

		txtAnswerQ8 = new JTextField();
		txtAnswerQ8.setBackground(Color.WHITE);
		txtAnswerQ8.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAnswerQ8.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAnswerQ8.setFocusable(false);
		txtAnswerQ8.setEditable(false);
		txtAnswerQ8.setText("Answer: 2");
		txtAnswerQ8.setBounds(48, 2218, 120, 20);
		add(txtAnswerQ8);
		txtAnswerQ8.setColumns(10);

		txtQ8Explanation = new JTextArea();
		txtQ8Explanation.setBackground(Color.WHITE);
		txtQ8Explanation.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtQ8Explanation.setText("Explanation: fact(3) can be broken down into fact(2) * 3 which then recursively becomes fact(1)*2*3 which will then reach the base case and return 1*2*3 = 6. As you can see, this took two recursive calls to achieve.");
		txtQ8Explanation.setLineWrap(true);
		txtQ8Explanation.setWrapStyleWord(true);
		txtQ8Explanation.setFocusable(false);
		txtQ8Explanation.setEditable(false);
		txtQ8Explanation.setBounds(48, 2248, 750, 40);
		add(txtQ8Explanation);

	}
	
	/**
	 * Gets the users score
	 * 
	 * @return integer score
	 */
	public int getScore(){
		return score;
	}
	
	/**
	 * Sets the local score to the value of the users score for the text message the user recieves
	 * 
	 * @param n integer score
	 */
	public void setScore(int n){
		score = n;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		setScore(model.getScore());
		txtDescription.setText("Congratulations, you scored "+ getScore() + " out of 8!");

		setQ1Answer(model.getQ1Answer());
		setQ1Icons();

		setQ2Answer(model.getQ2Answer());
		setQ2Icons();

		setQ3Answer(model.getQ3Answer());
		setQ3Icons();

		setQ4Answer(model.getQ4Answer());
		setQ4Icons();

		setQ5Answer(model.getQ5Answer());
		setQ5Icons();

		setQ6Answer(model.getQ6Answer());
		setQ6Icons();

		setQ7Answer(model.getQ7Answer());
		setQ7Icons();

		setQ8Answer(model.getQ8Answer());
		setQ8Icons();
	}

	/*
	 * Getters and setters for the answer to each question
	 * The names of the methods correspond to the question number
	 * e.g getQ1Answer is question 1 and so on
	 */
	public int getQ1Answer() {
		return question1Answer;
	}


	public void setQ1Answer(int n) {
		question1Answer = n;

	}


	public int getQ2Answer() {
		return question2Answer;
	}


	public void setQ2Answer(int n) {
		question2Answer = n;

	}


	public int getQ3Answer() {
		return question3Answer;
	}


	public void setQ3Answer(int n) {
		question3Answer = n;

	}


	public int getQ4Answer() {
		return question4Answer;
	}


	public void setQ4Answer(int n) {
		question4Answer = n;

	}


	public int getQ5Answer() {
		return question5Answer;
	}


	public void setQ5Answer(int n) {
		question5Answer = n;

	}


	public int getQ6Answer() {
		return question6Answer;
	}


	public void setQ6Answer(int n) {
		question6Answer = n;

	}


	public int getQ7Answer() {
		return question7Answer;
	}


	public void setQ7Answer(int n) {
		question7Answer = n;

	}


	public int getQ8Answer() {
		return question8Answer;
	}


	public void setQ8Answer(int n) {
		question8Answer = n;

	}
	
	/*
	 * Sets the tick/cross labels visible/invisible for each question
	 * The answer that the user selected is set selected to make sure they know which answer they picked
	 * The label is then displayed beside that answer, tick if correct, cross if incorrect
	 */
	public void setQ1Icons(){
		if(question1Answer == 1){
			rdbtnQ1A1.setSelected(true);
			rdbtnQ1A1.setEnabled(true);
			lblCrossQ1A1.setVisible(true);
		}

		if(question1Answer == 2){
			rdbtnQ1A2.setSelected(true);
			rdbtnQ1A2.setEnabled(true);
			lblCrossQ1A2.setVisible(true);
		}

		if(question1Answer == 3){
			rdbtnQ1A3.setSelected(true);
			rdbtnQ1A3.setEnabled(true);
			lblTickQ1.setVisible(true);
		}

		if(question1Answer == 4){
			rdbtnQ1A4.setSelected(true);
			rdbtnQ1A4.setEnabled(true);
			lblCrossQ1A4.setVisible(true);
		}
	}

	public void setQ2Icons(){
		if(question2Answer == 1){
			rdbtnQ2A1.setSelected(true);
			rdbtnQ2A1.setEnabled(true);
			lblTickQ2.setVisible(true);
		}

		if(question2Answer == 2){
			rdbtnQ2A2.setSelected(true);
			rdbtnQ2A2.setEnabled(true);
			lblCrossQ2A2.setVisible(true);
		}

		if(question2Answer == 3){
			rdbtnQ2A3.setSelected(true);
			rdbtnQ2A3.setEnabled(true);
			lblCrossQ2A3.setVisible(true);
		}

		if(question2Answer == 4){
			rdbtnQ2A4.setSelected(true);
			rdbtnQ2A4.setEnabled(true);
			lblCrossQ2A4.setVisible(true);
		}
	}

	public void setQ3Icons(){
		if(question3Answer == 1){
			rdbtnQ3A1.setSelected(true);
			rdbtnQ3A1.setEnabled(true);
			lblCrossQ3A1.setVisible(true);
		}

		if(question3Answer == 2){
			rdbtnQ3A2.setSelected(true);
			rdbtnQ3A2.setEnabled(true);
			lblCrossQ3A2.setVisible(true);
		}

		if(question3Answer == 3){
			rdbtnQ3A3.setSelected(true);
			rdbtnQ3A3.setEnabled(true);
			lblCrossQ3A3.setVisible(true);
		}

		if(question3Answer == 4){
			rdbtnQ3A4.setSelected(true);
			rdbtnQ3A4.setEnabled(true);
			lblTickQ4.setVisible(true);
		}
	}

	public void setQ4Icons(){
		if(question4Answer == 1){
			rdbtnQ4A1.setSelected(true);
			rdbtnQ4A1.setEnabled(true);
			lblTickQ4.setVisible(true);
		}

		if(question4Answer == 2){
			rdbtnQ4A2.setSelected(true);
			rdbtnQ4A2.setEnabled(true);
			lblCrossQ4A2.setVisible(true);
		}

		if(question4Answer == 3){
			rdbtnQ4A3.setSelected(true);
			rdbtnQ4A3.setEnabled(true);
			lblCrossQ4A3.setVisible(true);
		}

		if(question4Answer == 4){
			rdbtnQ4A4.setSelected(true);
			rdbtnQ4A4.setEnabled(true);
			lblCrossQ4A4.setVisible(true);
		}
	}

	public void setQ5Icons(){
		if(question5Answer == 1){
			rdbtnQ5A1.setSelected(true);
			rdbtnQ5A1.setEnabled(true);
			lblCrossQ5A1.setVisible(true);
		}

		if(question5Answer == 2){
			rdbtnQ5A2.setSelected(true);
			rdbtnQ5A2.setEnabled(true);
			lblTickQ5.setVisible(true);
		}

		if(question5Answer == 3){
			rdbtnQ5A3.setSelected(true);
			rdbtnQ5A3.setEnabled(true);
			lblCrossQ5A3.setVisible(true);
		}

		if(question5Answer == 4){
			rdbtnQ5A4.setSelected(true);
			rdbtnQ5A4.setEnabled(true);
			lblCrossQ5A4.setVisible(true);
		}
	}

	public void setQ6Icons(){
		if(question6Answer == 1){
			rdbtnQ6A1.setSelected(true);
			rdbtnQ6A1.setEnabled(true);
			lblCrossQ6A1.setVisible(true);
		}

		if(question6Answer == 2){
			rdbtnQ6A2.setSelected(true);
			rdbtnQ6A2.setEnabled(true);
			lblTickQ6.setVisible(true);
		}

		if(question6Answer == 3){
			rdbtnQ6A3.setSelected(true);
			rdbtnQ6A3.setEnabled(true);
			lblCrossQ6A3.setVisible(true);
		}

		if(question6Answer == 4){
			rdbtnQ6A4.setSelected(true);
			rdbtnQ6A4.setEnabled(true);
			lblCrossQ6A4.setVisible(true);
		}
	}

	public void setQ7Icons(){
		if(question7Answer == 1){
			rdbtnQ7A1.setSelected(true);
			rdbtnQ7A1.setEnabled(true);
			lblCrossQ7A1.setVisible(true);
		}

		if(question7Answer == 2){
			rdbtnQ7A2.setSelected(true);
			rdbtnQ7A2.setEnabled(true);
			lblTickQ7.setVisible(true);
		}

		if(question7Answer == 3){
			rdbtnQ7A3.setSelected(true);
			rdbtnQ7A3.setEnabled(true);
			lblCrossQ7A3.setVisible(true);
		}

		if(question7Answer == 4){
			rdbtnQ7A4.setSelected(true);
			rdbtnQ7A4.setEnabled(true);
			lblCrossQ7A4.setVisible(true);
		}
	}

	public void setQ8Icons(){
		if(question8Answer == 1){
			rdbtnQ8A1.setSelected(true);
			rdbtnQ8A1.setEnabled(true);
			lblCrossQ8A1.setVisible(true);
		}

		if(question8Answer == 2){
			rdbtnQ8A2.setSelected(true);
			rdbtnQ8A2.setEnabled(true);
			lblTickQ8.setVisible(true);
		}

		if(question8Answer == 3){
			rdbtnQ8A3.setSelected(true);
			rdbtnQ8A3.setEnabled(true);
			lblCrossQ8A3.setVisible(true);
		}

		if(question8Answer == 4){
			rdbtnQ8A4.setSelected(true);
			rdbtnQ8A4.setEnabled(true);
			lblCrossQ8A4.setVisible(true);
		}
	}
}
