/* Count Subarray sum Equals K
Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k. A subarray is a contiguous non-empty sequence of elements within an array.

Examples
Input : N = 4, array[] = {3, 1, 2, 4}, k = 6
Output: 2
Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].

Input: N = 3, array[] = {1,2,3}, k = 3
Output: 2
Explanation: The subarrays that sum up to 3 are [1, 2], and [3].
*/

public class CountSubArraySumEqualsK {
	public static int getCount(int[] array, int k) {
		java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

		int prefixSum = 0;
		map.put(prefixSum, 1);

		int count = 0;

		for (int i = 0; i < array.length; ++i) {
			prefixSum += array[i];

			if (map.containsKey(prefixSum - k)) {
				count += map.get(prefixSum - k);
			}

			if (map.containsKey(prefixSum)) {
				map.put(prefixSum, map.get(prefixSum) + 1);
			} else {
				map.put(prefixSum, 1);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = {1,-1,0};
		int k = 0;

		IO.println("Given Array");
		IO.println(java.util.Arrays.toString(array));

		IO.println("Given k: " + k);

		IO.print("No. of subarray: ");
		IO.println(CountSubArraySumEqualsK.getCount(array, k));
	}
}