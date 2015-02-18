package view.ReturnValue;

/**
 * This GUI will be the second card example that the user will be able to work through.
 * 
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 * 
 */

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ReturnValueAlgorithm2 extends JPanel {


	private static final long serialVersionUID = 558449680019022130L;
	private JTextField line1Fact;
	private JTextField line2Return;
	private JTextField line3Return;
	private JTextField line4Return;
	private JTextField line5Return;
	private JTextField line6Return;
	private JTextField line7Return;
	private JTextField line8Return;
	private JTextField line9Return;
	private JTextField line10Return;
	private JTextField line1Input1;
	private JTextField line1Bracket;
	private JTextField line11Return;
	private JTextField line10Fact;
	private JTextField line9Fact;
	private JTextField line8Fact;
	private JTextField line7Fact;
	private JTextField line6Fact;
	private JTextField line5Fact;
	private JTextField line4Fact;
	private JTextField line3Fact;
	private JTextField line2Fact;
	private JTextField line2Input1;
	private JTextField line3Input1;
	private JTextField line4Input1;
	private JTextField line5Input1;
	private JTextField line6Input1;
	private JTextField line7Input1;
	private JTextField line8Input1;
	private JTextField line9Input1;
	private JTextField line10Input1;
	private JTextField line11Input1;
	private JTextField line2mult1;
	private JTextField line3mult1;
	private JTextField line4mult1;
	private JTextField line5mult1;
	private JTextField line6mult1;
	private JTextField line7mult1;
	private JTextField line8mult1;
	private JTextField line9mult1;
	private JTextField line10mult1;
	private JTextField line11mult1;
	private JTextField line2Bracket;
	private JTextField line3Bracket;
	private JTextField line4Bracket;
	private JTextField line5Bracket;
	private JTextField line6Bracket;
	private JTextField line7Bracket;
	private JTextField line8Bracket;
	private JTextField line9Bracket;
	private JTextField line10Bracket;
	private JTextField line2Input2;
	private JTextField line3Input2;
	private JTextField line4Input2;
	private JTextField line5Input2;
	private JTextField line6Input2;
	private JTextField line7Input2;
	private JTextField line8Input2;
	private JTextField line9Input2;
	private JTextField line11Input2;
	private JTextField line3mult2;
	private JTextField line4mult2;
	private JTextField line5mult2;
	private JTextField line6mult2;
	private JTextField line7mult2;
	private JTextField line8mult2;
	private JTextField line9mult2;
	private JTextField line10mult2;
	private JTextField line11mult2;
	private JTextField line3Input3;
	private JTextField line4Input3;
	private JTextField line5Input3;
	private JTextField line6Input3;
	private JTextField line7Input3;
	private JTextField line8Input3;
	private JTextField line9Input3;
	private JTextField line10Input3;
	private JTextField line11Input3;
	private JTextField line4mult3;
	private JTextField line5mult3;
	private JTextField line6mult3;
	private JTextField line7mult3;
	private JTextField line8mult3;
	private JTextField line9mult3;
	private JTextField line10mult3;
	private JTextField line11mult3;
	private JTextField line4Input4;
	private JTextField line5Input4;
	private JTextField line6Input4;
	private JTextField line7Input4;
	private JTextField line8Input4;
	private JTextField line9Input4;
	private JTextField line10Input4;
	private JTextField line11Input4;
	private JTextField line5mult4;
	private JTextField line6mult4;
	private JTextField line7mult4;
	private JTextField line8mult4;
	private JTextField line9mult4;
	private JTextField line10mult4;
	private JTextField line11mult4;
	private JTextField line5Input5;
	private JTextField line6Input5;
	private JTextField line7Input5;
	private JTextField line8Input5;
	private JTextField line9Input5;
	private JTextField line10Input5;
	private JTextField line11Input5;
	private JTextField line6mult5;
	private JTextField line7mult5;
	private JTextField line8mult5;
	private JTextField line9mult5;
	private JTextField line10mult5;
	private JTextField line11mult5;
	private JTextField line6Input6;
	private JTextField line7Input6;
	private JTextField line8Input6;
	private JTextField line9Input6;
	private JTextField line10Input6;
	private JTextField line11Input6;
	private JTextField line7mult6;
	private JTextField line8mult6;
	private JTextField line9mult6;
	private JTextField line10mult6;
	private JTextField line11mult6;
	private JTextField line7Input7;
	private JTextField line8Input7;
	private JTextField line9Input7;
	private JTextField line10Input7;
	private JTextField line11Input7;
	private JTextField line8mult7;
	private JTextField line9mult7;
	private JTextField line10mult7;
	private JTextField line11mult7;
	private JTextField line8Input8;
	private JTextField line9Input8;
	private JTextField line10Input8;
	private JTextField line11Input8;
	private JTextField line9mult8;
	private JTextField line10mult8;
	private JTextField line11mult8;
	private JTextField line9Input9;
	private JTextField line10Input9;
	private JTextField line11Input9;
	private JTextField line10mult9;
	private JTextField line11mult9;
	private JTextField line10Input10;
	private JTextField line11Input10;
	private JTextField line11eqReturn;
	private JTextField line11Input11;
	private JTextField line10eqReturn;
	private JTextField line9eqReturn;
	private JTextField line8eqReturn;
	private JTextField line7eqReturn;
	private JTextField line6eqReturn;
	private JTextField line5eqReturn;
	private JTextField line4eqReturn;
	private JTextField line3eqReturn;
	private JTextField line2eqReturn;
	private JTextField line10Input11;
	private JTextField line9Input10;
	private JTextField line8Input9;
	private JTextField line7Input8;
	private JTextField line6Input7;
	private JTextField line5Input6;
	private JTextField line4Input5;
	private JTextField line3Input4;
	private JTextField line2Input3;
	private JTextField line10Input2;

	/**
	 * Create the panel.
	 */
	public ReturnValueAlgorithm2() {

		JLabel lblExample = new JLabel("Example 2");

		JTextArea txtExample2 = new JTextArea();
		txtExample2.setText("As with the previous screen, you will be using the algorithim factorial(INSERTuserINPUThere)\r\n\r\nPlease fill out each text field with the value you think corresponds to each step in the recursive call.\r\n");
		txtExample2.setBackground(UIManager.getColor("Panel.background"));
		txtExample2.setWrapStyleWord(true);
		txtExample2.setLineWrap(true);
		txtExample2.setEditable(false);
		
		/*
		 * LINE ONE 
		 * 
		 */

		line1Fact = new JTextField();
		line1Fact.setEditable(false);
		line1Fact.setText("fact(");
		line1Fact.setColumns(10);
		
		line1Input1 = new JTextField();
		line1Input1.setColumns(10);

		line1Bracket = new JTextField();
		line1Bracket.setEditable(false);
		line1Bracket.setText(");");
		line1Bracket.setColumns(10);

		
		/*
		 * 
		 * LINE TWO
		 * 
		 */

		line2Return = new JTextField();
		line2Return.setText("return");
		line2Return.setEditable(false);
		line2Return.setColumns(10);
		
		line2Fact = new JTextField();
		line2Fact.setText("fact(");
		line2Fact.setEditable(false);
		line2Fact.setColumns(10);

		line2Input1 = new JTextField();
		line2Input1.setColumns(10);
		
		line2mult1 = new JTextField();
		line2mult1.setEditable(false);
		line2mult1.setText("*");
		line2mult1.setColumns(10);

		line2Bracket = new JTextField();
		line2Bracket.setText(")");
		line2Bracket.setEditable(false);
		line2Bracket.setColumns(10);

		line2Input2 = new JTextField();
		line2Input2.setColumns(10);

		line2eqReturn = new JTextField();
		line2eqReturn.setText("= return");
		line2eqReturn.setEditable(false);
		line2eqReturn.setColumns(10);

		line2Input3 = new JTextField();
		line2Input3.setColumns(10);
		
		/*
		 * 
		 * LINE THREE
		 * 
		 */

		line3Return = new JTextField();
		line3Return.setText("return");
		line3Return.setEditable(false);
		line3Return.setColumns(10);
		
		line3Fact = new JTextField();
		line3Fact.setText("fact(");
		line3Fact.setEditable(false);
		line3Fact.setColumns(10);
		
		line3Input1 = new JTextField();
		line3Input1.setColumns(10);

		line3mult1 = new JTextField();
		line3mult1.setText("*");
		line3mult1.setEditable(false);
		line3mult1.setColumns(10);


		line3Bracket = new JTextField();
		line3Bracket.setText(")");
		line3Bracket.setEditable(false);
		line3Bracket.setColumns(10);


		line3Input2 = new JTextField();
		line3Input2.setColumns(10);
		
		line3mult2 = new JTextField();
		line3mult2.setText("*");
		line3mult2.setEditable(false);
		line3mult2.setColumns(10);
		
		line3Input3 = new JTextField();
		line3Input3.setColumns(10);

		line3eqReturn = new JTextField();
		line3eqReturn.setText("= return");
		line3eqReturn.setEditable(false);
		line3eqReturn.setColumns(10);

		line3Input4 = new JTextField();
		line3Input4.setColumns(10);

		/*
		 * 
		 * LINE FOUR
		 * 
		 */
		
		line4Return = new JTextField();
		line4Return.setText("return");
		line4Return.setEditable(false);
		line4Return.setColumns(10);
		
		line4Fact = new JTextField();
		line4Fact.setText("fact(");
		line4Fact.setEditable(false);
		line4Fact.setColumns(10);

		line4Input1 = new JTextField();
		line4Input1.setColumns(10);

		line4mult1 = new JTextField();
		line4mult1.setText("*");
		line4mult1.setEditable(false);
		line4mult1.setColumns(10);


		line4Bracket = new JTextField();
		line4Bracket.setText(")");
		line4Bracket.setEditable(false);
		line4Bracket.setColumns(10);

		line4Input2 = new JTextField();
		line4Input2.setColumns(10);

		line4mult2 = new JTextField();
		line4mult2.setText("*");
		line4mult2.setEditable(false);
		line4mult2.setColumns(10);

		line4Input3 = new JTextField();
		line4Input3.setColumns(10);
		
		line4mult3 = new JTextField();
		line4mult3.setText("*");
		line4mult3.setEditable(false);
		line4mult3.setColumns(10);

		line4Input4 = new JTextField();
		line4Input4.setColumns(10);

		line4eqReturn = new JTextField();
		line4eqReturn.setText("= return");
		line4eqReturn.setEditable(false);
		line4eqReturn.setColumns(10);

		line4Input5 = new JTextField();
		line4Input5.setColumns(10);

		/*
		 * 
		 * LINE FIVE
		 * 
		 */
		
		line5Return = new JTextField();
		line5Return.setEditable(false);
		line5Return.setText("return");
		line5Return.setColumns(10);
		
		line5Fact = new JTextField();
		line5Fact.setText("fact(");
		line5Fact.setEditable(false);
		line5Fact.setColumns(10);

		line5Input1 = new JTextField();
		line5Input1.setColumns(10);

		line5mult1 = new JTextField();
		line5mult1.setText("*");
		line5mult1.setEditable(false);
		line5mult1.setColumns(10);


		line5Bracket = new JTextField();
		line5Bracket.setText(")");
		line5Bracket.setEditable(false);
		line5Bracket.setColumns(10);


		line5Input2 = new JTextField();
		line5Input2.setColumns(10);

		line5mult2 = new JTextField();
		line5mult2.setText("*");
		line5mult2.setEditable(false);
		line5mult2.setColumns(10);

		line5Input3 = new JTextField();
		line5Input3.setColumns(10);

		line5mult3 = new JTextField();
		line5mult3.setText("*");
		line5mult3.setEditable(false);
		line5mult3.setColumns(10);

		line5mult4 = new JTextField();
		line5mult4.setText("*");
		line5mult4.setEditable(false);
		line5mult4.setColumns(10);

		line5Input4 = new JTextField();
		line5Input4.setColumns(10);

		line5Input5 = new JTextField();
		line5Input5.setColumns(10);

		line5eqReturn = new JTextField();
		line5eqReturn.setText("= return");
		line5eqReturn.setEditable(false);
		line5eqReturn.setColumns(10);

		line5Input6 = new JTextField();
		line5Input6.setColumns(10);

		/*
		 * 
		 * LINE SIX
		 * 
		 */
		
		line6Return = new JTextField();
		line6Return.setEditable(false);
		line6Return.setText("return");
		line6Return.setColumns(10);
		
		line6Fact = new JTextField();
		line6Fact.setText("fact(");
		line6Fact.setEditable(false);
		line6Fact.setColumns(10);
		
		line6Input1 = new JTextField();
		line6Input1.setColumns(10);

		line6mult1 = new JTextField();
		line6mult1.setText("*");
		line6mult1.setEditable(false);
		line6mult1.setColumns(10);

		line6Bracket = new JTextField();
		line6Bracket.setText(")");
		line6Bracket.setEditable(false);
		line6Bracket.setColumns(10);


		line6Input2 = new JTextField();
		line6Input2.setColumns(10);

		line6mult2 = new JTextField();
		line6mult2.setText("*");
		line6mult2.setEditable(false);
		line6mult2.setColumns(10);

		line6Input3 = new JTextField();
		line6Input3.setColumns(10);

		line6mult3 = new JTextField();
		line6mult3.setText("*");
		line6mult3.setEditable(false);
		line6mult3.setColumns(10);

		line6mult4 = new JTextField();
		line6mult4.setText("*");
		line6mult4.setEditable(false);
		line6mult4.setColumns(10);

		line6Input4 = new JTextField();
		line6Input4.setColumns(10);

		line6Input5 = new JTextField();
		line6Input5.setColumns(10);

		line6mult5 = new JTextField();
		line6mult5.setText("*");
		line6mult5.setEditable(false);
		line6mult5.setColumns(10);

		line6Input6 = new JTextField();
		line6Input6.setColumns(10);

		line6eqReturn = new JTextField();
		line6eqReturn.setText("= return");
		line6eqReturn.setEditable(false);
		line6eqReturn.setColumns(10);

		line6Input7 = new JTextField();
		line6Input7.setColumns(10);

		/*
		 * 
		 * LINE SEVEN
		 * 
		 */
		
		line7Return = new JTextField();
		line7Return.setEditable(false);
		line7Return.setText("return");
		line7Return.setColumns(10);
		
		line7Fact = new JTextField();
		line7Fact.setText("fact(");
		line7Fact.setEditable(false);
		line7Fact.setColumns(10);
		
		line7Input1 = new JTextField();
		line7Input1.setColumns(10);

		line7mult1 = new JTextField();
		line7mult1.setText("*");
		line7mult1.setEditable(false);
		line7mult1.setColumns(10);

		line7Bracket = new JTextField();
		line7Bracket.setText(")");
		line7Bracket.setEditable(false);
		line7Bracket.setColumns(10);


		line7Input2 = new JTextField();
		line7Input2.setColumns(10);

		line7mult2 = new JTextField();
		line7mult2.setText("*");
		line7mult2.setEditable(false);
		line7mult2.setColumns(10);

		line7Input3 = new JTextField();
		line7Input3.setColumns(10);

		line7mult3 = new JTextField();
		line7mult3.setText("*");
		line7mult3.setEditable(false);
		line7mult3.setColumns(10);

		line7mult4 = new JTextField();
		line7mult4.setText("*");
		line7mult4.setEditable(false);
		line7mult4.setColumns(10);

		line7Input4 = new JTextField();
		line7Input4.setColumns(10);

		line7Input5 = new JTextField();
		line7Input5.setColumns(10);

		line7mult5 = new JTextField();
		line7mult5.setText("*");
		line7mult5.setEditable(false);
		line7mult5.setColumns(10);

		line7Input6 = new JTextField();
		line7Input6.setColumns(10);

		line7mult6 = new JTextField();
		line7mult6.setText("*");
		line7mult6.setEditable(false);
		line7mult6.setColumns(10);

		line7Input7 = new JTextField();
		line7Input7.setColumns(10);

		line7eqReturn = new JTextField();
		line7eqReturn.setText("= return");
		line7eqReturn.setEditable(false);
		line7eqReturn.setColumns(10);

		line7Input8 = new JTextField();
		line7Input8.setColumns(10);



		/*
		 * 
		 * LINE EIGHT
		 * 
		 */
		
		
		line8Return = new JTextField();
		line8Return.setEditable(false);
		line8Return.setText("return");
		line8Return.setColumns(10);
		
		line8Fact = new JTextField();
		line8Fact.setText("fact(");
		line8Fact.setEditable(false);
		line8Fact.setColumns(10);
		
		line8Input1 = new JTextField();
		line8Input1.setColumns(10);

		line8mult1 = new JTextField();
		line8mult1.setText("*");
		line8mult1.setEditable(false);
		line8mult1.setColumns(10);

		line8Bracket = new JTextField();
		line8Bracket.setText(")");
		line8Bracket.setEditable(false);
		line8Bracket.setColumns(10);

		line8Input2 = new JTextField();
		line8Input2.setColumns(10);

		line8mult2 = new JTextField();
		line8mult2.setText("*");
		line8mult2.setEditable(false);
		line8mult2.setColumns(10);

		line8Input3 = new JTextField();
		line8Input3.setColumns(10);

		line8mult3 = new JTextField();
		line8mult3.setText("*");
		line8mult3.setEditable(false);
		line8mult3.setColumns(10);

		line8mult4 = new JTextField();
		line8mult4.setText("*");
		line8mult4.setEditable(false);
		line8mult4.setColumns(10);

		line8Input4 = new JTextField();
		line8Input4.setColumns(10);

		line8Input5 = new JTextField();
		line8Input5.setColumns(10);

		line8mult5 = new JTextField();
		line8mult5.setText("*");
		line8mult5.setEditable(false);
		line8mult5.setColumns(10);

		line8Input6 = new JTextField();
		line8Input6.setColumns(10);
		
		line8mult6 = new JTextField();
		line8mult6.setText("*");
		line8mult6.setEditable(false);
		line8mult6.setColumns(10);

		line8mult7 = new JTextField();
		line8mult7.setText("*");
		line8mult7.setEditable(false);
		line8mult7.setColumns(10);

		line8Input7 = new JTextField();
		line8Input7.setColumns(10);
		
		line8Input8 = new JTextField();
		line8Input8.setColumns(10);

		line8eqReturn = new JTextField();
		line8eqReturn.setText("= return");
		line8eqReturn.setEditable(false);
		line8eqReturn.setColumns(10);

		line8Input9 = new JTextField();
		line8Input9.setColumns(10);

		/*
		 * 
		 * LINE NINE
		 * 
		 */
		
		
		line9Return = new JTextField();
		line9Return.setEditable(false);
		line9Return.setText("return");
		line9Return.setColumns(10);
		
		line9Fact = new JTextField();
		line9Fact.setText("fact(");
		line9Fact.setEditable(false);
		line9Fact.setColumns(10);
		
		line9Input1 = new JTextField();
		line9Input1.setColumns(10);
		
		line9mult1 = new JTextField();
		line9mult1.setText("*");
		line9mult1.setEditable(false);
		line9mult1.setColumns(10);

		line9Bracket = new JTextField();
		line9Bracket.setText(")");
		line9Bracket.setEditable(false);
		line9Bracket.setColumns(10);

		line9Input2 = new JTextField();
		line9Input2.setColumns(10);

		line9mult2 = new JTextField();
		line9mult2.setText("*");
		line9mult2.setEditable(false);
		line9mult2.setColumns(10);

		line9Input3 = new JTextField();
		line9Input3.setColumns(10);

		line9mult3 = new JTextField();
		line9mult3.setText("*");
		line9mult3.setEditable(false);
		line9mult3.setColumns(10);

		line9mult4 = new JTextField();
		line9mult4.setText("*");
		line9mult4.setEditable(false);
		line9mult4.setColumns(10);

		line9Input4 = new JTextField();
		line9Input4.setColumns(10);

		line9Input5 = new JTextField();
		line9Input5.setColumns(10);

		line9mult5 = new JTextField();
		line9mult5.setText("*");
		line9mult5.setEditable(false);
		line9mult5.setColumns(10);

		line9Input6 = new JTextField();
		line9Input6.setColumns(10);

		line9mult6 = new JTextField();
		line9mult6.setText("*");
		line9mult6.setEditable(false);
		line9mult6.setColumns(10);

		line9mult7 = new JTextField();
		line9mult7.setText("*");
		line9mult7.setEditable(false);
		line9mult7.setColumns(10);
		

		line9Input7 = new JTextField();
		line9Input7.setColumns(10);

		line9Input8 = new JTextField();
		line9Input8.setColumns(10);

		line9mult8 = new JTextField();
		line9mult8.setText("*");
		line9mult8.setEditable(false);
		line9mult8.setColumns(10);

		line9Input9 = new JTextField();
		line9Input9.setColumns(10);
		
		line9eqReturn = new JTextField();
		line9eqReturn.setText("= return");
		line9eqReturn.setEditable(false);
		line9eqReturn.setColumns(10);

		line9Input10 = new JTextField();
		line9Input10.setColumns(10);

		/*
		 * 
		 * LINE TEN
		 * 
		 */
		
		
		line10Return = new JTextField();
		line10Return.setEditable(false);
		line10Return.setText("return");
		line10Return.setColumns(10);
		
		line10Fact = new JTextField();
		line10Fact.setText("fact(");
		line10Fact.setEditable(false);
		line10Fact.setColumns(10);
		
		line10Input1 = new JTextField();
		line10Input1.setColumns(10);

		line10mult1 = new JTextField();
		line10mult1.setText("*");
		line10mult1.setEditable(false);
		line10mult1.setColumns(10);

		line10Bracket = new JTextField();
		line10Bracket.setText(")");
		line10Bracket.setEditable(false);
		line10Bracket.setColumns(10);

		line10Input2 = new JTextField();
		line10Input2.setColumns(10);

		line10mult2 = new JTextField();
		line10mult2.setText("*");
		line10mult2.setEditable(false);
		line10mult2.setColumns(10);

		line10Input3 = new JTextField();
		line10Input3.setColumns(10);

		line10mult3 = new JTextField();
		line10mult3.setText("*");
		line10mult3.setEditable(false);
		line10mult3.setColumns(10);

		line10mult4 = new JTextField();
		line10mult4.setText("*");
		line10mult4.setEditable(false);
		line10mult4.setColumns(10);

		line10Input4 = new JTextField();
		line10Input4.setColumns(10);

		line10Input5 = new JTextField();
		line10Input5.setColumns(10);

		line10mult5 = new JTextField();
		line10mult5.setText("*");
		line10mult5.setEditable(false);
		line10mult5.setColumns(10);

		line10Input6 = new JTextField();
		line10Input6.setColumns(10);

		line10mult6 = new JTextField();
		line10mult6.setText("*");
		line10mult6.setEditable(false);
		line10mult6.setColumns(10);

		line10mult7 = new JTextField();
		line10mult7.setText("*");
		line10mult7.setEditable(false);
		line10mult7.setColumns(10);
		
		line10Input7 = new JTextField();
		line10Input7.setColumns(10);

		line10Input8 = new JTextField();
		line10Input8.setColumns(10);

		line10mult8 = new JTextField();
		line10mult8.setText("*");
		line10mult8.setEditable(false);
		line10mult8.setColumns(10);

		line10Input9 = new JTextField();
		line10Input9.setColumns(10);
		
		line10mult9 = new JTextField();
		line10mult9.setText("*");
		line10mult9.setEditable(false);
		line10mult9.setColumns(10);
		
		line10Input10 = new JTextField();
		line10Input10.setColumns(10);
		
		line10eqReturn = new JTextField();
		line10eqReturn.setText("= return");
		line10eqReturn.setEditable(false);
		line10eqReturn.setColumns(10);

		line10Input11 = new JTextField();
		line10Input11.setColumns(10);

		/*
		 * 
		 * LINE ELEVEN
		 * 
		 */

		line11Return = new JTextField();
		line11Return.setEditable(false);
		line11Return.setText("return");
		line11Return.setColumns(10);

		line11Input1 = new JTextField();
		line11Input1.setColumns(10);

		line11mult1 = new JTextField();
		line11mult1.setText("*");
		line11mult1.setEditable(false);
		line11mult1.setColumns(10);

		line11Input2 = new JTextField();
		line11Input2.setColumns(10);

		line11mult2 = new JTextField();
		line11mult2.setText("*");
		line11mult2.setEditable(false);
		line11mult2.setColumns(10);

		line11Input3 = new JTextField();
		line11Input3.setColumns(10);

		line11mult3 = new JTextField();
		line11mult3.setText("*");
		line11mult3.setEditable(false);
		line11mult3.setColumns(10);

		line11Input4 = new JTextField();
		line11Input4.setColumns(10);

		line11mult4 = new JTextField();
		line11mult4.setText("*");
		line11mult4.setEditable(false);
		line11mult4.setColumns(10);

		line11Input5 = new JTextField();
		line11Input5.setColumns(10);

		line11mult5 = new JTextField();
		line11mult5.setText("*");
		line11mult5.setEditable(false);
		line11mult5.setColumns(10);

		line11Input6 = new JTextField();
		line11Input6.setColumns(10);

		line11mult6 = new JTextField();
		line11mult6.setText("*");
		line11mult6.setEditable(false);
		line11mult6.setColumns(10);

		line11mult7 = new JTextField();
		line11mult7.setText("*");
		line11mult7.setEditable(false);
		line11mult7.setColumns(10);

		line11Input7 = new JTextField();
		line11Input7.setColumns(10);

		line11Input8 = new JTextField();
		line11Input8.setColumns(10);

		line11mult8 = new JTextField();
		line11mult8.setText("*");
		line11mult8.setEditable(false);
		line11mult8.setColumns(10);

		line11Input9 = new JTextField();
		line11Input9.setColumns(10);

		line11mult9 = new JTextField();
		line11mult9.setText("*");
		line11mult9.setEditable(false);
		line11mult9.setColumns(10);

		line11Input10 = new JTextField();
		line11Input10.setColumns(10);

		line11eqReturn = new JTextField();
		line11eqReturn.setEditable(false);
		line11eqReturn.setText("= return");
		line11eqReturn.setColumns(10);

		line11Input11 = new JTextField();
		line11Input11.setColumns(10);


		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(347)
										.addComponent(lblExample))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(56)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(txtExample2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(line1Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(line1Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(line1Bracket, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
																.addGroup(groupLayout.createSequentialGroup()
																		.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
																				.addComponent(line2Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line3Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line4Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line5Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line6Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line7Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line8Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line9Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line10Return, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																				.addComponent(line11Return, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
																				.addPreferredGap(ComponentPlacement.RELATED)
																				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																						.addGroup(groupLayout.createSequentialGroup()
																								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
																										.addGroup(groupLayout.createSequentialGroup()
																												.addComponent(line11Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult7, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult8, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11mult9, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11Input10, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addComponent(line11eqReturn, 0, 0, Short.MAX_VALUE))
																												.addGroup(groupLayout.createSequentialGroup()
																														.addComponent(line10Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult7, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult8, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10mult9, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addComponent(line10Input10, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																														.addGroup(groupLayout.createSequentialGroup()
																																.addComponent(line8Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8mult4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8mult5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8mult6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8mult7, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(line8Input9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																																.addGroup(groupLayout.createSequentialGroup()
																																		.addComponent(line7Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7mult4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7mult5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7mult6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(ComponentPlacement.RELATED)
																																		.addComponent(line7Input8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																																		.addGroup(groupLayout.createSequentialGroup()
																																				.addComponent(line6Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6mult4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6mult5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Input6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(ComponentPlacement.RELATED)
																																				.addComponent(line6Input7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																																				.addGroup(groupLayout.createSequentialGroup()
																																						.addComponent(line5Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5mult4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(ComponentPlacement.RELATED)
																																						.addComponent(line5Input6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																																						.addGroup(groupLayout.createSequentialGroup()
																																								.addComponent(line4Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(ComponentPlacement.RELATED)
																																								.addComponent(line4Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																																								.addGroup(groupLayout.createSequentialGroup()
																																										.addComponent(line3Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(line3Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																																										.addGroup(groupLayout.createSequentialGroup()
																																												.addComponent(line2Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addComponent(line2Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addComponent(line2Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addComponent(line2mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addComponent(line2Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addComponent(line2eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addComponent(line2Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																																														.addGroup(groupLayout.createSequentialGroup()
																																																.addComponent(line10eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																																.addPreferredGap(ComponentPlacement.RELATED)
																																																.addComponent(line10Input11, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
																																																.addComponent(line11Input11, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
																																																.addGroup(groupLayout.createSequentialGroup()
																																																		.addComponent(line9Fact, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Bracket, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult7, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9mult8, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9eqReturn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(line9Input10, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))))))
																																																		.addContainerGap(129, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblExample)
						.addGap(35)
						.addComponent(txtExample2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(51)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(line1Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(line1Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(line1Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(line2Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(line2Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(line2Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(line2Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(line2mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(line2Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(line2eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(line2Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(line3Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(line3Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(line4Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(line4Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																.addComponent(line5Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5mult4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(line5Input6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(ComponentPlacement.RELATED)
																.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																		.addComponent(line6Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6mult4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6mult5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Input6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(line6Input7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																				.addComponent(line7Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7mult4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7mult5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7mult6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(line7Input8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																				.addPreferredGap(ComponentPlacement.RELATED)
																				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																						.addGroup(groupLayout.createSequentialGroup()
																								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																										.addComponent(line8Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																										.addComponent(line8Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																										.addComponent(line8Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																										.addComponent(line8Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																										.addComponent(line8mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																										.addComponent(line8Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																										.addComponent(line8mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(ComponentPlacement.RELATED)
																										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																												.addComponent(line9Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9mult8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(line9Input10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																												.addPreferredGap(ComponentPlacement.RELATED)
																												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																														.addComponent(line10Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Fact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Bracket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10mult9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																														.addComponent(line10Input11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																																.addComponent(line11Return, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11mult9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																.addComponent(line11Input11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																																.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																																		.addComponent(line8Input3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8mult3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8Input4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8mult4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8Input5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8mult5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8Input6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8mult6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8Input7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8mult7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8Input8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8eqReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																		.addComponent(line8Input9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																																		.addContainerGap(289, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}
}
