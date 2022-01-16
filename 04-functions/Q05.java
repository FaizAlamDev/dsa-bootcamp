import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Product is " + product(a, b));
		in.close();
	}

	static int product(int a, int b) {
		return a * b;
	}
}