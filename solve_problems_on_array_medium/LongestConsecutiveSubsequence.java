/* Longest Consecutive Sequence in an Array

Problem Statement: Given an array nums of n integers.

Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.

Examples
Example 1:
Input:
 nums = [100, 4, 200, 1, 3, 2]  
Output:
 4  
Explanation:
 The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4. This sequence can be formed regardless of the initial order of the elements in the array.

Example 2:
Input:
 nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]  
Output:
 9  
Explanation:
 The longest sequence of consecutive elements in the array is [0, 1, 2, 3, 4, 5, 6, 7, 8], which has a length of 9. 
*/

public class LongestConsecutiveSubsequence {
	public static int longestConsecutive(int[] nums) {
		int maxLen = 0;

		java.util.Set<Integer> set = new java.util.HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		for (int currNum : set) {
			if (!set.contains(currNum - 1)) {
				int len = 0;
				int num = currNum;

				while (set.contains(num)) {
					++num;
					++len;
				}

				if (len > maxLen) {
					maxLen = len;
				}
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

		IO.println("Given Array is:");
		IO.println(java.util.Arrays.toString(nums));

		IO.println("Length of longest consecutive is: ");
		IO.println(LongestConsecutiveSubsequence.longestConsecutive(nums));
	}
}