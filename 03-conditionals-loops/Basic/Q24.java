import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += n;
			n = input.nextInt();
		}
		System.out.println(sum);
		input.close();
	}
}