class Solution {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int num = 0;
            for (int i : account) {
                num += i;
            }
            max = Math.max(max, num);
        }
        return max;
    }
}