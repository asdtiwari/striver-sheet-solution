/* Implement Upper Bound
Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

What is Upper Bound?
The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than the given key i.e. x.

The upper bound is the smallest index, ind, where arr[ind] > x.

Example 1:
Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
Result: 3
Explanation: Index 3 is the smallest index such that arr[3] > x.

Example 2:
Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
Result: 4
Explanation: Index 4 is the smallest index such that arr[4] > x.
*/

public class ImplementUpperBound {
	public static int getIndex(int[] array, int x) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;

			if (array[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		int[] array = {3,5,8,9,15,19};
		int x = 9;

		IO.println("Given Array: ");
		IO.println(java.util.Arrays.toString(array));
		IO.println("Value of x is: " + x);

		IO.print("Index: ");
		IO.println(ImplementUpperBound.getIndex(array, x));
	}
}