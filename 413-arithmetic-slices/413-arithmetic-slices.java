class Solution {
public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3)
            return 0;

        int sum = 0;
        int startIndex = 0;
        int gap = nums[1] - nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            int cur = nums[i];
            if (nums[i + 1] - cur != gap) {
                if (i - startIndex >= 2) {
                    int elementsNum = i - startIndex + 1;
                    sum += ((elementsNum * elementsNum) - 3 * elementsNum + 2) / 2;
                }

                startIndex = i;
                gap = nums[i + 1] - cur;
            }
        }

        if (startIndex <= nums.length - 2) {
            int elementsNum = nums.length - 1 - startIndex + 1;
            sum += ((elementsNum * elementsNum) - 3 * elementsNum + 2) / 2;
        }

        return sum;
    }
}