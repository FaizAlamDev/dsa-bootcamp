import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = in.nextInt();
		if (vote(age))
			System.out.println("Can vote");
		else
			System.out.println("Can't vote");
		in.close();
	}

	static boolean vote(int age) {
		return age >= 18;
	}
}