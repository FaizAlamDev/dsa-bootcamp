import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max = n;
		while (n != 0) {
			if (n > max)
				max = n;
			n = input.nextInt();
		}
		System.out.println(max);
		input.close();
	}
}