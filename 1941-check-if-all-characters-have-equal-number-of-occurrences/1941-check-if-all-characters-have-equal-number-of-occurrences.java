class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }

        int n = map.get(s.charAt(0));
        for (Integer value : map.values()) {
            if(n != value)
                return false;
        }
        return true;
    }
}