package view.ExcessiveRecomputation;

/**
 *  The results of the excessive recomputation example.
 *  The users answer to the example will be displayed along with the actual answer.
 *  There will be an explanation of how the answer was calculated and in the case of the user inputting
 *  an incorrect answer, an explanation of the correct answer is emphasized.
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
import javax.swing.JTextArea;
import javax.swing.UIManager;

import model.IExcessiveRecomp;

public class ExcessiveRecompResult extends JPanel implements Observer {

	private static final long serialVersionUID = -5302119559920880728L;
	
	private IExcessiveRecomp model;
	
	private JTextArea txtResult;
	private JTextArea txtSummary;
	
	private int userRet;
	private int param;
	

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompResult(IExcessiveRecomp m) {
		
		model = m;
		
		((Observable) m).addObserver(this);

		txtResult = new JTextArea();
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setEditable(false);
		txtResult.setBackground(UIManager.getColor("Panel.background"));
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was fib(INSERTuserINPUThere)\r\n\r\n"
				+ "Your answer for fib(INSERTuserINPUThere) was : \r\n\r\n"
				+ "The correct answer for fib(INSERTuserINPUThere) is :\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");

		txtSummary = new JTextArea();
		txtSummary.setText("\t\t\tSummary\r\n\r\n"
				+ "In this tutorial series, the issue of excessive recomputation was presented.\r\n\r\n"
				+ "Excessive recomputation occurs when the same calculation is done multiple times wasting CPU resources and time because after the first time a calculation is done, it shouldn't have to be done again.\r\n\r\n"
				+ "For more releveant examples in this area and more challenging, please have a look at memoization and fibonacci with memoization. \r\n\r\n"
				+ "You can choose to do so now via the memoization button or you can continue to Tutorial 4 if you wish.\r\n\r\n");



		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setEditable(false);
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(33)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtResult, Alignment.LEADING)
								.addComponent(txtSummary, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
								.addContainerGap(175, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(33)
						.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(39)
						.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(71, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}
	
	public void setReturnVal(int n){
		userRet = n;
	}
	
	public int getReturnVal(){
		return userRet;
	}
	
	public int getParam(){
		return param;
	}
	
	public void setParam(int n){
		param = n;
	}

	@Override
	public void update(Observable o, Object arg) {
		setReturnVal(model.getUserReturnVal());
		setParam(model.getParam());
		System.out.println("RetValResults " + getParam());
		setResultsText();
		
	}
	
	public void setResultsText(){
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
				+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
				+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");
		
	}

}
