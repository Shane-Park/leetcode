class Solution {
    public int brokenCalc(int startValue, int target) {
        int cnt = 0;
        while (startValue != target) {
            if (target > startValue && target % 2 == 0)
                target = target / 2;
            else
                target++;
            cnt++;
        }
        return cnt;
    }
}