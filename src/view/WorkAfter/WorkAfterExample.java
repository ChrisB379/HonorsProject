package view.WorkAfter;

/**
 * This GUI will give an example of how the algorithm used works.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JTextField;

import view.JTextFieldLimit;

import javax.swing.JTextPane;

import model.IWorkAfter;
import controller.WorkAfter.WAParameterController;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class WorkAfterExample extends JPanel implements Observer {


	private static final long serialVersionUID = -5040691956374882581L;
	private JTextField txtParameterField;
	
	private IWorkAfter model;
	
	private WAParameterController waController;

	private int parameter;


	public WorkAfterExample(IWorkAfter m) {
		setFocusable(false);
		
		model = m;
		
		//register View as an observer to WorkAfter model
		((Observable) m).addObserver(this);
		
		waController = new WAParameterController(model, this);

		JTextPane txtExample = new JTextPane();
		txtExample.setBounds(21, 7, 395, 43);
		txtExample.setFont(new Font("Calibri", Font.PLAIN, 11));
		txtExample.setContentType("text/html");
		txtExample.setText("<html><font face=\"cambria\", size = 4>\r\nThe algorithm is as follows: \r\n</font>\r\n</html>");


		txtExample.setBackground(UIManager.getColor("Panel.background"));
		txtExample.setEditable(false);

		txtParameterField = new JTextField();
		txtParameterField.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtParameterField.setBounds(21, 519, 44, 20);
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		txtParameterField.addActionListener(waController);
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
		
		JTextPane txtWorkAfter = new JTextPane();
		txtWorkAfter.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtWorkAfter.setContentType("text/html");
		txtWorkAfter.setText("<code> \r\n&nbsp\t<font color = rgb(127,0,85)><b>public void</b></font> workAfter(<font color = rgb(127,0,85)><b>int</b> </font> n){\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)\r\n<br>&nbsp\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>Base case statement, showing the value of n is</font> \" + n);\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)><b>else</b> </font>\r\n<br>&nbsp\t\t\t&nbsp&nbsp workAfter(n-1);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>After the recursive call, showing the result of n*2 is</font> \" + n*2);\r\n<br>\t\t\t\r\n<br>&nbsp\t}\r\n</code> ");
		txtWorkAfter.setEditable(false);
		txtWorkAfter.setBounds(21, 61, 650, 211);
		add(txtWorkAfter);
		add(txtParameterField);
		add(txtExample);
		
		JTextPane txtHowItWorks = new JTextPane();
		txtHowItWorks.setBackground(UIManager.getColor("Panel.background"));
		txtHowItWorks.setEditable(false);
		txtHowItWorks.setContentType("text/html");
		txtHowItWorks.setText("<html><font face=\"cambria\", size = 4>\r\nHow this algorithm works:\r\n<br>\r\n<br>Step 1:\tThe parameter is checked by the base case\r\n<br>Step 2:\tIf the base case is not met then we go to the else statement; the recursive call\r\n<br>Step 3:\tRecursively this method is called until the base is met\r\n<br>Step 4:\tOnce this happens the print statement in the base case is printed\r\n<br>Step 5:\tThen the work after the recursive call is done and the final print statement is printed showing n*2 for each recursive call\r\n<br>\r\n<br>Next you will be working through your own example of this algorithm. \r\n<br>Please enter a number between 0 and 11 in the field provided which will be the parameter for your algorithm workAfter(n) .\r\n</font>\r\n</html>");
		txtHowItWorks.setBounds(21, 297, 810, 211);
		add(txtHowItWorks);

	}

	public void setParameter(int n){
		parameter = n;

	}

	public int getParameter(){
		return parameter;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
