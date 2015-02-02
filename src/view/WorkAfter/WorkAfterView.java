package view.WorkAfter;

/**
 * First GUI for showing work after the recursive call.
 * A parameter can be entered to be used in the next GUI screen.
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.UIManager;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1229, 795);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel cardPanel2 = new JPanel();
		
		JPanel cardPanel1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(cardPanel1, GroupLayout.PREFERRED_SIZE, 888, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
					.addComponent(cardPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cardPanel1, GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
						.addComponent(cardPanel2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
		);
		cardPanel1.setLayout(new CardLayout(0, 0));
		
		JPanel cp1GroupPanel = new JPanel();
		cardPanel1.add(cp1GroupPanel, "name_94405714894092");
		
		JTextArea txtrThisTutorialSeries = new JTextArea();
		txtrThisTutorialSeries.setText("This tutorial series focuses on work being done after a recursive call. \r\n\r\nUnlike the previous tutorials, a recursive call does not need to be the end of a method.\r\nAs the name suggests, work after a recursive call is when there is more code to be executed after a recursive call rather than it meaning the end of a method and being a return statement.\r\n\r\nIn this tutorial series, a custom algorithm will be used in order to demonstrate how work can be done after a recursive call.\r\n\r\n\r\nThe algorithm is as follows:\r\n\r\n\tpublic void workAfter(int n){\r\n\t\tint x = 0;\r\n\t\t\r\n\t\tint[] numbers = new int[n];\r\n\t\t\r\n\t\t//Fills the numbers array from 0 to n and fills each space with the value n\r\n\t\tArrays.fill(numbers, 0, n, n);\r\n\t\t\r\n\t\t//Recursive call\r\n\t\tif(n > 1)\r\n\t\tworkAfter(n-1);\r\n\t\t\r\n\t\t//Base case\r\n\t\tif(n == 1){\r\n\t\tfor(int num : numbers)\r\n\t\t\tx = num + 5;\r\n\t\t\r\n\t\tSystem.out.println(\"Value of x is \" + x);\r\n\t\t\r\n\t\t\r\n\t\t}\r\n\t\t\r\n\t}\r\n\r\nNow we are going to move onto how the factorial algorithm works.\r\n\r\nPlease click the Advance button to continue.");
		txtrThisTutorialSeries.setBackground(UIManager.getColor("Panel.background"));
		txtrThisTutorialSeries.setWrapStyleWord(true);
		txtrThisTutorialSeries.setLineWrap(true);
		txtrThisTutorialSeries.setEditable(false);
		GroupLayout gl_cp1GroupPanel = new GroupLayout(cp1GroupPanel);
		gl_cp1GroupPanel.setHorizontalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrThisTutorialSeries, GroupLayout.PREFERRED_SIZE, 804, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_cp1GroupPanel.setVerticalGroup(
			gl_cp1GroupPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cp1GroupPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrThisTutorialSeries, GroupLayout.PREFERRED_SIZE, 695, Short.MAX_VALUE)
					.addContainerGap())
		);
		cp1GroupPanel.setLayout(gl_cp1GroupPanel);
		cardPanel2.setLayout(new CardLayout(0, 0));
		
		JPanel advancePanel = new JPanel();
		cardPanel2.add(advancePanel, "name_94944655089283");
		
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
				//TODO remove the advance button and change it so that a Main Menu button is added along with a new advance button that will dispose ReturnValueView and load the next tutorial	
				}
				
				
				count++;
//				System.out.println("count after increment is " + count);
			} 
		});
		
		GroupLayout gl_advancePanel = new GroupLayout(advancePanel);
		gl_advancePanel.setHorizontalGroup(
			gl_advancePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_advancePanel.createSequentialGroup()
					.addGap(33)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_advancePanel.setVerticalGroup(
			gl_advancePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_advancePanel.createSequentialGroup()
					.addGap(26)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		advancePanel.setLayout(gl_advancePanel);
		contentPane.setLayout(gl_contentPane);
	}
}
