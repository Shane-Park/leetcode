class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            cnt = cnt + map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
        }
        return cnt;
    }
}