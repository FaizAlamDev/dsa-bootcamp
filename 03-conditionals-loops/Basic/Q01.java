import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius = input.nextInt();
		double area = Math.PI * radius * radius;
		System.out.println("Area is " + area);
		input.close();
	}
}