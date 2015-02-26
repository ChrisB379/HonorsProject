package view.BaseCase;

/**
 *  The results of the no base example is displayed.
 *  The users final answer is displayed along with the correct answer.
 *  A wrong answer will mean an explanation of the correct answer is emphasized as to how it came about.
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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import model.IBaseCase;

public class NoBaseCaseResult extends JPanel implements Observer {


	private static final long serialVersionUID = 5862849225888560531L;
	
	private JTextArea txtResult;
	private JTextArea txtSummary;
	
	private IBaseCase model;
	
	private int param;
	private String userRet;
	private int nbcResult;

	/**
	 * Create the panel.
	 */
	public NoBaseCaseResult(IBaseCase m) {
		
		model = m;
		
		((Observable) m).addObserver(this);
		
		JLabel lblResults = new JLabel("Results");

		txtResult = new JTextArea();
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was noBaseCase(INSERTuserINPUThere)\r\n\r\n"
				+ "Your answer for noBaseCase(INSERTuserINPUThere) was : \r\n\r\n"
				+ "The correct answer for noBaseCase(INSERTuserINPUThere) is :\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");

		txtResult.setBackground(UIManager.getColor("Panel.background"));
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setEditable(false);

		txtSummary = new JTextArea();
		txtSummary.setText("\t\t\t\tSummary\r\n\r\n"
				+ "In this tutorial series, the importance of base cases in recursion were presented.\r\n\r\n"
				+ "A base case is vital in recursive statements as a way to control how many times a recursive call happens. It also prevents the recursive call falling into an infinite loop and thus creating a stack overflow,"
				+ " crashing any programing running the recursive call.\r\n\r\n"
				+ "The next pages will cover the second algorithm in the base series. This will be about convergence.");

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
										.addGap(415)
										.addComponent(lblResults))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(28)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 853, GroupLayout.PREFERRED_SIZE)
														.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, 805, GroupLayout.PREFERRED_SIZE))))
														.addContainerGap(74, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblResults)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(273, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}

	@Override
	public void update(Observable o, Object arg) {
		setReturnVal(model.getUserReturnVal());
		setParam(model.getParam());
		setNoBaseCaseResult(model.getParam());
		System.out.println("RetValResults " + getParam());
		setResultsText();
		
	}
	public void setReturnVal(String s){
		userRet = s;
	}
	
	public String getReturnVal(){
		return userRet;
	}
	
	
	public int getParam(){
		return param;
	}
	
	public void setParam(int n){
		param = n;
	}
	
	public int getNoBaseCaseResult(){
		return nbcResult;
	}
	
	public void setNoBaseCaseResult(int n){
		nbcResult = n;
	}
	

	
	
	public void setResultsText(){
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was noBaseCase(" + getParam() + ")\r\n\r\n"
				+ "Your answer for noBaseCase(" + getParam() + ") was : "+ getReturnVal() +"\r\n\r\n"
				+ "The correct answer for noBaseCase(" + getParam() + ") is : "+ getNoBaseCaseResult() + "\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");

	}
}
