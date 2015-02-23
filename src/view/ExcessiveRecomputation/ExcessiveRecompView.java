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

import javax.swing.LayoutStyle.ComponentPlacement;

import model.ExcessiveRecomp;
import model.IExcessiveRecomp;
import model.IWorkAfter;
import model.WorkAfter;

public class ExcessiveRecompView extends JFrame implements Observer {


	private static final long serialVersionUID = -3750604378132419616L;
	private JPanel contentPane;
	private JPanel cardPanel1,cardPanel2;
	private JPanel advancePanel;
	
	
	private JButton btnAdvance,btnMenu;
	private JButton btnMemoization;
	
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
		e4 = new ExcessiveRecompResult();
		
		 mem = new Memoization();
		 memd = new MemoizationDescription();
		
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

		cardPanel1 = new JPanel();
		//This line is what makes a card not switch out. It must be up top. NOT AT THE BOTTOM LIKE ITS AUTO GENERATED TO DO!!!!
		cardPanel1.setLayout(new CardLayout(0, 0));

		cardPanel2 = new JPanel();
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
												.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
												.addGap(83))))
				);
		cardPanel2.setLayout(new CardLayout(0, 0));

		JPanel cp1GroupPanel = new JPanel();
		cardPanel1.add(cp1GroupPanel, "name_99260177086740");

		advancePanel = new JPanel();
		cardPanel2.add(advancePanel, "name_99302267697702");

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

		btnMenu = new JButton("Main Menu");
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

		btnMemoization = new JButton("Memoization");
		//Only want it visible for the last page
		btnMemoization.setVisible(false);
		btnMemoization.addActionListener(new ActionListener() {
			Memoization mem = new Memoization();
			MemoizationDescription memd = new MemoizationDescription();
			int count = 0;
			public void actionPerformed(ActionEvent e) {
				if(count == 0){
					cardPanel1.add(mem);
					cardPanel1.removeAll();
					cardPanel1.add(mem);
					btnMenu.setVisible(false);
					btnAdvance.setVisible(false);
				}

				if(count == 1){
					cardPanel1.add(memd);
					cardPanel1.remove(mem);

					btnMemoization.setVisible(false);
					btnMenu.setVisible(true);
					btnAdvance.setVisible(true);
				}

				count++;
			}
		});



		btnAdvance.addActionListener(new ActionListener() {
//			int count = 0;
//			ExcessiveRecompExample e1 = new ExcessiveRecompExample();
//			ExcessiveRecompExample2 e2 = new ExcessiveRecompExample2();
//			ExcessiveRecompAlgorithm e3 = new ExcessiveRecompAlgorithm();
//			ExcessiveRecompResult e4 = new ExcessiveRecompResult();
//
//			//Used for error control
//			boolean flag;
			public void actionPerformed(ActionEvent e) {


//				if(count == 0){
					//				System.out.println(count);
					cardPanel1.add(e1);
					cardPanel1.remove(cp1GroupPanel);
					
					cardPanel2.add(eb);
					cardPanel2.remove(advancePanel);
					
//					flag = true;
//				}
//				
//				if(count == 1){
//					cardPanel1.add(e2);
//					cardPanel1.remove(e1);
//					flag = true;
//				}
//
//				//Handles parameters that are not within the specified bound
//				if(count == 2 && e2.getParameter() < 1 || e2.getParameter() > 11){
//					flag = false;
//					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
//				}
//
//				if(count == 2 && e2.getParameter() > 0 && e2.getParameter() < 11){
//					//System.out.println("we got here " + count);
//					cardPanel1.add(e3);
//					cardPanel1.remove(e4);
//					flag = true;	
//				} 
//
//
//				if(count == 3){
//					cardPanel1.add(e4);
//					cardPanel1.remove(e3);
//					btnAdvance.setText("Tutorial 4");
//					btnMenu.setVisible(true);
//					btnMemoization.setVisible(true);
//					flag = true;
//				}
//
//				if(count == 4){
//					dispose();
//					IWorkAfter iWaModel = new WorkAfter();
//					WorkAfterView wav = new WorkAfterView(iWaModel);
//					wav.setVisible(true);
//					wav.setLocationRelativeTo(null);
//					flag = true;
//				}
//
//				if(flag)
//					count++;
				//				System.out.println("count after increment is " + count);
			} 
		});





		GroupLayout gl_advancePanel = new GroupLayout(advancePanel);
		gl_advancePanel.setHorizontalGroup(
				gl_advancePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_advancePanel.createSequentialGroup()
						.addGap(38)
						.addGroup(gl_advancePanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnMemoization, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAdvance, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
								.addContainerGap(36, Short.MAX_VALUE))
				);
		gl_advancePanel.setVerticalGroup(
				gl_advancePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_advancePanel.createSequentialGroup()
						.addGap(20)
						.addComponent(btnMemoization, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(45)
						.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
						.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGap(19))
				);
		advancePanel.setLayout(gl_advancePanel);




		contentPane.setLayout(gl_contentPane);

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	public void switchCards1(){
		cardPanel1.add(e2);
		cardPanel1.remove(e1);
		
		cardPanel2.add(eb2);
		cardPanel2.remove(eb);
	}
	
	public void switchCards2(){
		
		if(e2.getParameter() < 1 || e2.getParameter() > 11){
		JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
	}

	if(e2.getParameter() > 0 && e2.getParameter() < 11){
		//System.out.println("we got here " + count);
		cardPanel1.add(e3);
		cardPanel1.remove(e2);
		
		cardPanel2.add(ab);
		cardPanel2.remove(eb2);
	} 
		

	}
	
	public void switchCards3(){
		System.out.println("switchCards3");
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
	}
	
	public void memo(){
				cardPanel1.add(mem);
				cardPanel1.remove(e4);
				cardPanel1.add(mem);
				
				cardPanel2.add(mb);
				cardPanel2.remove(rb);
			
	}
	
	public void memo2(){
		cardPanel1.add(memd);
		cardPanel1.remove(mem);

		cardPanel2.add(amb);
		cardPanel2.remove(mb);
		
	}

}
