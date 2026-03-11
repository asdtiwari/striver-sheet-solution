import java.util.Scanner;

public class IO {
	private IO() {}

	public static String read(String arg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(arg);
		String str = scan.next();
		scan.close();
		return str;
	}

	public static String read() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		return str;
	}

	public static String readln(String arg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(arg);
		String str = scan.nextLine();
		scan.close();
		return str;
	}

	public static String readln() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		return str;
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