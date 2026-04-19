/* Move all Zeros to the end of the array

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Examples
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
Input : 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation : All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
*/

public class MovesAllZeroToEnd {
	public static void move(int[] array) {
		// Using Lomuto Algo
		int boundary = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != 0) {
				array[boundary] = array[i];
				++boundary;
			}
		}

		while (boundary < array.length) {
			array[boundary] = 0;
			++boundary;
		}
	}

	public static void main(String[] args) {
		int[] array = {7, 0, 0, 0, 4, 5, 0, 2, 1, 4};
		IO.println("Given Array:\n" + java.util.Arrays.toString(array));
		MovesAllZeroToEnd.move(array);
		IO.println("Array after zero shifted to end:\n" + java.util.Arrays.toString(array));
	}
}