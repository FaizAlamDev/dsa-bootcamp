class Q23 {
	public int numberOfSteps(int num) {
		return steps(num, 0);
	}

	public int steps(int num, int s) {
		if (num == 0) {
			return s;
		}
		if (!((num & 1) == 1)) {
			return steps(num / 2, s + 1);
		}
		return steps(num - 1, s + 1);
	}
}