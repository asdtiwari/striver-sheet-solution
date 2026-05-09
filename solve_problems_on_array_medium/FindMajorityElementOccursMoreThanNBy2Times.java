/* Find the Majority Element that occurs more than N/2 times

Problem Statement: Given an integer array nums of size n, return the majority element of the array.

The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

Examples
Example 1:
Input:
 nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
Output:
 7  
Explanation:
 The number 7 appears 5 times in the 9-sized array, making it the most frequent element.

Example 2:
Input:
 nums = [1, 1, 1, 2, 1, 2]  
Output:
 1  
Explanation:
 The number 1 appears 4 times in the 6-sized array, making it the most frequent element.
*/

public class FindMajorityElementOccursMoreThanNBy2Times {
	public static int getElement(int[] array) {
		// Boyer-Moore Voting Algorithm
		int candidate = -1;
		int squadSize = 0;

		for (int i = 0; i < array.length; ++i) {
			if (squadSize == 0) {
				candidate = array[i];
				squadSize = 1;
			} else if (candidate == array[i]) {
				++squadSize;
			} else {
				--squadSize;
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		IO.println("Given Array:");
		IO.println(java.util.Arrays.toString(array));

		IO.print("Majority Element: ");
		IO.println(FindMajorityElementOccursMoreThanNBy2Times.getElement(array));
	}
}