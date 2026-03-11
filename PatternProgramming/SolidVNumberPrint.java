public class SolidVNumberPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of row: "));

		int twice = 2 * n;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				IO.print(j);
			}
			for (int j = 0, end = twice - 2 * i; j < end; ++j) {
				IO.print(" ");
			}
			for (int j = i; j > 0; --j) {
				IO.print(j);
			}
			IO.println();
		}
	}
}