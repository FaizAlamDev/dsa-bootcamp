public class Q02 {
	public static void main(String[] args) {
		System.out.println(restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));
	}

	static String restoreString(String s, int[] indices) {
		char[] str = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			str[indices[i]] = s.charAt(i);
		}
		return String.valueOf(str);
	}
}
