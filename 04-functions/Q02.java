import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		if (even(n))
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		in.close();
	}

	static boolean even(int n) {
		return n % 2 == 0;
	}
}