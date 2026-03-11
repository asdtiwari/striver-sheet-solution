public class RightAngleTriangleOneZeroPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of row: "));

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= i; ++j) {
				IO.print((i + j) % 2 == 0 ? "1" : "0");
			}
			IO.println();
		}
	}
}