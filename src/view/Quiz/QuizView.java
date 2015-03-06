package view.Quiz;

/**
 * This is the screen that has the multiple choice quiz.
 * It has multiple questions that the user can answer by click the answer they think is correct.
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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.About;
import view.MainMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import model.IQuiz;
import model.Quiz;
import controller.QuizController;

import java.awt.CardLayout;

import javax.swing.UIManager;

import java.awt.Font;

public class QuizView extends JFrame {

	private static final long serialVersionUID = 5172182919142981596L;
	private JPanel contentPane;

	private JTextArea txtDescription;
	private JTextField txtQuestion1;
	private JTextField txtQuestion2;
	private JTextField txtQuestion3;
	private JTextArea txtQuestion4;
	private JTextPane txtQuestion5;
	private JTextField txtQuestion6;
	private JTextPane txtQuestion7;
	private JTextField txtQuestion8;

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

	private int score;

	private JScrollPane scrollPane;

	private QuizResults results;

	private IQuiz model;

	private QuizController qController;

	private int question1Answer;
	private int question2Answer;
	private int question3Answer;
	private int question4Answer;
	private int question5Answer;
	private int question6Answer;
	private int question7Answer;
	private int question8Answer;
	private JButton btnMainMenu;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IQuiz model = new Quiz();
					QuizView frame = new QuizView(model);
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
	public QuizView(IQuiz m) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-FrameIcon.png")));
		model = m;

		results = new QuizResults(model);

		qController = new QuizController(model, this);

		setTitle("End of Unit Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 757);
		
		/*
		 * The menu bar with its drop down options
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmMainMenu = new JMenuItem("Main Menu");
		mntmMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
			}
		});
		mnFile.add(mntmMainMenu);

		JMenuItem mntmQut = new JMenuItem("Quit");
		mntmQut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmQut);

		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About a = new About();
				a.setVisible(true);
				a.setLocationRelativeTo(null);
				a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mnAbout.add(mntmAbout);
		
		/*
		 * Content pane and panels
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 11, 886, 613);
		//Setting the scroll speed as the default is rather slow
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		contentPane.add(scrollPane);

		JPanel cardPanel = new JPanel();
		scrollPane.setViewportView(cardPanel);
		cardPanel.setLayout(new CardLayout(0, 0));

		JPanel contentPanel = new JPanel();
		contentPanel.setFocusable(false);
		contentPanel.setLayout(null);
		contentPanel.setPreferredSize(new Dimension(800, 1820));
		cardPanel.add(contentPanel, "name_165769048447621");
		
		/*
		 * Radio buttons for each question and their corresponding button groups
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
		rdbtnQ1A1.setBounds(48, 200, 150, 23);
		contentPanel.add(rdbtnQ1A1);


		rdbtnQ1A2 = new JRadioButton("Recursion is the process of defining a method that calls other methods repeatedly.");
		rdbtnQ1A2.setBounds(48, 226, 508, 23);
		contentPanel.add(rdbtnQ1A2);

		rdbtnQ1A3 = new JRadioButton("Recursion is the process of defining a method that calls itself repeatedly.");
		rdbtnQ1A3.setBounds(48, 252, 455, 23);
		contentPanel.add(rdbtnQ1A3);

		rdbtnQ1A4 = new JRadioButton("Recursion is the process of defining a method that calls other methods which in turn call again this method.");
		rdbtnQ1A4.setBounds(48, 278, 658, 23);
		contentPanel.add(rdbtnQ1A4);

		/*
		 * Button Group for Question 1
		 */
		btnGroupQ1.add(rdbtnQ1A1);
		btnGroupQ1.add(rdbtnQ1A2);
		btnGroupQ1.add(rdbtnQ1A3);
		btnGroupQ1.add(rdbtnQ1A4);

		rdbtnQ2A1 = new JRadioButton("An infinite loop occurs");
		rdbtnQ2A1.setBounds(48, 380, 171, 23);
		contentPanel.add(rdbtnQ2A1);

		rdbtnQ2A2 = new JRadioButton("The system stops the program after some time");
		rdbtnQ2A2.setBounds(48, 406, 300, 23);
		contentPanel.add(rdbtnQ2A2);

		rdbtnQ2A3 = new JRadioButton("After 1000000 calls it will be automatically stopped.");
		rdbtnQ2A3.setBounds(48, 432, 322, 23);
		contentPanel.add(rdbtnQ2A3);

		rdbtnQ2A4 = new JRadioButton("None of the above");
		rdbtnQ2A4.setBounds(48, 458, 138, 23);
		contentPanel.add(rdbtnQ2A4);

		/*
		 * Button Group for Question 2
		 */
		btnGroupQ2.add(rdbtnQ2A1);
		btnGroupQ2.add(rdbtnQ2A2);
		btnGroupQ2.add(rdbtnQ2A3);
		btnGroupQ2.add(rdbtnQ2A4);


		rdbtnQ3A1 = new JRadioButton("A recursive method must have a base case.");
		rdbtnQ3A1.setBounds(48, 560, 279, 23);
		contentPanel.add(rdbtnQ3A1);

		rdbtnQ3A2 = new JRadioButton("Recursion always uses a stack behind the scenes.");
		rdbtnQ3A2.setBounds(48, 586, 320, 23);
		contentPanel.add(rdbtnQ3A2);

		rdbtnQ3A3 = new JRadioButton("Recursive methods are faster than a programmers written loop to call the function repeatedly using a stack.");
		rdbtnQ3A3.setBounds(48, 612, 636, 23);
		contentPanel.add(rdbtnQ3A3);

		rdbtnQ3A4 = new JRadioButton("Memoization is a technique which makes recursion slower and less efficient.");
		rdbtnQ3A4.setBounds(48, 638, 470, 23);
		contentPanel.add(rdbtnQ3A4);

		/*
		 * Button Group for Question 3
		 */
		btnGroupQ3.add(rdbtnQ3A1);
		btnGroupQ3.add(rdbtnQ3A2);
		btnGroupQ3.add(rdbtnQ3A3);
		btnGroupQ3.add(rdbtnQ3A4);


		rdbtnQ4A1 = new JRadioButton("n == 0 && n == 1");
		rdbtnQ4A1.setBounds(48, 750, 120, 23);
		contentPanel.add(rdbtnQ4A1);

		rdbtnQ4A2 = new JRadioButton("n == 0 || n == 1");
		rdbtnQ4A2.setBounds(48, 776, 110, 23);
		contentPanel.add(rdbtnQ4A2);

		rdbtnQ4A3 = new JRadioButton("n <= 1");
		rdbtnQ4A3.setBounds(48, 802, 60, 23);
		contentPanel.add(rdbtnQ4A3);

		rdbtnQ4A4 = new JRadioButton("None of the above");
		rdbtnQ4A4.setBounds(48, 826, 130, 23);
		contentPanel.add(rdbtnQ4A4);

		/*
		 * Button Group for Question 4
		 */

		btnGroupQ4.add(rdbtnQ4A1);
		btnGroupQ4.add(rdbtnQ4A2);
		btnGroupQ4.add(rdbtnQ4A3);
		btnGroupQ4.add(rdbtnQ4A4);

		rdbtnQ5A1 = new JRadioButton("1");
		rdbtnQ5A1.setBounds(48, 1050, 35, 23);
		contentPanel.add(rdbtnQ5A1);

		rdbtnQ5A2 = new JRadioButton("24");
		rdbtnQ5A2.setBounds(48, 1076, 40, 23);
		contentPanel.add(rdbtnQ5A2);

		rdbtnQ5A3 = new JRadioButton("120");
		rdbtnQ5A3.setBounds(48, 1102, 50, 23);
		contentPanel.add(rdbtnQ5A3);

		rdbtnQ5A4 = new JRadioButton("720");
		rdbtnQ5A4.setBounds(48, 1128, 50, 23);
		contentPanel.add(rdbtnQ5A4);

		/*
		 * Button Group for Question 5
		 */
		btnGroupQ5.add(rdbtnQ5A1);
		btnGroupQ5.add(rdbtnQ5A2);
		btnGroupQ5.add(rdbtnQ5A3);
		btnGroupQ5.add(rdbtnQ5A4);

		/*
		 * Text fields with the questions
		 */
		txtQuestion1 = new JTextField();
		txtQuestion1.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion1.setFocusable(false);
		txtQuestion1.setEditable(false);
		txtQuestion1.setText("Question 1: Which of these describes the most basic form of recursion in java?");
		txtQuestion1.setBounds(48, 160, 500, 20);
		contentPanel.add(txtQuestion1);
		txtQuestion1.setColumns(10);

		txtQuestion2 = new JTextField();
		txtQuestion2.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion2.setFocusable(false);
		txtQuestion2.setEditable(false);
		txtQuestion2.setText("Question 2:  Which of these will happen if a recursive method does not have a base case?");
		txtQuestion2.setBounds(48, 340, 561, 20);
		contentPanel.add(txtQuestion2);
		txtQuestion2.setColumns(10);

		txtQuestion3 = new JTextField();
		txtQuestion3.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion3.setFocusable(false);
		txtQuestion3.setEditable(false);
		txtQuestion3.setText("Question 3: Which of these is not a correct statement?");
		txtQuestion3.setBounds(48, 520, 561, 20);
		contentPanel.add(txtQuestion3);
		txtQuestion3.setColumns(10);

		txtQuestion4 = new JTextArea();
		txtQuestion4.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion4.setWrapStyleWord(true);
		txtQuestion4.setLineWrap(true);
		txtQuestion4.setFocusable(false);
		txtQuestion4.setEditable(false);
		txtQuestion4.setText("Question 4: Suppose you are going to write a method which calculates the nth number in the fibonacci sequence. fib(n) returns fib(n-1) + fib(n-2), where the fib(0) and fib(1) are both defined to be 1. What is NOT a suitable base case for this method?");
		txtQuestion4.setBounds(48, 700, 800, 35);
		contentPanel.add(txtQuestion4);
		txtQuestion4.setColumns(10);

		txtQuestion5 = new JTextPane();
		txtQuestion5.setContentType("text/html");
		txtQuestion5.setFocusable(false);
		txtQuestion5.setEditable(false);
		txtQuestion5.setText("<html><font face=\"calibri\", size = 4>\r\nQuestion 5: What is the output of this program if input value of n is 4?\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</font>\r\n</html>");
		txtQuestion5.setBounds(48, 890, 420, 150);
		contentPanel.add(txtQuestion5);

		txtDescription = new JTextArea();
		txtDescription.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtDescription.setBackground(UIManager.getColor("Panel.background"));
		txtDescription.setFocusable(false);
		txtDescription.setWrapStyleWord(true);
		txtDescription.setLineWrap(true);
		txtDescription.setText("Congratulations on reaching the end of unit quiz!\r\n\r\n"
				+ "Now that you have completed the tutorials, it is time to test your new found knowledge.\r\n\r\n"
				+ "Please pick an answer for each of the questions and then click the submit button once you are ready to see your results.");
		txtDescription.setEditable(false);
		txtDescription.setBounds(48, 11, 783, 142);
		contentPanel.add(txtDescription);

		txtQuestion6 = new JTextField();
		txtQuestion6.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion6.setFocusable(false);
		txtQuestion6.setEditable(false);
		txtQuestion6.setText("Question 6: Which of these data types is used by the operating system to manage recursion in Java?");
		txtQuestion6.setBounds(48, 1190, 650, 20);
		contentPanel.add(txtQuestion6);
		txtQuestion6.setColumns(10);

		rdbtnQ6A1 = new JRadioButton("Array");
		rdbtnQ6A1.setBounds(48, 1230, 60, 23);
		contentPanel.add(rdbtnQ6A1);

		rdbtnQ6A2 = new JRadioButton("Stack");
		rdbtnQ6A2.setBounds(48, 1256, 60, 23);
		contentPanel.add(rdbtnQ6A2);

		rdbtnQ6A3 = new JRadioButton("Queue");
		rdbtnQ6A3.setBounds(48, 1282, 70, 23);
		contentPanel.add(rdbtnQ6A3);

		rdbtnQ6A4 = new JRadioButton("Tree");
		rdbtnQ6A4.setBounds(48, 1308, 60, 23);
		contentPanel.add(rdbtnQ6A4);

		/*
		 * Button Group for Question 6
		 */
		btnGroupQ6.add(rdbtnQ6A1);
		btnGroupQ6.add(rdbtnQ6A2);
		btnGroupQ6.add(rdbtnQ6A3);
		btnGroupQ6.add(rdbtnQ6A4);

		txtQuestion7 = new JTextPane();
		txtQuestion7.setEditable(false);
		txtQuestion7.setContentType("text/html");
		txtQuestion7.setText("<html><font face=\"calibri\", size = 4>\r\nQuestion 7: What is the output of this program if input value of n is 1?\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</font>\r\n</html>");
		txtQuestion7.setBounds(48, 1370, 500, 150);
		contentPanel.add(txtQuestion7);

		rdbtnQ7A1 = new JRadioButton("0");
		rdbtnQ7A1.setBounds(48, 1530, 40, 23);
		contentPanel.add(rdbtnQ7A1);

		rdbtnQ7A2 = new JRadioButton("1");
		rdbtnQ7A2.setFocusable(false);
		rdbtnQ7A2.setBounds(48, 1556, 40, 23);
		contentPanel.add(rdbtnQ7A2);

		rdbtnQ7A3 = new JRadioButton("Stack overflow error");
		rdbtnQ7A3.setBounds(48, 1582, 150, 23);
		contentPanel.add(rdbtnQ7A3);

		rdbtnQ7A4 = new JRadioButton("720");
		rdbtnQ7A4.setBounds(48, 1608, 50, 23);
		contentPanel.add(rdbtnQ7A4);

		/*
		 * Button Group for Question 7
		 */
		btnGroupQ7.add(rdbtnQ7A1);
		btnGroupQ7.add(rdbtnQ7A2);
		btnGroupQ7.add(rdbtnQ7A3);
		btnGroupQ7.add(rdbtnQ7A4);

		txtQuestion8 = new JTextField();
		txtQuestion8.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuestion8.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtQuestion8.setFocusable(false);
		txtQuestion8.setEditable(false);
		txtQuestion8.setText("Question 8: How many recursive calls are made when calculating the value of fact(3), excluding the initial call of fact(3).");
		txtQuestion8.setBounds(48, 1670, 750, 20);
		contentPanel.add(txtQuestion8);
		txtQuestion8.setColumns(10);

		rdbtnQ8A1 = new JRadioButton("1");
		rdbtnQ8A1.setBounds(48, 1710, 40, 23);
		contentPanel.add(rdbtnQ8A1);

		rdbtnQ8A2 = new JRadioButton("2");
		rdbtnQ8A2.setBounds(48, 1736, 40, 23);
		contentPanel.add(rdbtnQ8A2);

		rdbtnQ8A3 = new JRadioButton("3");
		rdbtnQ8A3.setBounds(48, 1762, 40, 23);
		contentPanel.add(rdbtnQ8A3);

		rdbtnQ8A4 = new JRadioButton("4");
		rdbtnQ8A4.setBounds(48, 1788, 40, 23);
		contentPanel.add(rdbtnQ8A4);

		/*
		 * Button Group for Question 8
		 */
		btnGroupQ8.add(rdbtnQ8A1);
		btnGroupQ8.add(rdbtnQ8A2);
		btnGroupQ8.add(rdbtnQ8A3);
		btnGroupQ8.add(rdbtnQ8A4);

		/*
		 * Submit button
		 * It calculates the users score if all questions have been answered and stores each questions answer
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(qController);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Automatically scrolls back up to the top
				if(!allQuestionsAnswered())
					JOptionPane.showMessageDialog(null, "Please choose an answer for all questions.");	

				if(allQuestionsAnswered()){
					calculateScore();

					question1Answer();
					question2Answer();
					question3Answer();
					question4Answer();
					question5Answer();
					question6Answer();
					question7Answer();
					question8Answer();

					//					results.setScore(getScore());
					scrollPane.getVerticalScrollBar().setValue(0);
					cardPanel.add(results);
					cardPanel.remove(contentPanel);
					cardPanel.add(results);
					btnSubmit.setVisible(false);
					btnMainMenu.setVisible(true);

				}

			}
		});
		btnSubmit.setBounds(420, 635, 127, 35);
		contentPane.add(btnSubmit);

		//Moves the caret to the top since text fields etc move it halfway down the screen to start
		txtQuestion1.setCaretPosition(0);
		txtQuestion2.setCaretPosition(0);
		txtQuestion3.setCaretPosition(0);
		txtQuestion4.setCaretPosition(0);
		txtQuestion5.setCaretPosition(0);
		txtQuestion6.setCaretPosition(0);
		txtQuestion7.setCaretPosition(0);
		txtQuestion8.setCaretPosition(0);
		txtDescription.setCaretPosition(0);
		
		/*
		 * Main menu button
		 */
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
				
			}
		});
		btnMainMenu.setVisible(false);
		btnMainMenu.setBounds(420, 635, 127, 35);
		contentPane.add(btnMainMenu);


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
	 * Increments the score by 1
	 */
	public void incrementScore(){
		score++;
	}
	
	/**
	 * Increments the score if the correct radio button was selected
	 * This is how the users total score is calculated
	 * One is added for each correct answer
	 */
	public void calculateScore(){
		if(rdbtnQ1A3.isSelected())
			score++;

		if(rdbtnQ2A1.isSelected())
			score++;

		if(rdbtnQ3A4.isSelected())
			score++;

		if(rdbtnQ4A1.isSelected())
			score++;

		if(rdbtnQ5A2.isSelected())
			score++;

		if(rdbtnQ6A2.isSelected())
			score++;

		if(rdbtnQ7A2.isSelected())
			score++;

		if(rdbtnQ8A2.isSelected())
			score++;
	}
	
	/*
	 * Boolean checks to see if questions are answered
	 * The allQuestionsAnswered combines each individual boolean to give one easy answer
	 * This is then used as a check to see if the user is allowed to progress to the results page
	 * if they entered an answer for all questions
	 */
	public boolean allQuestionsAnswered(){
		if(question1Answered()
				&& question2Answered()
				&& question3Answered()
				&& question4Answered()
				&& question5Answered()
				&& question6Answered()
				&& question7Answered()
				&& question8Answered())
			return true;
		else
			return false;
	}

	public boolean question1Answered(){
		if(rdbtnQ1A1.isSelected()
				|| rdbtnQ1A2.isSelected()
				|| rdbtnQ1A3.isSelected()
				|| rdbtnQ1A4.isSelected())
			return true;
		else
			return false;
	}

	public boolean question2Answered(){
		if(rdbtnQ2A1.isSelected()
				|| rdbtnQ2A2.isSelected()
				|| rdbtnQ2A3.isSelected()
				|| rdbtnQ2A4.isSelected())
			return true;
		else
			return false;
	}

	public boolean question3Answered(){
		if(rdbtnQ3A1.isSelected()
				|| rdbtnQ3A2.isSelected()
				|| rdbtnQ3A3.isSelected()
				|| rdbtnQ3A4.isSelected())
			return true;
		else
			return false;
	}

	public boolean question4Answered(){
		if(rdbtnQ4A1.isSelected()
				|| rdbtnQ4A2.isSelected()
				|| rdbtnQ4A3.isSelected()
				|| rdbtnQ4A4.isSelected())
			return true;
		else
			return false;
	}

	public boolean question5Answered(){
		if(rdbtnQ5A1.isSelected()
				|| rdbtnQ5A2.isSelected()
				|| rdbtnQ5A3.isSelected()
				|| rdbtnQ5A4.isSelected())
			return true;
		else
			return false;
	}

	public boolean question6Answered(){
		if(rdbtnQ6A1.isSelected()
				|| rdbtnQ6A2.isSelected()
				|| rdbtnQ6A3.isSelected()
				|| rdbtnQ6A4.isSelected())
			return true;
		else
			return false;
	}

	public boolean question7Answered(){
		if(rdbtnQ7A1.isSelected()
				|| rdbtnQ7A2.isSelected()
				|| rdbtnQ7A3.isSelected()
				|| rdbtnQ7A4.isSelected())
			return true;
		else
			return false;
	}

	public boolean question8Answered(){
		if(rdbtnQ8A1.isSelected()
				|| rdbtnQ8A2.isSelected()
				|| rdbtnQ8A3.isSelected()
				|| rdbtnQ8A4.isSelected())
			return true;
		else
			return false;
	}
	
	/*
	 * Each of these methods store the answer to their corresponding question
	 * Each radio button option is tied to an integer 1,2,3 or 4
	 * The integer variable is then set to that variable to the question it corresponds to
	 */
	public int question1Answer(){
		if(rdbtnQ1A1.isSelected())
			question1Answer = 1;
		else
			if(rdbtnQ1A2.isSelected())
				question1Answer = 2;
			else
				if(rdbtnQ1A3.isSelected())
					question1Answer = 3;
				else
					if(rdbtnQ1A4.isSelected())
						question1Answer = 4;

		return question1Answer;


	}

	public int question2Answer(){
		if(rdbtnQ2A1.isSelected())
			question2Answer = 1;

		if(rdbtnQ2A2.isSelected())
			question2Answer = 2;

		if(rdbtnQ2A3.isSelected())
			question1Answer = 3;

		if(rdbtnQ2A4.isSelected())
			question2Answer = 4;

		return question2Answer;


	}

	public int question3Answer(){
		if(rdbtnQ3A1.isSelected())
			question3Answer = 1;

		if(rdbtnQ3A2.isSelected())
			question3Answer = 2;

		if(rdbtnQ3A3.isSelected())
			question3Answer = 3;

		if(rdbtnQ3A4.isSelected())
			question3Answer = 4;

		return question3Answer;


	}

	public int question4Answer(){
		if(rdbtnQ4A1.isSelected())
			question4Answer = 1;

		if(rdbtnQ4A2.isSelected())
			question4Answer = 2;

		if(rdbtnQ4A3.isSelected())
			question4Answer = 3;

		if(rdbtnQ4A4.isSelected())
			question4Answer = 4;

		return question4Answer;


	}

	public int question5Answer(){
		if(rdbtnQ5A1.isSelected())
			question5Answer = 1;

		if(rdbtnQ5A2.isSelected())
			question5Answer = 2;

		if(rdbtnQ5A3.isSelected())
			question5Answer = 3;

		if(rdbtnQ5A4.isSelected())
			question5Answer = 4;

		return question5Answer;


	}

	public int question6Answer(){
		if(rdbtnQ6A1.isSelected())
			question6Answer = 1;

		if(rdbtnQ6A2.isSelected())
			question6Answer = 2;

		if(rdbtnQ6A3.isSelected())
			question6Answer = 3;

		if(rdbtnQ6A4.isSelected())
			question6Answer = 4;

		return question6Answer;


	}

	public int question7Answer(){
		if(rdbtnQ7A1.isSelected())
			question7Answer = 1;

		if(rdbtnQ7A2.isSelected())
			question7Answer = 2;

		if(rdbtnQ7A3.isSelected())
			question7Answer = 3;

		if(rdbtnQ7A4.isSelected())
			question7Answer = 4;

		return question7Answer;


	}

	public int question8Answer(){
		if(rdbtnQ8A1.isSelected())
			question8Answer = 1;

		if(rdbtnQ8A2.isSelected())
			question8Answer = 2;

		if(rdbtnQ8A3.isSelected())
			question8Answer = 3;

		if(rdbtnQ8A4.isSelected())
			question8Answer = 4;

		return question8Answer;


	}




}
