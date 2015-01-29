package view.ReturnValue;

/**
 * The first GUI for the return value example which will use the factorial algorithm.
 * Return value is described, why it is important, how it is calculated etc.
 * A parameter integer can be entered to be used in the next GUI screen.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ReturnValueView extends JFrame {


	private static final long serialVersionUID = 7660595269788434327L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnValueView frame = new ReturnValueView();
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
	public ReturnValueView() {
		setTitle("Tutorial 2: Return Values");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel cardPanel1 = new JPanel();
		cardPanel1.setBorder(null);
		
		JPanel cardPanel3 = new JPanel();
		
		JPanel cp1GroupPanel = new JPanel();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 871, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(cardPanel3, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(cardPanel3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(51))
						.addComponent(cardPanel1, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)))
		);
		cardPanel3.setLayout(new CardLayout(0, 0));
		
		JPanel advancePanel = new JPanel();
		cardPanel3.add(advancePanel, "name_12410711717075");

		JButton btnAdvance = new JButton("Advance");
				//Changing the cards to advance to the next screen
				btnAdvance.addActionListener(new ActionListener() {
					int count = 0;
					ReturnValueViewAlgorithmExample r = new ReturnValueViewAlgorithmExample();
					ReturnValueViewAlgorithm r2 = new ReturnValueViewAlgorithm();
					public void actionPerformed(ActionEvent e) {

						
						if(count == 0){
//							System.out.println(count);
						cardPanel1.add(r);
						cardPanel1.remove(cp1GroupPanel);
//						cardPanel2.remove(cp2GroupPanel);
//						cardPanel3.remove(advancePanel);
//						advancePanel.setVisible(false); 
						 }
						
						if(count == 1){
//						System.out.println("we got here " + count);
						cardPanel1.add(r2);
						cardPanel1.remove(r);
						
						} 
						
						count++;
//						System.out.println("count after increment is " + count);
					} 
				});
				GroupLayout gl_advancePanel = new GroupLayout(advancePanel);
				gl_advancePanel.setHorizontalGroup(
					gl_advancePanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_advancePanel.createSequentialGroup()
							.addGap(59)
							.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(81, Short.MAX_VALUE))
				);
				gl_advancePanel.setVerticalGroup(
					gl_advancePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_advancePanel.createSequentialGroup()
							.addGap(19)
							.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(29, Short.MAX_VALUE))
				);
				advancePanel.setLayout(gl_advancePanel);
		cardPanel1.setLayout(new CardLayout());
		

		cp1GroupPanel.setBorder(null);
		cardPanel1.add(cp1GroupPanel, "name_455689991325878");
		
		
		JTextArea txtrIntroduction = new JTextArea();
		txtrIntroduction.setEditable(false);
		//Setting line wrap so it automatically forms paragraphs rather than 1 big long line of text
		txtrIntroduction.setLineWrap(true);
		txtrIntroduction.setWrapStyleWord(true);
		txtrIntroduction.setBackground(UIManager.getColor("Panel.background"));
		txtrIntroduction.setText("This tutorial series focuses on return values in recursive calls. A method returns to the code that invoked it when it completes all the statements in the method, reaches a return statement, or when it throws an exception.\r\n\r\nThe return value of a recursive call is the result of a recursive call after all the statements in the method have been reached which is usually a return statement which itself is a recursive call.\r\n\r\nThe final return value however, is returned once the base case is met(as described in the previous tutorial) and thus a different return statement is met which does not continue the recursive calls.\r\n\r\nIn this tutorial series, the factorial algorithm will be used in order to demonstrate how the final return value of a recursive call is calculated.\r\n\r\nFactorial is the product of an integer and all the integers below it; e.g. factorial four ( 4! ) is equal to 24.\r\n\r\nThe Factorial algorithm is as follows:\r\n\r\npublic static int factorial(int n) { \r\n   if (n == 1) \r\n\t\treturn 1; \r\n\r\n   return n * factorial(n-1); \r\n} \r\n\r\n\r\nNow we are going to move onto how the factorial algorithm works.\r\n\r\nPlease click the Advance button to continue.");

		
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrIntroduction, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_cp1GroupPanel.setVerticalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrIntroduction, GroupLayout.PREFERRED_SIZE, 663, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		contentPane.setLayout(gl_contentPane);
	}
}
