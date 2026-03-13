/* Print N to 1 using Recursion

Problem Description: Given an integer N, write a program to print numbers from N to 1.

Examples
Input: N = 4
Output: 4, 3, 2, 1
Explanation: All the numbers from 4 to 1 are printed.
Input: N = 1
Output: 1 
Explanation: This is the base case.
*/

public class PrintNTo1 {
	public static void main(String[] args) {
		String num = IO.read("Enter the value of n: ");
		int n = Integer.parseInt(num);

		solution(n);
	}

	private static void solution(int n) {
		if (n > 0) {
			IO.print(n + " ");
			solution(n - 1);
		}
	}
}