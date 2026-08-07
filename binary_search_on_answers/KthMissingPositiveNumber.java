/* 1539. Kth Missing Positive Number
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 
Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 
Follow up:
Could you solve this problem in less than O(n) complexity?
*/

public class KthMissingPositiveNumber {
	public static int getMissing(int[] arr, int k) {
		// using the logic nums[i] should have (i + 1) as element
		// considering this we can say that nums[i] - (i + 1) tell us No. of missing elements

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			int missing = arr[mid] - (mid + 1);

			if (missing >= k) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		// here at this point the low will cross the high and they bound the target element between them
		// at high missings < k and at low missing >= k
		// nums[high] - (high + 1) will give missings M which is < k
		// (k - M)th element from the current element will our ans
		// nums[high] + (k - (nums[high] - (high + 1)))
		// nums[high] + (k - (nums[high]) - high - 1))
		// nums[high] + (k - nums[high] + high + 1) 
		// nums[high] + k - nums[high] + high + 1
		// k + high + 1 will be our final answer

		return k + high + 1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int k = 2;

		System.out.println("Given Array is ");
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println("Given k is " + k);

		System.out.println();
		System.out.print("Desired missing element is ");
		System.out.println(KthMissingPositiveNumber.getMissing(arr, k));
	}
}