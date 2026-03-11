public class ButterflyStarPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the number of rows: "));

		int odd = n % 2 == 0 ? 0 : 1;
		int half = n / 2;

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i < half + odd) {
					if (j <= i ||  j >= n - 1 - i) {
						IO.print("*");
					} else {
						IO.print(" ");
					}
				} else {
					if (j < n - i || j >= i) {
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