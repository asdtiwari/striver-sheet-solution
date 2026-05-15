/* Spiral Traversal of Matrix
Problem Statement: Given a Matrix, print the given matrix in spiral order.

Examples
Input: Matrix[][] = { { 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 } }
Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
Explanation: The output of matrix in spiral form.

Input: Matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 },{ 7, 8, 9 } }
Output: 1, 2, 3, 6, 9, 8, 7, 4, 5.
Explanation: The output of matrix in spiral form.
*/

public class SpiralMatrixTraversal {
	public static java.util.List<Integer> traverse(int[][] matrix) {

		java.util.List<Integer> list = new java.util.ArrayList<>();

		int totalElement = matrix.length * matrix[0].length;

		int top = 0;
		int right = matrix[0].length - 1;
		int bottom = matrix.length - 1;
		int left = 0;

		while (list.size() < totalElement) {
			for (int j = left; j <= right; ++j) {
				list.add(matrix[top][j]);
			}
			++top;

			for (int i = top; i <= bottom; ++i) {
				list.add(matrix[i][right]);
			}
			--right;

			if (list.size() < totalElement) {
				for (int j = right; j >= left; --j) {
					list.add(matrix[bottom][j]);
				}
				--bottom;
			}

			if (list.size() < totalElement) {
				for (int i = bottom; i >= top; --i) {
					list.add(matrix[i][left]);
				}
				++left;
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 },{ 7, 8, 9 } };

		IO.println("Given Matrix is:");
		for (int row = 0; row < matrix.length; ++row) {
			for (int col = 0; col < matrix[0].length; ++col) {
				IO.print(matrix[row][col] + " ");
			}
			IO.println();
		}
		IO.println();

		IO.println("Spiral Traversal Result:");
		IO.println(SpiralMatrixTraversal.traverse(matrix));
	}
}