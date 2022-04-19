class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }

        int cnt = 0;
        for (int i : arr) {
            if (i > 0)
                cnt += i;
        }

        return cnt;
    }
}