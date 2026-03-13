public class DiamondBorderStarPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the number of rows: "));

		int odd = n % 2 == 0 ? 0 : 1;
		int half = n / 2;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i < half + odd) {
					if (j < half + odd - i || j >= half + i) {
						IO.print("*");
					} else {
						IO.print(" ");
					}
				} else {
					if (j <= i - half || j >= n + half - i - 1) {
						IO.print("*");
					} else {
						IO.print(" ");
					}
				}
			}
			IO.println();
		}
	}
}