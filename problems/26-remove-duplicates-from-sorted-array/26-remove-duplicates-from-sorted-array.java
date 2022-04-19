class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[cnt++] = nums[i];
                nums[cnt] = nums[i + 1];
            }
        }
        return cnt + 1;
    }
}