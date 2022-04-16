class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n / 2; i++) {
            answer[i] = i + 1;
            answer[n - 1 - i] = -(i + 1);
        }
        return answer;
    }
}