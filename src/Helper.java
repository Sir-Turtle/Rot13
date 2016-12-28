import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * The purpose of this class is to provide convenient methods for reading input
 * from the keyboard.
 * 
 * @author Tolga Akkaya
 */

public class Helper {
	private static final BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	public static char[] readCharLine() {
		String inputString = getInput();

		return inputString.toCharArray();
	}

	public static String readString() {
		String inputString = getInput();

		return inputString;
	}

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
