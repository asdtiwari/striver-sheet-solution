public class RightTriangleIntegerPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of row: "));

		int integer = 1;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= i; ++j) {
				IO.print(integer++ + " ");
			}
			IO.println();
		}
	}
}