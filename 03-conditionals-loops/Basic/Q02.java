import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter height: ");
		double h = input.nextInt();
		System.out.print("Enter base: ");
		double b = input.nextInt();
		double area = 0.5 * b * h;
		System.out.println("Area of triangle is " + area);
		input.close();
	}
}