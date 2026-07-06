/* Find the repeating and missing numbers

Problem Statement: Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.

Note: You are not allowed to modify the original array.

Examples
Example 1:
Input:
 nums = [3, 5, 4, 1, 1]  
Output:
 [1, 2]  
Explanation:
 1 appears twice in the array, and 2 is missing from the array. So the output is [1, 2].

Example 2:
Input:
 nums = [1, 2, 3, 6, 7, 5, 7]  
Output:
 [7, 4]  
Explanation:
 7 appears twice in the array, and 4 is missing from the array. So the output is [7, 4].
*/

/* Solution Derivation
actual array = {a,b,r,m}
given array = {a,b,r,r}

sum(given) - sum(actual)
(a + b + r + r) - (a + b + r + m)
r - m = x ...(1)

sum(square(given)) - sum(square(actual))
(a^2 + b^2 + r^2 + r^2) - (a^2 + b^2 + r^2 + m^2)
r^2 - m^2 = y ...(2)

on divide eq 2 by eq 1
(r^2 - m^2) / (r - m) = y / x
((r - m)(r + m) / (r - m) = y / x
(r + m) = (y / x)
r + m = z ...(3)

on adding eq 1 and eq 3
r - m + r + m = x + z
2r = x + z
r = (x + z) / 2

In simple terms:
1. sum(given) - sum(actual) = x
2. sum(square(given)) - sum(square(actual)) = y
3. y / x = z
4. r = (x + z) / 2
6. m = r - x       ... from eq 1

Formula 
sum(1...n) = n(n+1)/2
sum(1^2...n^2) = n(n+1)(2n+1)/6
*/

public class FindMissingAndRepeatingNo {
	public static int[] get(int[] nums) {
		long n = nums.length; // n represent total no of elements

		long sumOfActual = n * (n + 1) / 2;
		long sumOfSqOfActual = n * (n + 1) * (2 * n + 1) / 6;

		long sumOfGiven = 0L;
		long sumOfSqOfGiven = 0L;
		for (int num : nums) {
			sumOfGiven += num;
			sumOfSqOfGiven += num * num;
		}

		long x = sumOfGiven - sumOfActual;

		long y = sumOfSqOfGiven - sumOfSqOfActual;

		long z = y / x;

		int repeated = (int)((x + z) / 2);
		
		int missing = (int)(repeated - x);

		return new int[]{missing, repeated};
	}

	public static void main(String[] args) {
		int[] array = {3, 5, 4, 1, 1};

		IO.println("Given Array");
		IO.println(java.util.Arrays.toString(array));

		int[] ans = {0, 0};
		ans = FindMissingAndRepeatingNo.get(array);

		IO.println();
		IO.println("Missing number is: " + ans[0]);
		IO.println("Repeating number is: " + ans[1]);
	}
}