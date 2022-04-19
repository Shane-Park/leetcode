class Solution {
 public boolean search(int[] nums, int target) {
        int left = 0;
        while (left < nums.length - 1 && nums[left] <= nums[left + 1]) {
            if (nums[left] == target) {
                return true;
            }
            left++;
        }
        if (nums[left++] == target) {
            return true;
        }

        // binary search
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (left < nums.length && nums[left] == target);
    }
}