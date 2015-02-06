package view.ExcessiveRecomputation;

/**
 * This is the initial GUI for the excessive recomputation and the fibonacci algorithm.
 * It will explain the concept of excessive recomputation, why it's bad, how it can be solved.
 * It will let the user pick a number for their parameter to be used in the next GUI.
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

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.About;
import view.MainMenu;
import view.WorkAfter.WorkAfterView;

import javax.swing.LayoutStyle.ComponentPlacement;

public class ExcessiveRecompView extends JFrame {


	private static final long serialVersionUID = -3750604378132419616L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcessiveRecompView frame = new ExcessiveRecompView();
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
	public ExcessiveRecompView() {
		setTitle("Tutorial 3: Excessive Recomputation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1239, 792);
		
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
		//This line is what makes a card not switch out. It must be up top. NOT AT THE BOTTOM LIKE ITS AUTO GENERATED TO DO!!!!
		cardPanel1.setLayout(new CardLayout(0, 0));
		
		JPanel cardPanel2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 694, GroupLayout.PREFERRED_SIZE)
							.addGap(50))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addGap(83))))
		);
		cardPanel2.setLayout(new CardLayout(0, 0));
		
		JPanel cp1GroupPanel = new JPanel();
		cardPanel1.add(cp1GroupPanel, "name_99260177086740");
		
		JPanel cp2GroupPanel = new JPanel();
		cardPanel2.add(cp2GroupPanel, "name_99302267697702");
		
		JTextPane txtIntroduction = new JTextPane();
		txtIntroduction.setContentType("text/html");
		txtIntroduction.setText("<html>\r\nThis tutorial series focuses on excessive recomputation in recursion.\r\n<br>\r\n<br>Excessive recomputation highlights an issue with recursion. \r\n<br>Excessive recomputation is when the same calculation is calculated multiple times throughout multiple recursive calls. \r\n<br>This can make basic recursion not very resource efficient, since it will be wasting time and CPU power calculating sums which it should already know the answer to having already did the same calculation before.\r\n<br>\r\n<br>\r\n<br>In this tutorial series, the fibonacci algorithm will be used in order to demonstrate how work can be done after a recursive call.\r\n<br>The Fibonacci sequence is a series of numbers where a number is found by adding up the two numbers before it. Starting with 0 and 1, the sequence goes 1, 1, 2, 3, 5, 8, 13, 21, 34, and so forth.\r\n<br>\r\n<br>\r\n<br>The algorithm is as follows:\r\n<br><code>\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> fib(<font color = rgb(127,0,85)> <b>int </b> </font>n) {\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b> </font> (n == 0 || n == 1)\r\n<br>\t\t  &nbsp&nbsp &nbsp&nbsp <font color = rgb(127,0,85)> <b>return </b> </font>1;\r\n<br>\t\t\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>else</b> </font>\r\n<br>\t\t &nbsp&nbsp&nbsp&nbsp<font color = rgb(63,127,95)> //Recursive call</font>\r\n<br>\t\t   &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b> </font> fib(n-1) + fib(n-2);\r\n<br>\t}\r\n<br></code>\r\n<br>Now we are going to move onto how the factorial algorithm works.\r\n<br>\r\n<br>Please click the Advance button to continue.\r\n</html>\r\n\r\n");
		
		
		txtIntroduction.setBackground(UIManager.getColor("Panel.background"));
		txtIntroduction.setEditable(false);

		
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(txtIntroduction, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(116, Short.MAX_VALUE))
		);
		gl_cp1GroupPanel.setVerticalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(txtIntroduction, GroupLayout.PREFERRED_SIZE, 575, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(148, Short.MAX_VALUE))
		);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		
		JButton btnMenu = new JButton("Main Menu");
		//Don't want it to be visible until the last page
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
		
		btnAdvance.addActionListener(new ActionListener() {
			int count = 0;
			ExcessiveRecompExample e1 = new ExcessiveRecompExample();
			ExcessiveRecompExample2 e2 = new ExcessiveRecompExample2();
			ExcessiveRecompAlgorithm e3 = new ExcessiveRecompAlgorithm();
			ExcessiveRecompResult e4 = new ExcessiveRecompResult();
			public void actionPerformed(ActionEvent e) {

				
				if(count == 0){
//				System.out.println(count);
				cardPanel1.add(e1);
				cardPanel1.remove(cp1GroupPanel);

				 }
				
				if(count == 1){
//				System.out.println("we got here " + count);
				cardPanel1.add(e2);
				cardPanel1.remove(e1);
				
				} 
				
				if(count == 2){
				cardPanel1.add(e3);
				cardPanel1.remove(e2);
				}
				
				if(count == 3){
				cardPanel1.add(e4);
				cardPanel1.remove(e3);
				btnAdvance.setText("Tutorial 4");
				btnMenu.setVisible(true);
				}
				
				if(count == 4){
					dispose();
					WorkAfterView wav = new WorkAfterView();
					wav.setVisible(true);
					wav.setLocationRelativeTo(null);
					
				}
				
				
				count++;
//				System.out.println("count after increment is " + count);
			} 
		});
		

		
		GroupLayout gl_cp2GroupPanel = new GroupLayout(cp2GroupPanel);
		gl_cp2GroupPanel.setHorizontalGroup(
			gl_cp2GroupPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_cp2GroupPanel.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_cp2GroupPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAdvance, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_cp2GroupPanel.setVerticalGroup(
			gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_cp2GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		cp2GroupPanel.setLayout(gl_cp2GroupPanel);

		
		

		contentPane.setLayout(gl_contentPane);
	}

}
