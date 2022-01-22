import java.util.Arrays;

public class Q08 {
	static int[] smallerNumbersThanCurrent(int[] nums) {
		// int[] ans = new int[nums.length];
		// for (int i = 0; i < nums.length; i++) {
		// int count = 0;
		// for (int j = 0; j < nums.length; j++) {
		// if (nums[j] < nums[i]) {
		// count++;
		// }
		// }
		// ans[i] = count;
		// }
		// return ans;
		int[] bucket = new int[101];
		int[] count = new int[101];
		for (int i = 0; i < nums.length; i++) {
			bucket[nums[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i - 1] + bucket[i - 1];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = count[nums[i]];
		}
		return nums;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 })));
	}
}