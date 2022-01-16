import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Sum is " + sum(a, b));
		in.close();
	}

	static int sum(int a, int b) {
		return a + b;
	}
}