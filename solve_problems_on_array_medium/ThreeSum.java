/* 3 Sum : Find triplets that add up to a zero

Problem Statement: Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero. In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and their sum is equal to zero.

Pre-requisite: 2 Sum Problem

Examples
Example 1:
Input:
 nums = [-1,0,1,2,-1,-4]
Output:
 [[-1,-1,2],[-1,0,1]]
Explanation:
 Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k


Example 2:
Input:
 nums=[-1,0,1,0]
Output:
 Output: [[-1,0,1],[-1,1,0]]
Explanation:
 Out of all possible unique triplets possible, [-1,0,1] and [-1,1,0] satisfy the condition of summing up to zero with i!=j!=k
*/

public class ThreeSum {
	public static java.util.List<java.util.List<Integer>> threeSum(int[] nums) {
		java.util.Arrays.sort(nums);

		java.util.List<java.util.List<Integer>> ans = new java.util.ArrayList<>();

		int idx = 0;
		while (idx < nums.length - 2) {
			if (idx == 0 || nums[idx] != nums[idx - 1]) {
				int target = -nums[idx];

				int left = idx + 1;
				int right = nums.length - 1;

				while (left < right) {
					int twoSum = nums[left] + nums[right];
					if (twoSum == target) {
						java.util.List<Integer> list = new java.util.ArrayList<>();
						list.add(nums[idx]);
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
					} else if (twoSum < target) {
						++left;
					} else {
						--right;
					} 
				}
			}
			++idx;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] array = {-1,0,1,0};
		IO.println("Given Array: ");
		IO.println(java.util.Arrays.toString(array));

		IO.println();
		IO.println("Answer:");
		IO.println(ThreeSum.threeSum(array));
	}
}