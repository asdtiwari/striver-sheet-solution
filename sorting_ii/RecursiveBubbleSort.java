/* Recursive Bubble Sort Algorithm
Problem Statement: Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.

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

public class RecursiveBubbleSort {
	public static void sort (int[] array, int n) {
		if (n == 1) {
			return;
		}

		boolean didSwap = false;
		for (int i = 0; i < n - 1; ++i) {
			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				didSwap = true;
			}
		}

		if (!didSwap) {
			return;
		}

		sort(array, n - 1);
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

                RecursiveBubbleSort.sort(array, array.length);

                IO.print("Sorted Array is: ");
                IO.println(java.util.Arrays.toString(array));
        }
}