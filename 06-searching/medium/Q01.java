class Q01 {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1, -1};
        // find first position of target
        ans[0] = searchOne(nums, target, true);
        // find last position of target
        ans[1] = searchOne(nums, target, false);
        return ans;
    }
    public int searchOne(int[] nums, int target, boolean findFirstInd) {
        int ans = -1;
        int start = 0, end = nums.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid+1;
            } else {
                ans = mid;
                if (findFirstInd) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

