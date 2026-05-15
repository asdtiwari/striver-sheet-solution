/* Rotate Image by 90 degree

Problem Statement: Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise. The rotation must be done in place, meaning the input 2D matrix must be modified directly..

Examples
Input :matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output :
matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
Explanation :
First, we transpose the matrix: rows become columns. Then, we reverse each row to simulate 90° clockwise rotation. So element at (0,0) goes to (0,2), (0,1) goes to (1,2), and so on, achieving the rotated layout.

Input :
matrix = [[0, 1, 1, 2], [2, 0, 3, 1], [4, 5, 0, 5], [5, 6, 7, 0]]
Output :
matrix = [[5, 4, 2, 0], [6, 5, 0, 1], [7, 0, 3, 1], [0, 5, 1, 2]]
Explanation :
First, the matrix is transposed: rows become columns. Then, each row is reversed. This moves the last column to the first row, the second last column to the second row, and so on. The original position of each element is rotated 90° clockwise into its new location.
*/

public class RotateImageBy90Deg {
	public static void rotate(int[][] image) {
		// rotate vertically
		for (int i = 0; i < image.length / 2; ++i) {
			for (int j = 0; j < image[0].length; ++j) {
				int swap = image[i][j];
				image[i][j] = image[image.length - 1 - i][j];
				image[image.length - 1 - i][j] = swap;
			}
		}

		// rotate diagonally
		for (int i = 0; i < image.length; ++i) {
			for (int j = 0; j < i; ++j) {
				int swap = image[i][j];
				image[i][j] = image[j][i];
				image[j][i] = swap;
			}
		}
	}

	private static void printImage(int[][] image) {
		for (int i = 0; i < image.length; ++i) {
			for (int j = 0; j < image[0].length; ++j) {
				IO.print(image[i][j] + " " );
			}
			IO.println();
		}
	}

	public static void main(String[] args) {
		int[][] image = {{0, 1, 1, 2}, {2, 0, 3, 1}, {4, 5, 0, 5}, {5, 6, 7, 0}};

		IO.println("Given Image:");
		printImage(image);

		RotateImageBy90Deg.rotate(image);

		IO.println();
		IO.println("After 90 degree rotation:");
		printImage(image);
	}
}