class Solution {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            cnt += map.getOrDefault(sum - k, 0);
            map.merge(sum, 1, (i, j) -> i + j);
        }
        return cnt;
    }
}