class Solution {
    public char findTheDifference(String s, String t) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + t.charAt(i) - s.charAt(i);
        }
        sum += t.charAt(s.length());
        return (char) sum;
    }
}