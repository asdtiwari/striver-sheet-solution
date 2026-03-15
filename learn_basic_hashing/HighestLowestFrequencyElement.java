/* Find the highest/lowest frequency element

Problem Statement: Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

Examples
Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.


Example 2:
Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
*/

public class HighestLowestFrequencyElement {
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

		int highestFreq = Integer.MIN_VALUE;
		int highestElement = 0;

		int lowestFreq = Integer.MAX_VALUE;
		int lowestElement = 0;

		for (int key : map.keySet()) {
			int val = map.get(key);

			if (val > highestFreq) {
				highestFreq = val;
				highestElement = key;
			}

			if (val < lowestFreq) {
				lowestFreq = val;
				lowestElement = key;
			}
		}

		IO.print(highestElement + " " + lowestElement);
	}
}