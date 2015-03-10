package view.BaseCase;

/**
 * This is the GUI for convergence. It will explain what non-convergence is and how it effects
 * recursion.
 * The user does not enter a parameter, instead it uses the parameter from No Base Case
 * 
 * @author Christopher Baillie
 * @version 2.0
 * @since 1.0
 */


import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JTextPane;

import model.IBaseCase;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class NonConvergenceExample extends JPanel implements Observer {


	private static final long serialVersionUID = -2694986035472196268L;
	private int parameter;
	
	private JTextPane txtExample2;
	
	private IBaseCase model;

	/**
	 * Create the panel.
	 */
	public NonConvergenceExample(IBaseCase m) {
		setOpaque(false);
		setFocusable(false);

		model = m;
		
		//register View as an observer to baseCase model so it can be notified and call update()
		((Observable) m).addObserver(this);
		setLayout(null);
		
		txtExample2 = new JTextPane();
		txtExample2.setOpaque(false);
		txtExample2.setBounds(10, 10, 868, 156);
		txtExample2.setFocusable(false);
		txtExample2.setContentType("text/html");
		txtExample2.setBackground(UIManager.getColor("Panel.background"));
		txtExample2.setEditable(false);
		txtExample2.setText("<html><font face=\"cambria\", size = 4>\r\nThe second of the two algorithms on base case we are going to look at is the convergence method. \r\n<br>\r\n<br>"
				+ "This is an example of how recursive calls  must converge towards the base or face the same problem as a recursive call with no base i.e an infinite loop leading to a stack"
				+ " overflow error and the possibility of the program crashing.\r\n<br>\r\n<br>\r\n<br>"
				+ "The algorithm for this example is as follows:\r\n</font>\r\n</html>");
		add(txtExample2);
		
		/*
		 * The non-convergence algorithm
		 */
		JTextPane txtNonConvergence = new JTextPane();
		txtNonConvergence.setContentType("text/html");
		txtNonConvergence.setText("<code>\r\n&nbsp\t<font color = rgb(127,0,85)> <b>public int</b> </font> nonConvergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>&nbsp\t\t&nbsp <font color = rgb(63,127,95)>//Base case</font>\r\n<br>&nbsp\t\t&nbsp <font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>&nbsp\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>&nbsp\t\t\t&nbsp&nbsp&nbsp&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> nonConvergence(n+1) + 2*n;\r\n<br>&nbsp\t}\r\n<br> </code>");
		txtNonConvergence.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtNonConvergence.setEditable(false);
		txtNonConvergence.setBounds(20, 177, 311, 133);
		add(txtNonConvergence);
		
		/*
		 * An explanation of the algorithm
		 */
		JTextPane txtHowItWorks = new JTextPane();
		txtHowItWorks.setOpaque(false);
		txtHowItWorks.setBackground(UIManager.getColor("Panel.background"));
		txtHowItWorks.setContentType("text/html");
		txtHowItWorks.setText("<font face=\"cambria\", size = 4>\r\nHow it works:\r\n<br>For this example, lets assume the value of n starts at the integer value 4.\r\n<br>\r\n<br>"
				+ "Step 1: The value of n is compared to the integer 1 in the if statement.  As our example uses the value 4 then this statement is not met and thus continues to the next line.\r\n<br>\r\n<br>"
				+ "Step 2: The return statement is a recursive call. However notice that it is calling convergence(n+1) and not convergence(n-1) like it should\r\n<br>\r\n<br>"
				+ "Step 3: Steps 1 and 2 repeat forever in a loop until a crash happens via a stack overflow error. The base case is never met due the value of n increasing and not decreasing.\r\n<br>\r\n<br>"
				+ "Due to the recursive call being convergence(n+1) and thus taking the value of n(originally 4) further away from the base case of 1, the base case will never be met. \r\n<br>"
				+ "While this is a simple fix to ensure that the recursive call converges towards the base case, it is important to remember that not doing so will likely cause your code to break and any program running it to crash."
				+ "\r\n<br>\r\n<br>\r\n<br>"
				+ "Next you will be working through your own example of this algorithm. The number used for the no base case example will be used for your algorithm. convergence(null)\r\n</font>");
		txtHowItWorks.setEditable(false);
		txtHowItWorks.setBounds(21, 326, 841, 387);
		add(txtHowItWorks);

	}

	/**
	 * Sets the parameter to then be used in text displays
	 * 
	 * @param n sets the parameter the user chose
	 */
	public void setParameter(int n){
		parameter = n;

	}
	
	/**
	 * Returns the users chosen parameter for use in text fields to be displayed
	 * 
	 * @return integer parameter
	 */
	public int getParameter(){
		return parameter;
	}

	@Override
	public void update(Observable o, Object arg) {
		setParameter(model.getParam());
		setText();
		
	}
	
	/**
	 * Sets the text field when called from the update method
	 * It must be within the update method in order for the parameters to be set correctly
	 * 
	 * It is in its own method to prevent clutter of the update method
	 * 
	 */
	public void setText(){
		txtExample2.setText("<html>\r\nThe second of the two algorithms on base case we are going to look at is the convergence method. \r\n<br>\r\n<br>"
				+ "This is an example of how recursive calls  must converge towards the base or face the same problem as a recursive call with no base "
				+ "i.e an infinite loop leading to a stack overflow error and the possibility of the program crashing.\r\n<br>\r\n<br>\r\n<br>"
				+ "The algorithm for this example is as follows:\r\n"
				+ "<br>\r\n"
				+ "<br> <code>\r\n"
				+ "<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> nonConvergence(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t&nbsp "
				+ "<font color = rgb(63,127,95)>//Base case</font>\r\n<br>\t\t&nbsp "
				+ "<font color = rgb(127,0,85)> <b>if</b></font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp"
				+ "<font color = rgb(127,0,85)> <b>return</b> </font> 5;\r\n<br>\t\t&nbsp"
				+ "<font color = rgb(127,0,85)> <b>else</b> </font> \r\n<br>\t\t\t&nbsp&nbsp&nbsp&nbsp"
				+ "<font color = rgb(127,0,85)> <b>return</b> </font> nonConvergence(n+1) + 2*n;\r\n<br>\t}\r\n<br> "
				+ "</code>\r\n<br>"
				+ "How it works:\r\n<br>"
				+ "For this example, lets assume the value of n starts at the integer value 4.\r\n<br>\r\n<br>"
				+ "Step 1: The value of n is compared to the integer 1 in the if statement.  As our example uses the value 4 then this statement is not met and thus continues to the next line.\r\n<br>\r\n<br>"
				+ "Step 2: The return statement is a recursive call. However notice that it is calling convergence(n+1) and not convergence(n-1) like it should\r\n<br>\r\n<br>"
				+ "Step 3: Steps 1 and 2 repeat forever in a loop until a crash happens via a stack overflow error. The base case is never met due the value of n increasing and not decreasing.\r\n<br>\r\n<br>"
				+ "Due to the recursive call being convergence(n+1) and thus taking the value of n(originally 4) further away from the base case of 1, the base case will never be met. \r\n<br>"
				+ "While this is a simple fix to ensure that the recursive call converges towards the base case, it is important to remember that not doing so will likely cause your code to break and any program running it to crash.\r\n<br>\r\n<br>\r\n<br>"
				+ "Next you will be working through your own example of this algorithm. The number used for the no base case example will be used for your algorithm. convergence("+ getParameter() +")\r\n</html>");
	}

}
