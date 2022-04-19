class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int cnt = map.getOrDefault(num, 0) + 1;
            if (cnt > length / 2) {
                return num;
            }
            map.put(num, cnt);
        }
        return -1;
    }
}