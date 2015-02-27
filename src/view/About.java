package view;

/**
 * A small frame that tells the user about the project
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;

public class About extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		
		
		setLocationRelativeTo(null);
		setTitle("About");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTextArea txtAbout = new JTextArea();
		txtAbout.setBounds(26, 29, 393, 159);
		txtAbout.setText("Understanding Recursion is a project undertaken by a fourth year student in his final year of his BSc Honors course in Computer Science.\r\n\r\nThe goal of this application was to create an interactive application which will aid a user in understanding and learning the basics of recursion.");
		txtAbout.setBackground(UIManager.getColor("Panel.background"));
		txtAbout.setWrapStyleWord(true);
		txtAbout.setLineWrap(true);
		txtAbout.setEditable(false);

		JButton btnReturnMainMenu = new JButton("Close");
		btnReturnMainMenu.setBounds(149, 209, 127, 30);
		btnReturnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		
		
		contentPane.setLayout(null);
		contentPane.add(txtAbout);
		contentPane.add(btnReturnMainMenu);
	}
}
