class Q05 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0, j = nums.length / 2, k = 0; i < nums.length / 2; i++, j++, k += 2) {
            ans[k] = nums[i];
            ans[k + 1] = nums[j];
        }
        return ans;
    }
}
