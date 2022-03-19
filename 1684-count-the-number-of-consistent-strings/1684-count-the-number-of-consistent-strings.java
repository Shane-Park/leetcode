class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] chars = allowed.toCharArray();
        Arrays.sort(chars);
        int cnt = 0;
        loop:
        for (String word : words) {
            final int LENGTH = word.length();
            for (int i = 0; i < LENGTH; i++) {
                if (Arrays.binarySearch(chars, word.charAt(i)) < 0)
                    continue loop;
            }
            cnt++;
        }
        return cnt;
    }
}