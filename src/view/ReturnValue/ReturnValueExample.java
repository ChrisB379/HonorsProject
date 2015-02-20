package view.ReturnValue;

/**
 * This GUI will show an example of the factorial algorithm with a work through of how to calculate the final answer.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.JTextFieldLimit;

import javax.swing.JTextPane;

import controller.ReturnValue.RVParameterController;
import model.IReturnValue;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Observable;
import java.util.Observer;

public class ReturnValueExample extends JPanel implements Observer {


	private static final long serialVersionUID = -3578796091219375513L;
	
	private IReturnValue model;
	
	private RVParameterController rvController;

	private int parameter;

	//private JTextField txtParameter;
	
	private JTextField txtParameterField;

	/**
	 * Create the panel.
	 */
	public ReturnValueExample(IReturnValue r) {
		
		//View holds a reference to the ReturnValue model
		model = r;
		
		
		//register View as an observer to ReturnValue model
		((Observable) r).addObserver(this);
		
		//create Controller - eventHandler - with reference to ReturnValue Model
		//and reference to ReturnValueExample View for 'call backs'
		rvController = new RVParameterController(model, this);
		
		
		setBackground(UIManager.getColor("Panel.background"));
		setBorder(null);

		JTextPane txtExample = new JTextPane();
		txtExample.setContentType("text/html");
		txtExample.setBorder(null);
		txtExample.setBackground(UIManager.getColor("Panel.background"));
		txtExample.setText("<html>Once again this is the factorial algorithm:\r\n<br>\r\n<br><code>&nbsp <font color = rgb(127,0,85)> <b>public static</b> </font> int factorial(<font color = rgb(127,0,85)><b>int</b> </font> n) {   \r\n<br>&nbsp <font color = rgb(127,0,85)>&nbsp<b>if</b></font> (n == 1) \r\n<br>&nbsp&nbsp&nbsp <font color = rgb(127,0,85)><b>return</b></font> 1; <br>\r\n<br> &nbsp&nbsp&nbsp<font color = rgb(127,0,85)><b>return</b></font> n * factorial(n-1);\r\n <br>&nbsp } </code> \r\n\r\n<br>\r\n<br>Now lets go through an example of how it works.\r\n<br>For our example, the value of the integer n will be 4. The execution of the method will be as follows.\r\n<br>\r\n<br>Step 1: fact(4);\r\n<br>Step 2:\treturn fact(3) * 4;\r\n<br>Step 3:\treturn fact(2) * 3 * 4;\r\n<br>Step 4:\treturn fact(1) * 2 * 3 * 4;\r\n<br>Step 5:\treturn 1 * 2 * 3 * 4 = return 24;\r\n<br>\r\n<br>Now a short explantion of how we come to this conclusion.\r\n<br>Step 1:  We start with fact(4), the value we pass in as our parameter.\r\n<br>\r\n<br>Step 2:  Our passed in variable 4 is checked with the base case(if n equals 1). This is false so we move onto the next line. \r\n<br>This is our recursive call which will return our current value of n(which is 4) and multiply it by the factorial of n-1(which is 3). \r\n<br>\r\n<br>Step 3: The value of n being passed this time is 3 since the recursive call, calls fact(n-1).\r\n<br>We now repeat what we did in step 2. The value of n being 3 does not match the base case of n == 1. So we move onto the return statement and once again return n*fact(n-1). \r\n<br>The result of which is fact(2)*3 however we must also add the extra multiplication from step 2 so we get return fact(2)*3*4\r\n<br>\r\n<br>Step 4: As with above, the value of n has been decremented by 1 to now be n = 1. Repeating steps 2 and 3 we get fact(1)*2*3*4 since we must keep track of the values of n from previous recursive calls.\r\n<br>\r\n<br>Step 5:  Now that n is the value 1, our base case condition is met which returns 1 and stops the recursive call chain. Now that the recursive call finishes, the full calculation will be done. \r\n<br>From the previous steps we have the final calculation being 1*2*3*4 which results in the value 24 and this is the answer which will be returned from calling fact(4).\r\n\r\n</html>");
		txtExample.setEditable(false);

		JTextPane txtNextPage = new JTextPane();
		txtNextPage.setContentType("text/html");
		txtNextPage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNextPage.setBackground(UIManager.getColor("Panel.background"));
		txtNextPage.setText("<html>Next you will be working through your own example of this algorithm. Please enter a number in the field provided which will be the parameter for your algorithm. factorial(n)\r\n</htm>");
		txtNextPage.setEditable(false);


		txtParameterField = new JTextField();
		//Limits to only 2 digits
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.addActionListener(rvController);
		txtParameterField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				int n = 0;
				if(txtParameterField.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter a valid number for the parameter.");
				
				if(!txtParameterField.getText().equals(""));{
				n = Integer.parseInt(txtParameterField.getText());
				setParameter(n);
				}

			}

			@Override
			public void focusGained(FocusEvent e) {

			}
		});


		//TODO figure out what here is making such a massive gap between the 2 text areas
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtExample, GroupLayout.PREFERRED_SIZE, 841, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtNextPage, GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(63))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtExample, GroupLayout.PREFERRED_SIZE, 683, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNextPage, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
		);
		setLayout(groupLayout);

	}


	public void setParameter(int n){
		parameter = n;

	}

	public int getParameter(){
		return parameter;
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		int p = model.getParam();
		
		
	}


}
