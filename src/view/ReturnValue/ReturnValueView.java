package view.ReturnValue;

/**
 * The first GUI for the return value example which will use the factorial algorithm.
 * Return value is described, why it is important, how it is calculated etc.
 * A parameter integer can be entered to be used in the next GUI screen.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.About;
import view.MainMenu;
import view.ExcessiveRecomputation.ExcessiveRecompView;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ReturnValueView extends JFrame {


	private static final long serialVersionUID = 7660595269788434327L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnValueView frame = new ReturnValueView();
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
	public ReturnValueView() {
		setTitle("Tutorial 2: Return Values");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 807);
		
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
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmQuit);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About a = new About();
				a.setVisible(true);
				a.setLocationRelativeTo(null);
			}
		});
		mnAbout.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel cardPanel1 = new JPanel();
		cardPanel1.setBorder(null);
		
		JPanel cardPanel3 = new JPanel();
		
		JPanel cp1GroupPanel = new JPanel();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 871, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(cardPanel3, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cardPanel1, GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(cardPanel3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(51))))
		);
		cardPanel3.setLayout(new CardLayout(0, 0));
		
		JPanel advancePanel = new JPanel();
		cardPanel3.add(advancePanel, "name_12410711717075");
		
		JButton btnMenu = new JButton("Main Menu");
		//Only want it visible once the user is on the last tutorial slide
		btnMenu.setVisible(false);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
			}
		});

		JButton btnAdvance = new JButton("Advance");
				//Changing the cards to advance to the next screen
				btnAdvance.addActionListener(new ActionListener() {
					int count = 0;
					ReturnValueExample r = new ReturnValueExample();
					ReturnValueAlgorithm r2 = new ReturnValueAlgorithm();
					ReturnValueAlgorithm2 r3 = new ReturnValueAlgorithm2();
					ReturnValueResults r4 = new ReturnValueResults();
					public void actionPerformed(ActionEvent e) {

						
						if(count == 0){
//							System.out.println(count);
						cardPanel1.add(r);
						cardPanel1.remove(cp1GroupPanel);
//						cardPanel2.remove(cp2GroupPanel);
//						cardPanel3.remove(advancePanel);
//						advancePanel.setVisible(false); 
						 }
						
						if(count == 1){
//						System.out.println("we got here " + count);
						System.out.println(r.getParameter());	
						cardPanel1.add(r2);
						cardPanel1.remove(r);
						
						} 
						
						if(count == 2){
						cardPanel1.add(r3);
						cardPanel1.remove(r2);
							
						}
						
						if(count == 3){
						cardPanel1.add(r4);
						cardPanel1.remove(r3);
						btnAdvance.setText("Tutorial 3");
						btnMenu.setVisible(true);
							
						}
						
						if(count == 4){
							dispose();
							ExcessiveRecompView erv = new ExcessiveRecompView();
							erv.setVisible(true);
							erv.setLocationRelativeTo(null);
							
						}
						
						count++;
//						System.out.println("count after increment is " + count);
					} 
				});
				

				GroupLayout gl_advancePanel = new GroupLayout(advancePanel);
				gl_advancePanel.setHorizontalGroup(
					gl_advancePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_advancePanel.createSequentialGroup()
							.addGap(55)
							.addGroup(gl_advancePanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAdvance, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(60, Short.MAX_VALUE))
				);
				gl_advancePanel.setVerticalGroup(
					gl_advancePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_advancePanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(32))
				);
				advancePanel.setLayout(gl_advancePanel);
		cardPanel1.setLayout(new CardLayout());
		

		cp1GroupPanel.setBorder(null);
		cardPanel1.add(cp1GroupPanel, "name_455689991325878");
		
		
		JTextPane txtrIntroduction = new JTextPane();
		txtrIntroduction.setContentType("text/html");
		txtrIntroduction.setEditable(false);
		txtrIntroduction.setBackground(UIManager.getColor("Panel.background"));
		txtrIntroduction.setText("<html>\r\n<br>This tutorial series focuses on return values in recursive calls. A method returns to the code that invoked it when it completes all the statements in the method, reaches a return statement, or when it throws an exception.\r\n"
				+ "<br>\r\n<br>The return value of a recursive call is the result of a recursive call after all the statements in the method have been reached which is usually a return statement which itself is a recursive call.\r\n"
				+ "<br>\r\n"
				+ "<br>The final return value however, is returned once the base case is met(as described in the previous tutorial) and thus a different return statement is met which does not continue the recursive calls.\r\n"
				+ "<br>\r\n"
				+ "<br>In this tutorial series, the factorial algorithm will be used in order to demonstrate how the final return value of a recursive call is calculated.\r\n"
				+ "<br>\r\n"
				+ "<br>Factorial is the product of an integer and all the integers below it; e.g. factorial four ( 4! ) is equal to 24.\r\n"
				+ "<br>\r\n"
				+ "<br>The Factorial algorithm is as follows:\r\n"
				+ "<br>\r\n"
				+ "<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int factorial(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n"
				+ "<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n"
				+ "<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; "
				+ "<br>\r\n"
				+ "<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * factorial(n-1);\r\n "
				+ "<br>&nbsp } </code> \r\n"
				+ "<br>\r\n"
				+ "<br>Now we are going to move onto how the factorial algorithm works.\r\n"
				+ "<br>\r\n"
				+ "<br>Please click the Advance button to continue.\r\n"
				+ "<br>\r\n</html>");

		
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrIntroduction, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_cp1GroupPanel.setVerticalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrIntroduction, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(188, Short.MAX_VALUE))
		);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		contentPane.setLayout(gl_contentPane);
	}
}
