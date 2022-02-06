class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[cnt - 2] != nums[i]) {
                nums[cnt++] = nums[i];
            }
        }
        return cnt;
    }
}