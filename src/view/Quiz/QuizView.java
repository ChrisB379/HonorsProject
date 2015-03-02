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

public class QuizView extends JFrame {


	private static final long serialVersionUID = 5172182919142981596L;
	private JPanel contentPane;
	private JTextField txtQuestion1;
	private JTextField txtQuestion2;
	private JTextField txtQuestion3;
	private JTextField txtQuestion4;
	private JTextField txtQuestion5;

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
		panel.setPreferredSize(new Dimension(600, 1050));

		ButtonGroup btnGroupQ1 = new ButtonGroup();
		ButtonGroup btnGroupQ2 = new ButtonGroup();
		ButtonGroup btnGroupQ3 = new ButtonGroup();
		ButtonGroup btnGroupQ4 = new ButtonGroup();
		ButtonGroup btnGroupQ5 = new ButtonGroup();

		rdbtnQ1A1 = new JRadioButton("New radio button");
		rdbtnQ1A1.setBounds(48, 200, 109, 23);
		panel.add(rdbtnQ1A1);

		rdbtnQ1A2 = new JRadioButton("New radio button");
		rdbtnQ1A2.setBounds(48, 226, 109, 23);
		panel.add(rdbtnQ1A2);

		rdbtnQ1A3 = new JRadioButton("New radio button");
		rdbtnQ1A3.setBounds(48, 252, 109, 23);
		panel.add(rdbtnQ1A3);

		rdbtnQ1A4 = new JRadioButton("New radio button");
		rdbtnQ1A4.setBounds(48, 278, 109, 23);
		panel.add(rdbtnQ1A4);

		/*
		 * Button Group for Question 1
		 */

		btnGroupQ1.add(rdbtnQ1A1);
		btnGroupQ1.add(rdbtnQ1A2);
		btnGroupQ1.add(rdbtnQ1A3);
		btnGroupQ1.add(rdbtnQ1A4);

		rdbtnQ2A1 = new JRadioButton("New radio button");
		rdbtnQ2A1.setBounds(48, 380, 109, 23);
		panel.add(rdbtnQ2A1);

		rdbtnQ2A2 = new JRadioButton("New radio button");
		rdbtnQ2A2.setBounds(48, 406, 109, 23);
		panel.add(rdbtnQ2A2);

		rdbtnQ2A3 = new JRadioButton("New radio button");
		rdbtnQ2A3.setBounds(48, 432, 109, 23);
		panel.add(rdbtnQ2A3);

		rdbtnQ2A4 = new JRadioButton("New radio button");
		rdbtnQ2A4.setBounds(48, 458, 109, 23);
		panel.add(rdbtnQ2A4);

		/*
		 * Button Group for Question 2
		 */
		btnGroupQ2.add(rdbtnQ2A1);
		btnGroupQ2.add(rdbtnQ2A2);
		btnGroupQ2.add(rdbtnQ2A3);
		btnGroupQ2.add(rdbtnQ2A4);


		rdbtnQ3A1 = new JRadioButton("New radio button");
		rdbtnQ3A1.setBounds(48, 560, 109, 23);
		panel.add(rdbtnQ3A1);

		rdbtnQ3A2 = new JRadioButton("New radio button");
		rdbtnQ3A2.setBounds(48, 586, 109, 23);
		panel.add(rdbtnQ3A2);

		rdbtnQ3A3 = new JRadioButton("New radio button");
		rdbtnQ3A3.setBounds(48, 612, 109, 23);
		panel.add(rdbtnQ3A3);

		rdbtnQ3A4 = new JRadioButton("New radio button");
		rdbtnQ3A4.setBounds(48, 638, 109, 23);
		panel.add(rdbtnQ3A4);

		/*
		 * Button Group for Question 3
		 */
		btnGroupQ3.add(rdbtnQ3A1);
		btnGroupQ3.add(rdbtnQ3A2);
		btnGroupQ3.add(rdbtnQ3A3);
		btnGroupQ3.add(rdbtnQ3A4);


		rdbtnQ4A1 = new JRadioButton("New radio button");
		rdbtnQ4A1.setBounds(48, 740, 109, 23);
		panel.add(rdbtnQ4A1);

		rdbtnQ4A2 = new JRadioButton("New radio button");
		rdbtnQ4A2.setBounds(48, 766, 109, 23);
		panel.add(rdbtnQ4A2);

		rdbtnQ4A3 = new JRadioButton("New radio button");
		rdbtnQ4A3.setBounds(48, 792, 109, 23);
		panel.add(rdbtnQ4A3);

		rdbtnQ4A4 = new JRadioButton("New radio button");
		rdbtnQ4A4.setBounds(48, 816, 109, 23);
		panel.add(rdbtnQ4A4);

		/*
		 * Button Group for Question 4
		 */
		btnGroupQ4.add(rdbtnQ4A1);
		btnGroupQ4.add(rdbtnQ4A2);
		btnGroupQ4.add(rdbtnQ4A3);
		btnGroupQ4.add(rdbtnQ4A4);

		rdbtnQ5A1 = new JRadioButton("New radio button");
		rdbtnQ5A1.setBounds(48, 920, 109, 23);
		panel.add(rdbtnQ5A1);

		rdbtnQ5A2 = new JRadioButton("New radio button");
		rdbtnQ5A2.setBounds(48, 946, 109, 23);
		panel.add(rdbtnQ5A2);

		rdbtnQ5A3 = new JRadioButton("New radio button");
		rdbtnQ5A3.setBounds(48, 972, 109, 23);
		panel.add(rdbtnQ5A3);

		rdbtnQ5A4 = new JRadioButton("New radio button");
		rdbtnQ5A4.setBounds(48, 998, 109, 23);
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
		txtQuestion1.setText("Question 1: ");
		txtQuestion1.setBounds(48, 160, 86, 20);
		panel.add(txtQuestion1);
		txtQuestion1.setColumns(10);

		txtQuestion2 = new JTextField();
		txtQuestion2.setFocusable(false);
		txtQuestion2.setEditable(false);
		txtQuestion2.setText("Question 2: ");
		txtQuestion2.setBounds(48, 340, 86, 20);
		panel.add(txtQuestion2);
		txtQuestion2.setColumns(10);

		txtQuestion3 = new JTextField();
		txtQuestion3.setFocusable(false);
		txtQuestion3.setEditable(false);
		txtQuestion3.setText("Question 3:");
		txtQuestion3.setBounds(48, 520, 86, 20);
		panel.add(txtQuestion3);
		txtQuestion3.setColumns(10);

		txtQuestion4 = new JTextField();
		txtQuestion4.setFocusable(false);
		txtQuestion4.setEditable(false);
		txtQuestion4.setText("Question 4:");
		txtQuestion4.setBounds(48, 700, 86, 20);
		panel.add(txtQuestion4);
		txtQuestion4.setColumns(10);

		txtQuestion5 = new JTextField();
		txtQuestion5.setFocusable(false);
		txtQuestion5.setEditable(false);
		txtQuestion5.setText("Question 5:");
		txtQuestion5.setBounds(48, 880, 86, 20);
		panel.add(txtQuestion5);
		txtQuestion5.setColumns(10);
		
		JTextArea txtrCongratulationsOnReaching = new JTextArea();
		txtrCongratulationsOnReaching.setWrapStyleWord(true);
		txtrCongratulationsOnReaching.setLineWrap(true);
		txtrCongratulationsOnReaching.setText("Congratulations on reaching the end of unit quiz!\r\n\r\nNow that you have completed the tutorials, it is time to test your new found knowledge.\r\n\r\nPlease pick an answer for each of the questions and then click the submit button once you are ready to see your results.");
		txtrCongratulationsOnReaching.setFocusable(false);
		txtrCongratulationsOnReaching.setEditable(false);
		txtrCongratulationsOnReaching.setBounds(48, 11, 783, 142);
		panel.add(txtrCongratulationsOnReaching);
		
		lblCross = new JLabel("");
		lblCross.setFocusable(false);
		lblCross.setIcon(new ImageIcon(QuizView.class.getResource("/images/raemi-cross-out.png")));
		lblCross.setBounds(163, 252, 27, 23);
		panel.add(lblCross);
		
		lblTick = new JLabel("");
		lblTick.setIcon(new ImageIcon(QuizView.class.getResource("/images/smallTick.png")));
		lblTick.setBounds(241, 252, 27, 23);
		panel.add(lblTick);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(420, 635, 127, 35);
		contentPane.add(btnSubmit);
	}
}
