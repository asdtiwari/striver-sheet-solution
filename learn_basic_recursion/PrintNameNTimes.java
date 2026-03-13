/* Print Name N times using Recursion

Problem Description: Given an integer N, write a program to print your name N times.

Examples
Input: N = 3
Output: Ashish Ashish Ashish 
Explanation: Name is printed 3 times.
Input: N = 1
Output: Ashish 
Explanation: Name is printed once.
*/

public class PrintNameNTimes {
	public static void main(String[] args) {
		String input = IO.read("Enter the value of n: ");
		int n = Integer.parseInt(input);

		String name = IO.read("Enter the name: ");

		solution(name, n);
	}

	private static void solution(String name, int n) {
		if (n > 0) {
			IO.println(name);
			solution(name, n - 1);
		}
	}
}