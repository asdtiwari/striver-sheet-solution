/* Linear Search
Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.

Examples
Example 1:
Input:
 arr[] = 1 2 3 4 5, num = 3  
Output:
 2  `
Explanation:
 3 is present at the 2nd index of the array.

Example 2:
Input:
 arr[] = 5 4 3 2 1, num = 5  
Output:
 0  
Explanation:
 5 is present at the 0th index of the array.
*/

public class LinearSearch {
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5, 3, 6, 9, 0, 7, 8};
		int key = 6;
		IO.println("Given Array:\n" + java.util.Arrays.toString(array));
		IO.println(LinearSearch.search(array, key));
	}
}