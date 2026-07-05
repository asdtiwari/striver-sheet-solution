/* Merge two Sorted Arrays Without Extra Space

Problem Statement: Given two sorted integer arrays nums1 and nums2, merge both the arrays into a single array sorted in non-decreasing order.
The final sorted array should be stored inside the array nums1 and it should be done in-place.
Array nums1 has a length of m + n, where the first m elements denote the elements of nums1 and rest are 0s whereas nums2 has a length of n.

Examples
Input : nums1 = [-5, -2, 4, 5, 0, 0, 0], nums2 = [-3, 1, 8]
Output : [-5, -3, -2, 1, 4, 5, 8]
Explanation : The merged array is: [-5, -3, -2, 1, 4, 5, 8], where [-5, -2, 4, 5] are from nums1 and [-3, 1, 8] are from nums2
Input : nums1 = [0, 2, 7, 8, 0, 0, 0], nums2 = [-7, -3, -1]
Output :  [-7, -3, -1, 0, 2, 7, 8]
Explanation :  The merged array is: [-7, -3, -1, 0, 2, 7, 8], where [0, 2, 7, 8] are from nums1 and [-7, -3, -1] are from nums2
*/

public class MergeSortedArrayWithoutExtraSpace {
	public static void merge(int[] array1, int m, int[] array2, int n) {
		int idx = array1.length - 1;

		--m;
		--n;

		while (m >= 0 && n >= 0) {
			if (array1[m] > array2[n]) {
				array1[idx] = array1[m];
				--m;
			} else {
				array1[idx] = array2[n];
				--n;
			}
			--idx;
		}

		while (m >= 0) {
			array1[idx] = array1[m];
			--idx;
			--m;
		}

		while (n >= 0) {
			array1[idx] = array2[n];
			--idx;
			--n;
		}
	}

	public static void main(String[] args) {
		int[] array1 = {0, 2, 7, 8, 0, 0, 0};
		int m = 4;

		int[] array2 = {-7, -3, -1};
		int n = array2.length;

		IO.println("Given Array1");
		IO.println(java.util.Arrays.toString(array1));

		IO.println("Given Array2");
		IO.println(java.util.Arrays.toString(array2));

		MergeSortedArrayWithoutExtraSpace.merge(array1, m, array2, n);

		IO.println("After merging, Array1 looks like");
		IO.println(java.util.Arrays.toString(array1));
	}
}