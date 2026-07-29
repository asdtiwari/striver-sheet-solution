/* Search Insert Position

Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.

Examples
Example 1:
Input Format: arr[] = {1,2,4,7}, x = 6
Result: 3
Explanation: 6 is not present in the array. So, if we will insert 6 in the 3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.

Example 2:
Input Format: arr[] = {1,2,4,7}, x = 2
Result: 1
Explanation: 2 is present in the array and so we will return its index i.e. 1.
*/

public class SearchInsertPosition {
	public static int getIndex(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	public static void main(String[] args) {
		int[] array = {3,5,8,9,15,19};
		int target = 2;

		IO.println("Given Array: ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Target is: " + target);

		IO.print("Index: ");
		IO.println(SearchInsertPosition.getIndex(array, target));
	}
}