/* Check if the given String is Palindrome or not

Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

Examples
Example 1:
Input: Str =  "ABCDCBA"
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = "TAKE U FORWARD"
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
*/

public class StringPalindromeOrNot {
	public static void main(String[] args) {
		String input = IO.read("Enter the string: ");
		if (isPalindromeString(input, 0)) {
			IO.println("Palindrome");
		} else {
			IO.println("Not Palindrome");
		}
	}

	public static boolean isPalindromeString(String input, int idx) {
		if (idx > input.length() / 2) {
			return true;
		}

		if (input.charAt(idx) != input.charAt(input.length() - 1 - idx)) {
			return false;
		}

		return isPalindromeString(input, idx + 1);
	}
}