import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int max = max(a, b, c);
		int min = min(a, b, c);
		System.out.println("The Maximum number is " + max);
		System.out.println("The Minimum number is " + min);
		in.close();
	}

	static int max(int a, int b, int c) {
		int max = Math.max(a, b);
		return Math.max(c, max);
	}

	static int min(int a, int b, int c) {
		int min = Math.min(a, b);
		return Math.min(c, min);
	}
}