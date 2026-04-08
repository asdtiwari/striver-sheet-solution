/* Find the Largest element in an array
Problem Statement: Given an array, we have to find the largest element in the array.

Examples
Example 1:
Input:
 arr[] = {2, 5, 1, 3, 0}  
Output:
 5  
Explanation:
  
5 is the largest element in the array.
*/

public class LargestElementInArray {
	public static int getLargestElement(int[] array) {
		if (array.length == 0) {
			IO.println("Empty Array");
			return 0;
		}

		int largest = array[0];
		for (int i = 1; i < array.length; ++i) {
			if (largest < array[i]) {
				largest = array[i];
			}
		}

		IO.println("Largest Element is: " + largest);
		return largest;
	}

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.read("Enter the size of the array: "));
		int[] array = new int[size];

		IO.println("Enter " + size + " elements in array seperated by space:");
		for (int i = 0; i < array.length; ++i) {
			array[i] = Integer.parseInt(IO.read());
		}

		IO.println("Given Array is : " + java.util.Arrays.toString(array));
		IO.println("Largest Element is: " + getLargestElement(array));
	}
}