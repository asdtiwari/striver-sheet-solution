/* Sum of first N Natural Numbers

Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

Examples
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15
*/

public class SumOfFirstNNaturalNumber {
	public static void main(String[] args) {
		String input = IO.read("Enter the value of n: ");
		int n = Integer.parseInt(input);

		// int sum = n * (n + 1) / 2;

		int sum = solution(n);

		IO.println(sum);
	}

	private static int solution(int n) {
		if (n == 1) {
			return n;
		}
		return n + solution(n - 1);
	}
}