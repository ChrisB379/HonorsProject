package view.Quiz;

/**
 * This will be the screen that has the multiple choice quiz.
 * It has multiple questions that the user can answer by click the answer they think is correct.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.awt.EventQueue;

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

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import java.awt.CardLayout;

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

	private JScrollPane scrollPane;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizView frame = new QuizView();
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
	public QuizView() {
		setTitle("End of Unit Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 757);

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
			}
		});
		mnAbout.add(mntmAbout);

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

		txtQuestion1 = new JTextField();
		txtQuestion1.setFocusable(false);
		txtQuestion1.setEditable(false);
		txtQuestion1.setText("Question 1: Which of these describes the most basic form of recursion in java?");
		txtQuestion1.setBounds(48, 160, 450, 20);
		contentPanel.add(txtQuestion1);
		txtQuestion1.setColumns(10);

		txtQuestion2 = new JTextField();
		txtQuestion2.setFocusable(false);
		txtQuestion2.setEditable(false);
		txtQuestion2.setText("Question 2:  Which of these will happen if a recursive method does not have a base case?");
		txtQuestion2.setBounds(48, 340, 561, 20);
		contentPanel.add(txtQuestion2);
		txtQuestion2.setColumns(10);

		txtQuestion3 = new JTextField();
		txtQuestion3.setFocusable(false);
		txtQuestion3.setEditable(false);
		txtQuestion3.setText("Question 3: Which of these is not a correct statement?");
		txtQuestion3.setBounds(48, 520, 561, 20);
		contentPanel.add(txtQuestion3);
		txtQuestion3.setColumns(10);

		txtQuestion4 = new JTextArea();
		txtQuestion4.setWrapStyleWord(true);
		txtQuestion4.setLineWrap(true);
		txtQuestion4.setFocusable(false);
		txtQuestion4.setEditable(false);
		txtQuestion4.setText("Question 4: Suppose you are going to write a method which calculates the nth number in the fibonacci sequence. fib(n) returns fib(n-1) + fib(n-2), where the fib(0) and fib(1) are both defined to be 1. What is NOT a suitable base case for this method?");
		txtQuestion4.setBounds(48, 700, 700, 35);
		contentPanel.add(txtQuestion4);
		txtQuestion4.setColumns(10);

		txtQuestion5 = new JTextPane();
		txtQuestion5.setContentType("text/html");
		txtQuestion5.setFocusable(false);
		txtQuestion5.setEditable(false);
		txtQuestion5.setText("<html>Question 5: What is the output of this program if input value of n is 4?\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</html>");
		txtQuestion5.setBounds(48, 890, 420, 150);
		contentPanel.add(txtQuestion5);

		txtDescription = new JTextArea();
		txtDescription.setFocusable(false);
		txtDescription.setWrapStyleWord(true);
		txtDescription.setLineWrap(true);
		txtDescription.setText("Congratulations on reaching the end of unit quiz!\r\n\r\n"
				+ "Now that you have completed the tutorials, it is time to test your new found knowledge.\r\n\r\n"
				+ "Please pick an answer for each of the questions and then click the submit button once you are ready to see your results.");
		txtDescription.setEditable(false);
		txtDescription.setBounds(48, 11, 783, 142);
		contentPanel.add(txtDescription);

		lblCrossQ1A1 = new JLabel("");
		lblCrossQ1A1.setFocusable(false);
		lblCrossQ1A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ1A1.setBounds(204, 200, 27, 23);
		contentPanel.add(lblCrossQ1A1);

		lblTickQ1 = new JLabel("");
		lblTickQ1.setFocusable(false);
		lblTickQ1.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ1.setBounds(521, 252, 27, 23);
		contentPanel.add(lblTickQ1);

		lblCrossQ1A4 = new JLabel("");
		lblCrossQ1A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ1A4.setFocusable(false);
		lblCrossQ1A4.setBounds(706, 278, 27, 23);
		contentPanel.add(lblCrossQ1A4);

		lblCrossQ1A2 = new JLabel("");
		lblCrossQ1A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ1A2.setFocusable(false);
		lblCrossQ1A2.setBounds(562, 226, 27, 23);
		contentPanel.add(lblCrossQ1A2);

		lblTickQ2 = new JLabel("");
		lblTickQ2.setFocusable(false);
		lblTickQ2.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ2.setBounds(225, 380, 27, 23);
		contentPanel.add(lblTickQ2);

		lblCrossQ2A2 = new JLabel("");
		lblCrossQ2A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ2A2.setFocusable(false);
		lblCrossQ2A2.setBounds(354, 406, 27, 23);
		contentPanel.add(lblCrossQ2A2);

		lblCrossQ2A3 = new JLabel("");
		lblCrossQ2A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ2A3.setFocusable(false);
		lblCrossQ2A3.setBounds(376, 432, 27, 23);
		contentPanel.add(lblCrossQ2A3);

		lblCrossQ2A4 = new JLabel("");
		lblCrossQ2A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ2A4.setFocusable(false);
		lblCrossQ2A4.setBounds(192, 458, 27, 23);
		contentPanel.add(lblCrossQ2A4);

		lblTickQ3 = new JLabel("");
		lblTickQ3.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ3.setFocusable(false);
		lblTickQ3.setBounds(524, 638, 27, 23);
		contentPanel.add(lblTickQ3);

		lblCrossQ3A2 = new JLabel("");
		lblCrossQ3A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ3A2.setFocusable(false);
		lblCrossQ3A2.setBounds(375, 586, 27, 23);
		contentPanel.add(lblCrossQ3A2);

		lblCrossQ3A3 = new JLabel("");
		lblCrossQ3A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ3A3.setFocusable(false);
		lblCrossQ3A3.setBounds(690, 612, 27, 23);
		contentPanel.add(lblCrossQ3A3);

		lblCrossQ3A1 = new JLabel("");
		lblCrossQ3A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ3A1.setFocusable(false);
		lblCrossQ3A1.setBounds(333, 560, 27, 23);
		contentPanel.add(lblCrossQ3A1);

		lblTickQ4 = new JLabel("");
		lblTickQ4.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ4.setFocusable(false);
		lblTickQ4.setBounds(170, 750, 27, 23);
		contentPanel.add(lblTickQ4);

		lblCrossQ4A2 = new JLabel("");
		lblCrossQ4A2.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ4A2.setFocusable(false);
		lblCrossQ4A2.setBounds(160, 776, 27, 23);
		contentPanel.add(lblCrossQ4A2);

		lblCrossQ4A3 = new JLabel("");
		lblCrossQ4A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ4A3.setFocusable(false);
		lblCrossQ4A3.setBounds(110, 802, 27, 23);
		contentPanel.add(lblCrossQ4A3);

		lblCrossQ4A4 = new JLabel("");
		lblCrossQ4A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ4A4.setFocusable(false);
		lblCrossQ4A4.setBounds(180, 826, 27, 23);
		contentPanel.add(lblCrossQ4A4);

		lblTickQ5 = new JLabel("");
		lblTickQ5.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTickQ5.setFocusable(false);
		lblTickQ5.setBounds(100, 1076, 27, 23);
		contentPanel.add(lblTickQ5);

		lblCrossQ5A1 = new JLabel("");
		lblCrossQ5A1.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ5A1.setFocusable(false);
		lblCrossQ5A1.setBounds(90, 1050, 27, 23);
		contentPanel.add(lblCrossQ5A1);

		lblCrossQ5A3 = new JLabel("");
		lblCrossQ5A3.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ5A3.setFocusable(false);
		lblCrossQ5A3.setBounds(100, 1102, 27, 23);
		contentPanel.add(lblCrossQ5A3);

		lblCrossQ5A4 = new JLabel("");
		lblCrossQ5A4.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCrossQ5A4.setFocusable(false);
		lblCrossQ5A4.setBounds(100, 1128, 27, 23);
		contentPanel.add(lblCrossQ5A4);

		txtQuestion6 = new JTextField();
		txtQuestion6.setFocusable(false);
		txtQuestion6.setEditable(false);
		txtQuestion6.setText("Question 6: Which of these data types is used by the operating system to manage recursion in Java?");
		txtQuestion6.setBounds(48, 1190, 575, 20);
		contentPanel.add(txtQuestion6);
		txtQuestion6.setColumns(10);

		rdbtnQ6A1 = new JRadioButton("Array");
		rdbtnQ6A1.setBounds(48, 1230, 109, 23);
		contentPanel.add(rdbtnQ6A1);

		rdbtnQ6A2 = new JRadioButton("Stack");
		rdbtnQ6A2.setBounds(48, 1256, 109, 23);
		contentPanel.add(rdbtnQ6A2);

		rdbtnQ6A3 = new JRadioButton("Queue");
		rdbtnQ6A3.setBounds(48, 1282, 109, 23);
		contentPanel.add(rdbtnQ6A3);

		rdbtnQ6A4 = new JRadioButton("Tree");
		rdbtnQ6A4.setBounds(48, 1308, 109, 23);
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
		txtQuestion7.setText("<html>Question 7: What is the output of this program if input value of n is 1?\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</html>");
		txtQuestion7.setBounds(48, 1370, 500, 150);
		contentPanel.add(txtQuestion7);

		rdbtnQ7A1 = new JRadioButton("0");
		rdbtnQ7A1.setBounds(48, 1530, 109, 23);
		contentPanel.add(rdbtnQ7A1);

		rdbtnQ7A2 = new JRadioButton("1");
		rdbtnQ7A2.setFocusable(false);
		rdbtnQ7A2.setBounds(48, 1556, 109, 23);
		contentPanel.add(rdbtnQ7A2);

		rdbtnQ7A3 = new JRadioButton("Stack overflow error");
		rdbtnQ7A3.setBounds(48, 1582, 109, 23);
		contentPanel.add(rdbtnQ7A3);

		rdbtnQ7A4 = new JRadioButton("720");
		rdbtnQ7A4.setBounds(48, 1608, 109, 23);
		contentPanel.add(rdbtnQ7A4);

		/*
		 * Button Group for Question 7
		 */
		btnGroupQ7.add(rdbtnQ7A1);
		btnGroupQ7.add(rdbtnQ7A2);
		btnGroupQ7.add(rdbtnQ7A3);
		btnGroupQ7.add(rdbtnQ7A4);

		txtQuestion8 = new JTextField();
		txtQuestion8.setFocusable(false);
		txtQuestion8.setEditable(false);
		txtQuestion8.setText("Question 8: How many recursive calls are made when calculating the value of fact(3), excluding the initial call of fact(3).");
		txtQuestion8.setBounds(48, 1670, 650, 20);
		contentPanel.add(txtQuestion8);
		txtQuestion8.setColumns(10);

		rdbtnQ8A1 = new JRadioButton("1");
		rdbtnQ8A1.setBounds(48, 1710, 109, 23);
		contentPanel.add(rdbtnQ8A1);

		rdbtnQ8A2 = new JRadioButton("2");
		rdbtnQ8A2.setBounds(48, 1736, 109, 23);
		contentPanel.add(rdbtnQ8A2);

		rdbtnQ8A3 = new JRadioButton("3");
		rdbtnQ8A3.setBounds(48, 1762, 109, 23);
		contentPanel.add(rdbtnQ8A3);

		rdbtnQ8A4 = new JRadioButton("4");
		rdbtnQ8A4.setBounds(48, 1788, 109, 23);
		contentPanel.add(rdbtnQ8A4);

		/*
		 * Button Group for Question 8
		 */
		btnGroupQ8.add(rdbtnQ8A1);
		btnGroupQ8.add(rdbtnQ8A2);
		btnGroupQ8.add(rdbtnQ8A3);
		btnGroupQ8.add(rdbtnQ8A4);


		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Automatically scrolls back up to the top
				scrollPane.getVerticalScrollBar().setValue(0);
				results();
			}
		});
		btnSubmit.setBounds(420, 635, 127, 35);
		contentPane.add(btnSubmit);

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


	}

	public int getScore(){
		return score;
	}

	public void incrementScore(){
		score++;
	}

	public void results(){
		txtDescription.setText("Congratulations, you scored "+ getScore() + " out of 5!\r\n\r\n");

	}

}
