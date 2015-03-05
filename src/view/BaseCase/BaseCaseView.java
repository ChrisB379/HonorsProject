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
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import view.BaseCase.AdvanceButtons.NCBCAlgorithmButton;
import view.BaseCase.AdvanceButtons.NCBCExampleButton;
import view.BaseCase.AdvanceButtons.NCBCResultsButton;
import view.BaseCase.AdvanceButtons.NBCAlgorithmButton;
import view.BaseCase.AdvanceButtons.NBCExampleButton;
import view.BaseCase.AdvanceButtons.NBCResultsButton;
import view.ReturnValue.ReturnValueView;
import model.BaseCase;
import model.IBaseCase;
import model.IReturnValue;
import model.ReturnValue;

import java.awt.Font;

import javax.swing.border.LineBorder;

import java.awt.Color;

public class BaseCaseView extends JFrame implements Observer {


	private static final long serialVersionUID = 4604408229700198517L;
	private JPanel contentPane;
	private JPanel cardPanel1,cardPanel2;
	private JPanel advancePanel;

	private JButton btnAdvance,btnMenu;
	
	private IBaseCase model;
	
	private NBCExampleButton NBeb;
	private NBCAlgorithmButton NBab;
	private NBCResultsButton NBrb;
	private NCBCExampleButton Ceb;
	private NCBCAlgorithmButton Cab;
	private NCBCResultsButton Crb;
	
	
	private NoBaseCaseExample bc1;
	private NoBaseCaseAlgorithm bc2;
	private NoBaseCaseResult bc3;
	private NonConvergenceExample bc4;
	private NonConvergenceAlgorithm bc5;
	private NonConvergenceResult bc6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IBaseCase iModel = new BaseCase();
					BaseCaseView frame = new BaseCaseView(iModel);
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
	public BaseCaseView(IBaseCase m) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/images/green-flame-FrameIcon.png")));
		model = m;
		
		bc1 = new NoBaseCaseExample(model);
		
		NBab = new NBCAlgorithmButton(this);
		bc2 = new NoBaseCaseAlgorithm(model,NBab);
		
		bc3 = new NoBaseCaseResult(model);
		bc4 = new NonConvergenceExample(model);
		
		Cab = new NCBCAlgorithmButton(this);
		bc5 = new NonConvergenceAlgorithm(model,Cab);
		
		bc6 = new NonConvergenceResult(model);
		
		NBeb = new NBCExampleButton(model,this,bc1);

		NBrb = new NBCResultsButton(this);
		Ceb = new NCBCExampleButton(this);
		Crb = new NCBCResultsButton(this);
		
		
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
				a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mnAbout.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		cardPanel1 = new JPanel();
		cardPanel1.setFocusable(false);
		cardPanel1.setBounds(15, 16, 1047, 730);
		//This line can prevent cards from switching. Make sure it's at the top
		cardPanel1.setLayout(new CardLayout(0, 0));

		cardPanel2 = new JPanel();
		cardPanel2.setFocusable(false);
		cardPanel2.setBounds(1080, 560, 145, 153);
		cardPanel2.setLayout(new CardLayout(0, 0));


		JPanel cp1GroupPanel = new JPanel();
		cp1GroupPanel.setFocusable(false);
		cardPanel1.add(cp1GroupPanel, "name_60102974363843");


		advancePanel = new JPanel();
		advancePanel.setFocusable(false);
		cardPanel2.add(advancePanel, "name_60155849133626");

		btnMenu = new JButton("Main Menu");
		btnMenu.setBounds(10, 24, 127, 35);
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
		btnAdvance.setBounds(10, 106, 127, 35);
		//Changing the cards to advance to the next screen
		btnAdvance.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					cardPanel1.add(bc1);
					cardPanel1.remove(cp1GroupPanel);
					
					cardPanel2.add(NBeb);
					cardPanel2.remove(advancePanel);
					
			} 
		});
		advancePanel.setLayout(null);
		advancePanel.add(btnMenu);
		advancePanel.add(btnAdvance);
		contentPane.setLayout(null);
		cp1GroupPanel.setLayout(null);
		
		JTextPane txtAdvance = new JTextPane();
		txtAdvance.setContentType("text/html");
		txtAdvance.setText("<font face=\"cambria\", size = 4>\r\nNow we are going to move onto how the noBaseCase algorithm works.\r\n<br>\r\n<br>Please click the Advance button to continue.");
		txtAdvance.setEditable(false);
		txtAdvance.setBounds(20, 560, 487, 78);
		cp1GroupPanel.add(txtAdvance);




		JTextPane txtrThisTutorialSeries = new JTextPane();
		txtrThisTutorialSeries.setBounds(10, 11, 1016, 240);
		txtrThisTutorialSeries.setFocusable(false);
		txtrThisTutorialSeries.setContentType("text/html");
		txtrThisTutorialSeries.setText("<html><font face=\"cambria\", size = 4>\r\n<br>This tutorial series focuses on base case in recursive calls. \r\n<br>\r\n<br>The base case of a recursive call returns a value without making any subsequent recursive calls. The base case is important in recursive calls as it prevents a recursive statement falling into an infinite loop before failing due to a stack overflow.\r\n<br>\r\n<br>\r\n<br>In this tutorial series,some simple algorithms will be used in order to demonstrate how the base case of a recursive call is used. Two algorithms will be used in order to demonstrate to different important features of base cases which recursive calls must adhere to.\r\n<br>\r\n<br>\r\n<br>The algorithms are as follows:\r\n</font>\r\n</html>");

		txtrThisTutorialSeries.setBackground(UIManager.getColor("Panel.background"));
		txtrThisTutorialSeries.setEditable(false);
		cp1GroupPanel.add(txtrThisTutorialSeries);
		
		JTextPane txtAlgorithms = new JTextPane();
		txtAlgorithms.setContentType("text/html");
		txtAlgorithms.setText("<code>\r\n<br>&nbsp\t<font color = rgb(127,0,85)> <b>public int</b> </font> noBaseCase(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> noBaseCase(n-1) + n;\r\n<br>&nbsp\t}\r\n<br> </code><font face=\"cambria\", size = 4>\r\n<br>The second algorithm :\t</font>\r\n<br> <code>\r\n<br>&nbsp\t<font color = rgb(127,0,85)> <b>public int</b> </font> nonConvergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>&nbsp\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>&nbsp\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>&nbsp\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>&nbsp\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> nonConvergence(n+1) + 2*n;\r\n<br>&nbsp\t}\r\n<br> </code>");
		txtAlgorithms.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtAlgorithms.setEditable(false);
		txtAlgorithms.setBounds(20, 262, 322, 287);
		cp1GroupPanel.add(txtAlgorithms);
		contentPane.add(cardPanel1);
		contentPane.add(cardPanel2);
	
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	public void switchCards1(){
		//Handles parameters that are not within the specified bound
		if(bc1.getParameter() < 1 || bc1.getParameter() > 5){
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5");	
		}

		if(bc1.getParameter() > 0 && bc1.getParameter() < 6){
			//				System.out.println("we got here " + count);
			cardPanel1.add(bc2);
			cardPanel1.remove(bc1);
			
			cardPanel2.add(NBab);
			cardPanel2.remove(NBeb);
		}
	}
	
	public void switchCards2(){
		cardPanel1.add(bc3);
		cardPanel1.remove(bc2);
		
		cardPanel2.add(NBrb);
		cardPanel2.remove(NBab);
	}
	
	public void switchCards3(){
		cardPanel1.add(bc4);
		cardPanel1.remove(bc3);
		
		
		cardPanel2.add(Ceb);
		cardPanel2.remove(NBrb);
	}
	
	public void switchCards4(){
		cardPanel1.add(bc5);
		cardPanel1.remove(bc4);
		
		cardPanel2.add(Cab);
		cardPanel2.remove(Ceb);
	}
	
	public void switchCards5(){
		cardPanel1.add(bc6);
		cardPanel1.remove(bc5);
		
		cardPanel2.add(Crb);
		cardPanel2.remove(Cab);
	}
	
	
	/**
	 * This method is used to advance the user to the next Tutorial
	 * 
	 * This is called by the BCResultsButton class
	 * It is used to dispose of the current frame and create a new one
	 * The new one is the ExcessiveRecompView which is tutorial 3
	 * 
	 * @since 1.2
	 */
	public void advanceTut(){
		dispose();
		IReturnValue iRModel = new ReturnValue();
		ReturnValueView rvv = new ReturnValueView(iRModel);
		rvv.setVisible(true);
		rvv.setLocationRelativeTo(null);
		rvv.setResizable(false);

	}

	/**
	 * This method is used to take the user to the main menu
	 * 
	 * This is called by the BCResultsButton class
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


