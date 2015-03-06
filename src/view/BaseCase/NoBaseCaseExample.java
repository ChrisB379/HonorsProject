package view.BaseCase;

/**
 * This is the GUI for the explanation of base cases, in this cause when there is no base case.
 * It explains why its bad and why a base case is required.
 * The user will be able to pick a parameter for the algorithm in the next GUI screen.
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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.JTextFieldLimit;

import javax.swing.JTextPane;

import controller.BaseCase.NoBCParameterController;
import model.IBaseCase;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class NoBaseCaseExample extends JPanel implements Observer {

	private static final long serialVersionUID = -62914920035463994L;
	private JTextField txtParameterField;
	private int parameter;
	
	private IBaseCase model;
	
	private NoBCParameterController nbcpController;

	/**
	 * Create the panel.
	 */
	public NoBaseCaseExample(IBaseCase m) {
		setFocusable(false);
		
		model = m;
		
		//register View as an observer to BaseCase model
		((Observable) m).addObserver(this);
		
		nbcpController = new NoBCParameterController(model, this);

		JTextPane txtExample1 = new JTextPane();
		txtExample1.setContentType("text/html");
		txtExample1.setText("<html> <font face=\"cambria\", size = 4>\r\nThe first of the two algorithms on base case we are going to look at is the noBaseCase method. As the name suggests, this is a simple recursive call which has no base case.\r\n<br>\r\n<br>The implications of not having a base case are that the recursive call will never stop and will instead go into an infinite loop until a stack overflow occurs causing a crash or failure.\r\n<br>\r\n<br>The algorithm for this example is as follows:\r\n</font>\r\n</html>");

		txtExample1.setBackground(UIManager.getColor("Panel.background"));
		txtExample1.setEditable(false);
		
		/*
		 * The input field for the parameter
		 */
		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		txtParameterField.addActionListener(nbcpController);
		txtParameterField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				int n = 0;
				
				if(!txtParameterField.getText().equals(""));{
				n = Integer.parseInt(txtParameterField.getText());
				setParameter(n);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {}
		});
		
		JTextPane txtrpublicIntNobasecaseint = new JTextPane();
		txtrpublicIntNobasecaseint.setContentType("text/html");
		txtrpublicIntNobasecaseint.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtrpublicIntNobasecaseint.setEditable(false);
		txtrpublicIntNobasecaseint.setText("<code>\r\n&nbsp\t<font color = rgb(127,0,85)> <b>public int</b> </font> noBaseCase(<font color = rgb(127,0,85)><b>int </b> </font> n) {\r\n<br>\t\t\r\n<br>&nbsp\t\t&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> noBaseCase(n-1) + n;\r\n<br>&nbsp\t}\r\n<br> </code>");
		
		JTextPane txtHowItWorks = new JTextPane();
		txtHowItWorks.setContentType("text/html");
		txtHowItWorks.setText("<font face=\"cambria\", size = 4>\r\nHow it works:\r\n<br>This is an extremely simple method and thus not much explanation is needed due to there only being one line of code.\r\n<br>\r\n<br>Step 1: There is only one line of code to be executed which is the recursive call. Thus no work is done, the return statement simply recursively calls itself.\r\n<br>\r\n<br>Step 2: This repeats until a stack overflow occurs.\r\n<br>\r\n<br>Next you will be working through your own example of this algorithm. Please enter a number between 0 and 6 in the field provided which will be the parameter for your algorithm. noBaseCase(n).\r\n</font>");
		txtHowItWorks.setBackground(UIManager.getColor("OptionPane.background"));
		txtHowItWorks.setEditable(false);
		
		/*
		 * Code for setting up the grou layout
		 */
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtHowItWorks, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(txtrpublicIntNobasecaseint, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtExample1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)))
							.addContainerGap(58, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(txtExample1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtrpublicIntNobasecaseint, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtHowItWorks, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(259, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	/**
	 * Sets the users chosen parameter
	 * 
	 * @param n integer which is the users parameter
	 */
	public void setParameter(int n){
		parameter = n;

	}
	
	/**
	 * Gets the users parameter
	 * 
	 * @return the integer parameter
	 */
	public int getParameter(){
		return parameter;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
