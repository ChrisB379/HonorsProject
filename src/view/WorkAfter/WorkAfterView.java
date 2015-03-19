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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class WorkAfterView extends JFrame {


	private static final long serialVersionUID = -5079828832114029998L;
	private JPanel contentPane;
	private JPanel cardPanel1,cardPanel2;
	private JPanel advancePanel;
	private JPanel cp1GroupPanel;
	
	private JButton btnAdvance;
	
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
		//Set the icon for the JFrame
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-frameIcon.png")));
		
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

		/*
		 * Menu bar with all of the options and drop down options
		 */
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
		
		/*
		 * Content pane and other panels
		 */
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		/*
		 * Card panel for swapping in buttons
		 */
		cardPanel2 = new JPanel();
		cardPanel2.setOpaque(false);
		cardPanel2.setFocusable(false);
		cardPanel2.setBounds(969, 527, 210, 150);

		/*
		 * Card panel for swapping in the actual tutorial content
		 */
		cardPanel1 = new JPanel();
		cardPanel1.setOpaque(false);
		cardPanel1.setFocusable(false);
		cardPanel1.setBounds(30, 16, 888, 714);
		cardPanel1.setLayout(new CardLayout(0, 0));

		cp1GroupPanel = new JPanel();
		cp1GroupPanel.setOpaque(false);
		cp1GroupPanel.setFocusable(false);
		cardPanel1.add(cp1GroupPanel, "name_94405714894092");
		
		/*
		 * Describes what this chapter is about
		 */
		JTextPane txtDescription = new JTextPane();
		txtDescription.setOpaque(false);
		txtDescription.setBounds(10, 11, 841, 221);
		txtDescription.setContentType("text/html");
		txtDescription.setText("<html> <font face=\"cambria\", size = 4>\r\n<br>This tutorial series focuses on work being done after a recursive call. \r\n<br>\r\n<br>"
				+ "Unlike the previous tutorials, a recursive call does not need to be the end of a method.\r\n<br>As the name suggests, "
				+ "work after a recursive call is when there is more code to be executed after a recursive call rather than it meaning the end of a method and being a return statement.\r\n<br>\r\n<br>"
				+ "In this tutorial series, a custom algorithm will be used in order to demonstrate how work can be done after a recursive call.\r\n<br>\r\n<br>\r\n<br>"
				+ "The algorithm is as follows:\r\n</html>");

		txtDescription.setBackground(UIManager.getColor("Panel.background"));
		txtDescription.setEditable(false);
		cp1GroupPanel.setLayout(null);
		
		/*
		 * The work after algorithm
		 */
		JTextPane txtAlgorithm = new JTextPane();
		txtAlgorithm.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtAlgorithm.setContentType("text/html");
		txtAlgorithm.setText("<code> \r\n<br>&nbsp\t<font color = rgb(127,0,85)><b>public void</b></font> workAfter(<font color = rgb(127,0,85)><b>int</b> </font> n)"
				+ "{\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)\r\n<br>&nbsp\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>."
				+ "println(\"<font color = rgb(0,0,192)>Base case statement, showing the value of n is</font> \" + n);\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)>"
				+ "<b>else</b> </font>\r\n<br>&nbsp\t\t\t&nbsp&nbsp workAfter(n-1);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println"
				+ "(\"<font color = rgb(0,0,192)>After the recursive call, showing the result of n*2 is</font> \" + n*2);\r\n<br>\t\r\n<br>&nbsp\t}\r\n<br></code>");
		txtAlgorithm.setBounds(10, 242, 672, 240);
		cp1GroupPanel.add(txtAlgorithm);
		cp1GroupPanel.add(txtDescription);
		
		/*
		 * Tells the user how to progress
		 */
		JTextPane txtAdvance = new JTextPane();
		txtAdvance.setOpaque(false);
		txtAdvance.setBackground(UIManager.getColor("Panel.background"));
		txtAdvance.setEditable(false);
		txtAdvance.setContentType("text/html");
		txtAdvance.setText("<font face=\"cambria\", size = 4>\r\nNow we are going to move onto how the factorial algorithm works.\r\n<br>\r\n<br>Please click the Advance button to continue.\r\n<br> \r\n</font>");
		txtAdvance.setBounds(10, 493, 431, 85);
		cp1GroupPanel.add(txtAdvance);
		cardPanel2.setLayout(new CardLayout(0, 0));

		advancePanel = new JPanel();
		advancePanel.setOpaque(false);
		advancePanel.setFocusable(false);
		cardPanel2.add(advancePanel, "name_94944655089283");
		
		/*
		 * Advance button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(37, 90, 127, 35);

		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					cardPanel1.add(w);
					cardPanel1.remove(cp1GroupPanel);
					
					cardPanel2.add(eb);
					cardPanel2.remove(advancePanel);
					
			} 
		});
		btnAdvance.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(btnAdvance.isFocusOwner()){
					if (e.getKeyCode()==KeyEvent.VK_ENTER){
						cardPanel1.add(w);
						cardPanel1.remove(cp1GroupPanel);
						
						cardPanel2.add(eb);
						cardPanel2.remove(advancePanel);
					}

				}
				
			}
		});
		advancePanel.setLayout(null);
		advancePanel.add(btnAdvance);
		contentPane.setLayout(null);
		contentPane.add(cardPanel1);
		contentPane.add(cardPanel2);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(WorkAfterView.class.getResource("/images/General Background.jpg")));
		lblBackground.setBounds(0, 0, 1223, 743);
		contentPane.add(lblBackground);
	}
	
	/**
	 * Switches to the algorithm panel with its relevant buttons
	 * This is assuming the parameter was valid and accepted
	 */
	public void switchCards1(){
		//Handles parameters that are not within the specified bound
		if(w.getParameter() < 1 || w.getParameter() > 10){
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
		}

		if(w.getParameter() > 0 && w.getParameter() < 11){
			cardPanel1.add(w2);
			cardPanel1.remove(w);
			
			cardPanel2.add(ab);
			cardPanel2.remove(eb);
		} 
		
	}
	
	/**
	 * Switches to the Results panel with its relevant buttons
	 * 
	 */
	public void switchCards2(){
		cardPanel1.add(w3);
		cardPanel1.remove(w2);
		btnAdvance.setText("Summary");
		
		cardPanel2.add(rb);
		cardPanel2.remove(ab);
		
	}
	
	/**
	 * Disposes this view and opens up the summary which is the next in the series
	 */
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
