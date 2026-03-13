public class InvertedRightTriangleColAlphaPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the number of rows: "));

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - i; ++j) {
				IO.print((char)('A' + j));
			}
			IO.println();
		}
	}
}