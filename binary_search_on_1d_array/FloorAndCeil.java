/* Floor and Ceil in Sorted Array

Problem Statement: ou're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1]. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x

Examples

Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
Result: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
Result: 8 8
Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
*/

public class FloorAndCeil {
	public static int[] getValue(int[] array, int x) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (array[mid] == x) {
				return new int[]{x, x};
			} else if (array[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		int[] ans = {-1, -1};

		if (high >= 0) {
			ans[0] = array[high];
		}

		if (low < array.length) {
			ans[1] = array[low];
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] array = {3, 4, 4, 7, 8, 10};
		int x = 5;

		IO.println("Given Array: ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Value of x is: " + x);

		int[] ans = FloorAndCeil.getValue(array, x);
		IO.println();
		IO.print("[Floor, Ceil]: ");
		IO.println(java.util.Arrays.toString(ans));
	}
}