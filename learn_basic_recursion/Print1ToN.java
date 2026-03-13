/* Print 1 to N using Recursion

Problem Description: Given an integer N, write a program to print numbers from 1 to N.

Examples
Input: N = 4
Output: 1, 2, 3, 4
Explanation: All the numbers from 1 to 4 are printed.
Input: N = 1
Output: 1 
Explanation: This is the base case.
*/

public class Print1ToN {
	public static void main(String[] args) {
		String input = IO.read("Enter value of n: ");
		int n = Integer.parseInt(input);

		solution(n);
	}
	private static void solution(int n) {
		if (n > 0) {
			solution(n - 1);
			IO.print(n + " ");
		}
	}
}