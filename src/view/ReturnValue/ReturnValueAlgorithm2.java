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
		lblExample.setBounds(347, 11, 49, 14);

		JTextArea txtExample2 = new JTextArea();
		txtExample2.setBounds(56, 60, 500, 76);
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
		line1Fact.setBounds(56, 190, 30, 14);
		line1Fact.setBorder(null);
		line1Fact.setEditable(false);
		line1Fact.setText("fact(");
		line1Fact.setColumns(10);
		
		line1Input1 = new JTextField();
		line1Input1.setBounds(89, 187, 22, 20);
		line1Input1.setColumns(10);

		line1Bracket = new JTextField();
		line1Bracket.setBounds(121, 190, 21, 14);
		line1Bracket.setBorder(null);
		line1Bracket.setEditable(false);
		line1Bracket.setText(");");
		line1Bracket.setColumns(10);

		
		/*
		 * 
		 * LINE TWO
		 * 
		 */

		line2Return = new JTextField();
		line2Return.setBounds(56, 215, 45, 14);
		line2Return.setBorder(null);
		line2Return.setText("return");
		line2Return.setEditable(false);
		line2Return.setColumns(10);
		
		line2Fact = new JTextField();
		line2Fact.setBounds(101, 216, 30, 14);
		line2Fact.setBorder(null);
		line2Fact.setText("fact(");
		line2Fact.setEditable(false);
		line2Fact.setColumns(10);

		line2Input1 = new JTextField();
		line2Input1.setBounds(137, 213, 22, 20);
		line2Input1.setColumns(10);
		
		line2mult1 = new JTextField();
		line2mult1.setBounds(182, 215, 12, 14);
		line2mult1.setBorder(null);
		line2mult1.setEditable(false);
		line2mult1.setText("*");
		line2mult1.setColumns(10);

		line2Bracket = new JTextField();
		line2Bracket.setBounds(165, 216, 14, 14);
		line2Bracket.setBorder(null);
		line2Bracket.setText(")");
		line2Bracket.setEditable(false);
		line2Bracket.setColumns(10);

		line2Input2 = new JTextField();
		line2Input2.setBounds(200, 212, 22, 20);
		line2Input2.setColumns(10);

		line2eqReturn = new JTextField();
		line2eqReturn.setBounds(231, 216, 50, 14);
		line2eqReturn.setBorder(null);
		line2eqReturn.setText("= return");
		line2eqReturn.setEditable(false);
		line2eqReturn.setColumns(10);

		line2Input3 = new JTextField();
		line2Input3.setBounds(287, 213, 22, 20);
		line2Input3.setColumns(10);
		
		/*
		 * 
		 * LINE THREE
		 * 
		 */

		line3Return = new JTextField();
		line3Return.setBounds(56, 240, 39, 14);
		line3Return.setBorder(null);
		line3Return.setText("return");
		line3Return.setEditable(false);
		line3Return.setColumns(10);
		
		line3Fact = new JTextField();
		line3Fact.setBounds(100, 240, 30, 14);
		line3Fact.setBorder(null);
		line3Fact.setText("fact(");
		line3Fact.setEditable(false);
		line3Fact.setColumns(10);
		
		line3Input1 = new JTextField();
		line3Input1.setBounds(136, 237, 22, 20);
		line3Input1.setColumns(10);

		line3mult1 = new JTextField();
		line3mult1.setBounds(182, 240, 12, 14);
		line3mult1.setBorder(null);
		line3mult1.setText("*");
		line3mult1.setEditable(false);
		line3mult1.setColumns(10);


		line3Bracket = new JTextField();
		line3Bracket.setBounds(164, 240, 14, 14);
		line3Bracket.setBorder(null);
		line3Bracket.setText(")");
		line3Bracket.setEditable(false);
		line3Bracket.setColumns(10);


		line3Input2 = new JTextField();
		line3Input2.setBounds(200, 237, 22, 20);
		line3Input2.setColumns(10);
		
		line3mult2 = new JTextField();
		line3mult2.setBounds(228, 240, 12, 14);
		line3mult2.setBorder(null);
		line3mult2.setText("*");
		line3mult2.setEditable(false);
		line3mult2.setColumns(10);
		
		line3Input3 = new JTextField();
		line3Input3.setBounds(246, 237, 22, 20);
		line3Input3.setColumns(10);

		line3eqReturn = new JTextField();
		line3eqReturn.setBounds(274, 240, 50, 14);
		line3eqReturn.setBorder(null);
		line3eqReturn.setText("= return");
		line3eqReturn.setEditable(false);
		line3eqReturn.setColumns(10);

		line3Input4 = new JTextField();
		line3Input4.setBounds(330, 237, 22, 20);
		line3Input4.setColumns(10);

		/*
		 * 
		 * LINE FOUR
		 * 
		 */
		
		line4Return = new JTextField();
		line4Return.setBounds(56, 265, 39, 14);
		line4Return.setBorder(null);
		line4Return.setText("return");
		line4Return.setEditable(false);
		line4Return.setColumns(10);
		
		line4Fact = new JTextField();
		line4Fact.setBounds(100, 265, 30, 14);
		line4Fact.setBorder(null);
		line4Fact.setText("fact(");
		line4Fact.setEditable(false);
		line4Fact.setColumns(10);

		line4Input1 = new JTextField();
		line4Input1.setBounds(136, 262, 22, 20);
		line4Input1.setColumns(10);

		line4mult1 = new JTextField();
		line4mult1.setBounds(182, 265, 12, 14);
		line4mult1.setBorder(null);
		line4mult1.setText("*");
		line4mult1.setEditable(false);
		line4mult1.setColumns(10);


		line4Bracket = new JTextField();
		line4Bracket.setBounds(164, 265, 14, 14);
		line4Bracket.setBorder(null);
		line4Bracket.setText(")");
		line4Bracket.setEditable(false);
		line4Bracket.setColumns(10);

		line4Input2 = new JTextField();
		line4Input2.setBounds(200, 262, 22, 20);
		line4Input2.setColumns(10);

		line4mult2 = new JTextField();
		line4mult2.setBounds(228, 265, 12, 14);
		line4mult2.setBorder(null);
		line4mult2.setText("*");
		line4mult2.setEditable(false);
		line4mult2.setColumns(10);

		line4Input3 = new JTextField();
		line4Input3.setBounds(246, 262, 22, 20);
		line4Input3.setColumns(10);
		
		line4mult3 = new JTextField();
		line4mult3.setBounds(274, 265, 12, 14);
		line4mult3.setBorder(null);
		line4mult3.setText("*");
		line4mult3.setEditable(false);
		line4mult3.setColumns(10);

		line4Input4 = new JTextField();
		line4Input4.setBounds(292, 262, 22, 20);
		line4Input4.setColumns(10);

		line4eqReturn = new JTextField();
		line4eqReturn.setBounds(320, 265, 50, 14);
		line4eqReturn.setBorder(null);
		line4eqReturn.setText("= return");
		line4eqReturn.setEditable(false);
		line4eqReturn.setColumns(10);

		line4Input5 = new JTextField();
		line4Input5.setBounds(374, 262, 22, 20);
		line4Input5.setColumns(10);

		/*
		 * 
		 * LINE FIVE
		 * 
		 */
		
		line5Return = new JTextField();
		line5Return.setBounds(56, 290, 39, 14);
		line5Return.setBorder(null);
		line5Return.setEditable(false);
		line5Return.setText("return");
		line5Return.setColumns(10);
		
		line5Fact = new JTextField();
		line5Fact.setBounds(100, 290, 30, 14);
		line5Fact.setBorder(null);
		line5Fact.setText("fact(");
		line5Fact.setEditable(false);
		line5Fact.setColumns(10);

		line5Input1 = new JTextField();
		line5Input1.setBounds(136, 287, 22, 20);
		line5Input1.setColumns(10);

		line5mult1 = new JTextField();
		line5mult1.setBounds(182, 290, 12, 14);
		line5mult1.setBorder(null);
		line5mult1.setText("*");
		line5mult1.setEditable(false);
		line5mult1.setColumns(10);


		line5Bracket = new JTextField();
		line5Bracket.setBounds(162, 290, 14, 14);
		line5Bracket.setBorder(null);
		line5Bracket.setText(")");
		line5Bracket.setEditable(false);
		line5Bracket.setColumns(10);


		line5Input2 = new JTextField();
		line5Input2.setBounds(200, 287, 22, 20);
		line5Input2.setColumns(10);

		line5mult2 = new JTextField();
		line5mult2.setBounds(228, 290, 12, 14);
		line5mult2.setBorder(null);
		line5mult2.setText("*");
		line5mult2.setEditable(false);
		line5mult2.setColumns(10);

		line5Input3 = new JTextField();
		line5Input3.setBounds(246, 287, 22, 20);
		line5Input3.setColumns(10);

		line5mult3 = new JTextField();
		line5mult3.setBounds(274, 290, 12, 14);
		line5mult3.setBorder(null);
		line5mult3.setText("*");
		line5mult3.setEditable(false);
		line5mult3.setColumns(10);

		line5mult4 = new JTextField();
		line5mult4.setBounds(320, 290, 12, 14);
		line5mult4.setBorder(null);
		line5mult4.setText("*");
		line5mult4.setEditable(false);
		line5mult4.setColumns(10);

		line5Input4 = new JTextField();
		line5Input4.setBounds(292, 287, 22, 20);
		line5Input4.setColumns(10);

		line5Input5 = new JTextField();
		line5Input5.setBounds(338, 287, 22, 20);
		line5Input5.setColumns(10);

		line5eqReturn = new JTextField();
		line5eqReturn.setBounds(366, 290, 50, 14);
		line5eqReturn.setBorder(null);
		line5eqReturn.setText("= return");
		line5eqReturn.setEditable(false);
		line5eqReturn.setColumns(10);

		line5Input6 = new JTextField();
		line5Input6.setBounds(422, 287, 22, 20);
		line5Input6.setColumns(10);

		/*
		 * 
		 * LINE SIX
		 * 
		 */
		
		line6Return = new JTextField();
		line6Return.setBounds(56, 315, 39, 14);
		line6Return.setBorder(null);
		line6Return.setEditable(false);
		line6Return.setText("return");
		line6Return.setColumns(10);
		
		line6Fact = new JTextField();
		line6Fact.setBounds(100, 315, 30, 14);
		line6Fact.setBorder(null);
		line6Fact.setText("fact(");
		line6Fact.setEditable(false);
		line6Fact.setColumns(10);
		
		line6Input1 = new JTextField();
		line6Input1.setBounds(136, 312, 22, 20);
		line6Input1.setColumns(10);

		line6mult1 = new JTextField();
		line6mult1.setBounds(182, 315, 12, 14);
		line6mult1.setBorder(null);
		line6mult1.setText("*");
		line6mult1.setEditable(false);
		line6mult1.setColumns(10);

		line6Bracket = new JTextField();
		line6Bracket.setBounds(162, 315, 14, 14);
		line6Bracket.setBorder(null);
		line6Bracket.setText(")");
		line6Bracket.setEditable(false);
		line6Bracket.setColumns(10);


		line6Input2 = new JTextField();
		line6Input2.setBounds(200, 312, 22, 20);
		line6Input2.setColumns(10);

		line6mult2 = new JTextField();
		line6mult2.setBounds(228, 315, 12, 14);
		line6mult2.setBorder(null);
		line6mult2.setText("*");
		line6mult2.setEditable(false);
		line6mult2.setColumns(10);

		line6Input3 = new JTextField();
		line6Input3.setBounds(246, 312, 22, 20);
		line6Input3.setColumns(10);

		line6mult3 = new JTextField();
		line6mult3.setBounds(274, 315, 12, 14);
		line6mult3.setBorder(null);
		line6mult3.setText("*");
		line6mult3.setEditable(false);
		line6mult3.setColumns(10);

		line6mult4 = new JTextField();
		line6mult4.setBounds(320, 315, 12, 14);
		line6mult4.setBorder(null);
		line6mult4.setText("*");
		line6mult4.setEditable(false);
		line6mult4.setColumns(10);

		line6Input4 = new JTextField();
		line6Input4.setBounds(292, 312, 22, 20);
		line6Input4.setColumns(10);

		line6Input5 = new JTextField();
		line6Input5.setBounds(338, 312, 22, 20);
		line6Input5.setColumns(10);

		line6mult5 = new JTextField();
		line6mult5.setBounds(366, 315, 12, 14);
		line6mult5.setBorder(null);
		line6mult5.setText("*");
		line6mult5.setEditable(false);
		line6mult5.setColumns(10);

		line6Input6 = new JTextField();
		line6Input6.setBounds(384, 312, 22, 20);
		line6Input6.setColumns(10);

		line6eqReturn = new JTextField();
		line6eqReturn.setBounds(412, 315, 50, 14);
		line6eqReturn.setBorder(null);
		line6eqReturn.setText("= return");
		line6eqReturn.setEditable(false);
		line6eqReturn.setColumns(10);

		line6Input7 = new JTextField();
		line6Input7.setBounds(468, 312, 22, 20);
		line6Input7.setColumns(10);

		/*
		 * 
		 * LINE SEVEN
		 * 
		 */
		
		line7Return = new JTextField();
		line7Return.setBounds(56, 340, 39, 14);
		line7Return.setBorder(null);
		line7Return.setEditable(false);
		line7Return.setText("return");
		line7Return.setColumns(10);
		
		line7Fact = new JTextField();
		line7Fact.setBounds(100, 340, 30, 14);
		line7Fact.setBorder(null);
		line7Fact.setText("fact(");
		line7Fact.setEditable(false);
		line7Fact.setColumns(10);
		
		line7Input1 = new JTextField();
		line7Input1.setBounds(136, 337, 22, 20);
		line7Input1.setColumns(10);

		line7mult1 = new JTextField();
		line7mult1.setBounds(182, 340, 12, 14);
		line7mult1.setBorder(null);
		line7mult1.setText("*");
		line7mult1.setEditable(false);
		line7mult1.setColumns(10);

		line7Bracket = new JTextField();
		line7Bracket.setBounds(164, 340, 14, 14);
		line7Bracket.setBorder(null);
		line7Bracket.setText(")");
		line7Bracket.setEditable(false);
		line7Bracket.setColumns(10);


		line7Input2 = new JTextField();
		line7Input2.setBounds(200, 337, 22, 20);
		line7Input2.setColumns(10);

		line7mult2 = new JTextField();
		line7mult2.setBounds(228, 340, 12, 14);
		line7mult2.setBorder(null);
		line7mult2.setText("*");
		line7mult2.setEditable(false);
		line7mult2.setColumns(10);

		line7Input3 = new JTextField();
		line7Input3.setBounds(246, 337, 22, 20);
		line7Input3.setColumns(10);

		line7mult3 = new JTextField();
		line7mult3.setBounds(274, 340, 12, 14);
		line7mult3.setBorder(null);
		line7mult3.setText("*");
		line7mult3.setEditable(false);
		line7mult3.setColumns(10);

		line7mult4 = new JTextField();
		line7mult4.setBounds(320, 340, 12, 14);
		line7mult4.setBorder(null);
		line7mult4.setText("*");
		line7mult4.setEditable(false);
		line7mult4.setColumns(10);

		line7Input4 = new JTextField();
		line7Input4.setBounds(292, 337, 22, 20);
		line7Input4.setColumns(10);

		line7Input5 = new JTextField();
		line7Input5.setBounds(338, 337, 22, 20);
		line7Input5.setColumns(10);

		line7mult5 = new JTextField();
		line7mult5.setBounds(366, 340, 12, 14);
		line7mult5.setBorder(null);
		line7mult5.setText("*");
		line7mult5.setEditable(false);
		line7mult5.setColumns(10);

		line7Input6 = new JTextField();
		line7Input6.setBounds(384, 337, 22, 20);
		line7Input6.setColumns(10);

		line7mult6 = new JTextField();
		line7mult6.setBounds(412, 340, 12, 14);
		line7mult6.setBorder(null);
		line7mult6.setText("*");
		line7mult6.setEditable(false);
		line7mult6.setColumns(10);

		line7Input7 = new JTextField();
		line7Input7.setBounds(430, 337, 22, 20);
		line7Input7.setColumns(10);

		line7eqReturn = new JTextField();
		line7eqReturn.setBounds(458, 340, 50, 14);
		line7eqReturn.setBorder(null);
		line7eqReturn.setText("= return");
		line7eqReturn.setEditable(false);
		line7eqReturn.setColumns(10);

		line7Input8 = new JTextField();
		line7Input8.setBounds(514, 337, 22, 20);
		line7Input8.setColumns(10);



		/*
		 * 
		 * LINE EIGHT
		 * 
		 */
		
		
		line8Return = new JTextField();
		line8Return.setBounds(56, 365, 39, 14);
		line8Return.setBorder(null);
		line8Return.setEditable(false);
		line8Return.setText("return");
		line8Return.setColumns(10);
		
		line8Fact = new JTextField();
		line8Fact.setBounds(100, 365, 30, 14);
		line8Fact.setBorder(null);
		line8Fact.setText("fact(");
		line8Fact.setEditable(false);
		line8Fact.setColumns(10);
		
		line8Input1 = new JTextField();
		line8Input1.setBounds(136, 362, 22, 20);
		line8Input1.setColumns(10);

		line8mult1 = new JTextField();
		line8mult1.setBounds(182, 365, 12, 14);
		line8mult1.setBorder(null);
		line8mult1.setText("*");
		line8mult1.setEditable(false);
		line8mult1.setColumns(10);

		line8Bracket = new JTextField();
		line8Bracket.setBounds(164, 365, 14, 14);
		line8Bracket.setBorder(null);
		line8Bracket.setText(")");
		line8Bracket.setEditable(false);
		line8Bracket.setColumns(10);

		line8Input2 = new JTextField();
		line8Input2.setBounds(200, 362, 22, 20);
		line8Input2.setColumns(10);

		line8mult2 = new JTextField();
		line8mult2.setBounds(228, 365, 12, 14);
		line8mult2.setBorder(null);
		line8mult2.setText("*");
		line8mult2.setEditable(false);
		line8mult2.setColumns(10);

		line8Input3 = new JTextField();
		line8Input3.setBounds(246, 362, 22, 20);
		line8Input3.setColumns(10);

		line8mult3 = new JTextField();
		line8mult3.setBounds(274, 365, 12, 14);
		line8mult3.setBorder(null);
		line8mult3.setText("*");
		line8mult3.setEditable(false);
		line8mult3.setColumns(10);

		line8mult4 = new JTextField();
		line8mult4.setBounds(320, 365, 12, 14);
		line8mult4.setBorder(null);
		line8mult4.setText("*");
		line8mult4.setEditable(false);
		line8mult4.setColumns(10);

		line8Input4 = new JTextField();
		line8Input4.setBounds(292, 362, 22, 20);
		line8Input4.setColumns(10);

		line8Input5 = new JTextField();
		line8Input5.setBounds(338, 362, 22, 20);
		line8Input5.setColumns(10);

		line8mult5 = new JTextField();
		line8mult5.setBounds(366, 365, 12, 14);
		line8mult5.setBorder(null);
		line8mult5.setText("*");
		line8mult5.setEditable(false);
		line8mult5.setColumns(10);

		line8Input6 = new JTextField();
		line8Input6.setBounds(384, 362, 22, 20);
		line8Input6.setColumns(10);
		
		line8mult6 = new JTextField();
		line8mult6.setBounds(412, 365, 12, 14);
		line8mult6.setBorder(null);
		line8mult6.setText("*");
		line8mult6.setEditable(false);
		line8mult6.setColumns(10);

		line8mult7 = new JTextField();
		line8mult7.setBounds(458, 365, 12, 14);
		line8mult7.setBorder(null);
		line8mult7.setText("*");
		line8mult7.setEditable(false);
		line8mult7.setColumns(10);

		line8Input7 = new JTextField();
		line8Input7.setBounds(430, 362, 22, 20);
		line8Input7.setColumns(10);
		
		line8Input8 = new JTextField();
		line8Input8.setBounds(476, 362, 22, 20);
		line8Input8.setColumns(10);

		line8eqReturn = new JTextField();
		line8eqReturn.setBounds(504, 365, 50, 14);
		line8eqReturn.setBorder(null);
		line8eqReturn.setText("= return");
		line8eqReturn.setEditable(false);
		line8eqReturn.setColumns(10);

		line8Input9 = new JTextField();
		line8Input9.setBounds(560, 362, 22, 20);
		line8Input9.setColumns(10);

		/*
		 * 
		 * LINE NINE
		 * 
		 */
		
		
		line9Return = new JTextField();
		line9Return.setBounds(56, 390, 39, 14);
		line9Return.setBorder(null);
		line9Return.setEditable(false);
		line9Return.setText("return");
		line9Return.setColumns(10);
		
		line9Fact = new JTextField();
		line9Fact.setBounds(100, 390, 30, 14);
		line9Fact.setBorder(null);
		line9Fact.setText("fact(");
		line9Fact.setEditable(false);
		line9Fact.setColumns(10);
		
		line9Input1 = new JTextField();
		line9Input1.setBounds(136, 387, 22, 20);
		line9Input1.setColumns(10);
		
		line9mult1 = new JTextField();
		line9mult1.setBounds(182, 390, 12, 14);
		line9mult1.setBorder(null);
		line9mult1.setText("*");
		line9mult1.setEditable(false);
		line9mult1.setColumns(10);

		line9Bracket = new JTextField();
		line9Bracket.setBounds(164, 390, 14, 14);
		line9Bracket.setBorder(null);
		line9Bracket.setText(")");
		line9Bracket.setEditable(false);
		line9Bracket.setColumns(10);

		line9Input2 = new JTextField();
		line9Input2.setBounds(200, 387, 22, 20);
		line9Input2.setColumns(10);

		line9mult2 = new JTextField();
		line9mult2.setBounds(228, 390, 12, 14);
		line9mult2.setBorder(null);
		line9mult2.setText("*");
		line9mult2.setEditable(false);
		line9mult2.setColumns(10);

		line9Input3 = new JTextField();
		line9Input3.setBounds(246, 387, 22, 20);
		line9Input3.setColumns(10);

		line9mult3 = new JTextField();
		line9mult3.setBounds(274, 390, 12, 14);
		line9mult3.setBorder(null);
		line9mult3.setText("*");
		line9mult3.setEditable(false);
		line9mult3.setColumns(10);

		line9mult4 = new JTextField();
		line9mult4.setBounds(320, 390, 12, 14);
		line9mult4.setBorder(null);
		line9mult4.setText("*");
		line9mult4.setEditable(false);
		line9mult4.setColumns(10);

		line9Input4 = new JTextField();
		line9Input4.setBounds(292, 387, 22, 20);
		line9Input4.setColumns(10);

		line9Input5 = new JTextField();
		line9Input5.setBounds(338, 387, 22, 20);
		line9Input5.setColumns(10);

		line9mult5 = new JTextField();
		line9mult5.setBounds(366, 390, 12, 14);
		line9mult5.setBorder(null);
		line9mult5.setText("*");
		line9mult5.setEditable(false);
		line9mult5.setColumns(10);

		line9Input6 = new JTextField();
		line9Input6.setBounds(384, 387, 22, 20);
		line9Input6.setColumns(10);

		line9mult6 = new JTextField();
		line9mult6.setBounds(412, 390, 12, 14);
		line9mult6.setBorder(null);
		line9mult6.setText("*");
		line9mult6.setEditable(false);
		line9mult6.setColumns(10);

		line9mult7 = new JTextField();
		line9mult7.setBounds(458, 390, 12, 14);
		line9mult7.setBorder(null);
		line9mult7.setText("*");
		line9mult7.setEditable(false);
		line9mult7.setColumns(10);
		

		line9Input7 = new JTextField();
		line9Input7.setBounds(430, 387, 22, 20);
		line9Input7.setColumns(10);

		line9Input8 = new JTextField();
		line9Input8.setBounds(476, 387, 22, 20);
		line9Input8.setColumns(10);

		line9mult8 = new JTextField();
		line9mult8.setBounds(504, 390, 12, 14);
		line9mult8.setBorder(null);
		line9mult8.setText("*");
		line9mult8.setEditable(false);
		line9mult8.setColumns(10);

		line9Input9 = new JTextField();
		line9Input9.setBounds(526, 387, 22, 20);
		line9Input9.setColumns(10);
		
		line9eqReturn = new JTextField();
		line9eqReturn.setBounds(560, 390, 50, 14);
		line9eqReturn.setBorder(null);
		line9eqReturn.setText("= return");
		line9eqReturn.setEditable(false);
		line9eqReturn.setColumns(10);

		line9Input10 = new JTextField();
		line9Input10.setBounds(620, 387, 22, 20);
		line9Input10.setColumns(10);

		/*
		 * 
		 * LINE TEN
		 * 
		 */
		
		
		line10Return = new JTextField();
		line10Return.setBounds(56, 415, 35, 14);
		line10Return.setBorder(null);
		line10Return.setEditable(false);
		line10Return.setText("return");
		line10Return.setColumns(10);
		
		line10Fact = new JTextField();
		line10Fact.setBounds(100, 415, 30, 14);
		line10Fact.setBorder(null);
		line10Fact.setText("fact(");
		line10Fact.setEditable(false);
		line10Fact.setColumns(10);
		
		line10Input1 = new JTextField();
		line10Input1.setBounds(136, 412, 22, 20);
		line10Input1.setColumns(10);

		line10mult1 = new JTextField();
		line10mult1.setBounds(182, 415, 12, 14);
		line10mult1.setBorder(null);
		line10mult1.setText("*");
		line10mult1.setEditable(false);
		line10mult1.setColumns(10);

		line10Bracket = new JTextField();
		line10Bracket.setBounds(164, 415, 14, 14);
		line10Bracket.setBorder(null);
		line10Bracket.setText(")");
		line10Bracket.setEditable(false);
		line10Bracket.setColumns(10);

		line10Input2 = new JTextField();
		line10Input2.setBounds(200, 412, 22, 20);
		line10Input2.setColumns(10);

		line10mult2 = new JTextField();
		line10mult2.setBounds(228, 415, 12, 14);
		line10mult2.setBorder(null);
		line10mult2.setText("*");
		line10mult2.setEditable(false);
		line10mult2.setColumns(10);

		line10Input3 = new JTextField();
		line10Input3.setBounds(246, 412, 22, 20);
		line10Input3.setColumns(10);

		line10mult3 = new JTextField();
		line10mult3.setBounds(274, 415, 12, 14);
		line10mult3.setBorder(null);
		line10mult3.setText("*");
		line10mult3.setEditable(false);
		line10mult3.setColumns(10);

		line10mult4 = new JTextField();
		line10mult4.setBounds(320, 415, 12, 14);
		line10mult4.setBorder(null);
		line10mult4.setText("*");
		line10mult4.setEditable(false);
		line10mult4.setColumns(10);

		line10Input4 = new JTextField();
		line10Input4.setBounds(292, 412, 22, 20);
		line10Input4.setColumns(10);

		line10Input5 = new JTextField();
		line10Input5.setBounds(338, 412, 22, 20);
		line10Input5.setColumns(10);

		line10mult5 = new JTextField();
		line10mult5.setBounds(366, 415, 12, 14);
		line10mult5.setBorder(null);
		line10mult5.setText("*");
		line10mult5.setEditable(false);
		line10mult5.setColumns(10);

		line10Input6 = new JTextField();
		line10Input6.setBounds(384, 412, 22, 20);
		line10Input6.setColumns(10);

		line10mult6 = new JTextField();
		line10mult6.setBounds(412, 415, 12, 14);
		line10mult6.setBorder(null);
		line10mult6.setText("*");
		line10mult6.setEditable(false);
		line10mult6.setColumns(10);

		line10mult7 = new JTextField();
		line10mult7.setBounds(458, 415, 12, 14);
		line10mult7.setBorder(null);
		line10mult7.setText("*");
		line10mult7.setEditable(false);
		line10mult7.setColumns(10);
		
		line10Input7 = new JTextField();
		line10Input7.setBounds(430, 412, 22, 20);
		line10Input7.setColumns(10);

		line10Input8 = new JTextField();
		line10Input8.setBounds(476, 412, 22, 20);
		line10Input8.setColumns(10);

		line10mult8 = new JTextField();
		line10mult8.setBounds(504, 415, 12, 14);
		line10mult8.setBorder(null);
		line10mult8.setText("*");
		line10mult8.setEditable(false);
		line10mult8.setColumns(10);

		line10Input9 = new JTextField();
		line10Input9.setBounds(526, 412, 22, 20);
		line10Input9.setColumns(10);
		
		line10mult9 = new JTextField();
		line10mult9.setBounds(558, 415, 12, 14);
		line10mult9.setBorder(null);
		line10mult9.setText("*");
		line10mult9.setEditable(false);
		line10mult9.setColumns(10);
		
		line10Input10 = new JTextField();
		line10Input10.setBounds(570, 412, 22, 20);
		line10Input10.setColumns(10);
		
		line10eqReturn = new JTextField();
		line10eqReturn.setBounds(604, 415, 50, 14);
		line10eqReturn.setBorder(null);
		line10eqReturn.setText("= return");
		line10eqReturn.setEditable(false);
		line10eqReturn.setColumns(10);

		line10Input11 = new JTextField();
		line10Input11.setBounds(664, 412, 22, 20);
		line10Input11.setColumns(10);

		/*
		 * 
		 * LINE ELEVEN
		 * 
		 */

		line11Return = new JTextField();
		line11Return.setBounds(56, 492, 39, 14);
		line11Return.setBorder(null);
		line11Return.setEditable(false);
		line11Return.setText("return");
		line11Return.setColumns(10);

		line11Input1 = new JTextField();
		line11Input1.setBounds(105, 489, 22, 20);
		line11Input1.setColumns(10);

		line11mult1 = new JTextField();
		line11mult1.setBounds(137, 492, 12, 14);
		line11mult1.setBorder(null);
		line11mult1.setText("*");
		line11mult1.setEditable(false);
		line11mult1.setColumns(10);

		line11Input2 = new JTextField();
		line11Input2.setBounds(159, 489, 22, 20);
		line11Input2.setColumns(10);

		line11mult2 = new JTextField();
		line11mult2.setBounds(191, 492, 12, 14);
		line11mult2.setBorder(null);
		line11mult2.setText("*");
		line11mult2.setEditable(false);
		line11mult2.setColumns(10);

		line11Input3 = new JTextField();
		line11Input3.setBounds(213, 489, 22, 20);
		line11Input3.setColumns(10);

		line11mult3 = new JTextField();
		line11mult3.setBounds(245, 492, 12, 14);
		line11mult3.setBorder(null);
		line11mult3.setText("*");
		line11mult3.setEditable(false);
		line11mult3.setColumns(10);

		line11Input4 = new JTextField();
		line11Input4.setBounds(267, 489, 22, 20);
		line11Input4.setColumns(10);

		line11mult4 = new JTextField();
		line11mult4.setBounds(302, 492, 12, 14);
		line11mult4.setBorder(null);
		line11mult4.setText("*");
		line11mult4.setEditable(false);
		line11mult4.setColumns(10);

		line11Input5 = new JTextField();
		line11Input5.setBounds(320, 489, 22, 20);
		line11Input5.setColumns(10);

		line11mult5 = new JTextField();
		line11mult5.setBounds(348, 492, 12, 14);
		line11mult5.setBorder(null);
		line11mult5.setText("*");
		line11mult5.setEditable(false);
		line11mult5.setColumns(10);

		line11Input6 = new JTextField();
		line11Input6.setBounds(366, 489, 22, 20);
		line11Input6.setColumns(10);

		line11mult6 = new JTextField();
		line11mult6.setBounds(394, 492, 12, 14);
		line11mult6.setBorder(null);
		line11mult6.setText("*");
		line11mult6.setEditable(false);
		line11mult6.setColumns(10);

		line11mult7 = new JTextField();
		line11mult7.setBounds(440, 492, 12, 14);
		line11mult7.setBorder(null);
		line11mult7.setText("*");
		line11mult7.setEditable(false);
		line11mult7.setColumns(10);

		line11Input7 = new JTextField();
		line11Input7.setBounds(412, 489, 22, 20);
		line11Input7.setColumns(10);

		line11Input8 = new JTextField();
		line11Input8.setBounds(458, 489, 22, 20);
		line11Input8.setColumns(10);

		line11mult8 = new JTextField();
		line11mult8.setBounds(490, 492, 12, 14);
		line11mult8.setBorder(null);
		line11mult8.setText("*");
		line11mult8.setEditable(false);
		line11mult8.setColumns(10);

		line11Input9 = new JTextField();
		line11Input9.setBounds(504, 489, 22, 20);
		line11Input9.setColumns(10);

		line11mult9 = new JTextField();
		line11mult9.setBounds(536, 492, 12, 14);
		line11mult9.setBorder(null);
		line11mult9.setText("*");
		line11mult9.setEditable(false);
		line11mult9.setColumns(10);

		line11Input10 = new JTextField();
		line11Input10.setBounds(558, 489, 22, 20);
		line11Input10.setColumns(10);

		line11eqReturn = new JTextField();
		line11eqReturn.setBounds(56, 555, 50, 14);
		line11eqReturn.setBorder(null);
		line11eqReturn.setEditable(false);
		line11eqReturn.setText("= return");
		line11eqReturn.setColumns(10);

		line11Input11 = new JTextField();
		line11Input11.setBounds(121, 552, 22, 20);
		line11Input11.setColumns(10);
		setLayout(null);
		add(lblExample);
		add(txtExample2);
		add(line3Return);
		add(line4Return);
		add(line5Return);
		add(line6Return);
		add(line7Return);
		add(line8Return);
		add(line9Return);
		add(line11Return);
		add(line2Return);
		add(line1Fact);
		add(line10Return);
		add(line1Input1);
		add(line1Bracket);
		add(line11Input1);
		add(line11mult1);
		add(line11Input2);
		add(line11mult2);
		add(line11Input3);
		add(line11mult3);
		add(line11Input4);
		add(line11mult4);
		add(line11Input5);
		add(line11mult5);
		add(line11Input6);
		add(line11mult6);
		add(line11Input7);
		add(line11mult7);
		add(line11Input8);
		add(line11mult8);
		add(line11Input9);
		add(line11mult9);
		add(line11Input10);
		add(line11eqReturn);
		add(line10Fact);
		add(line10Input1);
		add(line10Bracket);
		add(line10mult1);
		add(line10Input2);
		add(line10mult2);
		add(line10Input3);
		add(line10mult3);
		add(line10Input4);
		add(line10mult4);
		add(line10Input5);
		add(line10mult5);
		add(line10Input6);
		add(line10mult6);
		add(line10Input7);
		add(line10mult7);
		add(line10Input8);
		add(line10mult8);
		add(line10Input9);
		add(line10mult9);
		add(line10Input10);
		add(line8Fact);
		add(line8Input1);
		add(line8Bracket);
		add(line8mult1);
		add(line8Input2);
		add(line8mult2);
		add(line8Input3);
		add(line8mult3);
		add(line8Input4);
		add(line8mult4);
		add(line8Input5);
		add(line8mult5);
		add(line8Input6);
		add(line8mult6);
		add(line8Input7);
		add(line8mult7);
		add(line8Input8);
		add(line8eqReturn);
		add(line8Input9);
		add(line7Fact);
		add(line7Input1);
		add(line7Bracket);
		add(line7mult1);
		add(line7Input2);
		add(line7mult2);
		add(line7Input3);
		add(line7mult3);
		add(line7Input4);
		add(line7mult4);
		add(line7Input5);
		add(line7mult5);
		add(line7Input6);
		add(line7mult6);
		add(line7Input7);
		add(line7eqReturn);
		add(line7Input8);
		add(line6Fact);
		add(line6Input1);
		add(line6Bracket);
		add(line6mult1);
		add(line6Input2);
		add(line6mult2);
		add(line6Input3);
		add(line6mult3);
		add(line6Input4);
		add(line6mult4);
		add(line6Input5);
		add(line6mult5);
		add(line6Input6);
		add(line6eqReturn);
		add(line6Input7);
		add(line5Fact);
		add(line5Input1);
		add(line5Bracket);
		add(line5mult1);
		add(line5Input2);
		add(line5mult2);
		add(line5Input3);
		add(line5mult3);
		add(line5Input4);
		add(line5mult4);
		add(line5Input5);
		add(line5eqReturn);
		add(line5Input6);
		add(line4Fact);
		add(line4Input1);
		add(line4Bracket);
		add(line4mult1);
		add(line4Input2);
		add(line4mult2);
		add(line4Input3);
		add(line4mult3);
		add(line4Input4);
		add(line4eqReturn);
		add(line4Input5);
		add(line3Fact);
		add(line3Input1);
		add(line3Bracket);
		add(line3mult1);
		add(line3Input2);
		add(line3mult2);
		add(line3Input3);
		add(line3eqReturn);
		add(line3Input4);
		add(line2Fact);
		add(line2Input1);
		add(line2Bracket);
		add(line2mult1);
		add(line2Input2);
		add(line2eqReturn);
		add(line2Input3);
		add(line10eqReturn);
		add(line10Input11);
		add(line11Input11);
		add(line9Fact);
		add(line9Input1);
		add(line9Bracket);
		add(line9mult1);
		add(line9Input2);
		add(line9mult2);
		add(line9Input3);
		add(line9mult3);
		add(line9Input4);
		add(line9mult4);
		add(line9Input5);
		add(line9mult5);
		add(line9Input6);
		add(line9mult6);
		add(line9Input7);
		add(line9mult7);
		add(line9Input8);
		add(line9mult8);
		add(line9Input9);
		add(line9eqReturn);
		add(line9Input10);

	}
}