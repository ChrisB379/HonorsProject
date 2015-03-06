package view.ExcessiveRecomputation;

/**
 * This is the initial GUI for the excessive recomputation and the fibonacci algorithm.
 * It explains the concept of excessive recomputation, why it's bad, how it can be solved.
 * It lets the user pick a number for their parameter to be used in the next GUI.
 * 
 * @author Christopher Baillie
 * @version 2.0
 * @since 1.0
 */


import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.About;
import view.MainMenu;
import view.ExcessiveRecomputation.AdvanceButtons.ERAfterMemoButton;
import view.ExcessiveRecomputation.AdvanceButtons.ERAlgorithmButton;
import view.ExcessiveRecomputation.AdvanceButtons.ERExample2Button;
import view.ExcessiveRecomputation.AdvanceButtons.ERExampleButton;
import view.ExcessiveRecomputation.AdvanceButtons.ERMemoButton;
import view.ExcessiveRecomputation.AdvanceButtons.ERResultsButton;
import view.WorkAfter.WorkAfterView;
import model.ExcessiveRecomp;
import model.IExcessiveRecomp;
import model.IWorkAfter;
import model.WorkAfter;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import java.awt.Color;


public class ExcessiveRecompView extends JFrame implements Observer {


	private static final long serialVersionUID = -3750604378132419616L;
	private JPanel contentPane;
	private JPanel cardPanel1,cardPanel2;
	private JPanel advancePanel;
	
	
	private JButton btnAdvance;
	
	private ERExampleButton eb;
	private ERExample2Button eb2;
	private ERAlgorithmButton ab;
	private ERResultsButton rb;
	private ERMemoButton mb;
	private ERAfterMemoButton amb;
	
	private ExcessiveRecompExample e1;
	private ExcessiveRecompExample2 e2;
	private ExcessiveRecompAlgorithm e3;
	private ExcessiveRecompResult e4;
	
	private IExcessiveRecomp model;
	
	private Memoization mem;
	private MemoizationDescription memd;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IExcessiveRecomp iModel = new ExcessiveRecomp();
					ExcessiveRecompView frame = new ExcessiveRecompView(iModel);
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
	public ExcessiveRecompView(IExcessiveRecomp m) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-FrameIcon.png")));
		model = m;
		
		eb = new ERExampleButton(this);
		
		e2 = new ExcessiveRecompExample2(model);
		eb2 = new ERExample2Button(this,model,e2);
		mb = new ERMemoButton(this);
		amb = new ERAfterMemoButton(this);
		
		ab = new ERAlgorithmButton(this);
		rb = new ERResultsButton(this);
		
		e1 = new ExcessiveRecompExample();
		e3 = new ExcessiveRecompAlgorithm(model,ab);
		e4 = new ExcessiveRecompResult(model);
		
		 mem = new Memoization();
		 memd = new MemoizationDescription();
		
		setTitle("Tutorial 3: Excessive Recomputation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1239, 792);
		
		/*
		 * The menu bar with all of its options
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
			public void actionPerformed(ActionEvent arg0) {
				About a = new About();
				a.setVisible(true);
				a.setLocationRelativeTo(null);
				a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mnAbout.add(mntmAbout);
		
		/*
		 * Content Panes and panels
		 */
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		/*
		 * The card panel with the actual content
		 */
		cardPanel1 = new JPanel();
		cardPanel1.setFocusable(false);
		cardPanel1.setBounds(29, 16, 938, 694);
		//This line is what makes a card not switch out. It must be up top. NOT AT THE BOTTOM LIKE ITS AUTO GENERATED TO DO!!!!
		cardPanel1.setLayout(new CardLayout(0, 0));
		
		/*
		 * Card panel for the buttons
		 */
		cardPanel2 = new JPanel();
		cardPanel2.setFocusable(false);
		cardPanel2.setBounds(1004, 447, 197, 230);
		cardPanel2.setLayout(new CardLayout(0, 0));

		JPanel cp1GroupPanel = new JPanel();
		cp1GroupPanel.setFocusable(false);
		cardPanel1.add(cp1GroupPanel, "name_99260177086740");

		advancePanel = new JPanel();
		advancePanel.setFocusable(false);
		cardPanel2.add(advancePanel, "name_99302267697702");
		
		/*
		 * The introduction to excessive recomp
		 */
		JTextPane txtIntroduction = new JTextPane();
		txtIntroduction.setFocusable(false);
		txtIntroduction.setContentType("text/html");
		txtIntroduction.setText("<html><font face=\"cambria\", size = 4>\r\nThis tutorial series focuses on excessive recomputation in recursion.\r\n<br>\r\n<br>"
				+ "Excessive recomputation highlights an issue with recursion. \r\n<br>Excessive recomputation is when the same calculation is calculated multiple times throughout multiple recursive calls. \r\n<br>"
				+ "This can make basic recursion not very resource efficient, since it will be wasting time and CPU power calculating sums which it should already know the answer to having already did the same calculation before."
				+ "\r\n<br>\r\n<br>\r\n<br>"
				+ "In this tutorial series, the fibonacci algorithm will be used in order to demonstrate how work can be done after a recursive call.\r\n<br>"
				+ "The Fibonacci sequence is a series of numbers where a number is found by adding up the two numbers before it. Starting with 0 and 1, the sequence goes 1, 1, 2, 3, 5, 8, 13, 21, 34, and so forth.\r\n<br>\r\n<br>\r\n<br>"
				+ "The algorithm is as follows:\r\n</font>\r\n</html>\r\n\r\n");


		txtIntroduction.setBackground(UIManager.getColor("Panel.background"));
		txtIntroduction.setEditable(false);
		
		/*
		 * Tells the user to press the advance button to continue
		 */
		JTextPane txtAdvance = new JTextPane();
		txtAdvance.setContentType("text/html");
		txtAdvance.setText("<font face=\"cambria\", size = 4>\r\nNow we are going to move onto how the factorial algorithm works.\r\n<br>\r\n"
				+ "<br>Please click the Advance button to continue.\r\n</font>");
		txtAdvance.setBackground(UIManager.getColor("Panel.background"));
		txtAdvance.setEditable(false);
		
		/*
		 * Fibonacci algorithm
		 */
		JTextPane txtFib = new JTextPane();
		txtFib.setContentType("text/html");
		txtFib.setText("<code>\r\n<br>&nbsp\t<font color = rgb(127,0,85)> <b>public int</b> </font> fib(<font color = rgb(127,0,85)> <b>int </b> </font>n) {\r\n<br>&nbsp\t\t&nbsp "
				+ "<font color = rgb(63,127,95)>//Base case</font>\r\n<br>&nbsp\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b> </font> (n == 0 || n == 1)\r\n<br>&nbsp\t\t  "
				+ "&nbsp&nbsp &nbsp&nbsp <font color = rgb(127,0,85)> <b>return </b> </font>1;\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp <font color = rgb(127,0,85)> <b>else</b> </font>\r\n<br>&nbsp\t\t"
				+ " &nbsp&nbsp&nbsp&nbsp<font color = rgb(63,127,95)> //Recursive call</font>\r\n<br>&nbsp\t\t "
				+ "  &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b> </font> fib(n-1) + fib(n-2);\r\n<br>&nbsp\t}\r\n<br></code>");
		txtFib.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFib.setEditable(false);

		/*
		 * Group layout code
		 */
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtAdvance, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFib, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtIntroduction, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		gl_cp1GroupPanel.setVerticalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(txtIntroduction, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtFib, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtAdvance, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(119, Short.MAX_VALUE))
		);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		
		/*
		 * Advance button
		 */
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(38, 175, 127, 35);

		/*
		 * Advance button listeners
		 */
		btnAdvance.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					//Switches to the example panel with the relevant buttons
					cardPanel1.add(e1);
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
						cardPanel1.add(e1);
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

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Switches to the second example page with the relevant buttons
	 */
	public void switchCards1(){
		cardPanel1.add(e2);
		cardPanel1.remove(e1);
		
		cardPanel2.add(eb2);
		cardPanel2.remove(eb);
	}
	
	/**
	 * Switches to the algorithm page if the parameter input is accepted with the relevant buttons
	 */
	public void switchCards2(){
		
		if(e2.getParameter() < 1 || e2.getParameter() > 11){
		JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
	}

	if(e2.getParameter() > 0 && e2.getParameter() < 11){
		cardPanel1.add(e3);
		cardPanel1.remove(e2);
		
		cardPanel2.add(ab);
		cardPanel2.remove(eb2);
	} 
		

	}
	
	/**
	 * Switches to the Results page with the relevant buttons
	 * 
	 */
	public void switchCards3(){
		cardPanel1.add(e4);
		cardPanel1.remove(e3);
		
		cardPanel2.add(rb);
		cardPanel2.remove(ab);
	}
	
	/**
	 * This method is used to advance the user to the next Tutorial
	 * 
	 * This is called by the ERResultsButton class
	 * It is used to dispose of the current frame and create a new one
	 * The new one is the ExcessiveRecompView which is the work after tutorial
	 * 
	 * @since 1.2
	 */
	public void advanceTut(){
		dispose();
		IWorkAfter iWaModel = new WorkAfter();
		WorkAfterView wav = new WorkAfterView(iWaModel);
		wav.setVisible(true);
		wav.setLocationRelativeTo(null);
		wav.setResizable(false);
		
	}
	
	/**
	 * This method is used to take the user to the main menu
	 * 
	 * This is called by the ERResultsButton class
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
	
	/**
	 * Switches to the memoization tutorial from the results page
	 */
	public void memo(){
				cardPanel1.add(mem);
				cardPanel1.remove(e4);
				cardPanel1.add(mem);
				
				cardPanel2.add(mb);
				cardPanel2.remove(rb);
			
	}
	
	/**
	 * Switches from the first memoization page to the second along with its buttons
	 * 
	 */
	public void memo2(){
		cardPanel1.add(memd);
		cardPanel1.remove(mem);

		cardPanel2.add(amb);
		cardPanel2.remove(mb);
		
	}

}
