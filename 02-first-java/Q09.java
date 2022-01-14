import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		for (int i = n1; i <= n2; i++) {
			int temp = i;
			int sum = 0;
			while (temp != 0) {
				int d = temp % 10;
				sum = sum + (d * d * d);
				temp /= 10;
			}
			if (i == sum)
				System.out.println(i + " is an Armstrong number");
		}
		input.close();
	}
}