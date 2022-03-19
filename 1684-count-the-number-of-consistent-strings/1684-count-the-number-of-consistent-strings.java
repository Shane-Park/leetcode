class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] chars = allowed.toCharArray();
        Arrays.sort(chars);
        return Arrays.stream(words).mapToInt(s -> {
            char[] array = s.toCharArray();
            for (char c : array) {
                if (Arrays.binarySearch(chars, c) < 0)
                    return 0;
            }
            return 1;
        }).sum();
    }
}