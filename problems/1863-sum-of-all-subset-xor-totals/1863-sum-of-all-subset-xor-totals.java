class Solution {
  int sum;

    public int subsetXORSum(int[] nums) {
        sum = 0;
        dfs(nums, 0, 0);
        return sum;
    }

    private void dfs(int[] nums, int index, int cur) {
        if (index == nums.length) {
            sum += cur;
            return;
        }

        dfs(nums, index + 1, cur);
        dfs(nums, index + 1, cur ^ nums[index]);
    }
}