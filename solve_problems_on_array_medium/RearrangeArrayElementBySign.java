/* Rearrange Array Elements by Sign

Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

Examples
Example 1:
Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5
Explanation: 
Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
*/

public class RearrangeArrayElementBySign {
	public static int[] rearrangeArray(int[] nums) {
        	int[] ans = new int[nums.length];
        	int posAt = 0;
        	int negAt = 1;
        	for (int i = 0; i < nums.length; ++i) {
        	    if (nums[i] > 0) {
        	        ans[posAt] = nums[i];
        	        posAt += 2;
        	    } else {
        	        ans[negAt] = nums[i];
        	        negAt += 2;
        	    }
        	}
	        return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,-4,-5};
		IO.println("Given Array is: ");
		IO.println(java.util.Arrays.toString(nums));

		IO.print("Rearranged Array: ");
		IO.println(java.util.Arrays.toString(RearrangeArrayElementBySign.rearrangeArray(nums)));
	}
}