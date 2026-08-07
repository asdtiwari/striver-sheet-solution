/* Nth Root of a Number using Binary Search

Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.

Examples
Input: N = 3, M = 27
Output: 3
Explanation: The cube root of 27 is equal to 3.
Input : N = 4, M = 69
Output: -1
Explanation : The 4th root of 69 does not exist. So, the answer is -1.
*/

public class FindNthRootOfNumber {
	public static int getFloorValue(int M, int N) {
		int start = 0;
		int end = M;

		while (start <= end) {
			int mid = (end - start) / 2 + start;

			long res = 1L;
			for (int i = 0; i < N; ++i) {
				res *= mid;

				if (res > M) break;
			}

			if (res == M) {
				return mid;
			}

			if (res > M) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int M = 69;
		int N = 4;

		System.out.println("Given M and N is " + M + " and " + N);
		System.out.print("Root is: ");
		System.out.println(FindNthRootOfNumber.getFloorValue(M, N));
	}
}