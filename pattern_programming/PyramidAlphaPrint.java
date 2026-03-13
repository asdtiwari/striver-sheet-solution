public class PyramidAlphaPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the number of row: "));

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - i; ++j) {
				IO.print(" ");
			}
			for (int j = 0; j <= i; ++j) {
				IO.print((char)('A' + j));
			}
			for (int j = i - 1; j >= 0; --j) {
				IO.print((char)('A' + j));
			}
			IO.println();
		}
	}
}