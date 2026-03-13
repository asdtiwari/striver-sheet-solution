public class SolidSquareOfStarPattern {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter size of square: "));

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				IO.print("* ");
			}
			IO.println();
		}
	}
}