import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int prod = 1;
		int sum = 0;
		int temp = n;
		while (temp != 0) {
			int d = temp % 10;
			prod *= d;
			sum += d;
			temp /= 10;
		}
		System.out.println("Difference of product and sum is " + (prod - sum));
		input.close();
	}
}