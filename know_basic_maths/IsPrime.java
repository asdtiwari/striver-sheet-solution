/* Check if a number is prime or not

Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

Examples

Example 1:
Input:N = 2
               
Output:True
                
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                                        
Example 2:
Input:N =10                
                
Output: False
                
Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.
*/

public class IsPrime {
	public static void main(String[] args) {
		String input = IO.read("Enter a number: ");
		int num = Integer.parseInt(input);

		if (num < 2) {
			IO.println(false);
			return;
		}

		if (num == 2) {
			IO.println(true);
			return;
		} 

		int checkUpto = (int)Math.sqrt(num);
		for (int i = 2; i <= checkUpto; ++i) {
			if (num % i == 0) {
				IO.println(false);
				return;
			}
		}
		IO.println(true);
	}
}