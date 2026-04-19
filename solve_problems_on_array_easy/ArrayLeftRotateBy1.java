/* Left Rotate the Array by One

Problem Statement: Given an integer array nums, rotate the array to the left by one.

Note: There is no need to return anything, just modify the given array.

Examples
Example 1:
Input:
 nums = [1, 2, 3, 4, 5]  
Output:
 [2, 3, 4, 5, 1]  
Explanation:
 Initially, nums = [1, 2, 3, 4, 5]  
Rotating once to the left results in nums = [2, 3, 4, 5, 1].

Example 2:
Input:
 nums = [-1, 0, 3, 6]  
Output:
 [0, 3, 6, -1]  
Explanation:
 Initially, nums = [-1, 0, 3, 6]  
Rotating once to the left results in nums = [0, 3, 6, -1].
*/

public class ArrayLeftRotateBy1 {
	public static void rotate(int[] array) {
		int first = array[0];
		for (int i = 0; i < array.length - 1; ++i) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = first;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		IO.println("Given Array is:\n" + java.util.Arrays.toString(array));
		ArrayLeftRotateBy1.rotate(array);
		IO.println("Rotated Array is:\n" + java.util.Arrays.toString(array));		
	}
}