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
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(214, 151, 80, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tutorialMenu();
			}
		});
		btnNewButton.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(btnNewButton.isFocusOwner()){
				    if (e.getKeyCode()==KeyEvent.VK_ENTER){
						tutorialMenu();
				    }
				
			}
			}
		});


		JButton btnAbout = new JButton("About");
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

		JButton btnQuit = new JButton("Quit");
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

		JLabel lblUnderstandingRecursion = new JLabel("Understanding Recursion");
		lblUnderstandingRecursion.setBounds(91, 42, 357, 38);
		lblUnderstandingRecursion.setFont(new Font("Arial", Font.PLAIN, 32));
		contentPane.add(lblUnderstandingRecursion);
		contentPane.add(btnQuit);
		contentPane.add(btnAbout);
		contentPane.add(btnNewButton);
	}
	
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
