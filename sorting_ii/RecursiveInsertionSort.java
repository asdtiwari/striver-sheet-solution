/* Recursive Insertion Sort Algorithm
Problem Statement: Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.

Examples
Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52

Example 2:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5
*/

public class RecursiveInsertionSort {
	public static void sort(int[] array, int idx) {
		if (idx == array.length) {
			return;
		}

		int i = idx;
		int current = array[idx];
		while (i > 0 && current < array[i - 1]) {
			array[i] = array[i - 1];
			--i;
		}
		array[i] = current;

		sort(array, idx + 1);
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

                RecursiveInsertionSort.sort(array, 1);

                IO.print("Sorted Array is: ");
                IO.println(java.util.Arrays.toString(array));
        }
}