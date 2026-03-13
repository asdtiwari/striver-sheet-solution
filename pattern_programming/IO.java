import java.util.Scanner;

public class IO {
	private static Scanner scan = new Scanner(System.in);

	private IO() {}

	public static String read(String arg) {
		System.out.print(arg);
		return scan.next();
	}

	public static String read() {
		return scan.next();
	}

	public static String readln(String arg) {
		System.out.print(arg);
		return scan.nextLine();
	}

	public static String readln() {
		return scan.nextLine();
	}

	public static void print(Object arg) {
		System.out.print(arg);
	}

	public static void println(Object arg) {
		System.out.println(arg);
	}

	public static void println() {
		System.out.println();
	}
}