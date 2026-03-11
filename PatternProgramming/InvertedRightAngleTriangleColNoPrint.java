public class InvertedRightAngleTriangleColNoPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of row: "));

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n + 1 - i; ++j) {
				IO.print(j);
			}
			IO.println();
		}
	}
}