package view.ReturnValue;

/**
 * This GUI shows an example of the factorial algorithm with a work through of how to calculate the final answer.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import view.JTextFieldLimit;

import javax.swing.JTextPane;

import controller.ReturnValue.RVParameterController;
import model.IReturnValue;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ReturnValueExample extends JPanel implements Observer {


	private static final long serialVersionUID = -3578796091219375513L;
	
	private IReturnValue model;
	
	private RVParameterController rvController;

	private int parameter;
	
	private JTextField txtParameterField;

	/**
	 * Create the panel.
	 */
	public ReturnValueExample(IReturnValue r) {
		setOpaque(false);
		
		//View holds a reference to the ReturnValue model
		model = r;
		
		
		//register View as an observer to ReturnValue model
		((Observable) r).addObserver(this);
		
		//create Controller - eventHandler - with reference to ReturnValue Model
		//and reference to ReturnValueExample View for 'call backs'
		rvController = new RVParameterController(model, this);
		
		
		setBackground(UIManager.getColor("Panel.background"));
		setBorder(null);
		
		/*
		 * Tells the user to go to the next page and describes what to input for the parameter
		 */
		JTextPane txtNextPage = new JTextPane();
		txtNextPage.setOpaque(false);
		txtNextPage.setFocusable(false);
		txtNextPage.setBounds(22, 614, 662, 64);
		txtNextPage.setContentType("text/html");
		txtNextPage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNextPage.setBackground(UIManager.getColor("Panel.background"));
		txtNextPage.setText("<html><font face=\"cambria\", size = 4>\r\nNext you will be working through your own example of this algorithm."
				+ " Please enter a number between 0 and 11 in the field provided which will be the parameter for your algorithm. factorial(n)\r\n</font>\r\n</htm>");
		txtNextPage.setEditable(false);

		/*
		 * Input field for the parameter
		 */
		txtParameterField = new JTextField();
		txtParameterField.setBounds(704, 629, 24, 34);
		//Limits to only 2 digits
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.addActionListener(rvController);
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

			}
		});
		setLayout(null);
		
			/*
			 * Explaining how the algorithm works
			 */
				JTextPane txtExample = new JTextPane();
				txtExample.setOpaque(false);
				txtExample.setLocation(22, 147);
				txtExample.setSize(831, 438);
				txtExample.setFocusable(false);
				txtExample.setContentType("text/html");
				txtExample.setBorder(null);
				txtExample.setBackground(UIManager.getColor("Panel.background"));
				txtExample.setText("<html><font face=\"cambria\", size = 4>\r\nNow lets go through an example of how it works.\r\n<br>"
						+ "For our example, the value of the integer n will be 3. The execution of the method will be as follows.\r\n<br>\r\n<br>"
						+ "Step 1: fact(3);\r\n<br>"
						+ "Step 2:\treturn fact(2) * 3;\r\n<br>"
						+ "Step 3:\treturn fact(1) * 2 * 3;\r\n<br>"
						+ "Step 4:\treturn 1 * 2 * 3  = return 6;\r\n<br>\r\n<br>"
						+ "Now a short explantion of how we come to this conclusion.\r\n<br>"
						+ "Step 1:  We start with fact(3), the value we pass in as our parameter.\r\n<br>\r\n<br>"
						+ "Step 2:  Our passed in variable 3 is checked with the base case(if n equals 1). This is false so we move onto the next line. \r\n<br>"
						+ "This is our recursive call which will return our current value of n(which is 3) and multiply it by the factorial of n-1(which is 2). \r\n<br>\r\n<br>"
						+ "Step 3: The value of n being passed this time is 2 since the recursive call, calls fact(n-1).\r\n<br>We now repeat what we did in step 2. "
						+ "The value of n being 2 does not match the base case of n == 1. So we move onto the return statement and once again return n*fact(n-1). \r\n<br>"
						+ "The result of which is fact(1)*2 however we must also add the extra multiplication from step 2 so we get return fact(1)*2*3\r\n<br>\r\n<br>"
						+ "Step 4:  Now that n is the value 1, our base case condition is met which returns 1 and stops the recursive call chain. "
						+ "Now that the recursive call finishes, the full calculation will be done. \r\n<br>From the previous steps we have the final calculation being 1*2*3 which "
						+ "results in the value 6 and this is the answer which will be returned from calling fact(3).\r\n</font>\r\n</html>");
				txtExample.setEditable(false);
				
				/*
				 * Factorial algorithm
				 */
				JTextPane txtFactorial = new JTextPane();
				txtFactorial.setOpaque(false);
				txtFactorial.setBorder(new LineBorder(new Color(0, 0, 0)));
				txtFactorial.setSize(300, 127);
				txtFactorial.setLocation(22, 11);
				txtFactorial.setContentType("text/html");
				txtFactorial.setText("<font face=\"cambria\", size = 4>\r\n<code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> "
						+ "int fact(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp "
						+ "<font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * fact(n-1);\r\n <br>&nbsp } </code> \r\n\r\n</font>");
				txtFactorial.setEditable(false);
				
		add(txtExample);
		add(txtFactorial);
		add(txtNextPage);
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
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

		
	}


}
