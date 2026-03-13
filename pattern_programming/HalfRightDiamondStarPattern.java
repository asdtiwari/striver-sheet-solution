public class HalfRightDiamondStarPattern {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of row: "));

		int odd = n % 2 == 0 ? 0 : 1;
		int half = n / 2;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < half + odd; ++j) {
				if (i <= half && j <= i) {
					IO.print("*");
				} else if (i > half && j < n - i) {
					IO.print("*");
				} else {
					IO.print(" ");
				}
			}
			IO.println();
		}
	}
}