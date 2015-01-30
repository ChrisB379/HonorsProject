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

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ExcessiveRecompView extends JFrame {


	private static final long serialVersionUID = -3750604378132419616L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcessiveRecompView frame = new ExcessiveRecompView();
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
	public ExcessiveRecompView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1264, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel cardPanel1 = new JPanel();
		
		JPanel cardPanel2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 938, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cardPanel1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGap(83))))
		);
		cardPanel2.setLayout(new CardLayout(0, 0));
		
		JPanel cp1GroupPanel = new JPanel();
		cardPanel1.add(cp1GroupPanel, "name_99260177086740");
		
		JPanel cp2GroupPanel = new JPanel();
		cardPanel2.add(cp2GroupPanel, "name_99302267697702");
		
		JButton btnAdvance = new JButton("Advance");
		
		btnAdvance.addActionListener(new ActionListener() {
			int count = 0;
			ExcessiveRecompExample e1 = new ExcessiveRecompExample();
			ExcessiveRecompViewAlgorithm e2 = new ExcessiveRecompViewAlgorithm();
			ExcessiveRecompViewResult e3 = new ExcessiveRecompViewResult();
			public void actionPerformed(ActionEvent e) {

				
				if(count == 0){
//				System.out.println(count);
				cardPanel1.add(e1);
				cardPanel1.remove(cp1GroupPanel);

				 }
				
				if(count == 1){
//				System.out.println("we got here " + count);
				cardPanel1.add(e2);
				cardPanel1.remove(e1);
				
				} 
				
				if(count == 2){
				cardPanel1.add(e3);
				cardPanel1.remove(e2);
				//TODO remove the advance button and change it so that a Main Menu button is added along with a new advance button that will dispose ReturnValueView and load the next tutorial	
				}
				
				
				count++;
//				System.out.println("count after increment is " + count);
			} 
		});
		
		GroupLayout gl_cp2GroupPanel = new GroupLayout(cp2GroupPanel);
		gl_cp2GroupPanel.setHorizontalGroup(
			gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_cp2GroupPanel.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
		);
		gl_cp2GroupPanel.setVerticalGroup(
			gl_cp2GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp2GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAdvance, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(19))
		);
		cp2GroupPanel.setLayout(gl_cp2GroupPanel);
		cardPanel1.setLayout(new CardLayout(0, 0));
		
		
		JTextArea txtrThisTutorialSeries = new JTextArea();
		txtrThisTutorialSeries.setText("This tutorial series focuses on excessive recomputation in recursion.\r\n\r\nExcessive recomputation highlights an issue with recursion. \r\nExcessive recomputation is when the same calculation is calculated multiple times throughout multiple recursive calls. \r\nThis can make basic recursion not very resource efficient, since it will be wasting time and CPU power calculating sums which it should already know the answer to having already did the same calculation before.\r\n\r\n\r\nIn this tutorial series, the fibonacci algorithm will be used in order to demonstrate how work can be done after a recursive call.\r\n\r\n\r\nThe algorithm is as follows:\r\n\r\n\tpublic int fib(int n) {\r\n\t\t//Base case\r\n\t\tif (n == 0 || n == 1)\r\n\t\t\treturn 1;\r\n\t\t\r\n\t\telse\r\n\t\t\t//Recursive call\r\n\t\t\treturn fib(n-1) + fib(n-2);\r\n\t}\r\n\r\nNow we are going to move onto how the factorial algorithm works.\r\n\r\nPlease click the Advance button to continue.");
		txtrThisTutorialSeries.setWrapStyleWord(true);
		txtrThisTutorialSeries.setLineWrap(true);
		txtrThisTutorialSeries.setBackground(UIManager.getColor("Panel.background"));
		txtrThisTutorialSeries.setEditable(false);
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(txtrThisTutorialSeries, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(116, Short.MAX_VALUE))
		);
		gl_cp1GroupPanel.setVerticalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(txtrThisTutorialSeries, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		contentPane.setLayout(gl_contentPane);
	}

}
