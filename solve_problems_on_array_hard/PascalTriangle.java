/* Program to generate Pascal's Triangle

Problem Statement: Write a program to generate Pascal's triangle. In Pascal’s triangle, each number is the sum of the two numbers directly above it as shown in the figure below:

Examples
Input: N = 5, r = 5, c = 3 
Output: Element at position (r, c): 6
N-th row of Pascal’s triangle: 1 4 6 4 1
First n rows of Pascal’s triangle:
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1  
Explanation: Pascal triangle for first 5 rows is shown above.

Input: N = 1, r = 1, c = 1
Output: Element at position (r, c): 1
N-th row of Pascal’s triangle: 1
First n rows of Pascal’s triangle:
1  
Explanation: N = 1 is the base case fof a pascal's triangle.
*/

public class PascalTriangle {
	public static long factorialOf(int num) {
		long fact = 1;
		while (num > 0) {
			fact *= num;
			--num;
		}
		return fact;	
	}

	// get single element using Binomial Coefficient 
	public static int getElementAt(int row, int col) {

		if (row < col || row < 0 || col < 0) {
			IO.println("\n !!! Enter valid row and col !!! \n");
			System.exit(0);
		}

		// using formula (r)! / ((c)! * (r - c)!) for 0 based indexing
		// using formula (r - 1)! / ((c - 1)! & ((r - 1) - (c - 1))!) for 1 based indexing

		long rFact = factorialOf(row);
		long cFact = factorialOf(col);

		long rMinusCFact = factorialOf(row - col);

		long ans = rFact / (cFact * rMinusCFact);

		return (int)ans;
	}

	public static java.util.List<Integer> getElementsOfRow(int row) {
		java.util.List<Integer> list = new java.util.ArrayList<Integer>();

		int constant = 1;
		list.add(constant);

		for (int col = 1; col <= row; ++col) {
			constant = constant * (row - col + 1) / col;
			list.add(constant);
		}

		return list;
	}

	public static java.util.List<java.util.List<Integer>> getAllElementsUpto(int row) {
		java.util.List<java.util.List<Integer>> ans = new java.util.ArrayList<>();

		for (int i = 0; i < row; ++i) {
			java.util.List<Integer> list = new java.util.ArrayList<>();
			for (int j = 0; j <= i; ++j) {
				if (j == 0 || j == i) {
					list.add(1);
				} else {
					list.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
				}
			}
			ans.add(list);
		}

		return ans;
	}

	public static void main(String[] args) {
		int row = 10;
		int col = 5;

		IO.print("Element at (" + row + ", " + col + "): ");
		IO.println(PascalTriangle.getElementAt(row, col));
		IO.println();

		IO.print("Element of row " + row + ":");
		IO.println(PascalTriangle.getElementsOfRow(row));
		IO.println();

		IO.println("Elements upto row " + row);
		java.util.List<java.util.List<Integer>> ans = PascalTriangle.getAllElementsUpto(row);
		for (java.util.List<Integer> list : ans) {
			IO.println(list);
		}
	}
}