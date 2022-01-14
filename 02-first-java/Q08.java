import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		if (str.equals(revStr)) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("Not a palindrome string");
		}
		input.close();
	}
}