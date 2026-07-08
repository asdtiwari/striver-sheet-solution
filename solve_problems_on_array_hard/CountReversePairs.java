/* Count Reverse Pairs

Problem Statement: Given an array of numbers, you need to return the count of reverse pairs. Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].

Examples
Example 1:
Input:
 N = 5, array[] = {1,3,2,3,1)
Output
: 2 
Explanation:
 The pairs are (3, 1) and (3, 1) as from both the pairs the condition arr[i] > 2*arr[j] is satisfied.

Example 2:
Input:
 N = 4, array[] = {3,2,1,4}
Output:
 1
Explaination: 
There is only 1 pair  ( 3 , 1 ) that satisfy the condition arr[i] > 2*arr[j]
*/

public class CountReversePairs {
	public int merge(int[] nums, int start, int mid, int end) {
		int count = 0;

		int[] temp = new int[end - start + 1];
		int idx = 0;

		int l = start;
		int r = mid + 1;

		while (l <= mid && r <= end) {
			if (nums[l] <= nums[r]) {
				temp[idx++] = nums[l++];
			} else {
				temp[idx++] = nums[r++];
			}
		}

		while (l <= mid) {
			temp[idx++] = nums[l++];
		}

		while (r <= end) {
			temp[idx++] = nums[r++];
		}

		r = mid + 1;
		l = start;
		while (r <= end) {
			while (l <= mid) {
				if (nums[l] > 2L * nums[r]) {
					count += mid - l + 1;
					break;
				}
				++l;
			}
			++r;
		}

		for (int i = 0; i < temp.length; ++i) {
			nums[start + i] = temp[i];
		}

		return count;
	}

	public int partition(int[] nums, int start, int end) {
		int count = 0;
		if (start < end) {
			int mid = (end - start) / 2 + start;
			count += partition(nums, start, mid);
			count += partition(nums, mid + 1, end);
			count += merge(nums, start, mid, end);
		}
		return count;
	}

	public int modifiedMergeSort(int[] nums) {
		return partition(nums, 0, nums.length - 1);
	}

	public int getCount(int[] nums) {
		return modifiedMergeSort(nums);
	}

	public static void main (String[] args) {
		int[] nums = {3,2,1,4};
		IO.println("Given Array");
		IO.println(java.util.Arrays.toString(nums));

		IO.print("Number of Reverse Pairs are: ");
		IO.println(new CountReversePairs().getCount(nums));
	}
}