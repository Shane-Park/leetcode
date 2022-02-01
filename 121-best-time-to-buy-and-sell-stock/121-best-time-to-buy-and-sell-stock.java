class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int get = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (get >= prices[j]) {
                    break;
                }
                max = Math.max(max, prices[j] - get);
            }
        }
        return max;
    }
}