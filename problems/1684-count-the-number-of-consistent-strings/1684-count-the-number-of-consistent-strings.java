class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int cnt = 0;
        loop:
        for (String word : words) {
            final int LENGTH = word.length();
            for (int i = 0; i < LENGTH; i++) {
                if (!set.contains(word.charAt(i))) {
                    continue loop;
                }
            }
            cnt++;
        }
        return cnt;
    }
}