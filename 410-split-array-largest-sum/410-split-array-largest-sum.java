class Solution {
public int splitArray(int[] nums, int m) {
        int max = 0, sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }

        while (max <= sum) {
            int mid = (max + sum) / 2;
            if (valid(mid, nums, m)) {
                sum = mid - 1;
            } else {
                max = mid + 1;
            }
        }
        return max;

    }

    private boolean valid(int maxSum, int[] nums, int m) {
        int cnt = 1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) {
                if (++cnt > m) {
                    return false;
                }
                sum = num;
            }
        }
        return true;
    }
}