package view.WorkAfter;

/**
 * Showing the algorithm used for work after examples section which the user will work through.
 * This is based on the parameter entered from the previous GUI screen.
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.WorkAfter.AdvanceButtons.WAAlgorithmButton;

import javax.swing.JTextPane;

import controller.WorkAfter.WASubmitController;
import model.IWorkAfter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JRadioButton;

public class WorkAfterAlgorithm extends JPanel implements Observer,ActionListener {


	private static final long serialVersionUID = -1965751494479483614L;
	private JTextField txtBaseCase;
	private JTextArea txtVariables;

	private JRadioButton rdbtnQ1Option1;
	private JRadioButton rdbtnQ1Option2;
	private JRadioButton rdbtnQ1Option3;
	private JRadioButton rdbtnQ1Option4;
	private JRadioButton rdbtnQ1Option5;

	private JRadioButton rdbtnQ2Option1;
	private JRadioButton rdbtnQ2Option2;
	private JRadioButton rdbtnQ2Option3;
	private JRadioButton rdbtnQ2Option4;
	private JRadioButton rdbtnQ2Option5;

	private JButton btnSubmit;

	private IWorkAfter model;

	private WASubmitController wasc;

	private int parameter;

	private String RtrnValQ1, RtrnValQ2;

	private WAAlgorithmButton aBut;

	private JTextArea txtQuestion2;


	/**
	 * Create the panel.
	 */
	public WorkAfterAlgorithm(IWorkAfter m, WAAlgorithmButton ab) {

		model = m;

		aBut = ab;
		aBut.setNotVis();

		((Observable) m).addObserver(this);

		wasc = new WASubmitController(model,this);

		JLabel lblExample = new JLabel("Example");
		lblExample.setBounds(374, 11, 78, 14);

		JTextPane txtAlgorithm = new JTextPane();
		txtAlgorithm.setBounds(25, 58, 455, 268);
		txtAlgorithm.setContentType("text/html");
		txtAlgorithm.setText("<html>\r\n<code> \r\n<br>\t<font color = rgb(127,0,85)><b>public void</b></font> workAfter(<font color = rgb(127,0,85)><b>int</b> </font> n){\r\n<br>\t\t\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>if</b> </font>(n == 1)\r\n<br>\t\t\t&nbsp&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>Base case statement, showing the value \r\n<br>\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp of n is</font> \" + n);\r\n<br>\t\t&nbsp<font color = rgb(127,0,85)><b>else</b> </font>\r\n<br>\t\t\t&nbsp&nbsp workAfter(n-1);\r\n<br>\t\t\r\n<br>\t\t\r\n<br>\t\t&nbsp System.<font color = rgb(0,0,192)>out</font>.println(\"<font color = rgb(0,0,192)>After the recursive call, showing the \r\n<br>\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp result of n*2 is</font> \" + n*2);\r\n<br>\t\t\r\n<br>\t}\r\n<br></code> \r\n\r\n</html>");

		txtAlgorithm.setBackground(Color.WHITE);
		txtAlgorithm.setEditable(false);

		txtVariables = new JTextArea();
		txtVariables.setBounds(505, 67, 184, 45);
		txtVariables.setBackground(UIManager.getColor("Panel.background"));
		txtVariables.setEditable(false);
		txtVariables.setLineWrap(true);
		txtVariables.setWrapStyleWord(true);
		txtVariables.setText("Variables will be inserted here");

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(49, 598, 127, 35);
		btnSubmit.addActionListener(wasc);

		JTextArea textWorking = new JTextArea();
		textWorking.setBounds(505, 162, 341, 164);

		JLabel lblInsertYourWorking = new JLabel("Insert your working here:");
		lblInsertYourWorking.setBounds(613, 123, 149, 14);

		txtBaseCase = new JTextField();
		txtBaseCase.setBounds(49, 555, 377, 14);
		txtBaseCase.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBaseCase.setEditable(false);
		txtBaseCase.setText("Please click the Advance button to for the next example.");
		txtBaseCase.setColumns(10);
		txtBaseCase.setVisible(false);
		setLayout(null);
		add(lblExample);
		add(txtAlgorithm);
		add(txtVariables);
		add(lblInsertYourWorking);
		add(btnSubmit);
		add(txtBaseCase);
		add(textWorking);

		ButtonGroup btnGroupQ1 = new ButtonGroup();
		ButtonGroup btnGroupQ2 = new ButtonGroup();

		/* 
		 * QUESTION ONE
		 */

		JTextArea txtQuestion1 = new JTextArea();
		txtQuestion1.setEditable(false);
		txtQuestion1.setText("Q1: What will be the first line of output?");
		txtQuestion1.setBounds(49, 358, 355, 29);
		add(txtQuestion1);

		rdbtnQ1Option1 = new JRadioButton("Base case statement, showing the value of n is 1");
		rdbtnQ1Option1.setBounds(59, 394, 345, 23);
		add(rdbtnQ1Option1);

		rdbtnQ1Option2 = new JRadioButton("Base case statement, showing the value of n is 2");
		rdbtnQ1Option2.setBounds(59, 420, 345, 23);
		add(rdbtnQ1Option2);

		rdbtnQ1Option3 = new JRadioButton("After the recursive call, showing the result of n*2 is 2");
		rdbtnQ1Option3.setBounds(59, 446, 345, 23);
		add(rdbtnQ1Option3);

		rdbtnQ1Option4 = new JRadioButton("After the recursive call, showing the result of n*2 is "+ ((getParameter()-1)*2));
		rdbtnQ1Option4.setBounds(59, 472, 345, 23);
		add(rdbtnQ1Option4);

		rdbtnQ1Option5 = new JRadioButton("After the recursive call, showing the result of n*2 is " + getParameter());
		rdbtnQ1Option5.setBounds(59, 498, 345, 23);
		add(rdbtnQ1Option5);

		rdbtnQ1Option1.addActionListener(this);
		rdbtnQ1Option2.addActionListener(this);
		rdbtnQ1Option3.addActionListener(this);
		rdbtnQ1Option4.addActionListener(this);
		rdbtnQ1Option5.addActionListener(this);

		btnGroupQ1.add(rdbtnQ1Option1);
		btnGroupQ1.add(rdbtnQ1Option2);
		btnGroupQ1.add(rdbtnQ1Option3);
		btnGroupQ1.add(rdbtnQ1Option4);
		btnGroupQ1.add(rdbtnQ1Option5);

		/* 
		 * QUESTION TWO 
		 */

		txtQuestion2 = new JTextArea();
		txtQuestion2.setEditable(false);
		txtQuestion2.setText("Q2: What will be the last line of output?");
		txtQuestion2.setBounds(448, 360, 361, 27);
		add(txtQuestion2);
		txtQuestion2.setColumns(10);

		rdbtnQ2Option1 = new JRadioButton("Base case statement, showing the value of n is  1");
		rdbtnQ2Option1.setBounds(448, 394, 361, 23);
		add(rdbtnQ2Option1);

		rdbtnQ2Option2 = new JRadioButton("Base case statement, showing the value of n is  2");
		rdbtnQ2Option2.setBounds(448, 420, 361, 23);
		add(rdbtnQ2Option2);

		rdbtnQ2Option3 = new JRadioButton("After the recursive call, showing the result of n*2 is 2");
		rdbtnQ2Option3.setBounds(448, 446, 361, 23);
		add(rdbtnQ2Option3);

		rdbtnQ2Option4 = new JRadioButton("New radio button");
		rdbtnQ2Option4.setBounds(448, 472, 361, 23);
		add(rdbtnQ2Option4);

		rdbtnQ2Option5 = new JRadioButton("New radio button");
		rdbtnQ2Option5.setBounds(448, 498, 361, 23);
		add(rdbtnQ2Option5);

		rdbtnQ2Option1.addActionListener(this);
		rdbtnQ2Option2.addActionListener(this);
		rdbtnQ2Option3.addActionListener(this);
		rdbtnQ2Option4.addActionListener(this);
		rdbtnQ2Option5.addActionListener(this);

		btnGroupQ2.add(rdbtnQ2Option1);
		btnGroupQ2.add(rdbtnQ2Option2);
		btnGroupQ2.add(rdbtnQ2Option3);
		btnGroupQ2.add(rdbtnQ2Option4);
		btnGroupQ2.add(rdbtnQ2Option5);


	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		setParameter(model.getParam());
		rdbtnQ1Option4.setText("After the recursive call, showing the result of n*2 is "+ ((getParameter()-1)*2));
		rdbtnQ1Option5.setText("After the recursive call, showing the result of n*2 is " + getParameter()*2);
 
		rdbtnQ2Option4.setText("After the recursive call, showing the result of n*2 is "+ ((getParameter()-1)*2));
		rdbtnQ2Option5.setText("After the recursive call, showing the result of n*2 is " + getParameter()*2);
		
		/*
		 * Have to change the radio button options if the parameter is 1 or 2
		 * This is because there would be repeat answers or obviously wrong answers
		 */
		if(model.getParam() == 1){
			rdbtnQ1Option3.setText("After the recursive call, showing the result of n*2 is 1");
			rdbtnQ1Option4.setText("After the recursive call, showing the result of n*2 is "+ (getParameter()*2));
			rdbtnQ1Option5.setText("After the recursive call, showing the result of n*2 is " + getParameter()*4);
			
			rdbtnQ2Option3.setText("After the recursive call, showing the result of n*2 is 1");
			rdbtnQ2Option4.setText("After the recursive call, showing the result of n*2 is "+ (getParameter()*2));
			rdbtnQ2Option5.setText("After the recursive call, showing the result of n*2 is " + getParameter()*4);
		}
		
		if(model.getParam() == 2){
			rdbtnQ1Option4.setText("After the recursive call, showing the result of n*2 is "+ (getParameter()*2));
			rdbtnQ1Option5.setText("After the recursive call, showing the result of n*2 is " + getParameter()*3);
			
			rdbtnQ2Option4.setText("After the recursive call, showing the result of n*2 is "+ (getParameter()*2));
			rdbtnQ2Option5.setText("After the recursive call, showing the result of n*2 is " + getParameter()*3);
		}

		System.out.println("WorkAfterAlgorithm update method getPara value " + model.getParam());


		txtVariables.setText("n = " + getParameter());
	}

	/**
	 * Sets the value of the parameter
	 * 
	 * 
	 * @param n an integer which will be the value of the parameter
	 */
	public void setParameter(int n){
		parameter = n;

	}

	/**
	 * Returns an integer stored in parameter which is the value of the users input parameter
	 * 
	 * @return an integer which is the parameter
	 */
	public int getParameter(){
		return parameter;

	}

	/**
	 * Sets the RtrnVal to be the users selected radio button value
	 * 
	 * @param s the String from the button the user selected
	 */
	public void setRtrnValQ1(String s){
		RtrnValQ1 = s;
	}

	/**
	 * Returns the value of the radio button selected by the user to be used by the controller
	 * 
	 * @return the value of the radio button selected by the user
	 */
	public String getRtrnValQ1(){
		return RtrnValQ1;
	}

	/**
	 * Sets the RtrnVal to be the users selected radio button value
	 * 
	 * @param s the String from the button the user selected
	 */
	public void setRtrnValQ2(String s){
		RtrnValQ2 = s;
	}

	/**
	 * Returns the value of the radio button selected by the user to be used by the controller
	 * 
	 * @return the value of the radio button selected by the user
	 */
	public String getRtrnValQ2(){
		return RtrnValQ2;
	}



	/**
	 * This is triggered at the "return statement"
	 * i.e when the final return value has been input by the user
	 * This hides all the other text and text boxes while adding a new one to tell the user what to do
	 * If the text boxes are not hidden, some errors will be thrown if the user were to focus and unfocus the text boxes
	 * 
	 * @since 1.2
	 */
	public void setAfterReturnText(){
		txtBaseCase.setVisible(true);
		btnSubmit.setVisible(false);
		aBut.setVis();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		 * QUESTION ONE
		 */
		if(rdbtnQ1Option1.isSelected()){
			System.out.println("Q1 1");
			setRtrnValQ1("Base case statement, showing the value of n is  1");
		}
		if(rdbtnQ1Option2.isSelected()){
			System.out.println("Q1 2");
			setRtrnValQ1("Base case statement, showing the value of n is  2");
		}
		if(rdbtnQ1Option3.isSelected()){
			System.out.println("Q1 3");
			setRtrnValQ1("After the recursive call, showing the result of n*2 is 2");
		}
		if(rdbtnQ1Option4.isSelected()){
			System.out.println("Q1 4");
			setRtrnValQ1("After the recursive call, showing the result of n*2 is  "+ ((getParameter()-1)*2));
		}
		if(rdbtnQ1Option5.isSelected()){
			System.out.println("Q1 5");
			setRtrnValQ1("After the recursive call, showing the result of n*2 is  " + getParameter()*2);
		}

		/*
		 * QUESTION TWO
		 */

		if(rdbtnQ2Option1.isSelected()){
			System.out.println("Q2 1");
			setRtrnValQ2("Base case statement, showing the value of n is  1");
		}
		if(rdbtnQ2Option2.isSelected()){
			System.out.println("Q2 2");
			setRtrnValQ2("Base case statement, showing the value of n is  2");
		}
		if(rdbtnQ2Option3.isSelected()){
			System.out.println("Q2 3");
			setRtrnValQ2("After the recursive call, showing the result of n*2 is 2");
		}
		if(rdbtnQ2Option4.isSelected()){
			System.out.println("Q2 4");
			setRtrnValQ2("After the recursive call, showing the result of n*2 is "+ ((getParameter()-1)*2));
		}
		if(rdbtnQ2Option5.isSelected()){
			System.out.println("Q2 5");
			setRtrnValQ2("After the recursive call, showing the result of n*2 is " + getParameter()*2);
		}


	}
	
	/**
	 * Returns a boolean based on whether any radio button has been selected or not.
	 * This boolean refers to question 1 only.
	 * 
	 * @return a boolean, true if a radio button has been selected and false if no radio button has been selected for question 1
	 */
	public boolean question1Answered(){
		if(rdbtnQ1Option1.isSelected()
				||	rdbtnQ1Option2.isSelected()
				||	rdbtnQ1Option3.isSelected()
				||	rdbtnQ1Option4.isSelected()
				||	rdbtnQ1Option5.isSelected()
				){
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Returns a boolean based on whether any radio button has been selected or not.
	 * This boolean refers to question 2 only.
	 * 
	 * @return a boolean, true if a radio button has been selected and false if no radio button has been selected for question 1
	 */
	public boolean question2Answered(){
		if(rdbtnQ2Option1.isSelected()
				||	rdbtnQ2Option2.isSelected()
				||	rdbtnQ2Option3.isSelected()
				||	rdbtnQ2Option4.isSelected()
				||	rdbtnQ2Option5.isSelected()
				){
			return true;
		}
		else
			return false;
	}
}
