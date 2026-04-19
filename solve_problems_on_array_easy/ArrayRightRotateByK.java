/* Rotate array by K elements

Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples
Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
Output : [6, 7, 1, 2, 3, 4, 5]
Explanation : rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5] 

Input : nums = [1, 2, 3, 4, 5, 6], k=2, left
Output : [3, 4, 5, 6, 1, 2]
Explanation :rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
rotate 2 steps to the left: [3, 4, 5, 6, 1, 2] 
*/

public class ArrayRightRotateByK {
	private static void reverseArray(int[] array, int start, int end) {
		while (start < end) {
			int swap = array[start];
			array[start] = array[end];
			array[end] = swap;
			++start;
			--end;
		}
	}

	public static void rotate(int[] array, int k) {
		// to prevent from out of bound index
		k = k % array.length;

		// Using the Reversal algorithm of Array Rotation

		// Reverse complete array
		reverseArray(array, 0, array.length - 1);

		// Reverse first k elements of array)
		reverseArray(array, 0, k - 1);

		// Reverse remaining elements of array)
		reverseArray(array, k, array.length - 1);
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		IO.println("Given Array:\n" + java.util.Arrays.toString(array));
		int k = 3;
		rotate(array, k);
		IO.println("After " + k + " rotation:\n" + java.util.Arrays.toString(array));
	}
}