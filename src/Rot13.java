/**
 * The purpose of this class is to request a sentence to cipher from a user, and then to cipher it using the rot 13 technique.
 *
 * @author Tolga Akkaya
 */

public class Rot13 {
	public static void main(String[] args) {
		
		char[] strFromUser;
		
		// Request the user's input string.
		System.out.println("Please enter a sentence to cipher.");
		strFromUser = Helper.readCharLine();
		
		int n = strFromUser.length;
		
		// Call cipher method on input string.
		if (n >= 1) {
			cipher(strFromUser, n);
		}
		
		// Printing ciphered string.
		for (int i = 0; i < strFromUser.length; i++) {
			System.out.print(strFromUser[i]);
		}

	}

	// Method: cipher
	// Description: Ciphers a sentence provided by the user.
	public static void cipher(char[] strFromUser, int n) {
		// Recursively cipher input string.
		if (n == 1) {
			strFromUser[0] = rot13(strFromUser[0]);
		} else {
			cipher(strFromUser, n - 1);
			strFromUser[n - 1] = rot13(strFromUser[n - 1]);
		}

	}

	// Method: rot13
	// Description: Using the rot 13 technique, characters within the alphabet are translated into other characters.
	public static char rot13(char ch) {
		int pos = (int) ch;
		int pos2 = 0;
		
		// Check if characters exist in alphabet, then evaluate.
		if (('A' <= ch) && (ch <= 'Z') || ('a' <= ch) && (ch <= 'z')) {
			if (('A' <= ch) && (ch <= 'Z')) {
				pos = pos - 'A';
				pos2 = (pos + 13) % 26;
				pos2 = pos2 + 'A';
			}
			if (('a' <= ch) && (ch <= 'z')) {
				pos = pos - 'a';
				pos2 = (pos + 13) % 26;
				pos2 = pos2 + 'a';
			}
		} else {
			pos2 = pos;
		}
		
		// Final ciphered result.
		return ((char) pos2);
	}
}
