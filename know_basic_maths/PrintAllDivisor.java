/* Print all Divisors of a given Number

Problem Statement: Given an integer N, return all divisors of N.
A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Examples
Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
Input: N = 12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
*/

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisor {
	public static void main(String[] args) {
		String input = IO.read("Enter a number: ");
		int num = Integer.parseInt(input);

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				list.add(i);
			}
		}

		IO.println(list);
	}
}

