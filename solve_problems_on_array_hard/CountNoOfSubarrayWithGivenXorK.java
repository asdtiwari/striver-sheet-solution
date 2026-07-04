/* Count the number of subarrays with given xor K

Problem Statement: Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.

Examples
Input: A = [4, 2, 2, 6, 4], k = 6
Output: 4
Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
Input: A = [5, 6, 7, 8, 9], k = 5
Output: 2
Explanation: The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]
*/

public class CountNoOfSubarrayWithGivenXorK {
	public static int getCount(int[] array, int k) {
		java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

		int count = 0;

		int xor = 0;

		map.put(xor, 1);

		for (int i = 0; i < array.length; ++i) {
			xor ^= array[i];

			if (map.containsKey(xor ^ k)) {
				count += map.get(xor ^ k);
			}

			if (map.containsKey(xor)) {
				map.put(xor, map.get(xor) + 1);
			} else {
				map.put(xor, 1);
			}

		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = {5, 6, 7, 8, 9};
		int k = 5;

		IO.println("Given array: ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Given k: " + k);

		IO.println();
		IO.println(CountNoOfSubarrayWithGivenXorK.getCount(array, k));
	}
}