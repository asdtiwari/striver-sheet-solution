/* Find out how many times the array has been rotated

Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find how many times the array has been rotated.

Pre-requisites: Find minimum in Rotated Sorted Array,  Search in Rotated Sorted Array II & Binary Search algorithm

Examples
Input : arr = [4,5,6,7,0,1,2,3]
Result: 4
Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.

Input : arr = [3,4,5,1,2]
Output : 3
Explanation: The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.
*/

public class FindOutHowManyTimesSortedArrayRotated {
	public static int getNoOfRotation(int[] array) {
		int low = 0;
		int high = array.length - 1;

		while (low < high) {
			int mid = (high - low) / 2 + low;

			if (array[mid] < array[high]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	public static void main(String[] args) {
		int[] array = {3,4,5,1,2};

		IO.println("Given Array is");
		IO.println(java.util.Arrays.toString(array));

		IO.println();
		IO.print("Minimum element is: ");
		IO.println(FindOutHowManyTimesSortedArrayRotated.getNoOfRotation(array));
	}
}