/* Single Element in a Sorted Array

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10 

Constraints:
1 <= nums.length <= 105
0 <= nums[i] <= 105
*/

public class SingleElementInSortedArray {
	public static int getElement(int[] nums) {
		if (nums.length == 1) return nums[0];

		int low = 0;
		int high = nums.length - 1;

		if (nums[low] != nums[low + 1]) return nums[low];

		if (nums[high - 1] != nums[high]) return nums[high];

		low += 1;
		high -= 1;

		int ans = -1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
				ans = nums[mid];
				break;
			}

			if (mid % 2 == 0) {
				if (nums[mid - 1] == nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (nums[mid - 1] == nums[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {3,3,7,7,10,11,11};

		IO.println("Given Array is");
		IO.println(java.util.Arrays.toString(nums));

		IO.println();
		IO.print("Single Element is: ");
		IO.println(SingleElementInSortedArray.getElement(nums));
	}
}