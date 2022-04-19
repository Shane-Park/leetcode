class Solution {
    public int numberOfSteps(int num) {
        int cnt = 0;
        while (num > 0) {
            cnt += num % 2 + 1;
            num /= 2;
        }

        return cnt == 0 ? cnt : cnt - 1;

    }
}