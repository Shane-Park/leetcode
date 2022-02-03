class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = mapOfSum(nums1, nums2);
        Map<Integer, Integer> map2 = mapOfSum(nums3, nums4);
        int sum = 0;
        for (Integer i : map.keySet()) {
            sum += map.get(i) * map2.getOrDefault(-i, 0);
        }
        return sum;
    }

    private Map<Integer, Integer> mapOfSum(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                map.put(i + j, map.getOrDefault(i + j, 0) + 1);
            }
        }
        return map;
    }
}