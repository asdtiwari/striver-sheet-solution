/* Maximum Product Subarray in an Array

Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

Examples
Input: Nums = [1,2,3,4,5,0]
Output: 120
Explanation: 
In the given array, 1×2×3×4×5 gives maximum product value.
Input: Nums = [1,2,-3,0,-4,-5]
Output: 20
Explanation: 
In the given array, (-4)×(-5) gives maximum product value.
*/

public class MaximumProductSubarray {
	public static int getProduct(int[] nums) {
		int maxProduct = nums[0];

		int maxPosProd = nums[0];
		int minNegProd = nums[0];

		for (int i = 1; i < nums.length; ++i) {
			int prod1 = maxPosProd * nums[i];
			int prod2 = minNegProd * nums[i];
			int prod3 = nums[i];

			maxPosProd = Math.max(Math.max(prod1, prod2), prod3);
			minNegProd = Math.min(Math.min(prod1, prod2), prod3);

			if (maxPosProd > maxProduct) {
				maxProduct = maxPosProd;
			}
		}

		return maxProduct;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,-3,0,-4,-5};

		IO.println("Given Array is: ");
		IO.println(java.util.Arrays.toString(nums));

		IO.println();
		IO.print("Maximum Product is: ");
		IO.println(MaximumProductSubarray.getProduct(nums));
	}
}