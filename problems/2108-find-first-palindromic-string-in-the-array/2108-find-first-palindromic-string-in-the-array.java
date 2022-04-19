class Solution {

    public String firstPalindrome(String[] words) {
        loop:
        for (String word : words) {
            if (word.length() == 1)
                return word;
            int left = 0;
            int right = word.length() - 1;
            while (left < right) {
                if (word.charAt(left++) != word.charAt(right--)) {
                    continue loop;
                }
            }
            return word;
        }
        return "";
    }
}