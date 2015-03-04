package view.ReturnValue;

/**
 * This GUI will be the second card example that the user will be able to work through.
 * 
 * 
 * @author Christopher Baillie
 * @version 1.2
 * @since 1.0
 * 
 */

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;

import model.IReturnValue;
import view.JTextFieldLimit;
import view.ReturnValue.AdvanceButtons.Algorithm2Button;

import javax.swing.JButton;

import controller.ReturnValue.RVSubmitAlg2Controller;
import java.awt.Font;


public class ReturnValueAlgorithm2 extends JPanel implements Observer {


	private static final long serialVersionUID = 558449680019022130L;
	
	/*
	 * LINE ONE
	 */

	private JTextField line1Fact;
	private JTextField line1Input1;
	private JTextField line1Bracket;


	/*
	 * LINE TWO
	 */
	private JTextField line2Return;
	private JTextField line2Fact;
	private JTextField line2Input1;
	private JTextField line2mult1;
	private JTextField line2Bracket;
	private JTextField line2Input2;

	/*
	 * LINE THREE
	 */
	private JTextField line3Return;
	private JTextField line3Fact;
	private JTextField line3Input1;
	private JTextField line3mult1;
	private JTextField line3Bracket;
	private JTextField line3Input2;
	private JTextField line3mult2;
	private JTextField line3Input3;

	/*
	 * LINE FOUR
	 */
	private JTextField line4Return;
	private JTextField line4Fact;
	private JTextField line4Input1;
	private JTextField line4mult1;
	private JTextField line4Bracket;
	private JTextField line4Input2;
	private JTextField line4mult2;
	private JTextField line4Input3;
	private JTextField line4mult3;
	private JTextField line4Input4;

	/*
	 * LINE FIVE
	 */
	private JTextField line5Return;
	private JTextField line5Fact;
	private JTextField line5Input1;
	private JTextField line5mult1;
	private JTextField line5Bracket;
	private JTextField line5Input2;
	private JTextField line5mult2;
	private JTextField line5Input3;
	private JTextField line5mult3;
	private JTextField line5Input4;
	private JTextField line5mult4;
	private JTextField line5Input5;

	/*
	 * LINE SIX
	 */
	private JTextField line6Return;
	private JTextField line6Fact;
	private JTextField line6Input1;
	private JTextField line6mult1;
	private JTextField line6Bracket;
	private JTextField line6Input2;
	private JTextField line6mult2;
	private JTextField line6Input3;
	private JTextField line6mult3;
	private JTextField line6Input4;
	private JTextField line6mult4;
	private JTextField line6Input5;
	private JTextField line6mult5;
	private JTextField line6Input6;

	/*
	 * LINE SEVEN
	 */
	private JTextField line7Return;
	private JTextField line7Fact;
	private JTextField line7Input1;
	private JTextField line7mult1;
	private JTextField line7Bracket;
	private JTextField line7Input2;
	private JTextField line7mult2;
	private JTextField line7Input3;
	private JTextField line7mult3;
	private JTextField line7Input4;
	private JTextField line7mult4;
	private JTextField line7Input5;
	private JTextField line7mult5;
	private JTextField line7Input6;
	private JTextField line7mult6;
	private JTextField line7Input7;

	/*
	 * LINE EIGHT
	 */
	private JTextField line8Return;
	private JTextField line8Fact;
	private JTextField line8Input1;
	private JTextField line8mult1;
	private JTextField line8Bracket;
	private JTextField line8Input2;
	private JTextField line8mult2;
	private JTextField line8Input3;
	private JTextField line8mult3;
	private JTextField line8Input4;
	private JTextField line8mult4;
	private JTextField line8Input5;
	private JTextField line8mult5;
	private JTextField line8Input6;
	private JTextField line8mult6;
	private JTextField line8Input7;
	private JTextField line8mult7;
	private JTextField line8Input8;

	/*
	 * LINE NINE
	 */
	private JTextField line9Return;
	private JTextField line9Fact;
	private JTextField line9Input1;
	private JTextField line9mult1;
	private JTextField line9Bracket;
	private JTextField line9Input2;
	private JTextField line9mult2;
	private JTextField line9Input3;
	private JTextField line9mult3;
	private JTextField line9Input4;
	private JTextField line9mult4;
	private JTextField line9Input5;
	private JTextField line9mult5;
	private JTextField line9Input6;
	private JTextField line9mult6;
	private JTextField line9Input7;
	private JTextField line9mult7;
	private JTextField line9Input8;
	private JTextField line9mult8;
	private JTextField line9Input9;

	/*
	 * LINE TEN
	 */
	private JTextField line10Return;
	private JTextField line10Fact;
	private JTextField line10Input1;
	private JTextField line10mult1;
	private JTextField line10Bracket;
	private JTextField line10mult2;
	private JTextField line10Input3;
	private JTextField line10mult3;
	private JTextField line10Input4;
	private JTextField line10mult4;
	private JTextField line10Input5;
	private JTextField line10mult5;
	private JTextField line10Input6;
	private JTextField line10mult6;
	private JTextField line10Input7;
	private JTextField line10mult7;
	private JTextField line10Input8;
	private JTextField line10mult8;
	private JTextField line10Input9;
	private JTextField line10mult9;
	private JTextField line10Input10;
	private JTextField line10Input2;

	/*
	 * LINE ELEVEN
	 */
	private JTextField line11Return;
	private JTextField line11Input1;
	private JTextField line11mult1;
	private JTextField line11Input2;
	private JTextField line11mult2;
	private JTextField line11Input3;
	private JTextField line11mult3;
	private JTextField line11Input4;
	private JTextField line11mult4;
	private JTextField line11Input5;
	private JTextField line11mult5;
	private JTextField line11Input6;
	private JTextField line11mult6;
	private JTextField line11Input7;
	private JTextField line11mult7;
	private JTextField line11Input8;
	private JTextField line11Input9;
	private JTextField line11mult9;
	private JTextField line11Input10;
	private JTextField line11mult8;

	/*
	 * LINE TWELVE
	 */
	private JTextField line12eqReturn;
	private JTextField line12Input1;


	private JTextArea txtExample2;

	private JButton btnSubmit;

	private int parameter;
	private int usersReturnValue;

	private boolean bool;

	private Algorithm2Button ab2;

	private IReturnValue model;

	private RVSubmitAlg2Controller rvs2C;

	/**
	 * Create the panel.
	 */
	public ReturnValueAlgorithm2(IReturnValue r,Algorithm2Button ab) {
		setFocusable(false);

		model = r;

		//Sets the button not visible, similar to the previous ReturnAlgorithm Class
		ab2 = ab;
		ab2.setNotVis();

		((Observable) r).addObserver(this);

		rvs2C = new RVSubmitAlg2Controller(model, this);

		JLabel lblExample = new JLabel("Example 2");
		lblExample.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblExample.setFocusable(false);
		lblExample.setBounds(347, 11, 87, 20);

		txtExample2 = new JTextArea();
		txtExample2.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtExample2.setFocusable(false);
		txtExample2.setBounds(56, 60, 667, 97);
		txtExample2.setText("As with the previous screen, you will be using the algorithim fact("+ getParameter() + ")\r\n\r\nPlease fill out each text field with the value you think corresponds to each step in the recursive call.\r\n");
		txtExample2.setBackground(UIManager.getColor("Panel.background"));
		txtExample2.setWrapStyleWord(true);
		txtExample2.setLineWrap(true);
		txtExample2.setEditable(false);

		/*
		 * LINE ONE 
		 * 
		 */

		line1Fact = new JTextField();
		line1Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line1Fact.setFocusable(false);
		line1Fact.setBounds(56, 190, 30, 14);
		line1Fact.setBorder(null);
		line1Fact.setEditable(false);
		line1Fact.setText("fact(");
		line1Fact.setColumns(10);

		line1Input1 = new JTextField();
		line1Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line1Input1.setBounds(89, 187, 22, 20);
		line1Input1.setColumns(10);
		line1Input1.setDocument(new JTextFieldLimit(2));

		line1Bracket = new JTextField();
		line1Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line1Bracket.setFocusable(false);
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
		line2Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line2Return.setFocusable(false);
		line2Return.setVisible(false);
		line2Return.setBounds(56, 215, 45, 14);
		line2Return.setBorder(null);
		line2Return.setText("return");
		line2Return.setEditable(false);
		line2Return.setColumns(10);

		line2Fact = new JTextField();
		line2Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line2Fact.setFocusable(false);
		line2Fact.setVisible(false);
		line2Fact.setBounds(101, 216, 30, 14);
		line2Fact.setBorder(null);
		line2Fact.setText("fact(");
		line2Fact.setEditable(false);
		line2Fact.setColumns(10);

		line2Input1 = new JTextField();
		line2Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line2Input1.setVisible(false);
		line2Input1.setBounds(137, 213, 22, 20);
		line2Input1.setColumns(10);
		line2Input1.setDocument(new JTextFieldLimit(2));

		line2mult1 = new JTextField();
		line2mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line2mult1.setFocusable(false);
		line2mult1.setVisible(false);
		line2mult1.setBounds(182, 215, 12, 14);
		line2mult1.setBorder(null);
		line2mult1.setEditable(false);
		line2mult1.setText("*");
		line2mult1.setColumns(10);

		line2Bracket = new JTextField();
		line2Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line2Bracket.setFocusable(false);
		line2Bracket.setVisible(false);
		line2Bracket.setBounds(165, 216, 14, 14);
		line2Bracket.setBorder(null);
		line2Bracket.setText(")");
		line2Bracket.setEditable(false);
		line2Bracket.setColumns(10);

		line2Input2 = new JTextField();
		line2Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line2Input2.setVisible(false);
		line2Input2.setBounds(200, 213, 22, 20);
		line2Input2.setColumns(10);
		line2Input2.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE THREE
		 * 
		 */

		line3Return = new JTextField();
		line3Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3Return.setFocusable(false);
		line3Return.setVisible(false);
		line3Return.setBounds(56, 240, 39, 14);
		line3Return.setBorder(null);
		line3Return.setText("return");
		line3Return.setEditable(false);
		line3Return.setColumns(10);

		line3Fact = new JTextField();
		line3Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3Fact.setFocusable(false);
		line3Fact.setVisible(false);
		line3Fact.setBounds(100, 240, 30, 14);
		line3Fact.setBorder(null);
		line3Fact.setText("fact(");
		line3Fact.setEditable(false);
		line3Fact.setColumns(10);

		line3Input1 = new JTextField();
		line3Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3Input1.setVisible(false);
		line3Input1.setBounds(136, 237, 22, 20);
		line3Input1.setColumns(10);
		line3Input1.setDocument(new JTextFieldLimit(2));

		line3mult1 = new JTextField();
		line3mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3mult1.setFocusable(false);
		line3mult1.setVisible(false);
		line3mult1.setBounds(182, 240, 12, 14);
		line3mult1.setBorder(null);
		line3mult1.setText("*");
		line3mult1.setEditable(false);
		line3mult1.setColumns(10);


		line3Bracket = new JTextField();
		line3Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3Bracket.setFocusable(false);
		line3Bracket.setVisible(false);
		line3Bracket.setBounds(164, 240, 14, 14);
		line3Bracket.setBorder(null);
		line3Bracket.setText(")");
		line3Bracket.setEditable(false);
		line3Bracket.setColumns(10);


		line3Input2 = new JTextField();
		line3Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3Input2.setVisible(false);
		line3Input2.setBounds(200, 237, 22, 20);
		line3Input2.setColumns(10);
		line3Input2.setDocument(new JTextFieldLimit(2));

		line3mult2 = new JTextField();
		line3mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3mult2.setFocusable(false);
		line3mult2.setVisible(false);
		line3mult2.setBounds(228, 240, 12, 14);
		line3mult2.setBorder(null);
		line3mult2.setText("*");
		line3mult2.setEditable(false);
		line3mult2.setColumns(10);

		line3Input3 = new JTextField();
		line3Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line3Input3.setVisible(false);
		line3Input3.setBounds(246, 237, 22, 20);
		line3Input3.setColumns(10);
		line3Input3.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE FOUR
		 * 
		 */

		line4Return = new JTextField();
		line4Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4Return.setFocusable(false);
		line4Return.setVisible(false);
		line4Return.setBounds(56, 265, 39, 14);
		line4Return.setBorder(null);
		line4Return.setText("return");
		line4Return.setEditable(false);
		line4Return.setColumns(10);

		line4Fact = new JTextField();
		line4Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4Fact.setFocusable(false);
		line4Fact.setVisible(false);
		line4Fact.setBounds(100, 265, 30, 14);
		line4Fact.setBorder(null);
		line4Fact.setText("fact(");
		line4Fact.setEditable(false);
		line4Fact.setColumns(10);

		line4Input1 = new JTextField();
		line4Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4Input1.setVisible(false);
		line4Input1.setBounds(136, 262, 22, 20);
		line4Input1.setColumns(10);
		line4Input1.setDocument(new JTextFieldLimit(2));

		line4mult1 = new JTextField();
		line4mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4mult1.setFocusable(false);
		line4mult1.setVisible(false);
		line4mult1.setBounds(182, 265, 12, 14);
		line4mult1.setBorder(null);
		line4mult1.setText("*");
		line4mult1.setEditable(false);
		line4mult1.setColumns(10);


		line4Bracket = new JTextField();
		line4Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4Bracket.setFocusable(false);
		line4Bracket.setVisible(false);
		line4Bracket.setBounds(164, 265, 14, 14);
		line4Bracket.setBorder(null);
		line4Bracket.setText(")");
		line4Bracket.setEditable(false);
		line4Bracket.setColumns(10);

		line4Input2 = new JTextField();
		line4Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4Input2.setVisible(false);
		line4Input2.setBounds(200, 262, 22, 20);
		line4Input2.setColumns(10);
		line4Input2.setDocument(new JTextFieldLimit(2));

		line4mult2 = new JTextField();
		line4mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4mult2.setFocusable(false);
		line4mult2.setVisible(false);
		line4mult2.setBounds(228, 265, 12, 14);
		line4mult2.setBorder(null);
		line4mult2.setText("*");
		line4mult2.setEditable(false);
		line4mult2.setColumns(10);

		line4Input3 = new JTextField();
		line4Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4Input3.setVisible(false);
		line4Input3.setBounds(246, 262, 22, 20);
		line4Input3.setColumns(10);
		line4Input3.setDocument(new JTextFieldLimit(2));

		line4mult3 = new JTextField();
		line4mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4mult3.setFocusable(false);
		line4mult3.setVisible(false);
		line4mult3.setBounds(274, 265, 12, 14);
		line4mult3.setBorder(null);
		line4mult3.setText("*");
		line4mult3.setEditable(false);
		line4mult3.setColumns(10);

		line4Input4 = new JTextField();
		line4Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line4Input4.setVisible(false);
		line4Input4.setBounds(292, 262, 22, 20);
		line4Input4.setColumns(10);
		line4Input4.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE FIVE
		 * 
		 */

		line5Return = new JTextField();
		line5Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Return.setFocusable(false);
		line5Return.setVisible(false);
		line5Return.setBounds(56, 290, 39, 14);
		line5Return.setBorder(null);
		line5Return.setEditable(false);
		line5Return.setText("return");
		line5Return.setColumns(10);

		line5Fact = new JTextField();
		line5Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Fact.setFocusable(false);
		line5Fact.setVisible(false);
		line5Fact.setBounds(100, 290, 30, 14);
		line5Fact.setBorder(null);
		line5Fact.setText("fact(");
		line5Fact.setEditable(false);
		line5Fact.setColumns(10);

		line5Input1 = new JTextField();
		line5Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Input1.setVisible(false);
		line5Input1.setBounds(136, 287, 22, 20);
		line5Input1.setColumns(10);
		line5Input1.setDocument(new JTextFieldLimit(2));

		line5mult1 = new JTextField();
		line5mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5mult1.setFocusable(false);
		line5mult1.setVisible(false);
		line5mult1.setBounds(182, 290, 12, 14);
		line5mult1.setBorder(null);
		line5mult1.setText("*");
		line5mult1.setEditable(false);
		line5mult1.setColumns(10);


		line5Bracket = new JTextField();
		line5Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Bracket.setFocusable(false);
		line5Bracket.setVisible(false);
		line5Bracket.setBounds(162, 290, 14, 14);
		line5Bracket.setBorder(null);
		line5Bracket.setText(")");
		line5Bracket.setEditable(false);
		line5Bracket.setColumns(10);


		line5Input2 = new JTextField();
		line5Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Input2.setVisible(false);
		line5Input2.setBounds(200, 287, 22, 20);
		line5Input2.setColumns(10);
		line5Input2.setDocument(new JTextFieldLimit(2));

		line5mult2 = new JTextField();
		line5mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5mult2.setFocusable(false);
		line5mult2.setVisible(false);
		line5mult2.setBounds(228, 290, 12, 14);
		line5mult2.setBorder(null);
		line5mult2.setText("*");
		line5mult2.setEditable(false);
		line5mult2.setColumns(10);

		line5Input3 = new JTextField();
		line5Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Input3.setVisible(false);
		line5Input3.setBounds(246, 287, 22, 20);
		line5Input3.setColumns(10);
		line5Input3.setDocument(new JTextFieldLimit(2));

		line5mult3 = new JTextField();
		line5mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5mult3.setFocusable(false);
		line5mult3.setVisible(false);
		line5mult3.setBounds(274, 290, 12, 14);
		line5mult3.setBorder(null);
		line5mult3.setText("*");
		line5mult3.setEditable(false);
		line5mult3.setColumns(10);

		line5mult4 = new JTextField();
		line5mult4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5mult4.setFocusable(false);
		line5mult4.setVisible(false);
		line5mult4.setBounds(320, 290, 12, 14);
		line5mult4.setBorder(null);
		line5mult4.setText("*");
		line5mult4.setEditable(false);
		line5mult4.setColumns(10);

		line5Input4 = new JTextField();
		line5Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Input4.setVisible(false);
		line5Input4.setBounds(292, 287, 22, 20);
		line5Input4.setColumns(10);
		line5Input4.setDocument(new JTextFieldLimit(2));

		line5Input5 = new JTextField();
		line5Input5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line5Input5.setVisible(false);
		line5Input5.setBounds(338, 287, 22, 20);
		line5Input5.setColumns(10);
		line5Input5.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE SIX
		 * 
		 */

		line6Return = new JTextField();
		line6Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Return.setFocusable(false);
		line6Return.setVisible(false);
		line6Return.setBounds(56, 315, 39, 14);
		line6Return.setBorder(null);
		line6Return.setEditable(false);
		line6Return.setText("return");
		line6Return.setColumns(10);

		line6Fact = new JTextField();
		line6Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Fact.setFocusable(false);
		line6Fact.setVisible(false);
		line6Fact.setBounds(100, 315, 30, 14);
		line6Fact.setBorder(null);
		line6Fact.setText("fact(");
		line6Fact.setEditable(false);
		line6Fact.setColumns(10);

		line6Input1 = new JTextField();
		line6Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Input1.setVisible(false);
		line6Input1.setBounds(136, 312, 22, 20);
		line6Input1.setColumns(10);
		line6Input1.setDocument(new JTextFieldLimit(2));

		line6mult1 = new JTextField();
		line6mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6mult1.setFocusable(false);
		line6mult1.setVisible(false);
		line6mult1.setBounds(182, 315, 12, 14);
		line6mult1.setBorder(null);
		line6mult1.setText("*");
		line6mult1.setEditable(false);
		line6mult1.setColumns(10);

		line6Bracket = new JTextField();
		line6Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Bracket.setFocusable(false);
		line6Bracket.setVisible(false);
		line6Bracket.setBounds(162, 315, 14, 14);
		line6Bracket.setBorder(null);
		line6Bracket.setText(")");
		line6Bracket.setEditable(false);
		line6Bracket.setColumns(10);


		line6Input2 = new JTextField();
		line6Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Input2.setVisible(false);
		line6Input2.setBounds(200, 312, 22, 20);
		line6Input2.setColumns(10);
		line6Input2.setDocument(new JTextFieldLimit(2));

		line6mult2 = new JTextField();
		line6mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6mult2.setFocusable(false);
		line6mult2.setVisible(false);
		line6mult2.setBounds(228, 315, 12, 14);
		line6mult2.setBorder(null);
		line6mult2.setText("*");
		line6mult2.setEditable(false);
		line6mult2.setColumns(10);

		line6Input3 = new JTextField();
		line6Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Input3.setVisible(false);
		line6Input3.setBounds(246, 312, 22, 20);
		line6Input3.setColumns(10);
		line6Input3.setDocument(new JTextFieldLimit(2));

		line6mult3 = new JTextField();
		line6mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6mult3.setFocusable(false);
		line6mult3.setVisible(false);
		line6mult3.setBounds(274, 315, 12, 14);
		line6mult3.setBorder(null);
		line6mult3.setText("*");
		line6mult3.setEditable(false);
		line6mult3.setColumns(10);

		line6mult4 = new JTextField();
		line6mult4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6mult4.setFocusable(false);
		line6mult4.setVisible(false);
		line6mult4.setBounds(320, 315, 12, 14);
		line6mult4.setBorder(null);
		line6mult4.setText("*");
		line6mult4.setEditable(false);
		line6mult4.setColumns(10);

		line6Input4 = new JTextField();
		line6Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Input4.setVisible(false);
		line6Input4.setBounds(292, 312, 22, 20);
		line6Input4.setColumns(10);
		line6Input4.setDocument(new JTextFieldLimit(2));

		line6Input5 = new JTextField();
		line6Input5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Input5.setVisible(false);
		line6Input5.setBounds(338, 312, 22, 20);
		line6Input5.setColumns(10);
		line6Input5.setDocument(new JTextFieldLimit(2));

		line6mult5 = new JTextField();
		line6mult5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6mult5.setFocusable(false);
		line6mult5.setVisible(false);
		line6mult5.setBounds(366, 315, 12, 14);
		line6mult5.setBorder(null);
		line6mult5.setText("*");
		line6mult5.setEditable(false);
		line6mult5.setColumns(10);

		line6Input6 = new JTextField();
		line6Input6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line6Input6.setVisible(false);
		line6Input6.setBounds(384, 312, 22, 20);
		line6Input6.setColumns(10);
		line6Input6.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE SEVEN
		 * 
		 */

		line7Return = new JTextField();
		line7Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Return.setFocusable(false);
		line7Return.setVisible(false);
		line7Return.setBounds(56, 340, 39, 14);
		line7Return.setBorder(null);
		line7Return.setEditable(false);
		line7Return.setText("return");
		line7Return.setColumns(10);

		line7Fact = new JTextField();
		line7Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Fact.setFocusable(false);
		line7Fact.setVisible(false);
		line7Fact.setBounds(100, 340, 30, 14);
		line7Fact.setBorder(null);
		line7Fact.setText("fact(");
		line7Fact.setEditable(false);
		line7Fact.setColumns(10);

		line7Input1 = new JTextField();
		line7Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Input1.setVisible(false);
		line7Input1.setBounds(136, 337, 22, 20);
		line7Input1.setColumns(10);
		line7Input1.setDocument(new JTextFieldLimit(2));

		line7mult1 = new JTextField();
		line7mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7mult1.setFocusable(false);
		line7mult1.setVisible(false);
		line7mult1.setBounds(182, 340, 12, 14);
		line7mult1.setBorder(null);
		line7mult1.setText("*");
		line7mult1.setEditable(false);
		line7mult1.setColumns(10);

		line7Bracket = new JTextField();
		line7Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Bracket.setFocusable(false);
		line7Bracket.setVisible(false);
		line7Bracket.setBounds(164, 340, 14, 14);
		line7Bracket.setBorder(null);
		line7Bracket.setText(")");
		line7Bracket.setEditable(false);
		line7Bracket.setColumns(10);


		line7Input2 = new JTextField();
		line7Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Input2.setVisible(false);
		line7Input2.setBounds(200, 337, 22, 20);
		line7Input2.setColumns(10);
		line7Input2.setDocument(new JTextFieldLimit(2));

		line7mult2 = new JTextField();
		line7mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7mult2.setFocusable(false);
		line7mult2.setVisible(false);
		line7mult2.setBounds(228, 340, 12, 14);
		line7mult2.setBorder(null);
		line7mult2.setText("*");
		line7mult2.setEditable(false);
		line7mult2.setColumns(10);

		line7Input3 = new JTextField();
		line7Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Input3.setVisible(false);
		line7Input3.setBounds(246, 337, 22, 20);
		line7Input3.setColumns(10);
		line7Input3.setDocument(new JTextFieldLimit(2));

		line7mult3 = new JTextField();
		line7mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7mult3.setFocusable(false);
		line7mult3.setVisible(false);
		line7mult3.setBounds(274, 340, 12, 14);
		line7mult3.setBorder(null);
		line7mult3.setText("*");
		line7mult3.setEditable(false);
		line7mult3.setColumns(10);

		line7mult4 = new JTextField();
		line7mult4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7mult4.setFocusable(false);
		line7mult4.setVisible(false);
		line7mult4.setBounds(320, 340, 12, 14);
		line7mult4.setBorder(null);
		line7mult4.setText("*");
		line7mult4.setEditable(false);
		line7mult4.setColumns(10);

		line7Input4 = new JTextField();
		line7Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Input4.setVisible(false);
		line7Input4.setBounds(292, 337, 22, 20);
		line7Input4.setColumns(10);
		line7Input4.setDocument(new JTextFieldLimit(2));

		line7Input5 = new JTextField();
		line7Input5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Input5.setVisible(false);
		line7Input5.setBounds(338, 337, 22, 20);
		line7Input5.setColumns(10);
		line7Input5.setDocument(new JTextFieldLimit(2));

		line7mult5 = new JTextField();
		line7mult5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7mult5.setFocusable(false);
		line7mult5.setVisible(false);
		line7mult5.setBounds(366, 340, 12, 14);
		line7mult5.setBorder(null);
		line7mult5.setText("*");
		line7mult5.setEditable(false);
		line7mult5.setColumns(10);

		line7Input6 = new JTextField();
		line7Input6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Input6.setVisible(false);
		line7Input6.setBounds(384, 337, 22, 20);
		line7Input6.setColumns(10);
		line7Input6.setDocument(new JTextFieldLimit(2));

		line7mult6 = new JTextField();
		line7mult6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7mult6.setFocusable(false);
		line7mult6.setVisible(false);
		line7mult6.setBounds(412, 340, 12, 14);
		line7mult6.setBorder(null);
		line7mult6.setText("*");
		line7mult6.setEditable(false);
		line7mult6.setColumns(10);

		line7Input7 = new JTextField();
		line7Input7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line7Input7.setVisible(false);
		line7Input7.setBounds(430, 337, 22, 20);
		line7Input7.setColumns(10);
		line7Input7.setDocument(new JTextFieldLimit(2));


		/*
		 * 
		 * LINE EIGHT
		 * 
		 */


		line8Return = new JTextField();
		line8Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Return.setFocusable(false);
		line8Return.setVisible(false);
		line8Return.setBounds(56, 365, 39, 14);
		line8Return.setBorder(null);
		line8Return.setEditable(false);
		line8Return.setText("return");
		line8Return.setColumns(10);

		line8Fact = new JTextField();
		line8Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Fact.setFocusable(false);
		line8Fact.setVisible(false);
		line8Fact.setBounds(100, 365, 30, 14);
		line8Fact.setBorder(null);
		line8Fact.setText("fact(");
		line8Fact.setEditable(false);
		line8Fact.setColumns(10);

		line8Input1 = new JTextField();
		line8Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input1.setVisible(false);
		line8Input1.setBounds(136, 362, 22, 20);
		line8Input1.setColumns(10);
		line8Input1.setDocument(new JTextFieldLimit(2));

		line8mult1 = new JTextField();
		line8mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8mult1.setFocusable(false);
		line8mult1.setVisible(false);
		line8mult1.setBounds(182, 365, 12, 14);
		line8mult1.setBorder(null);
		line8mult1.setText("*");
		line8mult1.setEditable(false);
		line8mult1.setColumns(10);

		line8Bracket = new JTextField();
		line8Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Bracket.setFocusable(false);
		line8Bracket.setVisible(false);
		line8Bracket.setBounds(164, 365, 14, 14);
		line8Bracket.setBorder(null);
		line8Bracket.setText(")");
		line8Bracket.setEditable(false);
		line8Bracket.setColumns(10);

		line8Input2 = new JTextField();
		line8Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input2.setVisible(false);
		line8Input2.setBounds(200, 362, 22, 20);
		line8Input2.setColumns(10);
		line8Input2.setDocument(new JTextFieldLimit(2));

		line8mult2 = new JTextField();
		line8mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8mult2.setFocusable(false);
		line8mult2.setVisible(false);
		line8mult2.setBounds(228, 365, 12, 14);
		line8mult2.setBorder(null);
		line8mult2.setText("*");
		line8mult2.setEditable(false);
		line8mult2.setColumns(10);

		line8Input3 = new JTextField();
		line8Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input3.setVisible(false);
		line8Input3.setBounds(246, 362, 22, 20);
		line8Input3.setColumns(10);
		line8Input3.setDocument(new JTextFieldLimit(2));

		line8mult3 = new JTextField();
		line8mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8mult3.setFocusable(false);
		line8mult3.setVisible(false);
		line8mult3.setBounds(274, 365, 12, 14);
		line8mult3.setBorder(null);
		line8mult3.setText("*");
		line8mult3.setEditable(false);
		line8mult3.setColumns(10);

		line8mult4 = new JTextField();
		line8mult4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8mult4.setFocusable(false);
		line8mult4.setVisible(false);
		line8mult4.setBounds(320, 365, 12, 14);
		line8mult4.setBorder(null);
		line8mult4.setText("*");
		line8mult4.setEditable(false);
		line8mult4.setColumns(10);

		line8Input4 = new JTextField();
		line8Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input4.setVisible(false);
		line8Input4.setBounds(292, 362, 22, 20);
		line8Input4.setColumns(10);
		line8Input4.setDocument(new JTextFieldLimit(2));

		line8Input5 = new JTextField();
		line8Input5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input5.setVisible(false);
		line8Input5.setBounds(338, 362, 22, 20);
		line8Input5.setColumns(10);
		line8Input5.setDocument(new JTextFieldLimit(2));

		line8mult5 = new JTextField();
		line8mult5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8mult5.setFocusable(false);
		line8mult5.setVisible(false);
		line8mult5.setBounds(366, 365, 12, 14);
		line8mult5.setBorder(null);
		line8mult5.setText("*");
		line8mult5.setEditable(false);
		line8mult5.setColumns(10);

		line8Input6 = new JTextField();
		line8Input6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input6.setVisible(false);
		line8Input6.setBounds(384, 362, 22, 20);
		line8Input6.setColumns(10);
		line8Input6.setDocument(new JTextFieldLimit(2));

		line8mult6 = new JTextField();
		line8mult6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8mult6.setFocusable(false);
		line8mult6.setVisible(false);
		line8mult6.setBounds(412, 365, 12, 14);
		line8mult6.setBorder(null);
		line8mult6.setText("*");
		line8mult6.setEditable(false);
		line8mult6.setColumns(10);

		line8mult7 = new JTextField();
		line8mult7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8mult7.setFocusable(false);
		line8mult7.setVisible(false);
		line8mult7.setBounds(458, 365, 12, 14);
		line8mult7.setBorder(null);
		line8mult7.setText("*");
		line8mult7.setEditable(false);
		line8mult7.setColumns(10);

		line8Input7 = new JTextField();
		line8Input7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input7.setVisible(false);
		line8Input7.setBounds(430, 362, 22, 20);
		line8Input7.setColumns(10);
		line8Input7.setDocument(new JTextFieldLimit(2));

		line8Input8 = new JTextField();
		line8Input8.setFont(new Font("Calibri", Font.PLAIN, 15));
		line8Input8.setVisible(false);
		line8Input8.setBounds(476, 362, 22, 20);
		line8Input8.setColumns(10);
		line8Input8.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE NINE
		 * 
		 */


		line9Return = new JTextField();
		line9Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Return.setFocusable(false);
		line9Return.setVisible(false);
		line9Return.setBounds(56, 390, 39, 14);
		line9Return.setBorder(null);
		line9Return.setEditable(false);
		line9Return.setText("return");
		line9Return.setColumns(10);

		line9Fact = new JTextField();
		line9Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Fact.setFocusable(false);
		line9Fact.setVisible(false);
		line9Fact.setBounds(100, 390, 30, 14);
		line9Fact.setBorder(null);
		line9Fact.setText("fact(");
		line9Fact.setEditable(false);
		line9Fact.setColumns(10);

		line9Input1 = new JTextField();
		line9Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input1.setVisible(false);
		line9Input1.setBounds(136, 387, 22, 20);
		line9Input1.setColumns(10);
		line9Input1.setDocument(new JTextFieldLimit(2));

		line9mult1 = new JTextField();
		line9mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult1.setFocusable(false);
		line9mult1.setVisible(false);
		line9mult1.setBounds(182, 390, 12, 14);
		line9mult1.setBorder(null);
		line9mult1.setText("*");
		line9mult1.setEditable(false);
		line9mult1.setColumns(10);

		line9Bracket = new JTextField();
		line9Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Bracket.setFocusable(false);
		line9Bracket.setVisible(false);
		line9Bracket.setBounds(164, 390, 14, 14);
		line9Bracket.setBorder(null);
		line9Bracket.setText(")");
		line9Bracket.setEditable(false);
		line9Bracket.setColumns(10);

		line9Input2 = new JTextField();
		line9Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input2.setVisible(false);
		line9Input2.setBounds(200, 387, 22, 20);
		line9Input2.setColumns(10);
		line9Input2.setDocument(new JTextFieldLimit(2));

		line9mult2 = new JTextField();
		line9mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult2.setFocusable(false);
		line9mult2.setVisible(false);
		line9mult2.setBounds(228, 390, 12, 14);
		line9mult2.setBorder(null);
		line9mult2.setText("*");
		line9mult2.setEditable(false);
		line9mult2.setColumns(10);

		line9Input3 = new JTextField();
		line9Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input3.setVisible(false);
		line9Input3.setBounds(246, 387, 22, 20);
		line9Input3.setColumns(10);
		line9Input3.setDocument(new JTextFieldLimit(2));

		line9mult3 = new JTextField();
		line9mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult3.setFocusable(false);
		line9mult3.setVisible(false);
		line9mult3.setBounds(274, 390, 12, 14);
		line9mult3.setBorder(null);
		line9mult3.setText("*");
		line9mult3.setEditable(false);
		line9mult3.setColumns(10);

		line9mult4 = new JTextField();
		line9mult4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult4.setFocusable(false);
		line9mult4.setVisible(false);
		line9mult4.setBounds(320, 390, 12, 14);
		line9mult4.setBorder(null);
		line9mult4.setText("*");
		line9mult4.setEditable(false);
		line9mult4.setColumns(10);

		line9Input4 = new JTextField();
		line9Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input4.setVisible(false);
		line9Input4.setBounds(292, 387, 22, 20);
		line9Input4.setColumns(10);
		line9Input4.setDocument(new JTextFieldLimit(2));

		line9Input5 = new JTextField();
		line9Input5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input5.setVisible(false);
		line9Input5.setBounds(338, 387, 22, 20);
		line9Input5.setColumns(10);
		line9Input5.setDocument(new JTextFieldLimit(2));

		line9mult5 = new JTextField();
		line9mult5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult5.setFocusable(false);
		line9mult5.setVisible(false);
		line9mult5.setBounds(366, 390, 12, 14);
		line9mult5.setBorder(null);
		line9mult5.setText("*");
		line9mult5.setEditable(false);
		line9mult5.setColumns(10);

		line9Input6 = new JTextField();
		line9Input6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input6.setVisible(false);
		line9Input6.setBounds(384, 387, 22, 20);
		line9Input6.setColumns(10);
		line9Input6.setDocument(new JTextFieldLimit(2));

		line9mult6 = new JTextField();
		line9mult6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult6.setFocusable(false);
		line9mult6.setVisible(false);
		line9mult6.setBounds(412, 390, 12, 14);
		line9mult6.setBorder(null);
		line9mult6.setText("*");
		line9mult6.setEditable(false);
		line9mult6.setColumns(10);

		line9mult7 = new JTextField();
		line9mult7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult7.setFocusable(false);
		line9mult7.setVisible(false);
		line9mult7.setBounds(458, 390, 12, 14);
		line9mult7.setBorder(null);
		line9mult7.setText("*");
		line9mult7.setEditable(false);
		line9mult7.setColumns(10);


		line9Input7 = new JTextField();
		line9Input7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input7.setVisible(false);
		line9Input7.setBounds(430, 387, 22, 20);
		line9Input7.setColumns(10);
		line9Input7.setDocument(new JTextFieldLimit(2));

		line9Input8 = new JTextField();
		line9Input8.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input8.setVisible(false);
		line9Input8.setBounds(476, 387, 22, 20);
		line9Input8.setColumns(10);
		line9Input8.setDocument(new JTextFieldLimit(2));

		line9mult8 = new JTextField();
		line9mult8.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9mult8.setFocusable(false);
		line9mult8.setVisible(false);
		line9mult8.setBounds(504, 390, 12, 14);
		line9mult8.setBorder(null);
		line9mult8.setText("*");
		line9mult8.setEditable(false);
		line9mult8.setColumns(10);

		line9Input9 = new JTextField();
		line9Input9.setFont(new Font("Calibri", Font.PLAIN, 15));
		line9Input9.setVisible(false);
		line9Input9.setBounds(526, 387, 22, 20);
		line9Input9.setColumns(10);
		line9Input9.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE TEN
		 * 
		 */


		line10Return = new JTextField();
		line10Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Return.setFocusable(false);
		line10Return.setVisible(false);
		line10Return.setBounds(56, 415, 39, 14);
		line10Return.setBorder(null);
		line10Return.setEditable(false);
		line10Return.setText("return");
		line10Return.setColumns(10);

		line10Fact = new JTextField();
		line10Fact.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Fact.setFocusable(false);
		line10Fact.setVisible(false);
		line10Fact.setBounds(100, 415, 30, 14);
		line10Fact.setBorder(null);
		line10Fact.setText("fact(");
		line10Fact.setEditable(false);
		line10Fact.setColumns(10);

		line10Input1 = new JTextField();
		line10Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input1.setVisible(false);
		line10Input1.setBounds(136, 412, 22, 20);
		line10Input1.setColumns(10);
		line10Input1.setDocument(new JTextFieldLimit(2));

		line10mult1 = new JTextField();
		line10mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult1.setFocusable(false);
		line10mult1.setVisible(false);
		line10mult1.setBounds(182, 415, 12, 14);
		line10mult1.setBorder(null);
		line10mult1.setText("*");
		line10mult1.setEditable(false);
		line10mult1.setColumns(10);

		line10Bracket = new JTextField();
		line10Bracket.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Bracket.setFocusable(false);
		line10Bracket.setVisible(false);
		line10Bracket.setBounds(164, 415, 14, 14);
		line10Bracket.setBorder(null);
		line10Bracket.setText(")");
		line10Bracket.setEditable(false);
		line10Bracket.setColumns(10);

		line10Input2 = new JTextField();
		line10Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input2.setVisible(false);
		line10Input2.setBounds(200, 412, 22, 20);
		line10Input2.setColumns(10);
		line10Input2.setDocument(new JTextFieldLimit(2));

		line10mult2 = new JTextField();
		line10mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult2.setFocusable(false);
		line10mult2.setVisible(false);
		line10mult2.setBounds(228, 415, 12, 14);
		line10mult2.setBorder(null);
		line10mult2.setText("*");
		line10mult2.setEditable(false);
		line10mult2.setColumns(10);

		line10Input3 = new JTextField();
		line10Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input3.setVisible(false);
		line10Input3.setBounds(246, 412, 22, 20);
		line10Input3.setColumns(10);
		line10Input3.setDocument(new JTextFieldLimit(2));

		line10mult3 = new JTextField();
		line10mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult3.setFocusable(false);
		line10mult3.setVisible(false);
		line10mult3.setBounds(274, 415, 12, 14);
		line10mult3.setBorder(null);
		line10mult3.setText("*");
		line10mult3.setEditable(false);
		line10mult3.setColumns(10);

		line10mult4 = new JTextField();
		line10mult4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult4.setFocusable(false);
		line10mult4.setVisible(false);
		line10mult4.setBounds(320, 415, 12, 14);
		line10mult4.setBorder(null);
		line10mult4.setText("*");
		line10mult4.setEditable(false);
		line10mult4.setColumns(10);

		line10Input4 = new JTextField();
		line10Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input4.setVisible(false);
		line10Input4.setBounds(292, 412, 22, 20);
		line10Input4.setColumns(10);
		line10Input4.setDocument(new JTextFieldLimit(2));

		line10Input5 = new JTextField();
		line10Input5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input5.setVisible(false);
		line10Input5.setBounds(338, 412, 22, 20);
		line10Input5.setColumns(10);
		line10Input5.setDocument(new JTextFieldLimit(2));

		line10mult5 = new JTextField();
		line10mult5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult5.setFocusable(false);
		line10mult5.setVisible(false);
		line10mult5.setBounds(366, 415, 12, 14);
		line10mult5.setBorder(null);
		line10mult5.setText("*");
		line10mult5.setEditable(false);
		line10mult5.setColumns(10);

		line10Input6 = new JTextField();
		line10Input6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input6.setVisible(false);
		line10Input6.setBounds(384, 412, 22, 20);
		line10Input6.setColumns(10);
		line10Input6.setDocument(new JTextFieldLimit(2));

		line10mult6 = new JTextField();
		line10mult6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult6.setFocusable(false);
		line10mult6.setVisible(false);
		line10mult6.setBounds(412, 415, 12, 14);
		line10mult6.setBorder(null);
		line10mult6.setText("*");
		line10mult6.setEditable(false);
		line10mult6.setColumns(10);

		line10mult7 = new JTextField();
		line10mult7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult7.setFocusable(false);
		line10mult7.setVisible(false);
		line10mult7.setBounds(458, 415, 12, 14);
		line10mult7.setBorder(null);
		line10mult7.setText("*");
		line10mult7.setEditable(false);
		line10mult7.setColumns(10);

		line10Input7 = new JTextField();
		line10Input7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input7.setVisible(false);
		line10Input7.setBounds(430, 412, 22, 20);
		line10Input7.setColumns(10);
		line10Input7.setDocument(new JTextFieldLimit(2));

		line10Input8 = new JTextField();
		line10Input8.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input8.setVisible(false);
		line10Input8.setBounds(476, 412, 22, 20);
		line10Input8.setColumns(10);
		line10Input8.setDocument(new JTextFieldLimit(2));

		line10mult8 = new JTextField();
		line10mult8.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult8.setFocusable(false);
		line10mult8.setVisible(false);
		line10mult8.setBounds(504, 415, 12, 14);
		line10mult8.setBorder(null);
		line10mult8.setText("*");
		line10mult8.setEditable(false);
		line10mult8.setColumns(10);

		line10Input9 = new JTextField();
		line10Input9.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input9.setVisible(false);
		line10Input9.setBounds(526, 412, 22, 20);
		line10Input9.setColumns(10);
		line10Input9.setDocument(new JTextFieldLimit(2));

		line10mult9 = new JTextField();
		line10mult9.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10mult9.setFocusable(false);
		line10mult9.setVisible(false);
		line10mult9.setBounds(558, 415, 12, 14);
		line10mult9.setBorder(null);
		line10mult9.setText("*");
		line10mult9.setEditable(false);
		line10mult9.setColumns(10);

		line10Input10 = new JTextField();
		line10Input10.setFont(new Font("Calibri", Font.PLAIN, 15));
		line10Input10.setVisible(false);
		line10Input10.setBounds(570, 412, 22, 20);
		line10Input10.setColumns(10);
		line10Input10.setDocument(new JTextFieldLimit(2));

		/*
		 * 
		 * LINE ELEVEN
		 * 
		 */

		line11Return = new JTextField();
		line11Return.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Return.setFocusable(false);
		line11Return.setBounds(56, 492, 39, 14);
		line11Return.setBorder(null);
		line11Return.setEditable(false);
		line11Return.setText("return");
		line11Return.setColumns(10);

		line11Input1 = new JTextField();
		line11Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input1.setBounds(105, 489, 22, 20);
		line11Input1.setColumns(10);
		line11Input1.setDocument(new JTextFieldLimit(2));

		line11mult1 = new JTextField();
		line11mult1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult1.setFocusable(false);
		line11mult1.setVisible(false);
		line11mult1.setBounds(137, 492, 12, 14);
		line11mult1.setBorder(null);
		line11mult1.setText("*");
		line11mult1.setEditable(false);
		line11mult1.setColumns(10);

		line11Input2 = new JTextField();
		line11Input2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input2.setVisible(false);
		line11Input2.setBounds(159, 489, 22, 20);
		line11Input2.setColumns(10);
		line11Input2.setDocument(new JTextFieldLimit(2));

		line11mult2 = new JTextField();
		line11mult2.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult2.setFocusable(false);
		line11mult2.setVisible(false);
		line11mult2.setBounds(191, 492, 12, 14);
		line11mult2.setBorder(null);
		line11mult2.setText("*");
		line11mult2.setEditable(false);
		line11mult2.setColumns(10);

		line11Input3 = new JTextField();
		line11Input3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input3.setVisible(false);
		line11Input3.setBounds(213, 489, 22, 20);
		line11Input3.setColumns(10);
		line11Input3.setDocument(new JTextFieldLimit(2));

		line11mult3 = new JTextField();
		line11mult3.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult3.setFocusable(false);
		line11mult3.setVisible(false);
		line11mult3.setBounds(245, 492, 12, 14);
		line11mult3.setBorder(null);
		line11mult3.setText("*");
		line11mult3.setEditable(false);
		line11mult3.setColumns(10);

		line11Input4 = new JTextField();
		line11Input4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input4.setVisible(false);
		line11Input4.setBounds(267, 489, 22, 20);
		line11Input4.setColumns(10);
		line11Input4.setDocument(new JTextFieldLimit(2));

		line11mult4 = new JTextField();
		line11mult4.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult4.setFocusable(false);
		line11mult4.setVisible(false);
		line11mult4.setBounds(302, 492, 12, 14);
		line11mult4.setBorder(null);
		line11mult4.setText("*");
		line11mult4.setEditable(false);
		line11mult4.setColumns(10);

		line11Input5 = new JTextField();
		line11Input5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input5.setVisible(false);
		line11Input5.setBounds(320, 489, 22, 20);
		line11Input5.setColumns(10);
		line11Input5.setDocument(new JTextFieldLimit(2));

		line11mult5 = new JTextField();
		line11mult5.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult5.setFocusable(false);
		line11mult5.setVisible(false);
		line11mult5.setBounds(348, 492, 12, 14);
		line11mult5.setBorder(null);
		line11mult5.setText("*");
		line11mult5.setEditable(false);
		line11mult5.setColumns(10);

		line11Input6 = new JTextField();
		line11Input6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input6.setVisible(false);
		line11Input6.setBounds(366, 489, 22, 20);
		line11Input6.setColumns(10);
		line11Input6.setDocument(new JTextFieldLimit(2));

		line11mult6 = new JTextField();
		line11mult6.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult6.setFocusable(false);
		line11mult6.setVisible(false);
		line11mult6.setBounds(394, 492, 12, 14);
		line11mult6.setBorder(null);
		line11mult6.setText("*");
		line11mult6.setEditable(false);
		line11mult6.setColumns(10);

		line11mult7 = new JTextField();
		line11mult7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult7.setFocusable(false);
		line11mult7.setVisible(false);
		line11mult7.setBounds(440, 492, 12, 14);
		line11mult7.setBorder(null);
		line11mult7.setText("*");
		line11mult7.setEditable(false);
		line11mult7.setColumns(10);

		line11Input7 = new JTextField();
		line11Input7.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input7.setVisible(false);
		line11Input7.setBounds(412, 489, 22, 20);
		line11Input7.setColumns(10);
		line11Input7.setDocument(new JTextFieldLimit(2));

		line11Input8 = new JTextField();
		line11Input8.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input8.setVisible(false);
		line11Input8.setBounds(458, 489, 22, 20);
		line11Input8.setColumns(10);
		line11Input8.setDocument(new JTextFieldLimit(2));

		line11mult8 = new JTextField();
		line11mult8.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult8.setFocusable(false);
		line11mult8.setVisible(false);
		line11mult8.setBounds(490, 492, 12, 14);
		line11mult8.setBorder(null);
		line11mult8.setText("*");
		line11mult8.setEditable(false);
		line11mult8.setColumns(10);

		line11Input9 = new JTextField();
		line11Input9.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input9.setVisible(false);
		line11Input9.setBounds(504, 489, 22, 20);
		line11Input9.setColumns(10);
		line11Input9.setDocument(new JTextFieldLimit(2));

		line11mult9 = new JTextField();
		line11mult9.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11mult9.setFocusable(false);
		line11mult9.setVisible(false);
		line11mult9.setBounds(536, 492, 12, 14);
		line11mult9.setBorder(null);
		line11mult9.setText("*");
		line11mult9.setEditable(false);
		line11mult9.setColumns(10);

		line11Input10 = new JTextField();
		line11Input10.setFont(new Font("Calibri", Font.PLAIN, 15));
		line11Input10.setVisible(false);
		line11Input10.setBounds(558, 489, 22, 20);
		line11Input10.setColumns(10);
		line11Input10.setDocument(new JTextFieldLimit(2));

		/*
		 * LINE TWELVE
		 */

		line12eqReturn = new JTextField();
		line12eqReturn.setFont(new Font("Calibri", Font.PLAIN, 15));
		line12eqReturn.setFocusable(false);
		line12eqReturn.setBounds(56, 555, 50, 14);
		line12eqReturn.setBorder(null);
		line12eqReturn.setEditable(false);
		line12eqReturn.setText("= return");
		line12eqReturn.setColumns(10);

		line12Input1 = new JTextField();
		line12Input1.setFont(new Font("Calibri", Font.PLAIN, 15));
		line12Input1.setBounds(121, 552, 22, 20);
		line12Input1.setColumns(10);
		line12Input1.setDocument(new JTextFieldLimit(2));
		line12Input1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				int n = 0;
				if(line12Input1.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter a valid final return value.");

				if(!line12Input1.getText().equals("")){
					n = Integer.parseInt(line12Input1.getText());
					setUsersReturnValue(n);
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

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
		add(line12eqReturn);
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
		add(line4Fact);
		add(line4Input1);
		add(line4Bracket);
		add(line4mult1);
		add(line4Input2);
		add(line4mult2);
		add(line4Input3);
		add(line4mult3);
		add(line4Input4);
		add(line3Fact);
		add(line3Input1);
		add(line3Bracket);
		add(line3mult1);
		add(line3Input2);
		add(line3mult2);
		add(line3Input3);
		add(line2Fact);
		add(line2Input1);
		add(line2Bracket);
		add(line2mult1);
		add(line2Input2);
		add(line12Input1);
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

		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnSubmit.addActionListener(rvs2C);
		btnSubmit.setBounds(38, 611, 127, 35);
		add(btnSubmit);

		JLabel lblFinalAnswer = new JLabel("Final Answer:");
		lblFinalAnswer.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblFinalAnswer.setFocusable(false);
		lblFinalAnswer.setBounds(213, 449, 147, 20);
		add(lblFinalAnswer);

	}

	@Override
	public void update(Observable o, Object arg) {
		setParameter(model.getParam());
		txtExample2.setText("As with the previous screen, you will be using the algorithim fact("+ getParameter() + ").\r\n\r\nPlease fill out each text field with the value you think corresponds to each step in the recursive call.\r\n"
				+ "\n The first box is filled out for you to get you started.");
		line1Input1.setText(String.valueOf(getParameter()));

	}

	public void setParameter(int n){
		parameter = n;

	}

	public int getParameter(){
		return parameter;

	}

	/**
	 * Sets all of the text fields for line 2 to visible
	 * 
	 * @since 1.2
	 */

	public void setLine2Vis(){
		line2Return.setVisible(true);
		line2Fact.setVisible(true);
		line2Input1.setVisible(true);
		line2mult1.setVisible(true);
		line2Bracket.setVisible(true);
		line2Input2.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11mult1.setVisible(true);
	}

	/**
	 * Sets all of the text fields for line 3 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine3Vis(){
		line3Return.setVisible(true);
		line3Fact.setVisible(true);
		line3Input1.setVisible(true);
		line3mult1.setVisible(true);
		line3Bracket.setVisible(true);
		line3Input2.setVisible(true);
		line3mult2.setVisible(true);
		line3Input3.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);

	}

	/**
	 * Sets all of the text fields for line 4 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine4Vis(){
		line4Return.setVisible(true);
		line4Fact.setVisible(true);
		line4Input1.setVisible(true);
		line4mult1.setVisible(true);
		line4Bracket.setVisible(true);
		line4Input2.setVisible(true);
		line4mult2.setVisible(true);
		line4Input3.setVisible(true);
		line4mult3.setVisible(true);
		line4Input4.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);
		line11Input4.setVisible(true);

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);
		line11mult3.setVisible(true);


	}

	/**
	 * Sets all of the text fields for line 5 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine5Vis(){
		line5Return.setVisible(true);
		line5Fact.setVisible(true);
		line5Input1.setVisible(true);
		line5mult1.setVisible(true);
		line5Bracket.setVisible(true);
		line5Input2.setVisible(true);
		line5mult2.setVisible(true);
		line5Input3.setVisible(true);
		line5mult3.setVisible(true);
		line5Input4.setVisible(true);
		line5mult4.setVisible(true);
		line5Input5.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);
		line11Input4.setVisible(true);
		line11Input5.setVisible(true);

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);
		line11mult3.setVisible(true);
		line11mult4.setVisible(true);
	}

	/**
	 * Sets all of the text fields for line 6 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine6Vis(){
		line6Return.setVisible(true);
		line6Fact.setVisible(true);
		line6Input1.setVisible(true);
		line6mult1.setVisible(true);
		line6Bracket.setVisible(true);
		line6Input2.setVisible(true);
		line6mult2.setVisible(true);
		line6Input3.setVisible(true);
		line6mult3.setVisible(true);
		line6Input4.setVisible(true);
		line6mult4.setVisible(true);
		line6Input5.setVisible(true);
		line6mult5.setVisible(true);
		line6Input6.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);
		line11Input4.setVisible(true);
		line11Input5.setVisible(true);
		line11Input6.setVisible(true);

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);
		line11mult3.setVisible(true);
		line11mult4.setVisible(true);
		line11mult5.setVisible(true);
	}

	/**
	 * Sets all of the text fields for line 7 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine7Vis(){
		line7Return.setVisible(true);    
		line7Fact.setVisible(true);
		line7Input1.setVisible(true);
		line7mult1.setVisible(true);
		line7Bracket.setVisible(true);
		line7Input2.setVisible(true);
		line7mult2.setVisible(true);
		line7Input3.setVisible(true);
		line7mult3.setVisible(true);
		line7Input4.setVisible(true);
		line7mult4.setVisible(true);
		line7Input5.setVisible(true);
		line7mult5.setVisible(true);
		line7Input6.setVisible(true);
		line7mult6.setVisible(true);
		line7Input7.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);
		line11Input4.setVisible(true);
		line11Input5.setVisible(true);
		line11Input6.setVisible(true);
		line11Input7.setVisible(true);		

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);
		line11mult3.setVisible(true);
		line11mult4.setVisible(true);
		line11mult5.setVisible(true);
		line11mult6.setVisible(true);

	}

	/**
	 * Sets all of the text fields for line 8 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine8Vis(){
		line8Return.setVisible(true);
		line8Fact.setVisible(true);
		line8Input1.setVisible(true);
		line8mult1.setVisible(true);
		line8Bracket.setVisible(true);
		line8Input2.setVisible(true);
		line8mult2.setVisible(true);
		line8Input3.setVisible(true);
		line8mult3.setVisible(true);
		line8Input4.setVisible(true);
		line8mult4.setVisible(true);
		line8Input5.setVisible(true);
		line8mult5.setVisible(true);
		line8Input6.setVisible(true);
		line8mult6.setVisible(true);
		line8Input7.setVisible(true);
		line8mult7.setVisible(true);
		line8Input8.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);
		line11Input4.setVisible(true);
		line11Input5.setVisible(true);
		line11Input6.setVisible(true);
		line11Input7.setVisible(true);
		line11Input8.setVisible(true);

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);
		line11mult3.setVisible(true);
		line11mult4.setVisible(true);
		line11mult5.setVisible(true);
		line11mult6.setVisible(true);
		line11mult7.setVisible(true);
	}

	/**
	 * Sets all of the text fields for line 9 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine9Vis(){
		line9Return.setVisible(true);
		line9Fact.setVisible(true);
		line9Input1.setVisible(true);
		line9mult1.setVisible(true);
		line9Bracket.setVisible(true);
		line9Input2.setVisible(true);
		line9mult2.setVisible(true);
		line9Input3.setVisible(true);
		line9mult3.setVisible(true);
		line9Input4.setVisible(true);
		line9mult4.setVisible(true);
		line9Input5.setVisible(true);
		line9mult5.setVisible(true);
		line9Input6.setVisible(true);
		line9mult6.setVisible(true);
		line9Input7.setVisible(true);
		line9mult7.setVisible(true);
		line9Input8.setVisible(true);
		line9mult8.setVisible(true);
		line9Input9.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);
		line11Input4.setVisible(true);
		line11Input5.setVisible(true);
		line11Input6.setVisible(true);
		line11Input7.setVisible(true);
		line11Input8.setVisible(true);
		line11Input9.setVisible(true);

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);
		line11mult3.setVisible(true);
		line11mult4.setVisible(true);
		line11mult5.setVisible(true);
		line11mult6.setVisible(true);
		line11mult7.setVisible(true);
		line11mult8.setVisible(true);
	}

	/**
	 * Sets all of the text fields for line 10 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine10Vis(){
		line10Return.setVisible(true);
		line10Fact.setVisible(true);
		line10Input1.setVisible(true);
		line10mult1.setVisible(true);
		line10Bracket.setVisible(true);
		line10mult2.setVisible(true);
		line10Input3.setVisible(true);
		line10mult3.setVisible(true);
		line10Input4.setVisible(true);
		line10mult4.setVisible(true);
		line10Input5.setVisible(true);
		line10mult5.setVisible(true);
		line10Input6.setVisible(true);
		line10mult6.setVisible(true);
		line10Input7.setVisible(true);
		line10mult7.setVisible(true);
		line10Input8.setVisible(true);
		line10mult8.setVisible(true);
		line10Input9.setVisible(true);
		line10mult9.setVisible(true);
		line10Input10.setVisible(true);
		line10Input2.setVisible(true);

		line11Input1.setVisible(true);
		line11Input2.setVisible(true);
		line11Input3.setVisible(true);
		line11Input4.setVisible(true);
		line11Input5.setVisible(true);
		line11Input6.setVisible(true);
		line11Input7.setVisible(true);
		line11Input8.setVisible(true);
		line11Input9.setVisible(true);
		line11Input10.setVisible(true);

		line11mult1.setVisible(true);
		line11mult2.setVisible(true);
		line11mult3.setVisible(true);
		line11mult4.setVisible(true);
		line11mult5.setVisible(true);
		line11mult6.setVisible(true);
		line11mult7.setVisible(true);
		line11mult8.setVisible(true);
		line11mult9.setVisible(true);

	}

	/**
	 * Sets the rest of the text fields for line 11 to visible
	 * 
	 * @since 1.2
	 */
	public void setLine11Vis(){
		line11Return.setVisible(true);
		line11Input1.setVisible(true);
		line11mult1.setVisible(true);
		line11Input2.setVisible(true);
		line11mult2.setVisible(true);
		line11Input3.setVisible(true);
		line11mult3.setVisible(true);
		line11Input4.setVisible(true);
		line11mult4.setVisible(true);
		line11Input5.setVisible(true);
		line11mult5.setVisible(true);
		line11Input6.setVisible(true);
		line11mult6.setVisible(true);
		line11Input7.setVisible(true);
		line11mult7.setVisible(true);
		line11Input8.setVisible(true);
		line11Input9.setVisible(true);
		line11mult9.setVisible(true);
		line11Input10.setVisible(true);
		line11mult8.setVisible(true);

	}

	/**
	 * Returns the value which the user entered as the final return value of the recursive call
	 * 
	 * @return an Integer which the represents the final return value of the recursive call
	 */
	public int getUsersReturnValue(){
		return usersReturnValue;
	}

	/**
	 * Sets the value the user entered as the final return value
	 * This will be used to be passed onto the results page
	 * 
	 * @param n an Integer
	 */
	public void setUsersReturnValue(int n){
		usersReturnValue = n;
	}

	/**
	 * The following 11 methods check a link of inputs to see if any of the boxes are empty
	 * If at least 1 field is empty then true is returned
	 * 
	 * @return true or false wether or not the line has an empty field
	 */
	public boolean checkLine1(){
		if(line1Input1.getText().equals("")){
			return true;
		}
		else
			return false;
	}

	public boolean checkLine2(){
		if(line2Input1.getText().equals("")
				|| line2Input2.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine3(){
		if(line3Input1.getText().equals("")
				|| line3Input2.getText().equals("")
				|| line3Input3.getText().equals(""))
			return true;
		else
			return false;
	}
	public boolean checkLine4(){
		if(line4Input1.getText().equals("")
				|| line4Input2.getText().equals("")
				|| line4Input3.getText().equals("")
				|| line4Input4.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine5(){
		if(line5Input1.getText().equals("")
				|| line5Input2.getText().equals("")
				|| line5Input3.getText().equals("")
				|| line5Input4.getText().equals("")
				|| line5Input5.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine6(){
		if(line6Input1.getText().equals("")
				|| line6Input2.getText().equals("")
				|| line6Input3.getText().equals("")
				|| line6Input4.getText().equals("")
				|| line6Input5.getText().equals("")
				|| line6Input6.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine7(){
		if(line7Input1.getText().equals("")
				|| line7Input2.getText().equals("")
				|| line7Input3.getText().equals("")
				|| line7Input4.getText().equals("")
				|| line7Input5.getText().equals("")
				|| line7Input6.getText().equals("")
				|| line7Input7.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine8(){
		if(line8Input1.getText().equals("")
				|| line8Input2.getText().equals("")
				|| line8Input3.getText().equals("")
				|| line8Input4.getText().equals("")
				|| line8Input5.getText().equals("")
				|| line8Input6.getText().equals("")
				|| line8Input7.getText().equals("")
				|| line8Input8.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine9(){
		if(line9Input1.getText().equals("")
				|| line9Input2.getText().equals("")
				|| line9Input3.getText().equals("")
				|| line9Input4.getText().equals("")
				|| line9Input5.getText().equals("")
				|| line9Input6.getText().equals("")
				|| line9Input7.getText().equals("")
				|| line9Input8.getText().equals("")
				|| line9Input9.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine10(){
		if(line10Input1.getText().equals("")
				|| line10Input2.getText().equals("")
				|| line10Input3.getText().equals("")
				|| line10Input4.getText().equals("")
				|| line10Input5.getText().equals("")
				|| line10Input6.getText().equals("")
				|| line10Input7.getText().equals("")
				|| line10Input8.getText().equals("")
				|| line10Input9.getText().equals("")
				|| line10Input10.getText().equals(""))
			return true;
		else
			return false;
	}

	public boolean checkLine11(){
		if(getParameter() == 1){
			if(line11Input1.getText().equals(""))
				return true;
		}

		if(getParameter() == 2){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals(""))
				return true;
		}
		if(getParameter() == 3){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals(""))
				return true;
		}
		if(getParameter() == 4){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals("")
					|| line11Input4.getText().equals(""))
				return true;
		}
		if(getParameter() == 5){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals("")
					|| line11Input4.getText().equals("")
					|| line11Input5.getText().equals(""))
				return true;
		}
		if(getParameter() == 6){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals("")
					|| line11Input4.getText().equals("")
					|| line11Input5.getText().equals("")
					|| line11Input6.getText().equals(""))
				return true;
		}
		if(getParameter() == 7){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals("")
					|| line11Input4.getText().equals("")
					|| line11Input5.getText().equals("")
					|| line11Input6.getText().equals("")
					|| line11Input7.getText().equals(""))
				return true;
		}
		if(getParameter() == 8){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals("")
					|| line11Input4.getText().equals("")
					|| line11Input5.getText().equals("")
					|| line11Input6.getText().equals("")
					|| line11Input7.getText().equals("")
					|| line11Input8.getText().equals(""))
				return true;


		}
		if(getParameter() == 9){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals("")
					|| line11Input4.getText().equals("")
					|| line11Input5.getText().equals("")
					|| line11Input6.getText().equals("")
					|| line11Input7.getText().equals("")
					|| line11Input8.getText().equals("")
					|| line11Input9.getText().equals(""))
				return true;

		}
		if(getParameter() == 10){
			if(line11Input1.getText().equals("")
					|| line11Input2.getText().equals("")
					|| line11Input3.getText().equals("")
					|| line11Input4.getText().equals("")
					|| line11Input5.getText().equals("")
					|| line11Input6.getText().equals("")
					|| line11Input7.getText().equals("")
					|| line11Input8.getText().equals("")
					|| line11Input9.getText().equals("")
					|| line11Input10.getText().equals(""))
				return true;
		}


		return false;
	}

	public boolean checkLine12(){
		if(line12Input1.getText().equals(""))
			return true;
		else
			return false;
	}

	/**
	 * Checks each text field that is visible
	 * If at least one field is not filled then a dialog box pops up
	 * 
	 * 
	 * @since 1.2
	 */
	public void checkUserInputs(){

		if(getParameter() == 1){
			if(checkLine1()
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 2){
			if(checkLine1()
					|| checkLine2()
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 3){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 4){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine4()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 5){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine4()	
					|| checkLine5()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 6){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine4()	
					|| checkLine5()	
					|| checkLine6()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 7){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine4()	
					|| checkLine5()	
					|| checkLine6()	
					|| checkLine7()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 8){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine4()	
					|| checkLine5()	
					|| checkLine6()	
					|| checkLine7()	
					|| checkLine8()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 9){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine4()	
					|| checkLine5()	
					|| checkLine6()	
					|| checkLine7()	
					|| checkLine8()	
					|| checkLine9()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}

		if(getParameter() == 10){
			if(checkLine1()
					|| checkLine2()	
					|| checkLine3()	
					|| checkLine4()	
					|| checkLine5()	
					|| checkLine6()	
					|| checkLine7()	
					|| checkLine8()	
					|| checkLine9()	
					|| checkLine10()	
					|| checkLine11()
					|| checkLine12()
					)
				JOptionPane.showMessageDialog(null, "Please enter a value in all input boxes.");

		}


	}

	/**
	 * Returns the value of bool which is checking if all text fields are filled
	 * true = all filled
	 * false = not
	 * 
	 * @return a boolean true or false
	 */
	public boolean getFilled(){
		return bool;
	}

	/**
	 * Sets bool to true through another method if all text fields are filled
	 * 
	 * @param b boolean to set bool to
	 */
	public void setFilled(boolean b){
		bool = b;
	}

	public void checkAllFieldsFilled(){

		if(getParameter() == 1){
			if(!checkLine1()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 2){
			if(!checkLine1()
					&& !checkLine2()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 3){
			if(!checkLine1()
					&& !checkLine2()
					&& !checkLine3()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 4){
			if(!checkLine1()
					&& !checkLine2()	
					&& !checkLine3()	
					&& !checkLine4()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 5){
			if(!checkLine1()
					&& !checkLine2()	
					&& !checkLine3()	
					&& !checkLine4()	
					&& !checkLine5()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 6){
			if(!checkLine1()
					&& !checkLine2()	
					&& !checkLine3()	
					&& !checkLine4()	
					&& !checkLine5()	
					&& !checkLine6()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 7){
			if(!checkLine1()
					&& !checkLine2()	
					&& !checkLine3()	
					&& !checkLine4()	
					&& !checkLine5()	
					&& !checkLine6()	
					&& !checkLine7()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 8){
			if(!checkLine1()
					&& !checkLine2()	
					&& !checkLine3()	
					&& !checkLine4()	
					&& !checkLine5()	
					&& !checkLine6()	
					&& !checkLine7()	
					&& !checkLine8()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 9){
			if(!checkLine1()
					&& !checkLine2()	
					&& !checkLine3()	
					&& !checkLine4()	
					&& !checkLine5()	
					&& !checkLine6()	
					&& !checkLine7()	
					&& !checkLine8()	
					&& !checkLine9()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

		if(getParameter() == 10){
			if(!checkLine1()
					&& !checkLine2()	
					&& !checkLine3()	
					&& !checkLine4()	
					&& !checkLine5()	
					&& !checkLine6()	
					&& !checkLine7()	
					&& !checkLine8()	
					&& !checkLine9()	
					&& !checkLine10()
					&& !checkLine11()
					&& !checkLine12()
					)
				setFilled(true);

		}

	}

	/**
	 * Sets the advance button visible and the submit button not visible
	 * 
	 * @since 1.2
	 */
	public void setAdvButtonVis(){
		ab2.setVis();
		btnSubmit.setVisible(false);
	}


}