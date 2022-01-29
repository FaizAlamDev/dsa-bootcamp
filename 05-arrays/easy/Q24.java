public class Q24 {
	static int maxSubArray(int[] nums) {
		int currentMax = nums[0];
		int totalMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentMax = Math.max(nums[i], currentMax + nums[i]);
			totalMax = Math.max(totalMax, currentMax);
		}
		return totalMax;
	}

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}
