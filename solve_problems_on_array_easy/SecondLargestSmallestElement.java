/* Find Second Smallest and Second Largest Element in an array
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples
Example 1:
Input:
 [1, 2, 4, 7, 7, 5]  
Output:
  
Second Smallest : 2  
Second Largest : 5  
Explanation:
  The elements are sorted as 1, 2, 4, 5, 7, 7.  
Hence, the second smallest element is 2, and the second largest element is 5.

Example 2:
Input:
 [1]  
Output:
  
Second Smallest : -1  
Second Largest : -1  
Explanation:
  Since there is only one element in the array, it is both the largest and smallest element.  
Therefore, there is no second smallest or second largest element present.
*/

public class SecondLargestSmallestElement {
	public static int getSecondLargest(int[] array) {
		int largest = array[0];
		int second = -1;
		
		for (int i = 1; i < array.length; ++i) {
			if (largest < array[i]) {
				if (second < largest) {
					second = largest;
				}
				largest = array[i];
			} else if (array[i] > second){
				second = array[i];
			}
		}

		return second;
	}

	public static int getSecondSmallest(int[] array) {
		int smallest = array[0];
		int second = Integer.MAX_VALUE;
		boolean hasMaxValue = false;
		
		for (int i = 1; i < array.length; ++i) {
			if (smallest > array[i]) {
				if (second > smallest) {
					second = smallest;
				}
				smallest = array[i];
			} else if (array[i] < second){
				second = array[i];
			}

			if (Integer.MAX_VALUE == array[i]) {
				hasMaxValue = true;
			}
		}

		if (hasMaxValue && second == Integer.MAX_VALUE) {
			return second;
		} else if (second == Integer.MAX_VALUE) {
			return -1;
		}

		return second;

	}

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.read("Enter size of array: "));
		int[] array = new int[size];

		IO.println("Enter " + size + " elements in array seperated by space:");
		for (int i = 0; i < size; ++i) {
			array[i] = Integer.parseInt(IO.read());
		}

		IO.println("Second Largest: " + getSecondLargest(array));
		IO.println("Second Smallest: " + getSecondSmallest(array)); 
	}
}