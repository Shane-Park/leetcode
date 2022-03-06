class Solution {
    public int countOrders(int n) {
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = (answer * i * (2 * i - 1)) % ((long) 1e9 + 7);
        }
        return (int) answer;
    }
}