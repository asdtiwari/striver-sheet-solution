/* Quick Sort Algorithm
Problem Statement: Given an array of n integers, sort the array using the Quicksort method.

Examples
Input: N = 5, Arr[] = {4,1,7,9,3}
Output: {1, 3, 4, 7, 9}
Explanation: After sorting the array in ascending order it becomes 1, 3, 4, 7, 9
Input: N = 8, Arr[] = {4,6,2,5,7,9,1,3}
Output: {1, 2, 3, 4, 5, 6, 7, 9}
Explanation: After sorting the array in ascending order it becomes 1, 2, 3, 4, 5, 6, 7, 9
*/

public class QuickSort {
	private static int getIdxOfMid(int[] array, int low, int high) {
		int mid = (high - low) / 2 + low;
		int a = array[low];
		int b = array[mid];
		int c = array[high];

		// if mid element present at mid index return it
		if ((a <= b && b <= c) || (a >= b && b >= c)) {
			return mid;
		}

		// if mid element present at low index return it
		if ((b <= a && a <= c) || (b >= a && a >= c)) {
			return low;
		}

		// return last idx
		return high;	
	}


	private static int partition(int[] array, int low, int high) {
		int midIdx = getIdxOfMid(array, low, high);

		int temp = array[midIdx];
		array[midIdx] = array[high];
		array[high] = temp;

		int pivot = array[high];

		// Lomuto's Partition scheme
		int boundry = low;
		for (int scanner = low; scanner < high; ++scanner) {
			if (array[scanner] < pivot) {
				temp = array[boundry];
				array[boundry] = array[scanner];
				array[scanner] = temp;
				++boundry;
			}
		}
		/** Taking two pointer at opposite direction to perform this is called Hoare's Partition scheme */

		array[high] = array[boundry];
		array[boundry] = pivot;

		return boundry;
	}

	public static void sort(int[] array, int low, int high) {
		if (low < high) {
			int pivotAt = partition(array, low, high);
			sort(array, low, pivotAt - 1);
			sort(array, pivotAt + 1, high);
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

                QuickSort.sort(array, 0, array.length - 1);

                IO.print("Sorted Array is: ");
                IO.println(java.util.Arrays.toString(array));
        }

}