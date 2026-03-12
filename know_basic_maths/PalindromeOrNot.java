/* Check if a number is Palindrome or Not


18

Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

Examples
Example 1:
Input:N = 4554
Output:Palindrome Number
Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
                                        
Example 2:
Input:N = 7789          
Output: Not Palindrome
Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
*/

public class PalindromeOrNot {
	public static void main(String[] args) {
		String input = IO.read("Enter the number: ");
		int num = Integer.parseInt(input);
		
		int rev = 0;
		for (int i = num; i > 0; i /= 10) {
			rev *= 10;
			rev += i % 10;
		}

		if (rev == num) {
			IO.println("Palindrome Number");
		} else {
			IO.println("Not Palindrome");
		}
	}
}