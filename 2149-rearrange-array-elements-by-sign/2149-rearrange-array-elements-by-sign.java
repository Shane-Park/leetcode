class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> minus = new ArrayList<>();
        List<Integer> plus = new ArrayList<>();
        for (int num : nums) {
            if (num < 0) {
                minus.add(num);
            } else {
                plus.add(num);
            }
        }
        for (int i = 0; i < nums.length / 2; i++) {
            nums[2 * i] = plus.get(i);
            nums[2 * i + 1] = minus.get(i);
        }
        return nums;
    }
}