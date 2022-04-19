class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        final int SIZE = nums.length;
        final int MAX = (int) Math.pow(2, maximumBit) - 1;

        int[] answer = new int[SIZE];
        answer[SIZE - 1] = nums[0] ^ MAX;
        for (int i = 1; i < SIZE; i++) {
            answer[SIZE - 1 - i] = answer[SIZE - i] ^ nums[i];
        }

        return answer;
    }
}