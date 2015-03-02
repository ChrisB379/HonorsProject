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

public class QuizView extends JFrame {

	private static final long serialVersionUID = 5172182919142981596L;
	private JPanel contentPane;
	private JTextArea txtDescription;
	private JTextField txtQuestion1;
	private JTextField txtQuestion2;
	private JTextField txtQuestion3;
	private JTextArea txtQuestion4;
	private JTextPane txtQuestion5;

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
	
	private JLabel lblCross;
	private JLabel lblTick;
	
	private int score;

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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 11, 886, 613);
		//Setting the scroll speed as the default is rather slow
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		contentPane.add(scrollPane);

		JPanel panel = new JPanel();
		panel.setFocusable(false);
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(600, 1150));

		ButtonGroup btnGroupQ1 = new ButtonGroup();
		ButtonGroup btnGroupQ2 = new ButtonGroup();
		ButtonGroup btnGroupQ3 = new ButtonGroup();
		ButtonGroup btnGroupQ4 = new ButtonGroup();
		ButtonGroup btnGroupQ5 = new ButtonGroup();

		rdbtnQ1A1 = new JRadioButton("Recursion is a class.");
		rdbtnQ1A1.setBounds(48, 200, 209, 23);
		panel.add(rdbtnQ1A1);

		rdbtnQ1A2 = new JRadioButton("Recursion is the process of defining a method that calls other methods repeatedly.");
		rdbtnQ1A2.setBounds(48, 226, 617, 23);
		panel.add(rdbtnQ1A2);

		rdbtnQ1A3 = new JRadioButton("Recursion is the process of defining a method that calls itself repeatedly.");
		rdbtnQ1A3.setBounds(48, 252, 665, 23);
		panel.add(rdbtnQ1A3);

		rdbtnQ1A4 = new JRadioButton("Recursion is the process of defining a method that calls other methods which in turn call again this method.");
		rdbtnQ1A4.setBounds(48, 278, 676, 23);
		panel.add(rdbtnQ1A4);

		/*
		 * Button Group for Question 1
		 */

		btnGroupQ1.add(rdbtnQ1A1);
		btnGroupQ1.add(rdbtnQ1A2);
		btnGroupQ1.add(rdbtnQ1A3);
		btnGroupQ1.add(rdbtnQ1A4);

		rdbtnQ2A1 = new JRadioButton("An infinite loop occurs");
		rdbtnQ2A1.setBounds(48, 380, 209, 23);
		panel.add(rdbtnQ2A1);

		rdbtnQ2A2 = new JRadioButton("The system stops the program after some time");
		rdbtnQ2A2.setBounds(48, 406, 300, 23);
		panel.add(rdbtnQ2A2);

		rdbtnQ2A3 = new JRadioButton("After 1000000 calls it will be automatically stopped.");
		rdbtnQ2A3.setBounds(48, 432, 350, 23);
		panel.add(rdbtnQ2A3);

		rdbtnQ2A4 = new JRadioButton("None of the above");
		rdbtnQ2A4.setBounds(48, 458, 285, 23);
		panel.add(rdbtnQ2A4);

		/*
		 * Button Group for Question 2
		 */
		btnGroupQ2.add(rdbtnQ2A1);
		btnGroupQ2.add(rdbtnQ2A2);
		btnGroupQ2.add(rdbtnQ2A3);
		btnGroupQ2.add(rdbtnQ2A4);


		rdbtnQ3A1 = new JRadioButton("A recursive method must have a base case.");
		rdbtnQ3A1.setBounds(48, 560, 300, 23);
		panel.add(rdbtnQ3A1);

		rdbtnQ3A2 = new JRadioButton("Recursion always uses a stack.");
		rdbtnQ3A2.setBounds(48, 586, 248, 23);
		panel.add(rdbtnQ3A2);

		rdbtnQ3A3 = new JRadioButton("Recursive methods are faster than a programmers written loop to call the function repeatedly using a stack.");
		rdbtnQ3A3.setBounds(48, 612, 700, 23);
		panel.add(rdbtnQ3A3);

		rdbtnQ3A4 = new JRadioButton("Memoization is a technique which makes recursion slower and less efficient.");
		rdbtnQ3A4.setBounds(48, 638, 500, 23);
		panel.add(rdbtnQ3A4);

		/*
		 * Button Group for Question 3
		 */
		btnGroupQ3.add(rdbtnQ3A1);
		btnGroupQ3.add(rdbtnQ3A2);
		btnGroupQ3.add(rdbtnQ3A3);
		btnGroupQ3.add(rdbtnQ3A4);


		rdbtnQ4A1 = new JRadioButton("n == 0 && n == 1");
		rdbtnQ4A1.setBounds(48, 750, 150, 23);
		panel.add(rdbtnQ4A1);

		rdbtnQ4A2 = new JRadioButton("n == 0 || n == 1");
		rdbtnQ4A2.setBounds(48, 776, 109, 23);
		panel.add(rdbtnQ4A2);

		rdbtnQ4A3 = new JRadioButton("n <= 1");
		rdbtnQ4A3.setBounds(48, 802, 109, 23);
		panel.add(rdbtnQ4A3);

		rdbtnQ4A4 = new JRadioButton("None of the above");
		rdbtnQ4A4.setBounds(48, 826, 150, 23);
		panel.add(rdbtnQ4A4);

		/*
		 * Button Group for Question 4
		 */
		btnGroupQ4.add(rdbtnQ4A1);
		btnGroupQ4.add(rdbtnQ4A2);
		btnGroupQ4.add(rdbtnQ4A3);
		btnGroupQ4.add(rdbtnQ4A4);

		rdbtnQ5A1 = new JRadioButton("1");
		rdbtnQ5A1.setBounds(48, 1050, 109, 23);
		panel.add(rdbtnQ5A1);

		rdbtnQ5A2 = new JRadioButton("24");
		rdbtnQ5A2.setBounds(48, 1076, 109, 23);
		panel.add(rdbtnQ5A2);

		rdbtnQ5A3 = new JRadioButton("120");
		rdbtnQ5A3.setBounds(48, 1102, 109, 23);
		panel.add(rdbtnQ5A3);

		rdbtnQ5A4 = new JRadioButton("720");
		rdbtnQ5A4.setBounds(48, 1128, 109, 23);
		panel.add(rdbtnQ5A4);

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
		txtQuestion1.setText("Question 1: What is recursion in java?");
		txtQuestion1.setBounds(48, 160, 248, 20);
		panel.add(txtQuestion1);
		txtQuestion1.setColumns(10);

		txtQuestion2 = new JTextField();
		txtQuestion2.setFocusable(false);
		txtQuestion2.setEditable(false);
		txtQuestion2.setText("Question 2:  Which of these will happen if a recursive method does not have a base case?");
		txtQuestion2.setBounds(48, 340, 561, 20);
		panel.add(txtQuestion2);
		txtQuestion2.setColumns(10);

		txtQuestion3 = new JTextField();
		txtQuestion3.setFocusable(false);
		txtQuestion3.setEditable(false);
		txtQuestion3.setText("Question 3: Which of these is not a correct statement?");
		txtQuestion3.setBounds(48, 520, 561, 20);
		panel.add(txtQuestion3);
		txtQuestion3.setColumns(10);

		txtQuestion4 = new JTextArea();
		txtQuestion4.setWrapStyleWord(true);
		txtQuestion4.setLineWrap(true);
		txtQuestion4.setFocusable(false);
		txtQuestion4.setEditable(false);
		txtQuestion4.setText("Question 4: Suppose you are going to write a method which calculates the nth number in the fibonacci sequence. fib(n) returns fib(n-1) + fib(n-2), where the fib(0) and fib(1) are both defined to be 1. What is NOT a suitable base case for this method?");
		txtQuestion4.setBounds(48, 700, 700, 35);
		panel.add(txtQuestion4);
		txtQuestion4.setColumns(10);

		txtQuestion5 = new JTextPane();
		txtQuestion5.setContentType("text/html");
		txtQuestion5.setFocusable(false);
		txtQuestion5.setEditable(false);
		txtQuestion5.setText("<html>Question 5: What is the output of this program if input value of n is 4?\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</html>");
		txtQuestion5.setBounds(48, 890, 420, 150);
		panel.add(txtQuestion5);
		
		txtDescription = new JTextArea();
		txtDescription.setWrapStyleWord(true);
		txtDescription.setLineWrap(true);
		txtDescription.setText("Congratulations on reaching the end of unit quiz!\r\n\r\n"
				+ "Now that you have completed the tutorials, it is time to test your new found knowledge.\r\n\r\n"
				+ "Please pick an answer for each of the questions and then click the submit button once you are ready to see your results.");
		txtDescription.setFocusable(false);
		txtDescription.setEditable(false);
		txtDescription.setBounds(48, 11, 783, 142);
		panel.add(txtDescription);
		
		lblCross = new JLabel("");
		lblCross.setFocusable(false);
		lblCross.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCross.setBounds(475, 380, 27, 23);
		panel.add(lblCross);
		
		lblTick = new JLabel("");
		lblTick.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTick.setBounds(593, 380, 27, 23);
		panel.add(lblTick);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Automatically scrolls back up to the top
				scrollPane.getVerticalScrollBar().setValue(1);
				results();
			}
		});
		btnSubmit.setBounds(420, 635, 127, 35);
		contentPane.add(btnSubmit);
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
