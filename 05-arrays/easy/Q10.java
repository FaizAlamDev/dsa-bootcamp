public class Q10 {
	static boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26)
			return false;
		for (int i = 1; i <= 26; i++) {
			if (sentence.indexOf((char) i + 96) < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
}
