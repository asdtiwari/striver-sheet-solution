/* Insertion Sort Algorithm

Problem Statement: Given an array of integers called nums, sort the array in non-decreasing order using the insertion sort algorithm and return the sorted array.

A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.

Examples
Example 1:
Input:
  nums = [7, 4, 1, 5, 3]  
Output:
  [1, 3, 4, 5, 7]  
Explanation:
  The array is sorted in non-decreasing order: 1 ≤ 3 ≤ 4 ≤ 5 ≤ 7.

Example 2:
Input:
  nums = [5, 4, 4, 1, 1]  
Output:
  [1, 1, 4, 4, 5]  
Explanation:
  The array is sorted in non-decreasing order: 1 ≤ 1 ≤ 4 ≤ 4 ≤ 5.
*/

public class InsertionSort {
	public static void sort(int[] array) {
		for (int i = 1; i < array.length; ++i) {
			int j = i;
			int current = array[i];
			while (j > 0 && current < array[j - 1]) {
				array[j] = array[j - 1];
				--j;
			}
			array[j] = current;
		}
	}


	public static void main(String[] args) {
		int size = Integer.parseInt(IO.read("Enter the size of array: "));

		int[] array = new int[size];
		IO.println("Enter " + size + " integers seperated by space");
		for (int i = 0; i < size; ++i) {
			array[i] = Integer.parseInt(IO.read());
		}

		IO.print("Given Array is: ");
		IO.println(java.util.Arrays.toString(array));

		InsertionSort.sort(array);

		IO.print("Sorted Array is: ");
		IO.println(java.util.Arrays.toString(array));
	}

}