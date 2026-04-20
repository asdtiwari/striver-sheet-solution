/* Count Maximum Consecutive One's in the array

Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array..

Examples
Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Example 2:
Input: prices = {1, 0, 1, 1, 0, 1} 
Output: 2
Explanation: There are two consecutive 1's in the array.
*/

public class CountMaxConsecutiveOne {
	public static int getCount(int[] array) {
		int count = 0;
		int i = 0;
		while(i < array.length) {
			int j = i;
			while (j < array.length && array[j] == 1) {
				++j;
			}

			if (i != j) {
				if (count < j - i) {
					count = j - i;
				}
				i = j;
			} else {
				i = j + 1;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = {1, 0, 1, 1, 0, 1};

		IO.println("Given Array");
		IO.println(java.util.Arrays.toString(array));

		IO.print("Max length of consecutive One: ");
		IO.println(CountMaxConsecutiveOne.getCount(array));
	}
}