import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (pTriplets(a, b, c))
			System.out.println("Pythagorean Triplets");
		else
			System.out.println("Not Pythagorean Triplets");
		in.close();
	}

	static boolean pTriplets(int a, int b, int c) {
		return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
	}
}