class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int min = 10000;
        for (int price : prices) {
            if (min >= price) {
                min = price;
            } else {
                answer = Math.max(answer, price - min);
            }
        }
        return answer;
    }
}