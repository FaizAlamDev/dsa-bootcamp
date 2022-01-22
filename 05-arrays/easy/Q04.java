class Q04 {
	public int maximumWealth(int[][] accounts) {
		int max = accounts[0][0];
		for (int person = 0; person < accounts.length; person++) {
			int wealth = 0;
			for (int money = 0; money < accounts[person].length; money++) {
				wealth += accounts[person][money];
			}
			if (wealth > max) {
				max = wealth;
			}
		}
		return max;
	}
}