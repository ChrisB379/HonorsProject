package view.ReturnValue;

/**
 * The results of the users example work through.
 * The correct answer and users answer is displayed.
 * An incorrect answer shows an explation of how the correct answer was found.
 * There is a summary of the return value topic and all that was covered.
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.IReturnValue;

public class ReturnValueResults extends JPanel implements Observer {

	private static final long serialVersionUID = 8198343565299698957L;
	
	private IReturnValue model;
	
	private JTextArea txtResults;
	private JTextArea txtSummary;

	/**
	 * Create the panel.
	 */
	public ReturnValueResults(IReturnValue r) {
		
		model = r;
		
		((Observable) r).addObserver(this);

		JLabel lblResults = new JLabel("Results");

		txtResults = new JTextArea();
		txtResults.setText("The results from the previous two pages are as follows: \r\n\r\nThe algorithm worked on was factorial(INSERTuserINPUThere)\r\n\r\nYour answer for factorial(INSERTuserINPUThere) was : "
				+ "\r\n\r\nThe correct answer for factorial(INSERTuserINPUThere) is :\r\n\r\nWe get to this answer by:\r\n\r\nInsert algorithim + variables here\r\n\r\n");
		txtResults.setBackground(UIManager.getColor("Panel.background"));
		txtResults.setWrapStyleWord(true);
		txtResults.setLineWrap(true);
		txtResults.setEditable(false);

		txtSummary = new JTextArea();
		txtSummary.setText("\t\t\t\t\t\t\t\t\t\tSummary\r\n\r\nIn this tutorial series, the basics of return values in recursion were presented.\r\n\r\nReturn values take two forms in basic recursive methods.\r\n\r\nFirst is the base case return value which is how we stop the recursive call going into an infinite loop and causing a stack overflow. The final calculation is then begun.\r\n\r\nThe second is the recursive value itself as seen in the factorial algorithm, the recursive call being return n * factorial(n-1).");
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setEditable(false);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(327)
										.addComponent(lblResults))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(46)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE)
														.addComponent(txtResults, GroupLayout.PREFERRED_SIZE, 633, GroupLayout.PREFERRED_SIZE))))
														.addContainerGap(104, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblResults)
						.addGap(53)
						.addComponent(txtResults, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(143, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}

	private int userRet;
	
	@Override
	public void update(Observable arg0, Object arg1) {
		setReturnVal(model.getUserReturnVal());
		System.out.println("getReturnVal "+ getReturnVal());
		System.out.println("1 " + model.getUserReturnVal());
		System.out.println("2 " + model.getUserRetVal2());
		txtResults.setText("The results from the previous two pages are as follows: \r\n\r\nThe algorithm worked on was factorial("+ model.getParam() + ")\r\n\r\nYour answer for factorial(" + model.getParam()+ ") in the first exmaple was : " + model.getUserReturnVal()
				+"\r\n\r\nYour answer for factorial(" + model.getParam()+ ") in the second example was : "+ model.getUserRetVal2() 
				+ "\r\n\r\nThe correct answer for factorial("+ model.getParam() + ") is : "+ model.factorial(model.getParam()) 
				+ "\r\n\r\nWe get to this answer by:\r\n\r\nInsert algorithim + variables here\r\n\r\n");
		
	}
	
	public void setReturnVal(int n){
		userRet = n;
	}
	
	public int getReturnVal(){
		return userRet;
	}
}
