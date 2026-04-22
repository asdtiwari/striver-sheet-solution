/* Longest Subarray with given Sum K(Positives)

Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

Examples
Example 1:
Input:
 nums = [10, 5, 2, 7, 1, 9], k = 15  
Output:
 4  
Explanation:
 The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Example 2:
Input:
 nums = [-3, 2, 1], k = 6  
Output:
 0  
Explanation:
 There is no sub-array in the array that sums to 6. Therefore, the output is 0.
*/

public class LongestSubarrayWithGivenSumK {
	public static int getLength(int[] array, long k) {
		java.util.Map<Long, Integer> map = new java.util.HashMap<>();

		int maxLength = 0;

		long prefixSum = 0;

		// if currentSum is k then currentSum - k will be 0 it means from idx 0 subarray will start
		map.put(0L, -1); 

		for (int i = 0; i < array.length; ++i) {
			prefixSum += array[i];

			if (map.containsKey(prefixSum - k)) {
				int prevIdx = map.get(prefixSum -k);
				if (maxLength < i - prevIdx) {
					maxLength = i - prevIdx;
				}
			}

			if (!map.containsKey(prefixSum)) {
				map.put(prefixSum, i);
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 4, -2, 5};
		int k = 7;

		IO.println("Given Array:");
		IO.println(java.util.Arrays.toString(array));

		IO.println();
		IO.print("Length of Longest subarray having sum " + k + " is ");
		IO.println(LongestSubarrayWithGivenSumK.getLength(array, k));
	}
}