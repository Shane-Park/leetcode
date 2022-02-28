class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                end++;
                i++;
            }
            list.add(start == end ? String.valueOf(nums[end]) : nums[start] + "->" + nums[end]);
            end++;
            start = end;
        }

        return list;
    }
}