import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal, time and rate");
		int p = input.nextInt();
		int t = input.nextInt();
		int r = input.nextInt();
		double SI = (p * t * r) / 100;
		System.out.println("Simple interest is " + SI);
		input.close();
	}
}