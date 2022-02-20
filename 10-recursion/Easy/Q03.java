class Q03 {
	public int search(int[] nums, int target) {
		return BS(nums, target, 0, nums.length - 1);
	}

	public int BS(int[] nums, int target, int l, int r) {
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (target == nums[mid]) {
				return mid;
			}
			if (target > nums[mid]) {
				return BS(nums, target, mid + 1, r);
			}
			return BS(nums, target, l, mid - 1);
		}
		return -1;
	}
}