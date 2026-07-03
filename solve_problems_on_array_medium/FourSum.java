/* 4 Sum | Find Quads that add up to a target value

Problem Statement: Given an array of N integers, your task is to find unique quads that add up to give a target value. In short, you need to return an array of all the unique quadruplets [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.

Note: a, b, c and d are also distinct and lies between 0 to n-1 (both inclusive).
Examples
Example 1:
Input Format:arr[] = [1,0,-1,0,-2,2], target = 0
Result: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Explanation:We have to find unique quadruplets from the array such that the sum of those elements is equal to the target sum given that is 0. The result obtained is such that the sum of the quadruplets yields 0.

Example 2:
Input Format: arr[] = [4,3,3,4,4,2,1,2,1,1], target = 9
Result: [[1,1,3,4],[1,2,2,4],[1,2,3,3]]
Explanation: The sum of all the quadruplets is equal to the target i.e. 9.
*/

public class FourSum {
	public static java.util.List<java.util.List<Integer>> fourSum(int[] nums, int target) {
		java.util.Arrays.sort(nums);

		java.util.List<java.util.List<Integer>> ans = new java.util.ArrayList<>();

		int firstAt = 0;
		while (firstAt < nums.length - 3) {
			if (firstAt == 0 || nums[firstAt] != nums[firstAt - 1]) {
				int secondAt = firstAt + 1;
				while (secondAt < nums.length - 2) {
					if (secondAt == firstAt + 1 || nums[secondAt] != nums[secondAt - 1]) {
						long twoSum = (long)nums[firstAt] + nums[secondAt];
						long newTarget = target - twoSum;

						int left = secondAt + 1;
						int right = nums.length - 1;
						while (left < right) {
							long sum = (long)nums[left] + nums[right];
							if (sum == newTarget) {
								java.util.List<Integer> list = new java.util.ArrayList<>();
								list.add(nums[firstAt]);
								list.add(nums[secondAt]);
								list.add(nums[left]);
								list.add(nums[right]);

								ans.add(list);

								++left;
								--right;

								while (left < right && nums[left] == nums[left - 1]) {
									++left;
								}

								while (right > left && nums[right] == nums[right + 1]) {
									--right;
								}
							} else if (sum < newTarget) {
								++left;
							} else {
								--right;
							}
						}
					}
					++secondAt;
				}
			}
			++firstAt;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] array = {4,3,3,4,4,2,1,2,1,1};
		int target = 9;

		IO.println("Given array is: ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Given Target is: " + target);

		IO.println();
		IO.println("Answer:");
		IO.println(FourSum.fourSum(array, target));
	}
}