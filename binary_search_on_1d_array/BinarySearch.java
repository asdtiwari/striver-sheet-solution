/* Binary Search: Explained
Problem statement: You are given a sorted array of integers and a target, your task is to search for the target in the given array. Assume the given array does not contain any duplicate numbers.
*/

public class BinarySearch {
	public static int search(int[] array, int target) {
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

		return -1;
	}

	public static void main(String[] args) {
		int[] array = {0, 1, 2, 4, 7, 9};
		int target = 9;

		IO.println("Given Array: ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Given Target: " + target);

		IO.println();
		IO.print("Target present at ");
		IO.println(BinarySearch.search(array, target));
	}
}