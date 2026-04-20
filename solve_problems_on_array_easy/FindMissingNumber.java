/* Find the Missing Number

Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.

Examples: 

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
*/

public class FindMissingNumber {
	public static int get(int[] array) {
		int n = array.length + 1;
		int exptSum = n * (n + 1) / 2;

		int currentSum = 0;
		for (int i = 0; i < array.length; ++i) {
			currentSum += array[i];
		}

		return exptSum - currentSum;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 5};

		IO.println("Given array:");
		IO.println(java.util.Arrays.toString(array));

		IO.print("Missing number: ");
		IO.println(FindMissingNumber.get(array));
	}
}