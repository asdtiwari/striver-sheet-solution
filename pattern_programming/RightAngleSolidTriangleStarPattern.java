public class RightAngleSolidTriangleStarPattern {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.read("Enter the value of n: "));

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= i; ++j) {
				IO.print("*");
			}
			IO.println();
		}
	}
}