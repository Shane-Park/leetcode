class Solution {
    public int brokenCalc(int startValue, int target) {
        int cnt = 0;
        while (target > startValue) {
            target = target % 2 == 0 ? target / 2 : target + 1;
            cnt++;
        }
        return cnt + (startValue - target);
    }
}