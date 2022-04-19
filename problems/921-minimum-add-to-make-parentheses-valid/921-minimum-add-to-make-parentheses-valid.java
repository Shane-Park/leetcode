class Solution {
    public int minAddToMakeValid(String s) {
        int cnt = 0;
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else if (s.charAt(i) == ')') {
                if (cnt == 0) {
                    total++;
                } else {
                    cnt--;
                }
            }
        }
        return cnt + total;
    }
}