package view;

/**
 *  This is GUI for the main menu which navigates the examples and quiz in the program.
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

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8282570358801343346L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		/*
		 * Sourced picture from 
		 * http://www.clker.com/clipart-green-flame-1.html#
		 * http://www.clker.com/cliparts/K/h/G/A/p/G/green-flame-th.png
		 * 
		 * SHARED BY: VLADIMIR 04-08-2011
		 * 
		 * Resized to 16x16 using www.picresize.com/
		 */
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-frameIcon.png")));
		
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		/*
		 * The buttons used in the JFrame
		 * Each has an action listener for if it is clicked
		 * Each also have KeyListeners to be activated by the Enter button if it is focused(tabbed over)
		 * 
		 */

		/*
		 * Start button to begin the program
		 */
		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnStart.setBounds(214, 151, 80, 23);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tutorialMenu();
			}
		});
		btnStart.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnStart.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						tutorialMenu();
					}

				}
			}
		});

		/*
		 * About button to open the About JFrame
		 */
		JButton btnAbout = new JButton("About");
		btnAbout.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAbout.setBounds(214, 211, 80, 23);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about();

			}
		});
		btnAbout.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(btnAbout.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						about();
					}


				}

			}
		});
		
		/*
		 * Quit Button
		 */
		JButton btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnQuit.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(btnQuit.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						System.exit(0);
					}


				}

			}
		});
		btnQuit.setBounds(214, 267, 80, 23);

		//Used to close the application if the quit button is pressed
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		contentPane.setLayout(null);
		
		/*
		 * The Title
		 */
		JLabel lblUnderstandingRecursion = new JLabel("Understanding Recursion");
		lblUnderstandingRecursion.setBounds(78, 42, 370, 48);
		lblUnderstandingRecursion.setFont(new Font("Segoe UI", Font.PLAIN, 32));
		
		/*
		 * Adding components to the content pane
		 */
		contentPane.add(lblUnderstandingRecursion);
		contentPane.add(btnQuit);
		contentPane.add(btnAbout);
		contentPane.add(btnStart);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainMenu.class.getResource("/images/MainMenuBackground.jpg")));
		lblNewLabel.setBounds(0, 0, 522, 375);
		contentPane.add(lblNewLabel);
	}
	
	/*
	 * Methods for opening the About/Tutorial Menu JFrames
	 * 
	 * Due to this code being needed twice, once for action and one for key listener, it was
	 * decided it best to make a method for each so that only one method must be called per listener
	 * thus reducing code
	 */
	public void about(){
		About a = new About();
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		a.setResizable(false);
		a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void tutorialMenu(){
		dispose();
		TutorialMenu tm = new TutorialMenu();
		tm.setVisible(true);
		tm.setLocationRelativeTo(null);
		tm.setResizable(false);

	}
}
