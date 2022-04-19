class Solution {
public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for (int i : nums) {
            arr[i]++;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i] + arr[i + 1];
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 0;
            } else {
                answer[i] = arr[nums[i] - 1];
            }
        }

        return answer;
    }
}