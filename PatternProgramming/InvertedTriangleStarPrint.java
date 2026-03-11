public class InvertedTriangleStarPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of row: "));

		int cols = 2 * n;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (j > i && j < cols - i) {
					IO.print("*");
				} else {
					IO.print(" ");
				}
			}
			IO.println();
		}
	}
}