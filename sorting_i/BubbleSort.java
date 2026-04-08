/* Bubble Sort Algorithm

Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

Examples

Example 1:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5

Example 2:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52
*/

public class BubbleSort {
	public static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			boolean isSwapped = false;
			for (int j = 0; j < array.length - 1 - i; ++j) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}
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

                BubbleSort.sort(array);

                IO.print("Sorted Array is: ");
                IO.println(java.util.Arrays.toString(array));
        }
}