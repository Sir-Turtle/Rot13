/**
 * The purpose of this class is to request a sentence to cipher from a user, and then to cipher it using the rot 13 technique.
 *
 * @author Tolga Akkaya
 */

public class Rot13 {
	public static void main(String[] args) {

		char[] strFromUser;

		System.out.println("Please enter a sentence to cipher.");
		strFromUser = Helper.readCharLine();
		int n = strFromUser.length;

		if (n >= 1) {
			cipher(strFromUser, n);
		}

		for (int i = 0; i < strFromUser.length; i++) {
			System.out.print(strFromUser[i]);
		}

	}

	public static void cipher(char[] strFromUser, int n) {
		if (n == 1) {
			strFromUser[0] = rot13(strFromUser[0]);
		} else {
			cipher(strFromUser, n - 1);
			strFromUser[n - 1] = rot13(strFromUser[n - 1]);
		}

	}

	public static char rot13(char ch) {
		int pos = (int) ch;
		int pos2 = 0;

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

		return ((char) pos2);
	}
}
