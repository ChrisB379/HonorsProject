package view.ExcessiveRecomputation;

/**
 * This is third GUI to excessive recomputation and shows the fibonacci algorithm.
 * This shows how recursion can cause excessive recomputation through the fibonacci algorithm
 * 
 * @author Christopher Baillie
 * @version 2.0
 * @since 1.0
 */


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import model.IExcessiveRecomp;
import controller.ExcessiveRecomputation.ERParameterController;
import view.JTextFieldLimit;
import java.awt.Font;

public class ExcessiveRecompExample2 extends JPanel implements Observer {

	private static final long serialVersionUID = 2871400796171081840L;
	private JTextField txtParameterField;

	private int parameter;
	
	private IExcessiveRecomp model;
	
	private ERParameterController erpc;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompExample2(IExcessiveRecomp m) {
		setOpaque(false);
		setFocusable(false);
		
		model = m;

		//register View as an observer to ExcessiveRecomp model
		((Observable) m).addObserver(this);
		
		erpc = new ERParameterController(model, this);
		
		/*
		 * Description of excessive recomputation with a diagram
		 */
		JTextArea txtExample2 = new JTextArea();
		txtExample2.setOpaque(false);
		txtExample2.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtExample2.setBounds(33, 31, 875, 499);
		txtExample2.setFocusable(false);
		txtExample2.setText("An example of how this causes excessive recomputation:\r\n\r\n                              "
				+ " F(n)\r\n                              /      \\\r\n                       F(n-1)      F(n-2)\r\n                          "
				+ "/   \\               /     \\\r\n                  F(n-2) F(n-3) F(n-3)  F(n-4)\r\n                     /    \\\r\n             "
				+ " F(n-3) F(n-4)\r\n\r\nFor the sake of short hand, F(n) will be short for fib(n). As you can see, when F(n) is calculated it will calculated F(n-1) + F(n-2). "
				+ "Each of these statements then branch out themselves as they are recursively called.\r\n\r\nHowever notice that F(n-3) is called 3 times, F(n-2) and F(n-4) two times. "
				+ "This is excessive recomputation. Once we finish a calculation we shouldn't have to do it again.\r\n\r\nThis can be solved through use of memoization, "
				+ "a technique to store results and then check if a sum has already been done. If it has then it simply takes the result from where it is stored(e.g a list). "
				+ "If it has not been calculated yet then it will be calculated with the result being added to a \"list\" so it isn't calculated again needlessly.\r\n\r\n"
				+ "Next you will be working through your own example of this algorithm. \r\nPlease enter a number between 0 and 11 in the field provided which will be the parameter for your algorithm workAfter(n) .");
		txtExample2.setBackground(UIManager.getColor("Panel.background"));
		txtExample2.setWrapStyleWord(true);
		txtExample2.setLineWrap(true);
		txtExample2.setEditable(false);

		/*
		 * Input field for the parameter
		 */
		txtParameterField = new JTextField();
		txtParameterField.setBounds(33, 536, 45, 20);
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		txtParameterField.addActionListener(erpc);
		txtParameterField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				int n = 0;
				
				if(!txtParameterField.getText().equals(""));{
				n = Integer.parseInt(txtParameterField.getText());
				setParameter(n);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});
		setLayout(null);
		add(txtExample2);
		add(txtParameterField);

	}

	/**
	 * Sets the local parameter to the value of the users chosen parameter
	 * 
	 * @param n integer parameter
	 */
	public void setParameter(int n){
		parameter = n;

	}

	/**
	 * Gets the users parameter
	 * 
	 * @return integer parameter
	 */
	public int getParameter(){
		return parameter;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
