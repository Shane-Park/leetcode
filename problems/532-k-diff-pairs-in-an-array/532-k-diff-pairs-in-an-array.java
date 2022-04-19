class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int cnt = 0;
        if (k == 0) {
            for (Integer i : map.keySet()) {
                if (map.get(i) > 1)
                    cnt++;
            }
        } else {
            for (Integer i : map.keySet()) {
                if (map.containsKey(i + k)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}