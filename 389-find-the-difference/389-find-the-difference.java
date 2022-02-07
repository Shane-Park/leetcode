class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int['z' - 'a' + 1];
        arr[t.charAt(0) - 'a']--;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i + 1) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return (char) ('a' + i);
            }
        }
        return ' ';
    }
}