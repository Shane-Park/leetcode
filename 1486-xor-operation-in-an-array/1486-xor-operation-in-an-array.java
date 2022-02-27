class Solution {
    public int xorOperation(int n, int start) {
        int answer = start;
        for (int i = 1; i < n; i++) {
            start += 2;
            answer ^= start;
        }
        return answer;
    }
}