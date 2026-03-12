/* Check if a number is Armstrong Number or not

Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
Examples
Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
                                        
Example 2:
Input:N = 371                
Output: True
Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371
*/

public class IsArmstrong {
	public static void main(String[] args) {
		String input = IO.read("Enter the number: ");
		int num = Integer.parseInt(input);

		int digitCount = 0;
		for (int i = num; i > 0; i /= 10) {
			++digitCount;
		}

		int newNum = 0;
		for (int i = num; i > 0; i /= 10) {
			int digit = i % 10;

			int power = 1;
			for (int j = 0; j < digitCount; ++j) {
				power *= digit;
			}

			newNum += power;
		}

		IO.println(newNum == num);
	}
}