public class RightTriangleRevAlphaPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the number of row: "
));

		for (int i = 0; i < n; ++i) {
			for (int j = i; j >= 0; --j) {
				IO.print((char)('A' + n - 1 - j));
			}
			IO.println();
		}
	}
}