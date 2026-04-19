/* Check if an Array is Sorted

Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Examples
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.
Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.
Here element 5 is not smaller than or equal to its future elements.
*/

public class ArraySortedOrNot {
	public static boolean isSortedArray(int[] array) {
		for (int i = 1; i < array.length; ++i) {
			if (array[i] < array[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.read("Enter the size of array: "));
		int[] array = new int[size];

		IO.println("Enter " + size + " elements in array seperated by space:");

		for (int i = 0; i < size; ++i) {
			array[i] = Integer.parseInt(IO.read());
		}

		IO.println(isSortedArray(array));
	}
}