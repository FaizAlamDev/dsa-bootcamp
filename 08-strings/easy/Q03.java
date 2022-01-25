public class Q03 {
	public static void main(String[] args) {
		System.out.println(interpret("G()(al)"));
	}

	static String interpret(String command) {
		// return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G') {
				str.append("G");
			} else if (command.charAt(i) == '(') {
				if (command.charAt(i + 1) == ')') {
					str.append("o");
					i += 1;
				} else {
					str.append("al");
					i += 3;
				}
			}

		}
		return str.toString();
	}
}
