public class InvertedRightAngleTriangleStarPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of row: "));

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - i; ++j) {
				IO.print("*");
			}
			IO.println();
		}
	}
}