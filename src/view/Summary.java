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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JButton;

import view.Quiz.QuizView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Summary extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setTitle("End of Series Summary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTextPane txtrCongratulationsYouHave = new JTextPane();
		txtrCongratulationsYouHave.setContentType("text/html");
		txtrCongratulationsYouHave.setBackground(UIManager.getColor("Panel.background"));
		txtrCongratulationsYouHave.setText("<b>Congratulations!</b> You have reached the end of this tutorial series on recursion.\r\n<br>\r\n<br>Throughout this series you should have learnt the basics of recursion, with each tutorial building on the previous one.\r\n<br>\r\n<br>Here is a brief summary of what you should have learnt from this series:\r\n<br>\r\n<br><b>Tutorial 1: Base Case</b>\r\n<br>\tA base case in a recursive call is a way to break out of a recursive call. It prevents infinite loops and crashes due to stack overflow errors. \r\n<br>\r\n<br>\tConvergence is an important term relating to the base case. Each recursive call must converge towards the base case to ensure it is eventually met or the same errors mentioned above can occur.\r\n<br>\r\n<br><b>Tutorial 2: Return Values</b>\r\n<br>\tReturn values for a recursive method is calculated after the base case has been met. Until that point, each value is remembered from each recursive call before a final calculation or algorithm is done once the base case has been met.\r\n<br>\r\n<br><b>Tutorial 3: Excessive Recomputation</b>\r\n<br>\tExcessive recomputation is when a recursive call recalculates a sum or algorithm which has already been calculated previously. By not saving results of recursive calls, CPU time and resources are wasted by recalculating sums/algorithms.\r\n<br>\r\n<br>\tMemoization is a method to solve this, by storing results and calculations of recursive calls which can then be checked on each call to ensure it has not already been calculated before. If it has then it is just a matter of fetching the answer from whatever data structure it was stored in.\r\n<br>\r\n<br><b>Tutorial 4: Work after</b>\r\n<br>\tWork after the recursive call shows that a method does not have to return and end once the base case of a recursive call has been met. More work can be done after the recursive call has been compelted.\r\n<br>\r\n<br>\tA good series of examples for this is searches and sorts. Particularly merge sort.\r\n<br>\r\n<br> Now that you have compelted the tutorial series it is recommended that you proceed to the end of series quiz to test your new found knowledge.");
		txtrCongratulationsYouHave.setEditable(false);

		JButton btnMenu = new JButton("Main Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
			}
		});

		JButton btnQuiz = new JButton("End of Series Quiz");
		btnQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QuizView qzv = new QuizView();
				qzv.setVisible(true);
				qzv.setLocationRelativeTo(null);
			}
		});

		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});


		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(19)
										.addComponent(txtrCongratulationsYouHave, GroupLayout.PREFERRED_SIZE, 794, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(152)
												.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
												.addGap(95)
												.addComponent(btnQuiz, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
												.addGap(36)
												.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
												.addContainerGap(101, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtrCongratulationsYouHave, GroupLayout.PREFERRED_SIZE, 622, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnQuiz, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
								.addComponent(btnQuit, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
								.addContainerGap(19, Short.MAX_VALUE))
				);
		contentPane.setLayout(gl_contentPane);
	}
}
