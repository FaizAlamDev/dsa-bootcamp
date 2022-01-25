import java.util.Arrays;

public class Q29 {
	static int[] findErrorNums(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				int temp = nums[i];
				nums[i] = nums[correct];
				nums[correct] = temp;
			} else {
				i++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				return new int[] { nums[j], j + 1 };
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(findErrorNums(new int[] { 1, 2, 2, 4 })));
	}
}
