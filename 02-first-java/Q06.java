import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount in rupees: ");
		double rupees = input.nextInt();
		System.out.println("Amount is USD is " + rupees / 74.1);
		input.close();
	}
}