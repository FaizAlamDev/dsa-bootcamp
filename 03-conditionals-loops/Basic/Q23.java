import java.util.Scanner;

public class Q23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Factors are:");
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		input.close();
	}
}