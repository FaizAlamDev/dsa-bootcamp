import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("Max number is " + Math.max(n1, n2));
		input.close();
	}
}