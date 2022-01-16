import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		in.close();
	}

	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		int c = 2;
		while (c * c < n) {
			if (n % c == 0)
				return false;
			c++;
		}
		return c * c > n;
	}
}