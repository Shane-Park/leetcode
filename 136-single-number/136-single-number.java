class Solution {
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        for (Integer integer : set) {
            return integer;
        }
        return -1;
    }
}