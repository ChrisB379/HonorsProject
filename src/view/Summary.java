package view;

/**
 * This will be shown after tutorial 4 if the user so chooses.
 * It will just be a brief summary of what they have learnt and a
 * recommendation to move onto the quiz section.
 * 
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
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JButton;

import model.IQuiz;
import model.Quiz;
import view.Quiz.QuizView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Summary extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private JButton btnMenu;
	private JButton btnQuiz;
	private JButton btnQuit;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Summary frame = new Summary();
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
	public Summary() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-frameIcon.png")));
		setTitle("End of Series Summary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		/*
		 * Text pane with the text summary
		 */
		JTextPane txtrCongratulationsYouHave = new JTextPane();
		txtrCongratulationsYouHave.setOpaque(false);
		txtrCongratulationsYouHave.setBounds(24, 16, 794, 622);
		txtrCongratulationsYouHave.setContentType("text/html");
		txtrCongratulationsYouHave.setBackground(UIManager.getColor("Panel.background"));
		txtrCongratulationsYouHave.setText("<b>Congratulations!</b> You have reached the end of this tutorial series on recursion.\r\n<br>\r\n<br>"
				+ "Throughout this series you should have learnt the basics of recursion, with each tutorial building on the previous one.\r\n<br>\r\n<br>"
				+ "Here is a brief summary of what you should have learnt from this series:\r\n<br>\r\n<br>"
				+ "<b>Tutorial 1: Base Case</b>\r\n<br>\t"
				+ "A base case in a recursive call is a way to break out of a recursive call. It prevents infinite loops and crashes due to stack overflow errors. \r\n<br>\r\n<br>\t"
				+ "Convergence is an important term relating to the base case. Each recursive call must converge towards the base case to ensure it is eventually met or the same errors mentioned above can occur.\r\n<br>\r\n<br>"
				+ "<b>Tutorial 2: Return Values</b>\r\n<br>\t"
				+ "Return values for a recursive method is calculated after the base case has been met. Until that point, each value is remembered from each recursive call before a final calculation "
				+ "or algorithm is done once the base case has been met.\r\n<br>\r\n<br>"
				+ "<b>Tutorial 3: Excessive Recomputation</b>\r\n<br>\t"
				+ "Excessive recomputation is when a recursive call recalculates a sum or algorithm which has already been calculated previously. By not saving results of recursive calls, CPU time and resources are wasted"
				+ " by recalculating sums/algorithms.\r\n<br>\r\n<br>\t"
				+ "Memoization is a method to solve this, by storing results and calculations of recursive calls which can then be checked on each call to ensure it has not already been calculated before. "
				+ "If it has then it is just a matter of fetching the answer from whatever data structure it was stored in.\r\n<br>\r\n<br>"
				+ "<b>Tutorial 4: Work after</b>\r\n<br>\t"
				+ "Work after the recursive call shows that a method does not have to return and end once the base case of a recursive call has been met. More work can be done after the recursive call has been compelted.\r\n<br>\r\n<br>\t"
				+ "A good series of examples for this is searches and sorts. Particularly merge sort.\r\n<br>\r\n<br> "
				+ "Now that you have compelted the tutorial series it is recommended that you proceed to the end of series quiz to test your new found knowledge.");
		
		txtrCongratulationsYouHave.setEditable(false);
		
		/*
		 * The buttons used in the JFrame follow
		 * Each has an action listener for if it is clicked
		 * Each also have KeyListeners to be activated by the Enter button if it is focused(tabbed over)
		 * 
		 */
		
		/*
		 * Main Menu button
		 */
		btnMenu = new JButton("Main Menu");
		btnMenu.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnMenu.setBounds(157, 658, 127, 35);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
			}
		});
		btnMenu.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnMenu.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						dispose();
						MainMenu m = new MainMenu();
						m.setVisible(true);
						m.setLocationRelativeTo(null);
					}

				}
			}
		});
		
		/*
		 * Quiz Button
		 */
		btnQuiz = new JButton("End of Series Quiz");
		btnQuiz.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnQuiz.setBounds(372, 656, 149, 35);
		btnQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IQuiz iQModel = new Quiz();
				QuizView qzv = new QuizView(iQModel);
				qzv.setVisible(true);
				qzv.setLocationRelativeTo(null);
			}
		});
		btnQuiz.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnQuiz.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						dispose();
						IQuiz iQModel = new Quiz();
						QuizView qzv = new QuizView(iQModel);
						qzv.setVisible(true);
						qzv.setLocationRelativeTo(null);
					}

				}
			}
		});
		
		/*
		 * Quit button
		 */
		btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnQuit.setBounds(596, 658, 127, 35);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(btnQuit.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						System.exit(0);
					}

				}
			}
		});
		
		/*
		 * Adding components to the contentPane
		 */
		contentPane.setLayout(null);
		contentPane.add(txtrCongratulationsYouHave);
		contentPane.add(btnMenu);
		contentPane.add(btnQuiz);
		contentPane.add(btnQuit);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(Summary.class.getResource("/images/General Background.jpg")));
		lblBackground.setBounds(0, 0, 940, 730);
		contentPane.add(lblBackground);
	}
}
