import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter terms of fibonacci series: ");
		int n = input.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + ", " + n2);
		for (int i = 1; i <= n - 2; i++) {
			int n3 = n1 + n2;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
		input.close();
	}
}