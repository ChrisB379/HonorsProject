package view.ExcessiveRecomputation;

/**
 * This is third GUI to excessive recomputation and will show the fibonacci algorithm.
 * This will show how recursion can cause excessive recomputation through the fibonacci algorithm
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.JTextFieldLimit;

public class ExcessiveRecompExample2 extends JPanel {

	private static final long serialVersionUID = 2871400796171081840L;
	private JTextField txtParameterField;
	
	private int parameter;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompExample2() {
		
		JTextArea txtExample2 = new JTextArea();
		txtExample2.setText("An example of how this causes excessive recomputation:\r\n\r\n                             F(n)\r\n                            /    \\\r\n                        F(n-1)    F(n-2)\r\n                        /   \\      /     \\\r\n                    F(n-2) F(n-3) F(n-3)  F(n-4)\r\n                   /    \\\r\n                 F(n-3) F(n-4)\r\n\r\nFor the sake of short hand, F(n) will be short for fib(n). As you can see, when F(n) is calculated it will calculated F(n-1) + F(n-2). Each of these statements then branch out themselves as they are recursively called.\r\n\r\nHowever notice that F(n-3) is called 3 times, F(n-2) and F(n-4) two times. This is excessive recomputation. Once we finish a calculation we shouldn't have to do it again.\r\n\r\nThis can be solved through use of memoization, a technique to store results and then check if a sum has already been done. If it has then it simply takes the result from where it is stored(e.g a list). If it has not been calculated yet then it will be calculated with the result being added to a \"list\" so it isn't calculated again needlessly.\r\n\r\nNext you will be working through your own example of this algorithm. \r\nPlease enter a number in the field provided which will be the parameter for your algorithm workAfter(n) .");
		txtExample2.setBackground(UIManager.getColor("Panel.background"));
		txtExample2.setWrapStyleWord(true);
		txtExample2.setLineWrap(true);
		txtExample2.setEditable(false);
		
		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		txtParameterField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				int n = Integer.parseInt(txtParameterField.getText());
				setParameter(n);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtExample2, GroupLayout.PREFERRED_SIZE, 776, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(152, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(txtExample2, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(193, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public void setParameter(int n){
		parameter = n;
		 
	}
	
	public int getParameter(){
		return parameter;
	}

}
