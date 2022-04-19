class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] arr = new int[10001];
        for (int num : nums) {
            arr[num] += num;
        }
        int take = 0;
        int skip = 0;
        for (int i : arr) {
            int max = Math.max(skip + i, take);
            skip = take;
            take = max;
        }
        return take;
    }
}