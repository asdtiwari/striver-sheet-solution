public class RightAngleTriangleRowNoPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter size of row: "));

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				IO.print(i);
			}
			IO.println();
		}
	}
}