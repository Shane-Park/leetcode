class Solution {
    public int numberOfBeams(String[] bank) {
        int devices = 0;
        int total = 0;
        for (int i = 0; i < bank.length; i++) {
            int cnt = countDevices(bank[i]);
            if (cnt > 0) {
                total += devices * cnt;
                devices = cnt;
            }
        }
        return total;
    }

    private int countDevices(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}