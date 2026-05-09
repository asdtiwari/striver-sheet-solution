/* Majority Elements(> N/3 times) | Find the elements that appears more than N/3 times in the array

Problem Statement: Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.

Examples
Example 1:
Input:
 nums = [1, 2, 1, 1, 3, 2]  
Output:
 [1]  
Explanation:
 Here, n / 3 = 6 / 3 = 2.  
Therefore, the elements appearing 3 or more times are: [1].

Example 2:
Input:
 nums = [1, 2, 1, 1, 3, 2, 2]  
Output:
 [1, 2]  
Explanation:
 Here, n / 3 = 7 / 3 = 2.  
Therefore, the elements appearing 3 or more times are: [1, 2].
*/

public class MajorityElementII {
	public static java.util.List<Integer> majorityElement(int[] nums) {
		// Extended version of Boyer-Moore Voting Alogrithm
		int candidate1 = Integer.MAX_VALUE;
		int squad1 = 0;

		int candidate2 = Integer.MAX_VALUE;
		int squad2 = 0;

		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] == candidate1) {
				++squad1;
			} else if (nums[i] == candidate2) {
				++squad2;
			} else if (squad1 == 0) {
				candidate1 = nums[i];
				++squad1;
			} else if (squad2 == 0) {
				candidate2 = nums[i];
				++squad2;
			} else {
				--squad1;
				--squad2;
			}
		}

		// Cross check both candidate strength
		int check1 = 0;
		int check2 = 0;

		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] == candidate1) {
				++check1;
			} else if (nums[i] == candidate2) {
				++check2;
			}
		}

		java.util.List<Integer> list = new java.util.ArrayList<>();
		int eligibleStrength = nums.length / 3;
		if (check1 > eligibleStrength) {
			list.add(candidate1);
		}
		if (check2 > eligibleStrength) {
			list.add(candidate2);
		}

		return list;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 1, 3, 2, 2};
		IO.println("Given Array:");
		IO.println(java.util.Arrays.toString(nums));

		IO.print("Elements appeared more than n/3 times: ");
		IO.println(MajorityElementII.majorityElement(nums));
	}
}