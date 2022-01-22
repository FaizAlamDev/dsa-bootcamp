class Q02 {
	public int[] getConcatenation(int[] nums) {
		int k = nums.length;
		int[] ans = new int[k * 2];

		for (int i = 0; i < k; i++) {
			ans[i] = nums[i];
			ans[i + k] = nums[i];
		}
		return ans;
	}
}