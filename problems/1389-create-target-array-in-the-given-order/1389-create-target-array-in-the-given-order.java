class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] answer = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            answer[i++] = integer;
        }

        return answer;

    }
}