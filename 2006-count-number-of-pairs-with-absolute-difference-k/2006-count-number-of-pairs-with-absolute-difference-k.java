class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == k) {
                    cnt++;
                } else if (nums[j] - nums[i] > k) {
                    break;
                }
            }
        }
        return cnt;
    }
}