/* Union of Two Sorted Arrays

Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.

NOTE: Elements in the union should be in ascending order.

Examples

Input:n = 5,m = 5 arr1[] = {1,2,3,4,5}  arr2[] = {2,3,4,4,5}
Output: {1,2,3,4,5}
Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}

Input:n = 10,m = 7,arr1[] = {1,2,3,4,5,6,7,8,9,10}arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}
*/

public class UnionOfTwoSortedArray {
	public static int[] union(int[] array1, int[] array2) {
		int[] temp = new int[array1.length + array2.length + 1];
		int idxT = 0;

		int idx1 = 0;
		int idx2 = 0;

		while (idx1 < array1.length && idx2 < array2.length) {

			if (array1[idx1] < array2[idx2]) {
				if (idxT == 0 || temp[idxT - 1] != array1[idx1]) {
					temp[idxT] = array1[idx1];
					++idxT;
				}
				++idx1;
			} else if (array1[idx1] > array2[idx2]) {
				if (idxT == 0 || temp[idxT - 1] != array2[idx2]) {
					temp[idxT] = array2[idx2];
					++idxT;
				}
				++idx2;
			} else {
				if (idxT == 0 || temp[idxT - 1] != array1[idx1]) {
					temp[idxT] = array1[idx1];
					++idxT;
				}
				++idx1;
				++idx2;
			}
		}

		while (idx1 < array1.length) {
			if (idxT == 0 || temp[idxT - 1] != array1[idx1]) {
				temp[idxT] = array1[idx1];
				++idxT;
			}
			++idx1;
		}

		while (idx2 < array2.length) {
			if (idxT == 0 || temp[idxT - 1] != array2[idx2]) {
				temp[idxT] = array2[idx2];
				++idxT;
			}
			++idx2;
		}

		int[] ans = new int[idxT];
		for (int i = 0; i < idxT; ++i) {
			ans[i] = temp[i];
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		int[] array2 = {2,3,4,4,5,11,12};

		IO.println("Given Array");
		IO.println(java.util.Arrays.toString(array1));
		IO.println(java.util.Arrays.toString(array2));

		IO.println();
		IO.println("Union Array");
		int[] unionArray = UnionOfTwoSortedArray.union(array1, array2);
		IO.println(java.util.Arrays.toString(unionArray));
	}
}