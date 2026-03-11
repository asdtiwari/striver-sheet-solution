public class OutToInNumPrint {
	public static void main(String[] args) {
		int num = Integer.parseInt(IO.read("Enter the num: "));

		int n = num + num - 1;
		for (int i = 0; i < n; ++i) {
			int toPrint = num;
			for (int j = 0; j < n; ++j) {
				IO.print(toPrint);
				if (i < num) {
					if (j < i) {
						--toPrint;
					} else if (j > n - 2 - i) {
						++toPrint;
					}
				} else if (j < n - 1 - i) {
					--toPrint;
				} else if (j >= i) {
					++toPrint;
				}
			}
			IO.println();
		}
	}
}