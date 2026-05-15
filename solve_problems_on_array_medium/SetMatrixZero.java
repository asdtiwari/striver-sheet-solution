/* Set Matrix Zero

Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix..

Examples
Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
*/

public class SetMatrixZero {
	public static void setZero(int[][] matrix) {
		boolean hasZeroInTop = false;
		for (int j = 0; j < matrix[0].length; ++j) {
			if (matrix[0][j] == 0) {
				hasZeroInTop = true;
				break;
			}
		}

		boolean hasZeroInLeft = false;
		for (int i = 0; i < matrix.length; ++i) {
			if (matrix[i][0] == 0) {
				hasZeroInLeft = true;
				break;
			}
		}

		// use top and left as marker
		for (int i = 1; i < matrix.length; ++i) {
			for (int j = 1; j < matrix[0].length; ++j) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}

		// use the marker and set zero
		for (int i = 1; i < matrix.length; ++i) {
			for (int j = 1; j < matrix[0].length; ++j) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// set top zero if required
		if (hasZeroInTop) {
			for (int j = 0; j < matrix[0].length; ++j) {
				matrix[0][j] = 0;
			}
		}

		// set left zero if required
		if (hasZeroInLeft) {
			for (int i = 0; i < matrix.length; ++i) {
				matrix[i][0] = 0;
			}
		}
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				IO.print(matrix[i][j] + " ");
			}
			IO.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
					{8,3,6,9,7,8,0,6},
					{0,3,7,0,0,4,3,8},
					{5,3,6,7,1,6,2,6},
					{8,7,2,5,0,6,4,0},
					{0,2,9,9,3,9,7,3}
				};

		IO.println("Given matrix is:");
		printMatrix(matrix);

		SetMatrixZero.setZero(matrix);

		IO.println();
		IO.println("After setting zeroes");
		printMatrix(matrix);
	}
}