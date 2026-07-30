/* 154. Find Minimum in Rotated Sorted Array II

Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.

Example 1:
Input: nums = [1,3,5]
Output: 1

Example 2:
Input: nums = [2,2,2,0,1]
Output: 0

Constraints:
n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
nums is sorted and rotated between 1 and n times.
*/

public class FindMinInRotatedSortedArrayII {
	public static int getMin(int[] array) {
		int low = 0;
		int high = array.length - 1;

		while (low < high) {
			int mid = (high - low) / 2 + low;

			if (array[mid] == array[high]) {
				high = high - 1;
			} else if (array[mid] < array[high]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return array[low];
	}

	public static void main(String[] args) {
		int[] array = {2,2,2,0,1};

		IO.println("Given Array is");
		IO.println(java.util.Arrays.toString(array));

		IO.println();
		IO.print("Minimum element is: ");
		IO.println(FindMinInRotatedSortedArrayII.getMin(array));
	}
}