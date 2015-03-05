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

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.IWorkAfter;
import model.WorkAfter;
import view.About;
import view.MainMenu;
import view.Summary;
import view.WorkAfter.AdvanceButtons.WAAlgorithmButton;
import view.WorkAfter.AdvanceButtons.WAExampleButton;
import view.WorkAfter.AdvanceButtons.WAResultsButton;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class WorkAfterView extends JFrame {


	private static final long serialVersionUID = -5079828832114029998L;
	private JPanel contentPane;
	private JPanel cardPanel1,cardPanel2;
	private JPanel advancePanel;
	
	private JButton btnAdvance,btnMenu;
	
	private WAExampleButton eb;
	private WAAlgorithmButton ab;
	private WAResultsButton rb;
	
	private WorkAfterExample w;
	private WorkAfterAlgorithm w2;
	private WorkAfterResult w3;
	
	private IWorkAfter model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IWorkAfter model = new WorkAfter();
					WorkAfterView frame = new WorkAfterView(model);
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
	public WorkAfterView(IWorkAfter m) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-FrameIcon.png")));
		model = m;
		
		w = new WorkAfterExample(model);
		
		ab = new WAAlgorithmButton(this);
		w2 = new WorkAfterAlgorithm(model,ab);
		
		w3 = new WorkAfterResult(model);
		
		eb = new WAExampleButton(this,model,w);
		rb = new WAResultsButton(this);
		
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
				a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mnAbout.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		cardPanel2 = new JPanel();
		cardPanel2.setFocusable(false);
		cardPanel2.setBounds(969, 527, 210, 150);

		cardPanel1 = new JPanel();
		cardPanel1.setFocusable(false);
		cardPanel1.setBounds(30, 16, 888, 714);
		cardPanel1.setLayout(new CardLayout(0, 0));

		JPanel cp1GroupPanel = new JPanel();
		cp1GroupPanel.setFocusable(false);
		cardPanel1.add(cp1GroupPanel, "name_94405714894092");

		JTextPane txtDescription = new JTextPane();
		txtDescription.setBounds(10, 11, 841, 221);
		txtDescription.setContentType("text/html");
		txtDescription.setText("<html> <font face=\"cambria\", size = 4>\r\n<br>This tutorial series focuses on work being done after a recursive call. \r\n<br>\r\n<br>Unlike the previous tutorials, a recursive call does not need to be the end of a method.\r\n<br>As the name suggests, work after a recursive call is when there is more code to be executed after a recursive call rather than it meaning the end of a method and being a return statement.\r\n<br>\r\n<br>In this tutorial series, a custom algorithm will be used in order to demonstrate how work can be done after a recursive call.\r\n<br>\r\n<br>\r\n<br>The algorithm is as follows:\r\n</html>");

		txtDescription.setBackground(UIManager.getColor("Panel.background"));
		txtDescription.setEditable(false);
		cp1GroupPanel.setLayout(null);
		
		JTextPane txtAlgorithm = new JTextPane();
		txtAlgorithm.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtAlgorithm.setContentType("text/html");
		txtAlgorithm.setText("<code> \r\n<br>&nbsp\t<font color = rgb(127,0,85)><b>public void</b></font> workAfter(<font color = rgb(127,0,85)><b>int</b> </font> n){\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)\r\n<br>&nbsp\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>Base case statement, showing the value of n is</font> \" + n);\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)><b>else</b> </font>\r\n<br>&nbsp\t\t\t&nbsp&nbsp workAfter(n-1);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>After the recursive call, showing the result of n*2 is</font> \" + n*2);\r\n<br>\t\r\n<br>&nbsp\t}\r\n<br></code>");
		txtAlgorithm.setBounds(10, 242, 672, 240);
		cp1GroupPanel.add(txtAlgorithm);
		cp1GroupPanel.add(txtDescription);
		
		JTextPane txtAdvance = new JTextPane();
		txtAdvance.setBackground(UIManager.getColor("Panel.background"));
		txtAdvance.setEditable(false);
		txtAdvance.setContentType("text/html");
		txtAdvance.setText("<font face=\"cambria\", size = 4>\r\nNow we are going to move onto how the factorial algorithm works.\r\n<br>\r\n<br>Please click the Advance button to continue.\r\n<br> \r\n</font>");
		txtAdvance.setBounds(10, 493, 431, 85);
		cp1GroupPanel.add(txtAdvance);
		cardPanel2.setLayout(new CardLayout(0, 0));

		advancePanel = new JPanel();
		advancePanel.setFocusable(false);
		cardPanel2.add(advancePanel, "name_94944655089283");

		btnMenu = new JButton("Main Menu");
		btnMenu.setBounds(37, 21, 127, 35);
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

		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(37, 90, 127, 35);

		btnAdvance.addActionListener(new ActionListener() {
//			int count = 0;
//			WorkAfterExample w = new WorkAfterExample();
//			WorkAfterAlgorithm w2 = new WorkAfterAlgorithm();
//			WorkAfterResult w3 = new WorkAfterResult();
//
//			//Used for error control
//			boolean flag;
			public void actionPerformed(ActionEvent e) {



//				if(count == 0){
					cardPanel1.add(w);
					cardPanel1.remove(cp1GroupPanel);
					
					cardPanel2.add(eb);
					cardPanel2.remove(advancePanel);
					
//					flag = true;
//				}
//
//				//Handles parameters that are not within the specified bound
//				if(count == 1 && w.getParameter() < 1 || w.getParameter() > 11){
//					flag = false;
//					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
//				}
//
//				if(count == 1 && w.getParameter() > 0 && w.getParameter() < 11){
//					cardPanel1.add(w2);
//					cardPanel1.remove(w);
//					flag = true;
//				} 
//
//				if(count == 2){
//					cardPanel1.add(w3);
//					cardPanel1.remove(w2);
//					btnAdvance.setText("Summary");
//					btnMenu.setVisible(true);
//					flag = true;
//				}
//
//				if(count == 3){
//					dispose();
//					Summary summ = new Summary();
//					summ.setVisible(true);
//					summ.setLocationRelativeTo(null);
//					flag = true;	
//				}
//
//				if(flag)
//					count++;
			} 
		});
		advancePanel.setLayout(null);
		advancePanel.add(btnMenu);
		advancePanel.add(btnAdvance);
		contentPane.setLayout(null);
		contentPane.add(cardPanel1);
		contentPane.add(cardPanel2);
	}
	
	public void switchCards1(){
		//Handles parameters that are not within the specified bound
		if(w.getParameter() < 1 || w.getParameter() > 11){
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
		}

		if(w.getParameter() > 0 && w.getParameter() < 11){
			cardPanel1.add(w2);
			cardPanel1.remove(w);
			
			cardPanel2.add(ab);
			cardPanel2.remove(eb);
		} 
		
	}
	
	public void switchCards2(){
		cardPanel1.add(w3);
		cardPanel1.remove(w2);
		btnAdvance.setText("Summary");
		btnMenu.setVisible(true);
		
		cardPanel2.add(rb);
		cardPanel2.remove(ab);
		
	}
	
	public void advanceTut(){
		dispose();
		Summary summ = new Summary();
		summ.setVisible(true);
		summ.setLocationRelativeTo(null);
		summ.setResizable(false);
	}
	
	/**
	 * This method is used to take the user to the main menu
	 * 
	 * This is called by the ResultsButton class
	 * It is used to dispose of the current frame and create a new one
	 * The new one is the main menu
	 * 
	 * @since 1.2
	 * 
	 */
	public void mainMenu(){
		dispose();
		MainMenu m = new MainMenu();
		m.setVisible(true);
		m.setLocationRelativeTo(null);
		m.setResizable(false);
	}
}
