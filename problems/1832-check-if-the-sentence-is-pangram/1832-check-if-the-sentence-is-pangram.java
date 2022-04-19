class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < sentence.length() && cnt < 26; i++) {
            if (set.add(sentence.charAt(i))) {
                cnt++;
            }
        }
        return cnt == 26;
    }
}