package view.ExcessiveRecomputation;

/**
 * This GUI will show and explain how the fibonacci algorithm works
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ExcessiveRecompExample extends JPanel {

	private static final long serialVersionUID = 3170105316737825613L;

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompExample() {
		setFocusable(false);
		setLayout(null);

		/*
		 * Just a single line to say this is the algorithm
		 */
		JTextPane txtIntroduction = new JTextPane();
		txtIntroduction.setBounds(19, 30, 194, 52);
		txtIntroduction.setFocusable(false);
		txtIntroduction.setContentType("text/html");
		txtIntroduction.setText("<html><font face=\"cambria\", size = 4>\r\nThe algorithm is as follows: \r\n</font>\r\n</html>\r\n\r\n\r\n");

		txtIntroduction.setEditable(false);
		txtIntroduction.setBackground(UIManager.getColor("Panel.background"));
		add(txtIntroduction);
		
		/*
		 * Explaining how the algorithm works
		 */
		JTextPane txtHowItWorks = new JTextPane();
		txtHowItWorks.setBackground(UIManager.getColor("Panel.background"));
		txtHowItWorks.setContentType("text/html");
		txtHowItWorks.setEditable(false);
		txtHowItWorks.setText("<font face=\"cambria\", size = 4>\r\nHow this algorithm works:\r\n<br>\r\n<br>"
				+ "Step 1:\tThe input parameter n is checked by the base case to see if it is either 0 or 1. \n\t(fibonacci 0 and 1 are both equal to 1)\r\n<br>\r\n<br>"
				+ "Step 2:\tIf the base case is not met then we go to the else statement which will be the recursive call\r\n<br>\r\n<br>"
				+ "Step 3:\tThe recursive call returns fib(n-1) + fib(n-2). These are the two numbers that came before n \n\tand is how n is calculated.\r\n<br>\r\n<br>"
				+ "Step 4:\tThis repeats until the base case is met and 1 is returned.\r\n<br>\r\n<br>"
				+ "Step 5:\tThe final calculation will then take place and return the result of fibonacci(n)\r\n</font>");
		txtHowItWorks.setBounds(19, 315, 846, 248);
		add(txtHowItWorks);
		
		/*
		 * Fibonacci algorithm
		 */
		JTextPane txtFib = new JTextPane();
		txtFib.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFib.setEditable(false);
		txtFib.setContentType("text/html");
		txtFib.setText("<code>\r\n<br>&nbsp\t<font color = rgb(127,0,85)> <b>public int</b> </font> fib(<font color = rgb(127,0,85)> <b>int </b> </font>n) {\r\n<br>&nbsp\t\t&nbsp "
				+ "<font color = rgb(63,127,95)>//Base case</font>\r\n<br>&nbsp\t\t&nbsp "
				+ "<font color = rgb(127,0,85)> <b>if</b> </font> (n == 0 || n == 1)\r\n<br>&nbsp\t\t "
				+ " &nbsp&nbsp &nbsp&nbsp <font color = rgb(127,0,85)> <b>return </b> </font>1;\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp "
				+ "<font color = rgb(127,0,85)> <b>else</b> </font>\r\n<br>&nbsp\t\t &nbsp&nbsp&nbsp&nbsp"
				+ "<font color = rgb(63,127,95)> //Recursive call</font>\r\n<br>&nbsp\t\t  "
				+ " &nbsp&nbsp&nbsp&nbsp <font color = rgb(127,0,85)> <b>return</b> </font> fib(n-1) + fib(n-2);\r\n<br>&nbsp\t}\r\n</code>");
		txtFib.setBounds(19, 93, 271, 184);
		add(txtFib);

	}

}
