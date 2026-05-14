/* Leaders in an Array

Examples
Example 1:
Input:
 arr = [4, 7, 1, 0]  
Output:
 7 1 0  
Explanation:
 The rightmost element (0) is always a leader.  
7 and 1 are greater than the elements to their right, making them leaders as well.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]  
Output:
 22 12 6  
Explanation:
 6 is a leader because there are no elements after it.  
12 is greater than all the elements to its right (3, 0, 6), and 22 is greater than 12, 3, 0, 6, making them leaders as well.
*/

public class LeaderInArray {
	public static java.util.List<Integer> leaderInArray(int[] nums) {
		java.util.List<Integer> list = new java.util.ArrayList<>();

		if (nums.length == 0) {
			return list;
		}

		int max = nums[nums.length - 1];
		list.add(max);

		for (int i = nums.length - 2; i >= 0; --i) {
			if (nums[i] > max) {
				max = nums[i];
				list.add(max);
			}
		}

		java.util.Collections.reverse(list);

		return list;
	}

	public static void main(String[] args) {
		int[] nums = {4, 7, 1, 0};

		IO.println("Given Array is:");
		IO.println(java.util.Arrays.toString(nums));

		IO.println("Leaders in Array are:");
		IO.println(LeaderInArray.leaderInArray(nums));
	}
}