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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

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
		txtAbout.setText("Understanding Recursion is a project undertaken by a fourth year student in his final year of his BSc Honors course in Computer Science.\r\n\r\nThe goal of this application was to create an interactive application which will aid a user in understanding and learning the basics of recursion.");
		txtAbout.setBackground(UIManager.getColor("Panel.background"));
		txtAbout.setWrapStyleWord(true);
		txtAbout.setLineWrap(true);
		txtAbout.setEditable(false);

		JButton btnReturnMainMenu = new JButton("Close");
		btnReturnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});


		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap(21, Short.MAX_VALUE)
						.addComponent(txtAbout, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(147)
								.addComponent(btnReturnMainMenu, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(175, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(24)
						.addComponent(txtAbout, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
						.addComponent(btnReturnMainMenu)
						.addContainerGap())
				);
		contentPane.setLayout(gl_contentPane);
	}
}
