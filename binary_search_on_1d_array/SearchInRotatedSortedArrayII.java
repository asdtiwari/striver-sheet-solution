/* Search Element in Rotated Sorted Array II

Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.

Examples
Example 1:
Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
Result: True
Explanation: The element 3 is present in the array. So, the answer is True.

Example 2:
Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
Result: False
Explanation: The element 10 is not present in the array. So, the answer is False.
*/

public class SearchInRotatedSortedArrayII {
	public static boolean isPresent(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (array[mid] == target) {
				return true;
			} else if (array[low] == array[mid] && array[mid] == array[high]) {
				low = low + 1;
				high = high - 1;
			} else if (array[low] <= array[mid]) {
				if (array[low] <= target && target < array[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (array[mid] < target && target <= array[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = {1, 0, 1, 1, 1};
		int target = 0;

		IO.println("Given array is ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Target is: " + target);

		IO.println();
		IO.print("Is element present: ");
		IO.println(SearchInRotatedSortedArrayII.isPresent(array, target));
	}
}