package view.BaseCase;

/**
 * This is the GUi after the convergence algorithm that the user has worked through.
 * Here they see what the final answer is, what their answer was and then an explanation of how
 * the answer was to the algorithm was found. If the user is wrong itll explain why.
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
import javax.swing.LayoutStyle.ComponentPlacement;

import model.IBaseCase;

public class ConvergenceResult extends JPanel implements Observer {


	private static final long serialVersionUID = -6554799182952231997L;
	
	private JTextArea txtResult;
	private JTextArea txtSummary;
	
	private IBaseCase model;
	
	private int param;
	private int userRet;
	private int convResult;


	/**
	 * Create the panel.
	 */
	public ConvergenceResult(IBaseCase m) {

		model = m;
		
		((Observable) m).addObserver(this);
		
		txtResult = new JTextArea();
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\nT"
				+ "he algorithm worked on was convergence(INSERTuserINPUThere)\r\n\r\n"
				+ "Your answer for convergence(INSERTuserINPUThere) was : \r\n\r\n"
				+ "The correct answer for convergence(INSERTuserINPUThere) is :\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");
		
		txtResult.setBackground(UIManager.getColor("Panel.background"));
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setEditable(false);

		txtSummary = new JTextArea();
		txtSummary.setText("\t\t\t\t\tSummary\r\n\r\nIn this tutorial series, the importance of base cases in recursion were presented.\r\n\r\nA base case is vital in recursive statements as a way to control how many times a recursive call happens. It also prevents the recursive call falling into an infinite loop and thus creating a stack overflow, crashing any programing running the recursive call.\r\n\r\nWithin the topic of bases, the idea of convergence was presented. Convergence plays an important part in bases cases, in that each recursive call must ensure that any variables being incremented/decremented should converge(get closer to) the base case. If this fails to happen then similar to what happens if there is no base case, the program can crash in an infinite loop which causes a stack overflow.\r\n\r\nThis is the end of tutortial series 1.");
		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		txtSummary.setEditable(false);
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(32)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 1022, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, 948, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(41, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(43)
						.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtSummary, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(35, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}


	@Override
	public void update(Observable o, Object arg) {
		setReturnVal(model.getUserReturnVal2());
		setParam(model.getParam());
		setConvResult(model.getParam());
		System.out.println("RetValResults " + getParam());
		setResultsText();
		
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
	
	public int getConvResult(){
		return convResult;
	}
	
	public void setConvResult(int n){
		convResult = n;
	}
	

	
	
	public void setResultsText(){
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\nT"
				+ "he algorithm worked on was convergence(" + getParam() + ")\r\n\r\n"
				+ "Your answer for convergence(" + getParam() + ") was : " + getReturnVal() + "\r\n\r\n"
				+ "The correct answer for convergence(" + getParam() + ") is : "+ getConvResult() +"\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");
	}

}
