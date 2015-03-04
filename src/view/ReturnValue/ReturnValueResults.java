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
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import model.IReturnValue;
import java.awt.Font;

public class ReturnValueResults extends JPanel implements Observer {

	private static final long serialVersionUID = 8198343565299698957L;
	
	private IReturnValue model;
	
	private JTextArea txtResults;
	private JTextArea txtSummary;
	
	private int userRet,userRet2;
	private int fact;
	private int param;
	private JLabel lblSummary;

	/**
	 * Create the panel.
	 */
	public ReturnValueResults(IReturnValue r) {
		
		model = r;
		
		((Observable) r).addObserver(this);

		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblResults.setBounds(319, 11, 61, 14);

		txtResults = new JTextArea();
		txtResults.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtResults.setFocusable(false);
		txtResults.setBounds(47, 36, 668, 423);
		txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
				+ "The algorithm worked on was factorial(0)\r\n\r\n"
				+ "Your answer for factorial(0) in the first exmaple was : 0\r\n\r\n"
				+ "Your answer for factorial(0) in the second example was : 0\r\n\r\n"
				+ "The correct answer for factorial(0) is : 0\r\n\r\n"
				+ "We get to this answer by:\r\n\r\n"
				+ "fact(null);\r\n"
				+ "return fact() * null\r\n"
				+ "return fact()\r\n"
				+ "return fact()\r\n"
				+ "return fact()\r\n"
				+ "return fact()\r\n"
				+ "return fact()\r\n"
				+ "return fact()\r\n"
				+ "return fact()\r\n"
				+ "return fact()\r\n"
				+ "return   = return " );
		
		txtResults.setBackground(UIManager.getColor("Panel.background"));
		txtResults.setEditable(false);

		txtSummary = new JTextArea();
		txtSummary.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtSummary.setFocusable(false);
		txtSummary.setBounds(47, 487, 668, 266);
		txtSummary.setText("\r\n\r\nIn this tutorial series, the basics of return values in recursion were presented.\r\n\r\nReturn values take two forms in basic recursive methods.\r\n\r\nFirst is the base case return value which is how we stop the recursive call going into an infinite loop and causing a stack overflow. The final calculation is then begun.\r\n\r\nThe second is the recursive value itself as seen in the factorial algorithm, the recursive call being return n * fact(n-1).");
		txtSummary.setBackground(UIManager.getColor("Panel.background"));
		txtSummary.setWrapStyleWord(true);
		txtSummary.setLineWrap(true);
		txtSummary.setEditable(false);
		setLayout(null);
		
		lblSummary = new JLabel("Summary");
		lblSummary.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSummary.setBounds(319, 491, 83, 21);
		add(lblSummary);
		add(lblResults);
		add(txtSummary);
		add(txtResults);

	}


	
	@Override
	public void update(Observable arg0, Object arg1) {
		setReturnVal(model.getUserReturnVal());
		setReturnVal2(model.getUserReturnVal2());
		setParam(model.getParam());
		
		//Stops a stackoverflow error since it will call update before there is a parameter to be used
		if(model.getParam() > 0)
		setFact(model.factorial(model.getParam()));

		setResultsText();
		
	}
	
	public void setReturnVal(int n){
		userRet = n;
	}
	
	public int getReturnVal(){
		return userRet;
	}
	
	public void setReturnVal2(int n){
		userRet2 = n;
	}
	
	public int getReturnVal2(){
		return userRet2;
	}
	
	public int getParam(){
		return param;
	}
	
	public void setParam(int n){
		param = n;
	}
	
	public int getFact(){
		return fact;
	}
	
	public void setFact(int n){
		fact = n;
	}
	
	public void setResultsText(){
		
		if(param == 1){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(1)\r\n\r\n"
					+ "Your answer for factorial(1) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(1) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(1) is :"+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return " + getParam() +  "= return " + model.factorial(model.getParam()) );
		}
		
		if(param == 2){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(2)\r\n\r\n"
					+ "Your answer for factorial(2) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(2) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(2) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
		}
		
		if(param == 3){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(3)\r\n\r\n"
					+ "Your answer for factorial(3) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(3) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(3) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
		}
		
		if(param == 4){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(4)\r\n\r\n"
					+ "Your answer for factorial(4) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(4) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(4) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-3) + ") * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
		}
		
		if(param == 5){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(5)\r\n\r\n"
					+ "Your answer for factorial(5) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(5) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(5) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-3) + ") * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-4) + ") * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
		}
		
		if(param == 6){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(6)\r\n\r\n"
					+ "Your answer for factorial(6) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(6) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(6) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-3) + ") * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-4) + ") * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-5) + ") * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
		}
		
		if(param == 7){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(7)\r\n\r\n"
					+ "Your answer for factorial(7) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(7) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(7) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-3) + ") * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-4) + ") * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-5) + ") * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-6) + ") * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
		}
		
		if(param == 8){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(8)\r\n\r\n"
					+ "Your answer for factorial(8) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(8) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(8) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-3) + ") * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-4) + ") * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-5) + ") * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-6) + ") * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-7) + ") * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return " + (getParam()-7) + " * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
			
		}
		
		if(param == 9){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(9)\r\n\r\n"
					+ "Your answer for factorial(9) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(9) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(9) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-3) + ") * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-4) + ") * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-5) + ") * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-6) + ") * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-7) + ") * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-8) + ") * " + (getParam()-7) + " * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return " + (getParam()-8) + " * " + (getParam()-7) + " * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
			
		}
		
		if(param == 10){
			txtResults.setText("The results from the previous two pages are as follows: \r\n\r\n"
					+ "The algorithm worked on was factorial(10)\r\n\r\n"
					+ "Your answer for factorial(10) in the first exmaple was : "+ getReturnVal() + "\r\n\r\n"
					+ "Your answer for factorial(10) in the second example was : "+ getReturnVal2() + "\r\n\r\n"
					+ "The correct answer for factorial(10) is : "+ getFact()  + "\r\n\r\n"
					+ "We get to this answer by:\r\n\r\n"
					+ "fact("+ getParam() +");\r\n"
					+ "return fact(" + (getParam()-1) + ") * "+ getParam()+ "\r\n"
					+ "return fact(" + (getParam()-2) + ") * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-3) + ") * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + " \r\n"
					+ "return fact(" + (getParam()-4) + ") * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-5) + ") * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-6) + ") * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-7) + ") * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-8) + ") * " + (getParam()-7) + " * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return fact(" + (getParam()-9) + ") * " + (getParam()-8) + " * " + (getParam()-7) + " * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() + "\r\n"
					+ "return " + (getParam()-9) + " * " + (getParam()-8) + " * " + (getParam()-7) + " * " + (getParam()-6) + " * " + (getParam()-5) + " * " + (getParam()-4) + " * " + (getParam()-3) + " * " + (getParam()-2) + " * " + (getParam()-1) + " * "+ getParam() +  "= return " + model.factorial(model.getParam()) );
			
		}
		
	}
}
