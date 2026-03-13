/* Reverse a given Array

Problem Statement: You are given an array. The task is to reverse the array and print it.

Examples
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
*/

import java.util.Arrays;

public class ReverseAGivenArray {
	public static void main(String[] args) {
		int size = Integer.parseInt(IO.read("Enter the size of Array: "));
		int[] array = new int[size];

		for (int i = 0; i < size; ++i) {
			array[i] = Integer.parseInt(IO.read("Enter element " + i + ": "));
		}

		IO.println("Given Array: " + Arrays.toString(array));

		reverseTheArray(array, 0);

		IO.println("Reverse Array: " + Arrays.toString(array));
	}

	public static void reverseTheArray(int[] array, int idx) {
		if (idx < array.length / 2) {
			int temp = array[idx];
			array[idx] = array[array.length - 1 - idx];
			array[array.length - 1 - idx] = temp;
		}
	}
}
