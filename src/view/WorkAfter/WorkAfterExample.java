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

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JTextField;

import view.JTextFieldLimit;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

import model.IReturnValue;
import model.IWorkAfter;
import controller.ReturnValue.RVParameterController;
import controller.WorkAfter.WAParameterController;

public class WorkAfterExample extends JPanel implements Observer {


	private static final long serialVersionUID = -5040691956374882581L;
	private JTextField txtParameterField;
	
	private IWorkAfter model;
	
	private WAParameterController waController;

	private int parameter;


	public WorkAfterExample(IWorkAfter m) {
		
		model = m;
		
		//register View as an observer to WorkAfter model
		((Observable) m).addObserver(this);
		
		waController = new WAParameterController(model, this);

		JTextPane txtExample = new JTextPane();
		txtExample.setContentType("text/html");
		txtExample.setText("<html>\r\n<br>The algorithm is as follows: \r\n<br>\r\n<br><code> \r\n<br>\t<font color = rgb(127,0,85)><b>public void</b></font> workAfter(<font color = rgb(127,0,85)><b>int</b> </font> n){\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>Base case statement</font> \" + n);\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>else</b> </font>\r\n<br>\t\t\t&nbsp&nbsp workAfter(n-1);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>After the recursive call</font> \" + n*2);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>\t}\r\n<br></code> \r\n<br>\r\n<br>How this algorithm works:\r\n<br>\r\n<br>Step 1:\tThe parameter is checked by the base case\r\n<br>Step 2:\tIf the base case is not met then we go to the else statement; the recursive call\r\n<br>Step 3:\tRecursively this method is called until the base is met\r\n<br>Step 4:\tOnce this happens the print statement in the base case is printed\r\n<br>Step 5:\tThen the work after the recursive call is done and the final print statement is printed showing n*2 for each recursive call\r\n<br>\r\n<br>Next you will be working through your own example of this algorithm. \r\n<br>Please enter a number in the field provided which will be the parameter for your algorithm workAfter(n) .\r\n</html>");


		txtExample.setBackground(UIManager.getColor("Panel.background"));
		txtExample.setEditable(false);

		txtParameterField = new JTextField();
		txtParameterField.setDocument(new JTextFieldLimit(2));
		txtParameterField.setColumns(10);
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
				// TODO Auto-generated method stub

			}
		});

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(21)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtExample, GroupLayout.PREFERRED_SIZE, 797, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(76, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtExample, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtParameterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(314, Short.MAX_VALUE))
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
