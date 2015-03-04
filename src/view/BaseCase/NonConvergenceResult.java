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
import javax.swing.JTextArea;
import javax.swing.UIManager;
import model.IBaseCase;
import javax.swing.JLabel;
import java.awt.Font;

public class NonConvergenceResult extends JPanel implements Observer {


	private static final long serialVersionUID = -6554799182952231997L;
	
	private JTextArea txtResult;
	private JTextArea txtSummary;
	
	private IBaseCase model;
	
	private int param;
	private int convResult;

	private String userRet;
	private JLabel lblSummary;

	/**
	 * Create the panel.
	 */
	public NonConvergenceResult(IBaseCase m) {
		setFocusable(false);

		model = m;
		
		((Observable) m).addObserver(this);
		
		txtResult = new JTextArea();
		txtResult.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtResult.setFocusable(false);
		txtResult.setBounds(32, 43, 948, 421);
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\nT"
				+ "he algorithm worked on was nonConvergence(" + getParam() + ")\r\n\r\n"
				+ "Your answer for nonConvergence(" + getParam() + ") was : " + getReturnVal() + "\r\n\r\n"
				+ "The correct answer for nonConvergence(" + getParam() + ") is : The method will continue recursing until a stack overflow error halts the program. \r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "As the recursive call is \"nonConvergence(n+1) + 2*n\", the value of n constantly increases as you can see by the recursive call parameter being \"n+1\" rather than \"n+1\" \n\n"
				+ "Since the value of n is constantly increasing with each recursive call, it will never reach the base case of n == 1. \n\n"
				+ "Eventually so many recursive calls build up within the java runtime stack that the stack becomes full. \n\n"
				+ "This prevents anything else being added to the stack and causes a stack overflow error which will halt the program. \n\n"
				);
		
		txtResult.setBackground(UIManager.getColor("Panel.background"));
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setEditable(false);
		setLayout(null);
		
		lblSummary = new JLabel("Summary");
		lblSummary.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSummary.setBounds(496, 473, 96, 21);
		add(lblSummary);

		txtSummary = new JTextArea();
		txtSummary.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtSummary.setFocusable(false);
		txtSummary.setBounds(26, 473, 1022, 239);
		txtSummary.setText("\r\n\r\nIn this tutorial series, the importance of base cases in recursion were presented.\r\n\r\nA base case is vital in recursive statements as a way to control how many times a recursive call happens. It also prevents the recursive call falling into an infinite loop and thus creating a stack overflow, crashing any programing running the recursive call.\r\n\r\nWithin the topic of bases, the idea of convergence was presented. Convergence plays an important part in bases cases, in that each recursive call must ensure that any variables being incremented/decremented should converge(get closer to) the base case. If this fails to happen then similar to what happens if there is no base case, the program can crash in an infinite loop which causes a stack overflow.\r\n\r\nThis is the end of tutortial series 1.");
		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		txtSummary.setEditable(false);
		add(txtSummary);
		add(txtResult);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResults.setBounds(455, 11, 96, 21);
		add(lblResults);

	}


	@Override
	public void update(Observable o, Object arg) {
		setReturnVal(model.getUserReturnVal2());
		setParam(model.getParam());
		setConvResult(model.getParam());
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
	
	public int getConvResult(){
		return convResult;
	}
	
	public void setConvResult(int n){
		convResult = n;
	}
	

	
	
	public void setResultsText(){
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\nT"
				+ "he algorithm worked on was nonConvergence(" + getParam() + ")\r\n\r\n"
				+ "Your answer for nonConvergence(" + getParam() + ") was : " + getReturnVal() + "\r\n\r\n"
				+ "The correct answer for nonConvergence(" + getParam() + ") is : The method will continue recursing until a stack overflow error halts the program. \r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "As the recursive call is \"nonConvergence(n+1) + 2*n\", the value of n constantly increases as you can see by the recursive call parameter being \"n+1\" rather than \"n+1\" \n\n"
				+ "Since the value of n is constantly increasing with each recursive call, it will never reach the base case of n == 1. \n\n"
				+ "Eventually so many recursive calls build up within the java runtime stack that the stack becomes full. \n\n"
				+ "This prevents anything else being added to the stack and causes a stack overflow error which will halt the program. \n\n"
				);
	}
}
