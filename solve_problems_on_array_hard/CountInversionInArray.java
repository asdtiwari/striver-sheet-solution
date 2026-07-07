/* Count inversions in an array

Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).

Inversion of an array: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

Examples
Example 1:
Input Format: N = 5, array[] = {1,2,3,4,5}
Result: 0
Explanation: we have a sorted array and the sorted array has 0 inversions as for i < j you will never find a pair such that A[j] < A[i]. More clear example: 2 has index 1 and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an inversion.

Example 2:
Input Format: N = 5, array[] = {5,4,3,2,1}
Result: 10
Explanation: we have a reverse sorted array and we will get the maximum inversions as for i < j we will always find a pair such that A[j] < A[i]. Example: 5 has index 0 and 3 has index 2 now (5,3) pair is inversion as 0 < 2 and 5 > 3 which will satisfy out conditions and for reverse sorted array we will get maximum inversions and that is (n)*(n-1) / 2.For above given array there is 4 + 3 + 2 + 1 = 10 inversions.

Example 3:
Input Format: N = 5, array[] = {5,3,2,1,4}
Result: 7
Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition.
*/

public class CountInversionInArray {

	public static long merge(int[] array, int start, int mid, int end) {
		long inversions = 0L;

		int[] temp = new int[end - start + 1];
		int idx = 0;

		int s = start;
		int m = mid + 1;
		while (s <= mid && m <= end) {
			if (array[s] <= array[m]) {
				temp[idx++] = array[s++];
			} else {
				temp[idx++] = array[m++];
				inversions += mid - s + 1;
			}
		}

		while (s <= mid) {
			temp[idx++] = array[s++];
		}

		while (m <= end) {
			temp[idx++] = array[m++];
		}

		for (int i = 0; i < temp.length; ++i) {
			array[start + i] = temp[i];
		}

		return inversions;
	}

	public static long split(int[] array, int start, int end) {
		long inversions = 0L;
		if (start < end) {
			int mid = (end - start) / 2 + start;
			inversions += split(array, start, mid);
			inversions += split(array, mid + 1, end);
			inversions += merge(array, start, mid, end);
		}
		return inversions;
	}

	public static long mergeSort(int[] array) {
		return split(array, 0, array.length - 1);
	}

	public static long getCount(int[] array) {
		return mergeSort(array);
	}

	public static void main(String[] args) {
		int[] array = {5,3,2,1,4};

		IO.println("Given Array is: ");
		IO.println(java.util.Arrays.toString(array));

		IO.println();
		IO.print("Number of Inversions are: ");
		IO.println(CountInversionInArray.getCount(array));
	}
}