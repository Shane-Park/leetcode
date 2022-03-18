class Solution {
  public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];
        int plus = 0;
        int minus = 1;
        for (int num : nums) {
            if(num > 0) {
                answer[plus] = num;
                plus += 2;
            }else {
                answer[minus] = num;
                minus += 2;
            }
        }
        return answer;
    }
}