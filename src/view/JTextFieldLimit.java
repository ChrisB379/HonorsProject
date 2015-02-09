package view;

/**
 * This class stops JTextfields from taking in anything but integers and limits input length to 2
 * 
 * Code is sourced from :
 * http://www.java2s.com/Tutorial/Java/0240__Swing/LimitJTextFieldinputtoamaximumlength.htm
 * @author java2s.com
 * 
 * Second bit of code used from 
 * http://stackoverflow.com/questions/14319064/how-to-validate-a-jtextfield-to-accept-only-integer-numbers
 * @author davidbuzatto on stackoverflow.com
 * 
 * 
 * Slight adaptations were made to make it limit both input length to only 2 and to only accept integers
 */

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class JTextFieldLimit extends PlainDocument {

	private static final long serialVersionUID = 6530563563104252452L;
	private int limit;


	public JTextFieldLimit(int limit) {
		super();
		this.limit = limit;
	}

	JTextFieldLimit(int limit, boolean upper) {
		super();
		this.limit = limit;
	}

	public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		if (str == null)
			return;

		/*
		 * This char array, boolean and for statement are from 
		 * http://stackoverflow.com/questions/14319064/how-to-validate-a-jtextfield-to-accept-only-integer-numbers
		 */
		char[] chars = str.toCharArray();
		boolean ok = true;

		for ( int i = 0; i < chars.length; i++ ) {

			try {
				Integer.parseInt( String.valueOf( chars[i] ) );
			} catch ( NumberFormatException exc ) {
				ok = false;
				break;
			}


		}

		if ((getLength() + str.length()) <= limit && ok) {
			super.insertString(offset, str, attr);
		}



	}
}

