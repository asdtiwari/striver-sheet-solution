public class DiamondStarPattern {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the size of diamond: "));

		int odd = n % 2 == 0 ? 0 : 1;
		int half = n / 2;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i < half + odd) {
					if (j >= half - 1 + odd - i && j < half + i + odd) {
						IO.print("*");
					} else {
						IO.print(" ");
					}
				} else {
					if (j >= i - half && j < n + half - 1 + odd - i) {
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