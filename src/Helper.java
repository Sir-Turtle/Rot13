import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The purpose of this class is to provide convenient methods for reading input
 * from the keyboard.
 * 
 * @author Tolga Akkaya
 */

public class Helper {
	private static final BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
	// The private constructor is so that instances of this class cannot be constructed.
	private Helper(){}
	
	/**
	 * Read an array of char values from the keyboard.
	 * 
	 * After the user has entered a string of characters, hitting 'enter'
	 * returns to the calling method. All characters including spaces are put
	 * in the array.
	 *
	 * The String entered by the user is converted to an array of characters of
	 * the appropriate length.
	 * 
	 * @return An array of char values containing the set
	 *	of characters entered from the keyboard.
	 */
	public static char[] readCharLine() {
		// Get the user's input string.
		String inputString = getInput();
		
		// Convert the entire String that was entered to an array of chars.
		return inputString.toCharArray();
	}
	
	/**
	 * This method gets the input from the keyboard as a String.
	 * 
	 * The intention of this method is to catch the possible {@link IOException}
	 * that could be thrown by the readline() method, so that the
	 * main() method does not have to declare that it throws this
	 * exception.
	 * 
	 * If the exception occurs, a stack trace is printed and the program is
	 * terminated.
	 * 
	 * @return A {@link String} with the input typed from the keyboard.
	 */
	private static String getInput() {
		String inputString = null;
		try {
			inputString = keyboard.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		return inputString;
	}

}
