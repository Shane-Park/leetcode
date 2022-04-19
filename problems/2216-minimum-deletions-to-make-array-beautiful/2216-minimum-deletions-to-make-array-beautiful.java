class Solution {
    public int minDeletion(int[] nums) {
        int cnt = 0;
        int before = -1;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (index % 2 == 0) {
                before = nums[i];
                index++;
            } else {
                if (nums[i] != before) {
                    index++;
                    before = -1;
                } else {
                    cnt++;
                }
            }
        }

        return before < 0 ? cnt : cnt + 1;
    }
}