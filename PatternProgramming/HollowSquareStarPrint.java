public class HollowSquareStarPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the number of rows: "));

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					IO.print("* ");
				} else {
					IO.print("  ");
				}
			}
			IO.println();
		}
	}
}