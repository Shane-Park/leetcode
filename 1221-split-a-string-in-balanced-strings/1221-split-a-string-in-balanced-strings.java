class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                right++;
            } else {
                right--;
            }
            if (right == 0)
                cnt++;

        }
        return cnt;
    }
}