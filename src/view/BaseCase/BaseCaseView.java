package view.BaseCase;

/**
 *  This will be the initial GUIL for the base case set of examples
 *  It will describe the base case, why it's important etc and then introduce the 
 *  next GUI being no base case.
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
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.About;
import view.MainMenu;
import view.ReturnValue.ReturnValueView;

import javax.swing.LayoutStyle.ComponentPlacement;

import model.ReturnValue;

public class BaseCaseView extends JFrame {


	private static final long serialVersionUID = 4604408229700198517L;
	private JPanel contentPane;
	
	private ReturnValue model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseCaseView frame = new BaseCaseView();
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
	public BaseCaseView() {
		setTitle("Tutorial 1: Base Case");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 802);

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

		JPanel cardPanel1 = new JPanel();
		//This line can prevent cards from switching. Make sure it's at the top
		cardPanel1.setLayout(new CardLayout(0, 0));

		JPanel cardPanel2 = new JPanel();
		cardPanel2.setLayout(new CardLayout(0, 0));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 1047, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addContainerGap()
										.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
										.addGap(33))
										.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
												.addContainerGap()
												.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 730, GroupLayout.PREFERRED_SIZE)))
												.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);


		JPanel cp1GroupPanel = new JPanel();
		cardPanel1.add(cp1GroupPanel, "name_60102974363843");


		JPanel cp2GroupPanel = new JPanel();
		cardPanel2.add(cp2GroupPanel, "name_60155849133626");

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
		//Changing the cards to advance to the next screen
		btnAdvance.addActionListener(new ActionListener() {
			int count = 0;
			NoBaseCaseExample bc1 = new NoBaseCaseExample();
			NoBaseCaseAlgorithm bc2 = new NoBaseCaseAlgorithm();
			NoBaseCaseResult bc3 = new NoBaseCaseResult();
			ConvergenceExample bc4 = new ConvergenceExample();
			ConvergenceAlgorithm bc5 = new ConvergenceAlgorithm();
			ConvergenceResult bc6 = new ConvergenceResult();

			//Used for error control
			boolean flag;

			public void actionPerformed(ActionEvent e) {


				if(count == 0){
					cardPanel1.add(bc1);
					cardPanel1.remove(cp1GroupPanel);
					flag = true;
				}

				//Handles parameters that are not within the specified bound
				if(count == 1 && bc1.getParameter() < 1 || bc1.getParameter() > 11){
					flag = false;
					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
				}

				if(count == 1 && bc1.getParameter() > 0 && bc1.getParameter() < 11){
					//				System.out.println("we got here " + count);
					cardPanel1.add(bc2);
					cardPanel1.remove(bc1);
					flag = true;	
				} 

				if(count == 2){
					cardPanel1.add(bc3);
					cardPanel1.remove(bc2);
					flag = true;	
				}

				if(count == 3){
					cardPanel1.add(bc4);
					cardPanel1.remove(bc3);
					flag = true;	
				}

				if(count == 4){
					cardPanel1.add(bc5);
					cardPanel1.remove(bc4);
					flag = true;
				}

				if(count == 5){
					cardPanel1.add(bc6);
					cardPanel1.remove(bc5);
					btnAdvance.setText("Tutorial 2");
					btnMenu.setVisible(true);
					flag = true;	
				}

				if(count == 6){
					dispose();
					ReturnValueView rvv = new ReturnValueView(model);
					rvv.setVisible(true);
					rvv.setLocationRelativeTo(null);
					flag = true;	
				}

				if(flag)
					count++;
				//				System.out.println("count after increment is " + count);
			} 
		});





		GroupLayout gl_cp2GroupPanel = new GroupLayout(cp2GroupPanel);
		gl_cp2GroupPanel.setHorizontalGroup(
				gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp2GroupPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnMenu, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(btnAdvance, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
								.addGap(20))
				);
		gl_cp2GroupPanel.setVerticalGroup(
				gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_cp2GroupPanel.createSequentialGroup()
						.addGap(25)
						.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
						.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		cp2GroupPanel.setLayout(gl_cp2GroupPanel);




		JTextPane txtrThisTutorialSeries = new JTextPane();
		txtrThisTutorialSeries.setContentType("text/html");
		txtrThisTutorialSeries.setText("<html>\r\n<br>This tutorial series focuses on base case in recursive calls. \r\n<br>\r\n<br>The base case of a recursive call returns a value without making any subsequent recursive calls. The base case is important in recursive calls as it prevents a recursive statement falling into an infinite loop before failing due to a stack overflow.\r\n<br>\r\n<br>\r\n<br>In this tutorial series,some simple algorithms will be used in order to demonstrate how the base case of a recursive call is used. Two algorithms will be used in order to demonstrate to different important features of base cases which recursive calls must adhere to.\r\n<br>\r\n<br>\r\n<br>The algorithms are as follows:\r\n<br>\r\n<br> <code>\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> noBaseCase(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> noBaseCase(n-1) + n;\r\n<br>\t}\r\n<br> </code>\r\n<br>The second algorithm :\t\r\n<br> <code>\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> convergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> convergence(n+1) + 2*n;\r\n<br>\t}\r\n<br> </code>\r\n<br>\r\n<br>\r\n<br>Now we are going to move onto how the noBaseCase algorithm works.\r\n<br>\r\n<br>Please click the Advance button to continue.\r\n</html>");

		txtrThisTutorialSeries.setBackground(UIManager.getColor("Panel.background"));
		txtrThisTutorialSeries.setEditable(false);
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
				gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtrThisTutorialSeries, GroupLayout.PREFERRED_SIZE, 1016, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(21, Short.MAX_VALUE))
				);
		gl_cp1GroupPanel.setVerticalGroup(
				gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtrThisTutorialSeries, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(15, Short.MAX_VALUE))
				);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		contentPane.setLayout(gl_contentPane);
	}
}


