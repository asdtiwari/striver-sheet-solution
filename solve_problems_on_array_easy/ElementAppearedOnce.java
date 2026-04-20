/* Find the number that appears once, and the other numbers twice

Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

Examples
Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
*/

public class ElementAppearedOnce {
	public static int getElement(int[] array) {
		// a xor a = 0 by considering this fact, at last unique element will be in xor
		int xor = 0; 

		for (int i = 0; i < array.length; ++i) {
			xor ^= array[i];
		}

		return xor;
	}

	public static void main(String[] args) {
		int[] array = {2,2,1};
		IO.println("Given Array:");
		IO.println(java.util.Arrays.toString(array));

		IO.print("Element having unique appearence: ");
		IO.println(ElementAppearedOnce.getElement(array));
	}
}