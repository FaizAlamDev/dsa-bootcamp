public class Q11 {
	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
	}

	static int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != i + 1) {
				int correct = nums[i] - 1;
				if (nums[i] != nums[correct]) {
					swap(nums, i, correct);
				} else {
					return nums[i];
				}
			} else {
				i++;
			}
		}
		return -1;
	}

	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}