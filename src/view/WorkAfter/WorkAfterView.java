package view.WorkAfter;

/**
 * First GUI for showing work after the recursive call.
 * A parameter can be entered to be used in the next GUI screen.
 * 
 * @author Christopher Baillie
 * @version 1.1
 * @since 1.0
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.About;
import view.MainMenu;
import view.ReturnValue.ReturnValueView;

public class WorkAfterView extends JFrame {


	private static final long serialVersionUID = -5079828832114029998L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkAfterView frame = new WorkAfterView();
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
	public WorkAfterView() {
		setTitle("Tutorial 4: Work After ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1229, 795);
		
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
		
		JPanel cardPanel2 = new JPanel();
		
		JPanel cardPanel1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 888, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cardPanel1, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
						.addComponent(cardPanel2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
		);
		cardPanel1.setLayout(new CardLayout(0, 0));
		
		JPanel cp1GroupPanel = new JPanel();
		cardPanel1.add(cp1GroupPanel, "name_94405714894092");
		
		JTextPane txtDescription = new JTextPane();
		txtDescription.setContentType("text/html");
		txtDescription.setText("<html>\r\n<br>This tutorial series focuses on work being done after a recursive call. \r\n<br>\r\n<br>Unlike the previous tutorials, a recursive call does not need to be the end of a method.\r\n<br>As the name suggests, work after a recursive call is when there is more code to be executed after a recursive call rather than it meaning the end of a method and being a return statement.\r\n<br>\r\n<br>In this tutorial series, a custom algorithm will be used in order to demonstrate how work can be done after a recursive call.\r\n<br>\r\n<br>\r\n<br>The algorithm is as follows:\r\n<br><code>\r\n<br>\t<font color = rgb(127,0,85)><b>public void</b></font> workAfterNew(<font color = rgb(127,0,85)><b>int</b> </font> n){\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>Base case statement</font> \" + n);\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>else</b> </font>\r\n<br>\t\t\t&nbsp&nbsp workAfterNew(n-1);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>After the recursive call</font> \" + n*2);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>\t}\r\n<br></code>\r\n<br>Now we are going to move onto how the factorial algorithm works.\r\n<br>\r\n<br>Please click the Advance button to continue.\r\n<br>\r\n</html>");
		
		txtDescription.setBackground(UIManager.getColor("Panel.background"));
		txtDescription.setEditable(false);
		
		
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, 841, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_cp1GroupPanel.setVerticalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, 553, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
		);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		cardPanel2.setLayout(new CardLayout(0, 0));
		
		JPanel advancePanel = new JPanel();
		cardPanel2.add(advancePanel, "name_94944655089283");
		
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
			WorkAfterExample w = new WorkAfterExample();
			WorkAfterAlgorithm w2 = new WorkAfterAlgorithm();
			WorkAfterResult w3 = new WorkAfterResult();
			public void actionPerformed(ActionEvent e) {

				
				if(count == 0){
//					System.out.println(count);
				cardPanel1.add(w);
				cardPanel1.remove(cp1GroupPanel);

				 }
				
				if(count == 1){
//				System.out.println("we got here " + count);
				cardPanel1.add(w2);
				cardPanel1.remove(w);
				
				} 
				
				if(count == 2){
				cardPanel1.add(w3);
				cardPanel1.remove(w2);
				btnAdvance.setText("Tutorial 2");
				btnMenu.setVisible(true);
				}
				//TODO change this
				if(count == 3){
					dispose();
					ReturnValueView rvv = new ReturnValueView();
					rvv.setVisible(true);
					rvv.setLocationRelativeTo(null);
					
				}
				
				
				count++;
//				System.out.println("count after increment is " + count);
			} 
		});
		

		
		GroupLayout gl_advancePanel = new GroupLayout(advancePanel);
		gl_advancePanel.setHorizontalGroup(
			gl_advancePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_advancePanel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_advancePanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAdvance, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_advancePanel.setVerticalGroup(
			gl_advancePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_advancePanel.createSequentialGroup()
					.addGap(21)
					.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		advancePanel.setLayout(gl_advancePanel);
		contentPane.setLayout(gl_contentPane);
	}
}
