class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        process(list, new Stack<>(), nums, 0);
        return list;
    }

    private void process(List<List<Integer>> list, Stack<Integer> temp, int[] nums, int cur) {
        list.add(new ArrayList<>(temp));
        for (int i = cur; i < nums.length; i++) {
            temp.push(nums[i]);
            process(list, temp, nums, i + 1);
            temp.pop();
        }
    }
}