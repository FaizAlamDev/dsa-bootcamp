import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		double n1 = input.nextInt();
		double n2 = input.nextInt();
		System.out.print("Enter operator: ");
		char op = input.next().trim().charAt(0);
		double result = 0;
		if (op == '+') {
			result = n1 + n2;
		} else if (op == '-') {
			result = n1 - n2;
		} else if (op == '*') {
			result = n1 * n2;
		} else if (op == '/') {
			if (n2 != 0) {
				result = n1 / n2;
			}
		} else {
			System.out.println("Operator is incorrect");
		}
		System.out.println(result);
		input.close();
	}
}