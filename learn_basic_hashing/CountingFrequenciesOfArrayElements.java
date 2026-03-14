/* Count frequency of each element in the array

Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

Examples
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 
10  3
5   2
15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 
2  3
3  1
4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array
*/

public class CountingFrequenciesOfArrayElements {
	public static void main(String[] args) {
		String input = IO.read("Enter the size of array: ");
		int size = Integer.parseInt(input);

		int[] array = new int[size];

		for (int i = 0; i < size; ++i) {
			array[i] = Integer.parseInt(IO.read("Enter element " + i + ": "));
		}

		IO.println("Given Array: " + java.util.Arrays.toString(array));

		java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

		for (int i = 0; i < size; ++i) {
			if (map.containsKey(array[i])) {
				map.replace(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}

		IO.println("Frequencies of elements: " + map);
	}
}