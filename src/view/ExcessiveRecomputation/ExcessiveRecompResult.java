package view.ExcessiveRecomputation;

/**
 *  The results of the excessive recomputation example.
 *  The users answer to the example is displayed along with the actual answer.
 *  An explanation to how the answer was got to, is given.
 *  
 *  There is also a summary of the tutorial series
 * 
 * @author Christopher Baillie
 * @version 2.0
 * @since 1.0
 */

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import model.IExcessiveRecomp;
import javax.swing.JLabel;
import java.awt.Font;

public class ExcessiveRecompResult extends JPanel implements Observer {

	private static final long serialVersionUID = -5302119559920880728L;
	
	private IExcessiveRecomp model;
	
	private JTextArea txtResult;
	private JTextArea txtSummary;
	
	private int userRet;
	private int param;
	private JLabel lblSummary;
	

	/**
	 * Create the panel.
	 */
	public ExcessiveRecompResult(IExcessiveRecomp m) {
		setOpaque(false);
		setFocusable(false);
		
		model = m;
		
		((Observable) m).addObserver(this);
		
		/*
		 * Results text area
		 */
		txtResult = new JTextArea();
		txtResult.setOpaque(false);
		txtResult.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtResult.setBounds(33, 33, 751, 421);
		txtResult.setFocusable(false);
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
		
		/*
		 * Summary text area
		 */
		txtSummary = new JTextArea();
		txtSummary.setOpaque(false);
		txtSummary.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtSummary.setBounds(33, 465, 751, 255);
		txtSummary.setFocusable(false);
		txtSummary.setText("\r\n\r\nIn this tutorial series, the issue of excessive recomputation was presented.\r\n\r\n"
				+ "Excessive recomputation occurs when the same calculation is done multiple times wasting CPU resources and time because after the first time a calculation is done, it shouldn't have to be done again.\r\n\r\n"
				+ "For more releveant examples in this area and more challenging, please have a look at memoization and fibonacci with memoization. \r\n\r\n"
				+ "You can choose to do so now via the memoization button or you can continue to Tutorial 4 if you wish.\r\n\r\n");



		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setEditable(false);
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		setLayout(null);
		
		lblSummary = new JLabel("Summary");
		lblSummary.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSummary.setBounds(384, 463, 105, 21);
		add(lblSummary);
		add(txtResult);
		add(txtSummary);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResults.setBounds(384, 11, 83, 14);
		add(lblResults);

	}
	
	/**
	 * Sets the users return value
	 * 
	 * @return integer return value
	 */
	public void setReturnVal(int n){
		userRet = n;
	}
	
	/**
	 * Gets the users return value
	 * 
	 * @return integer return value
	 */
	public int getReturnVal(){
		return userRet;
	}
	
	/**
	 * Gets the users parameter
	 * 
	 * @return integer parameter
	 */
	public int getParam(){
		return param;
	}
	
	/**
	 * Sets the local parameter to the value of the users chosen parameter
	 * 
	 * @param n integer parameter
	 */
	public void setParam(int n){
		param = n;
	}

	@Override
	public void update(Observable o, Object arg) {
		setReturnVal(model.getUserReturnVal());
		setParam(model.getParam());
		setResultsText();
		
	}
	
	/**
	 * Sets the text field via the update method
	 * 
	 * This is just a large series of if statements
	 * 
	 * Depending on the parameter, the text field is set to a certain value. It is completely hard coded
	 * 
	 */
	public void setResultsText(){
		txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
				+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
				+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "Insert algorithim + variables here\r\n\r\n");
		
		if(param == 1){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-3) + "\r\n"
					+ "return "  + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
		}
		
		if(param == 2){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-2) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
		}
		
		if(param == 3){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
		}
		
		if(param == 4){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-4) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-3) + " + " + model.fib(model.getParam()-4) + " = " + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(3) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
		}
		
		if(param == 5){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-5) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-4) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-4) + " + " + model.fib(model.getParam()-5) + " = " + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(3) =" + model.fib(model.getParam()-3) + " + " + model.fib(model.getParam()-4) + " = " + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(4) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
		}
		
		if(param == 6){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-6) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-5) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-5) + " + " + model.fib(model.getParam()-6) + " = " + model.fib(model.getParam()-4) + "\r\n"
					+ "fib(3) =" + model.fib(model.getParam()-4) + " + " + model.fib(model.getParam()-5) + " = " + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(4) =" + model.fib(model.getParam()-3) + " + " + model.fib(model.getParam()-4) + " = " + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(5) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
		}
		
		if(param == 7){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-7) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-6) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-6) + " + " + model.fib(model.getParam()-7) + " = " + model.fib(model.getParam()-5) + "\r\n"
					+ "fib(3) =" + model.fib(model.getParam()-5) + " + " + model.fib(model.getParam()-6) + " = " + model.fib(model.getParam()-4) + "\r\n"
					+ "fib(4) =" + model.fib(model.getParam()-4) + " + " + model.fib(model.getParam()-5) + " = " + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(5) =" + model.fib(model.getParam()-3) + " + " + model.fib(model.getParam()-4) + " = " + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(6) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
		}
		
		if(param == 8){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-8) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-7) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-7) + " + " + model.fib(model.getParam()-8) + " = " + model.fib(model.getParam()-6) + "\r\n"
					+ "fib(3) =" + model.fib(model.getParam()-6) + " + " + model.fib(model.getParam()-7) + " = " + model.fib(model.getParam()-5) + "\r\n"
					+ "fib(4) =" + model.fib(model.getParam()-5) + " + " + model.fib(model.getParam()-6) + " = " + model.fib(model.getParam()-4) + "\r\n"
					+ "fib(5) =" + model.fib(model.getParam()-4) + " + " + model.fib(model.getParam()-5) + " = " + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(6) =" + model.fib(model.getParam()-3) + " + " + model.fib(model.getParam()-4) + " = " + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(7) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
			
		}
		
		if(param == 9){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-9) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-8) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-8) + " + " + model.fib(model.getParam()-9) + " = " + model.fib(model.getParam()-7) + "\r\n"
					+ "fib(3) =" + model.fib(model.getParam()-7) + " + " + model.fib(model.getParam()-8) + " = " + model.fib(model.getParam()-6) + "\r\n"
					+ "fib(4) =" + model.fib(model.getParam()-6) + " + " + model.fib(model.getParam()-7) + " = " + model.fib(model.getParam()-5) + "\r\n"
					+ "fib(5) =" + model.fib(model.getParam()-5) + " + " + model.fib(model.getParam()-6) + " = " + model.fib(model.getParam()-4) + "\r\n"
					+ "fib(6) =" + model.fib(model.getParam()-4) + " + " + model.fib(model.getParam()-5) + " = " + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(7) =" + model.fib(model.getParam()-3) + " + " + model.fib(model.getParam()-4) + " = " + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(8) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
			
		}
		
		if(param == 10){
			txtResult.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was fib(" + getParam() + ")\r\n\r\n"
					+ "Your answer for fib(" + getParam() + ") was : " + getReturnVal() + " \r\n\r\n"
					+ "The correct answer for fib(" + getParam() + ") is : " + model.fib(model.getParam()) + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fib(0) =" + model.fib(model.getParam()-10) + "\r\n"
					+ "fib(1) =" + model.fib(model.getParam()-9) + "\r\n"
					+ "fib(2) =" + model.fib(model.getParam()-9) + " + " + model.fib(model.getParam()-10) + " = " + model.fib(model.getParam()-8) + "\r\n"
					+ "fib(3) =" + model.fib(model.getParam()-8) + " + " + model.fib(model.getParam()-9) + " = " + model.fib(model.getParam()-7) + "\r\n"
					+ "fib(4) =" + model.fib(model.getParam()-7) + " + " + model.fib(model.getParam()-8) + " = " + model.fib(model.getParam()-6) + "\r\n"
					+ "fib(5) =" + model.fib(model.getParam()-6) + " + " + model.fib(model.getParam()-7) + " = " + model.fib(model.getParam()-5) + "\r\n"
					+ "fib(6) =" + model.fib(model.getParam()-5) + " + " + model.fib(model.getParam()-6) + " = " + model.fib(model.getParam()-4) + "\r\n"
					+ "fib(7) =" + model.fib(model.getParam()-4) + " + " + model.fib(model.getParam()-5) + " = " + model.fib(model.getParam()-3) + "\r\n"
					+ "fib(8) =" + model.fib(model.getParam()-3) + " + " + model.fib(model.getParam()-4) + " = " + model.fib(model.getParam()-2) + "\r\n"
					+ "fib(9) =" + model.fib(model.getParam()-2) + " + " + model.fib(model.getParam()-3) + " = " + model.fib(model.getParam()-1) + "\r\n"
					+ "return "  + model.fib(getParam()-2) + " + " + model.fib(getParam()-1) + "= return " + model.fib(model.getParam()));
			
		}
		
	}
}
