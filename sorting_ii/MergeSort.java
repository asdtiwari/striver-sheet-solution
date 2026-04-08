/* Merge Sort Algorithm
Problem Statement: Given an array of size n, sort the array using Merge Sort.

Examples
Input : N=7,arr[]={3,2,8,5,1,4,23}
Output : {1,2,3,4,5,8,23}
Explanation : Given array is sorted in non-decreasing order.
Input : N=5, arr[]={4,2,1,6,7}
Output : {1,2,4,6,7}
Explanation : Given array is sorted in non-decreasing order.
*/

public class MergeSort {
	private static void merge(int[] array, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int k = 0;

		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (array[left] <= array[right]) {
				temp[k] = array[left];
				++left;
			} else {
				temp[k] = array[right];
				++right;
			}
			++k;
		}

		while (left <= mid) {
			temp[k] = array[left];
			++k;
			++left;
		}

		while (right <= high) {
			temp[k] = array[right];
			++k;
			++right;
		}

		for (k = 0; k < temp.length; ++k) {
			array[low + k] = temp[k];
		}
	}

	public static void sort(int[] array, int low, int high) {
		if (low < high) {
			int mid = (high - low) / 2 + low;
			sort(array, low, mid);
			sort(array, mid + 1, high);
			merge(array, low, mid, high);
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

                MergeSort.sort(array, 0, array.length - 1);

                IO.print("Sorted Array is: ");
                IO.println(java.util.Arrays.toString(array));
        }
}