public class Q01 {
	public static void main(String[] args) {
		String s = "1.1.1.1";
		String s1 = s.replaceAll("\\.", "[.]");
		System.out.println(s1);
	}
}