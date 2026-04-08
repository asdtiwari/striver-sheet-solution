/* Selection Sort Algorithm

Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

Examples
Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5
*/

public class SelectionSort {
	// logic of selection sort
	public static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			int smallestAt = i;
			for (int j = i + 1; j < array.length; ++j) {
				if (array[smallestAt] > array[j]) {
					smallestAt = j;
				}
			}
			int temp = array[i];
			array[i] = array[smallestAt];
			array[smallestAt] = temp;
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

		SelectionSort.sort(array);

		IO.print("Sorted Array is: ");
		IO.println(java.util.Arrays.toString(array));
	}
}