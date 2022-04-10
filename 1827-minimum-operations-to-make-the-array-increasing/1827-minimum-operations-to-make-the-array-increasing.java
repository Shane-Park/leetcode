class Solution {
    public int minOperations(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int gap = nums[i - 1] - nums[i] + 1;
                nums[i] += gap;
                sum += gap;
            }
        }

        return sum;
    }
}