/* Print subarray with maximum subarray sum (extended version of Kadane's Algorithm problem) */

public class PrintSubarrayWithMaxSum {
	public static int[] getSubarray(int[] array) {
		if (array.length == 0) {
			return new int[0];
		}

		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;

		int maxSubarrayStartIdx = -1;
		int maxSubarrayEndIdx = -1;

		int sIdx = 0;
		int eIdx = 0;

		for (int i = 0; i < array.length; ++i) {
			currSum += array[i];
			eIdx = i;

			if (currSum > maxSum) {
				maxSubarrayStartIdx = sIdx;
				maxSubarrayEndIdx = eIdx;
				maxSum = currSum;
			}

			if (currSum < 0) {
				sIdx = i + 1;
				eIdx = i + 1;
				currSum = 0;
			}
		}

		int subarraySize = maxSubarrayEndIdx - maxSubarrayStartIdx + 1;
		int[] ans = new int[subarraySize];

		for (int i = maxSubarrayStartIdx, j = 0; i <= maxSubarrayEndIdx; ++i, ++j) {
			ans[j] = array[i];
		} 

		return ans;
	}
	public static void main(String[] args) {
		int[] array = {2, 3, 5, -2, 7, -4};
		IO.println("Given Array is:");
		IO.println(java.util.Arrays.toString(array));

		IO.println("Subarray having max sum");
		int[] ans = PrintSubarrayWithMaxSum.getSubarray(array);
		IO.println(java.util.Arrays.toString(ans));
	}
}