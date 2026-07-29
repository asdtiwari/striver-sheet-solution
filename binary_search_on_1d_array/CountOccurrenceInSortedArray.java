/* Count Occurrences in Sorted Array

Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

Examples
Example 1:
Input:
 N = 7,  X = 3 , array[] = {2, 2 , 3 , 3 , 3 , 3 , 4}
Output
: 4
Explanation:
 3 is occurring 4 times in 
the given array so it is our answer.

Example 2:
Input:
 N = 8,  X = 2 , array[] = {1, 1, 2, 2, 2, 2, 2, 3}
Output
: 5
Explanation:
 2 is occurring 5 times in the given array so it is our answer.
*/

public class CountOccurrenceInSortedArray {
	public static int getCount(int[] nums, int x) {
		int[] indices = {-1, -1};


		// lower bound

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (nums[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		if (low < nums.length && nums[low] == x) {
			indices[0] = low;
		} else {
			return 0;
		}


		// upper bound

		low = 0;
		high = nums.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (nums[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		indices[1] = low - 1;

		return indices[1] - indices[0] + 1;
	}

	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 2, 2, 2, 2, 3};
		int x = 2;

		IO.println("Given array is ");
		IO.println(java.util.Arrays.toString(nums));
		IO.println("Given X: " + x);

		IO.println();
		IO.println("Occurrences: ");
		IO.println(CountOccurrenceInSortedArray.getCount(nums, x));
	}
}