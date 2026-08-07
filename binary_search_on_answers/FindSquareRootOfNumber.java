/* Finding Sqrt of a number using Binary Search
Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).

Examples
Input: N = 36
Output: 6
Explanation: Square root of 36 is 6. 

Input: N = 28
Output: 5
Explanation: Square root of 28 is approximately 5.292. So, the floor value will be 5. 
*/

public class FindSquareRootOfNumber {
	public static int getFloorSqrt(int num) {
		int start = 0;
		int end = num;

		while (start <= end) {
			int mid = (end - start) / 2 + start;

			if (mid == 0) return mid;

			int numDivMid = num / mid;

			if (mid == numDivMid) return mid;

			if (mid > numDivMid) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return end;
	}

	public static void main(String[] args) {
		int num = 3;

		System.out.print("Floor Sqrt of " + num + " is ");
		System.out.println(FindSquareRootOfNumber.getFloorSqrt(num));
	}
}