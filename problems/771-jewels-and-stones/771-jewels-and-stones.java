class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i)))
                cnt++;
        }

        return cnt;

    }
}