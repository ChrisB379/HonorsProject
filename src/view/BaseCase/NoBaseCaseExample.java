package view.BaseCase;

/**
 * This is the GUI for the explanation of base cases, in this cause when there is no base case.
 * It will explain why its bad and why a base case is required.
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

import javax.swing.JOptionPane;
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
		
		model = m;
		
		//register View as an observer to ReturnValue model
		((Observable) m).addObserver(this);
		
		nbcpController = new NoBCParameterController(model, this);

		JTextPane txtExample1 = new JTextPane();
		txtExample1.setContentType("text/html");
		txtExample1.setText("<html>"
				+ "\r\n<br>The first of the two algorithms on base case we are going to look at is the noBaseCase method. As the name suggests, this is a simple recursive call which has no base case."
				+ "\r\n<br>\r\n<br>The implications of not having a base case are that the recursive call will never stop and will instead go into an infinite loop until a stack overflow occurs causing a crash or failure."
				+ "\r\n<br>\r\n<br>The algorithm for this example is as follows:"
				+ "\r\n<br>\r\n<br> <code>\r\n<br>\t<font color = rgb(127,0,85)> <b>public int</b> </font> noBaseCase(<font color = rgb(127,0,85)><b>int </b> </font> n) {"
				+ "\r\n<br>"
				+ "\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)> <b>return</b> </font> noBaseCase(n-1) + n;"
				+ "\r\n<br>\t}"
				+ "\r\n<br> </code>"
				+ "\r\n<br>\r\n<br>How it works:"
				+ "\r\n<br>This is an extremely simple method and thus not much explanation is needed due to there only being one line of code."
				+ "\r\n<br>"
				+ "\r\n<br>Step 1: There is only one line of code to be executed which is the recursive call. Thus no work is done, the return statement simply recursively calls itself."
				+ "\r\n<br>\r\n<br>Step 2: This repeats until a stack overflow occurs."
				+ "\r\n<br>"
				+ "\r\n<br>Next you will be working through your own example of this algorithm. Please enter a number in the field provided which will be the parameter for your algorithm. noBaseCase(n)."
				+ "\r\n</html>");

		txtExample1.setBackground(UIManager.getColor("Panel.background"));
		txtExample1.setEditable(false);

		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
		txtParameterField.addActionListener(nbcpController);
		txtParameterField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
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
				// TODO Auto-generated method stub

			}
		});

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(23)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtExample1, GroupLayout.PREFERRED_SIZE, 897, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(58, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(26)
						.addComponent(txtExample1, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(232, Short.MAX_VALUE))
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
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
