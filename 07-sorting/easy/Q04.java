public class Q04 {
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] { 1, 0, 4, 2 }));
	}

	static int missingNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != i && nums[i] < nums.length) {
				swap(nums, i, nums[i]);
			} else {
				i++;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index) {
				return index;
			}
		}
		return nums.length;

	}

	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}