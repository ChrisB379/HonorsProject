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
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class BaseCaseView extends JFrame {


	private static final long serialVersionUID = 4604408229700198517L;
	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 802);
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
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 730, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(649, Short.MAX_VALUE)
					.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(44))
		);

		
		JPanel cp1GroupPanel = new JPanel();
		cardPanel1.add(cp1GroupPanel, "name_60102974363843");

		
		JPanel cp2GroupPanel = new JPanel();
		cardPanel2.add(cp2GroupPanel, "name_60155849133626");
		
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

			public void actionPerformed(ActionEvent e) {

				
				if(count == 0){
				cardPanel1.add(bc1);
				cardPanel1.remove(cp1GroupPanel);

				 }
				
				if(count == 1){
//				System.out.println("we got here " + count);
				cardPanel1.add(bc2);
				cardPanel1.remove(bc1);
				
				} 
				
				if(count == 2){
				cardPanel1.add(bc3);
				cardPanel1.remove(bc2);
					
				}
				
				if(count == 3){
				cardPanel1.add(bc4);
				cardPanel1.remove(bc3);
					
				}
				
				if(count == 4){
				cardPanel1.add(bc5);
				cardPanel1.remove(bc4);
	
				}
				
				if(count == 5){
				cardPanel1.add(bc6);
				cardPanel1.remove(bc5);
				//TODO remove the advance button and change it so that a Main Menu button is added along with a new advance button that will dispose ReturnValueView and load the next tutorial
					
				}
				
				count++;
//				System.out.println("count after increment is " + count);
			} 
		});
		
		
		
		GroupLayout gl_cp2GroupPanel = new GroupLayout(cp2GroupPanel);
		gl_cp2GroupPanel.setHorizontalGroup(
			gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp2GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
					.addGap(20))
		);
		gl_cp2GroupPanel.setVerticalGroup(
			gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp2GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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


