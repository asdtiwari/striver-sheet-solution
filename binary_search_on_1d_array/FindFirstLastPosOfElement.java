/* Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
*/

public class FindFirstLastPosOfElement {
	public static int[] getPosition(int[] nums, int target) {
		int[] ans = {-1, -1};


		// lower bound

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		if (low < nums.length && nums[low] == target) {
			ans[0] = low;
		} else {
			return ans;
		}


		// upper bound

		low = 0;
		high = nums.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		ans[1] = low - 1;

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {};
		int target = 0;

		IO.println("Given array is ");
		IO.println(java.util.Arrays.toString(nums));
		IO.println("Given Target: " + target);

		IO.println();
		int[] ans = FindFirstLastPosOfElement.getPosition(nums, target);
		IO.print("First and Last Position: ");
		IO.println(java.util.Arrays.toString(ans));
	}
}