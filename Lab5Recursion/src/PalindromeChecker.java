
import java.util.Scanner;

public class PalindromeChecker {

	public static boolean isaPalindrome(String expr) {

		if (expr == null || expr.length() <= 1) {
			return true;
		} else if (expr.charAt(0) != expr.charAt(expr.length() - 1)) {
			return false;
		} else {
			return isaPalindrome(expr.substring(1, expr.length() - 1));
		}

	}

	public static void main(String args[]) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter in a word, phrase, or number.");
		String s = reader.nextLine();
		if (isaPalindrome(s)) {
			System.out.println(s + " is a palindrome.");
		} else {
			System.out.println(s + " is not a palindrome.");
		}

		reader.close();
	}

}
