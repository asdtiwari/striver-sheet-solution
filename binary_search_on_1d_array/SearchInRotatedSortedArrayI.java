/* Search Element in a Rotated Sorted Array

Problem Statement: Given an integer array nums, sorted in ascending order (with distinct values) and a target value k. The array is rotated at some pivot point that is unknown. Find the index at which k is present and if k is not present return -1.

Examples
Input:nums = [4, 5, 6, 7, 0, 1, 2], k = 0
Output :4
Explanation : Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums. Thus, we get output as 4, which is the index at which 0 is present in the array.

Input: nums = [4, 5, 6, 7, 0, 1, 2], k = 3
Output :-1
Explanation :Here, the target is 3. Since 3 is not present in the given rotated sorted array. Thus, we get the output as -1.
*/

public class SearchInRotatedSortedArrayI {
	public static int getIdx(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (array[mid] == target) {
				return mid;
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

		return -1;
	}

	public static void main(String[] args) {
		int[] array = {4, 5, 6, 7, 0, 1, 2};
		int target = 3;

		IO.println("Given array is ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Target is: " + target);

		IO.println();
		IO.print("Index of target is: ");
		IO.println(SearchInRotatedSortedArrayI.getIdx(array, target));
	}
}