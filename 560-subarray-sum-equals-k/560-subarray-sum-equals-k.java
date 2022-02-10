class Solution {

    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length - i; j++) {
                sum += nums[i + j];
                if (sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}