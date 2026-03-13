public class RightAngleTriangleColNoPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the row row size: "));

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				IO.print(j);
			}
			IO.println();
		}
	}
}