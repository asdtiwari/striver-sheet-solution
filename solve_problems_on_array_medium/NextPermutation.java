/* next_permutation : find next lexicographically greater permutation

Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).

Examples
Input: Arr[] = {1,3,2}
Output: {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
Input : Arr[] = {3,2,1}
Output: {1,2,3}
Explanation : As we see all permutations of {1,2,3}, we find {3,2,1} at the last position. So, we have to return the lowest permutation.
*/

public class NextPermutation {
	private void swap(int[] nums, int idx1, int idx2) {
		int temp = nums[idx1];
		nums[idx1] = nums[idx2];
		nums[idx2] = temp;
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			++start;
			--end;
		}
	}

	public void nextPermutation(int[] nums) {
		int idx = nums.length - 2;

		while (idx >= 0) {
			if (nums[idx] < nums[idx + 1]) {
				break;
			}
			--idx;
		}

		if (idx < 0) {
			reverse(nums, 0, nums.length - 1);
		} else {
			int smallAt = nums.length - 1;
			while (smallAt > idx) {
				if (nums[smallAt] > nums[idx]) {
					break;
				}
				--smallAt;
			}

			swap(nums, idx, smallAt);
			reverse(nums, idx + 1, nums.length - 1);
		}
	}

	public static void main(String[] args) {
		int[] nums = {1,1,1};
		IO.println("Given Permutaion:");
		IO.println(java.util.Arrays.toString(nums));

		new NextPermutation().nextPermutation(nums);
		IO.println("Next Permutation:");
		IO.println(java.util.Arrays.toString(nums));
	}
}