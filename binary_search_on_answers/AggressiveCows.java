/* Aggressive Cows

Given an integer array arr[], which denotes the positions of stalls. All the positions are distinct. There are k aggressive cows.

Assign the cows to the stalls such that the minimum distance between any two cows is maximized.

Examples:
Input: arr[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at arr[0], the second at arr[2], and the third at arr[3]. The minimum distance between any two cows is 3 (between arr[0] and arr[2]), which is the maximum possible among all valid arrangements.

Input: arr[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at arr[0], the second at arr[1], and the third at arr[4]. In this arrangement, the minimum distance between any two cows is 4 (between arr[1] and arr[4]), which is the maximum possible among all valid arrangements.

Constraints:
2 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 108
2 ≤ k ≤ arr.size()
*/

public class AggressiveCows {
	public static int getNextPost(int[] arr, int start, int target) {
		int low = start;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	public static boolean canPlace(int[] arr, int cows, int dist) {
		int idx = 0;

		while (idx < arr.length && cows > 0) {
			--cows;
			idx = getNextPost(arr, idx + 1, arr[idx] + dist);
		}

		if (cows == 0) {
			return true;
		}
		return false;
	}

	public static int getMinDist(int[] arr, int k) {
		java.util.Arrays.sort(arr);

		int min = 1;
		int max = arr[arr.length - 1] - arr[0];

		int ans = 0;
		while (min <= max) {
			int mid = (max - min) / 2 + min;

			if (canPlace(arr, k, mid)) {
				ans = mid;
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {10, 1, 2, 7, 5};
		int k = 3;

		System.out.println("Given Stall Coordinates");
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println("Given No. of Aggressive Cows are " + k);

		System.out.println();
		System.out.print("Desired Maximized Minimum Distance is ");
		System.out.println(getMinDist(arr, k));
	}
}