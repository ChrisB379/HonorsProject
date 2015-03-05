package view.ReturnValue;

/**
 * The first GUI for the return value example which will use the factorial algorithm.
 * Return value is described, why it is important, how it is calculated etc.
 * A parameter integer can be entered to be used in the next GUI screen.
 * 
 * @author Christopher Baillie
 * @version 1.2
 * @since 1.0
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.About;
import view.MainMenu;
import view.ExcessiveRecomputation.ExcessiveRecompView;
import view.ReturnValue.AdvanceButtons.Algorithm2Button;
import view.ReturnValue.AdvanceButtons.AlgorithmButton;
import view.ReturnValue.AdvanceButtons.ExampleButton;
import view.ReturnValue.AdvanceButtons.ResultsButton;

import model.ExcessiveRecomp;
import model.IExcessiveRecomp;
import model.IReturnValue;
import model.ReturnValue;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class ReturnValueView extends JFrame implements Observer {


	private static final long serialVersionUID = 7660595269788434327L;
	private JPanel contentPane;
	private JPanel cardPanel1,cardPanel2;
	private JPanel advancePanel;

	private JButton btnAdvance,btnMenu;

	private ExampleButton eb;
	private AlgorithmButton ab;
	private Algorithm2Button ab2;
	private ResultsButton rb;

	private ReturnValueExample r1;
	private ReturnValueAlgorithm r2;
	private ReturnValueAlgorithm2 r3;
	private ReturnValueResults r4;

	private IReturnValue model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IReturnValue model = new ReturnValue();
					ReturnValueView frame = new ReturnValueView(model);
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
	public ReturnValueView(IReturnValue r) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ReturnValueView.class.getResource("/images/rsz_green-flame-th.png")));

		model = r;

		r1 = new ReturnValueExample(model);

		eb = new ExampleButton(this,model,r1);
		ab2 = new Algorithm2Button(this);
		r3 = new ReturnValueAlgorithm2(model,ab2);
		ab = new AlgorithmButton(this,r3);

		rb = new ResultsButton(this);


		r2 = new ReturnValueAlgorithm(model,ab);

		r4 = new ReturnValueResults(model);


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
				a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mnAbout.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		cardPanel1 = new JPanel();
		cardPanel1.setBounds(36, 16, 871, 726);
		cardPanel1.setBorder(null);

		cardPanel2 = new JPanel();
		cardPanel2.setFocusable(false);
		cardPanel2.setBounds(939, 539, 242, 152);

		JPanel cp1GroupPanel = new JPanel();
		cp1GroupPanel.setFocusable(false);
		cardPanel2.setLayout(new CardLayout(0, 0));

		advancePanel = new JPanel();
		advancePanel.setFocusable(false);
		cardPanel2.add(advancePanel, "name_12410711717075");

		btnMenu = new JButton("Main Menu");
		btnMenu.setBounds(55, 11, 127, 35);
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

		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(55, 85, 127, 35);



		//Changing the cards to advance to the next screen
		btnAdvance.addActionListener(new ActionListener() {
			//int count = 0;
			//			ReturnValueExample r = new ReturnValueExample(model);
			//			ReturnValueParameterController rvpController = new ReturnValueParameterController(model, r);
			//			ReturnValueAlgorithm r2 = new ReturnValueAlgorithm(model);
			//			ReturnValueAlgorithmController rvac = new ReturnValueAlgorithmController(model,r2);
			//			ReturnValueAlgorithm2 r3 = new ReturnValueAlgorithm2();
			//			ReturnValueResults r4 = new ReturnValueResults();

			//ExampleButton eb = new ExampleButton(test);
			//Used for error control
			//boolean flag;
			public void actionPerformed(ActionEvent e) {
				//				btnAdvance.addActionListener(rvpController);
				//				btnAdvance.addActionListener(rvac);




				//				if(count == 0){
				//							System.out.println(count);
				cardPanel1.add(r1);
				cardPanel1.remove(cp1GroupPanel);

				cardPanel2.add(eb);
				cardPanel2.remove(advancePanel);

				//					cardPanel2.
				//						cardPanel2.remove(cp2GroupPanel);
				//						cardPanel3.remove(advancePanel);
				//						advancePanel.setVisible(false); 
				//					flag = true;
				//				}
				//
				//				//Handles parameters that are not within the specified bound
				//				if(count == 1 && r.getParameter() < 1 || r.getParameter() > 11){
				//					flag = false;
				//					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
				//				}
				//				
				//				
				//				if(count == 1 && r.getParameter() > 0 && r.getParameter() < 11){
				//					flag = true;
				//					cardPanel1.add(r2);
				//					cardPanel1.remove(r);
				//				} 
				//
				//
				//				if(count == 2){
				//					if(model.getParam() != 0)
				//						flag = false;
				//					else{
				//					cardPanel1.add(r3);
				//					cardPanel1.remove(r2);
				//					flag = true; }
				//				}
				//
				//				if(count == 3){
				//					cardPanel1.add(r4);
				//					cardPanel1.remove(r3);
				//					btnAdvance.setText("Tutorial 3");
				//					btnMenu.setVisible(true);
				//					flag = true;
				//				}
				//
				//				if(count == 4){
				//					dispose();
				//					ExcessiveRecompView erv = new ExcessiveRecompView();
				//					erv.setVisible(true);
				//					erv.setLocationRelativeTo(null);
				//					flag = true;
				//				}
				//
				//				if(flag)
				//					count++;
				//						System.out.println("count after increment is " + count);
			} 
		});
		advancePanel.setLayout(null);
		advancePanel.add(btnMenu);
		advancePanel.add(btnAdvance);
		contentPane.setLayout(null);
		cardPanel1.setLayout(new CardLayout());


		cp1GroupPanel.setBorder(null);
		cardPanel1.add(cp1GroupPanel, "name_455689991325878");
		cp1GroupPanel.setLayout(null);
		
		JTextPane txtAdvance = new JTextPane();
		txtAdvance.setContentType("text/html");
		txtAdvance.setBackground(UIManager.getColor("Panel.background"));
		txtAdvance.setEditable(false);
		txtAdvance.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtAdvance.setText("<font face=\"cambria\", size = 4>\r\nNow we are going to move onto how the factorial algorithm works.\r\n<br>\r\n<br>Please click the Advance button to continue.\r\n</font>");
		txtAdvance.setBounds(10, 475, 449, 61);
		cp1GroupPanel.add(txtAdvance);


		JTextPane txtrIntroduction = new JTextPane();
		txtrIntroduction.setBounds(10, 11, 839, 282);
		txtrIntroduction.setFocusable(false);
		txtrIntroduction.setContentType("text/html");
		txtrIntroduction.setEditable(false);
		txtrIntroduction.setBackground(UIManager.getColor("Panel.background"));
		txtrIntroduction.setText("<html><font face=\"cambria\", size = 4>\r\nThis tutorial series focuses on return values in recursive calls. A method returns to the code that invoked it when it completes all the statements in the method, reaches a return statement, or when it throws an exception.\r\n<br>\r\n<br>The return value of a recursive call is the result of a recursive call after all the statements in the method have been reached which is usually a return statement which itself is a recursive call.\r\n<br>\r\n<br>The final return value however, is returned once the base case is met(as described in the previous tutorial) and thus a different return statement is met which does not continue the recursive calls.\r\n<br>\r\n<br>In this tutorial series, the factorial algorithm will be used in order to demonstrate how the final return value of a recursive call is calculated.\r\n<br>\r\n<br>Factorial is the product of an integer and all the integers below it; e.g. factorial four ( 4! ) is equal to 24.\r\n<br>\r\n<br>The Factorial algorithm is as follows:\r\n</font>\r\n</html>");
		cp1GroupPanel.add(txtrIntroduction);
		
		JTextPane txtFact = new JTextPane();
		txtFact.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFact.setEditable(false);
		txtFact.setContentType("text/html");
		txtFact.setText("<font face=\"cambria\", size = 4>\r\n<code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n</font>");
		txtFact.setBounds(20, 304, 211, 130);
		cp1GroupPanel.add(txtFact);
		contentPane.add(cardPanel1);
		contentPane.add(cardPanel2);

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}


	/**
	 * This controls the switching of panels within the card panels
	 * 
	 * This method is called by the ExampleButton class
	 * 
	 * It will proceed to the next page if the conditions are met
	 * 
	 * The if condition is used as a parameter check to ensure it is greater than 0 and less than 11
	 * Otherwise a popup dialogue asks the user to change their input to match the parameters
	 * 
	 * The current panel is removed(returnValueExample) and replaced by the ReturnValueAlgorithm
	 * 
	 * The current advance button is also removed and replaced by the next button which is the AlgorithmButton
	 * 
	 * @since 1.2
	 */
	public void switchCards1(){

		if(r1.getParameter() < 1 || r1.getParameter() > 11){
			JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");	
		}

		if (r1.getParameter() > 0 && r1.getParameter() < 11){

			cardPanel1.add(r2);
			cardPanel1.remove(r1);

			cardPanel2.add(ab);
			cardPanel2.remove(eb);
		}
	}


	/**
	 * This controls the switching of panels within the card panels
	 * 
	 * This method is called by the AlgorithmButton class
	 * 
	 * It removes the current panel(ReturnValueAlgorith) and replaces it with ReturnValueAlgorithm2
	 * 
	 * The current advance button is also removed and replaced by the next button which is the Algorithm2Button
	 * 
	 * @since 1.2
	 */
	public void switchCards2(){

		cardPanel1.add(r3);
		cardPanel1.remove(r2);

		cardPanel2.add(ab2);
		cardPanel2.remove(ab);


	}

	/**
	 * This controls the switching of panels within the card panels
	 * 
	 * This method is called by the Algorithm2Button class
	 * 
	 * 
	 * It removes the current panel(ReturnValueAlgorith2) and replaces it with ReturnValueResults
	 * 
	 * The current advance button is also removed and replaced by the next button which is the ResultsButton
	 * 
	 * @since 1.2
	 */
	public void switchCards3(){

		cardPanel1.add(r4);
		cardPanel1.remove(r3);

		cardPanel2.add(rb);
		cardPanel2.remove(ab2);
		btnMenu.setVisible(true);

	}

	/**
	 * This method is used to advance the user to the next Tutorial
	 * 
	 * This is called by the ResultsButton class
	 * It is used to dispose of the current frame and create a new one
	 * The new one is the ExcessiveRecompView which is tutorial 3
	 * 
	 * @since 1.2
	 */
	public void advanceTut(){
		dispose();
		IExcessiveRecomp iModel = new ExcessiveRecomp();
		ExcessiveRecompView erv = new ExcessiveRecompView(iModel);
		erv.setVisible(true);
		erv.setLocationRelativeTo(null);
		erv.setResizable(false);

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
