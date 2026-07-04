/* Length of the longest subarray with zero Sum

Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

Examples
Example 1:
Input:
 N = 6, array[] = {9, -3, 3, -1, 6, -5}  
Result:
 5  
Explanation:
 The following subarrays sum to zero:
- {-3, 3}
- {-1, 6, -5}
- {-3, 3, -1, 6, -5}
The length of the longest subarray with sum zero is 5.

Example 2:
Input:
 N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}  
Result:
 8  
Explanation:
 Subarrays with sum zero:
- {-2, 2}
- {-8, 1, 7}
- {-2, 2, -8, 1, 7}
- {6, -2, 2, -8, 1, 7, 4, -10}
The length of the longest subarray with sum zero is 8.
*/

public class LengthOfLongestSubarrayWithZeroSum {
	public static int getLength(int[] array) {
		java.util.Map<Long, Integer> map = new java.util.HashMap<>();

		map.put(0L, -1);

		long sum = 0L;

		int maxLength = 0;

		for (int i = 0; i < array.length; ++i) {
			sum += array[i];
			if (map.containsKey(sum)) {
				int idx = map.get(sum);

				int length = i - idx;

				if (length > maxLength) {
					maxLength = length;
				}
			} else {
				map.put(sum, i);
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int[] array = {6, -2, 2, -8, 1, 7, 4, -10};

		IO.println("Given array:");
		IO.println(java.util.Arrays.toString(array));

		IO.println();
		IO.print("Length of longest subarray with 0 sum is ");
		IO.println(LengthOfLongestSubarrayWithZeroSum.getLength(array));
	}
}