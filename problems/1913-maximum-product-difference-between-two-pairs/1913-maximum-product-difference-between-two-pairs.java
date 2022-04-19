class Solution {
    public int maxProductDifference(int[] nums) {
        int largest = 0, secondLargest = 0;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > secondLargest) {
                secondLargest = num;
                if (largest < secondLargest) {
                    int temp = largest;
                    largest = secondLargest;
                    secondLargest = temp;
                }
            }
            if (num < secondSmallest) {
                secondSmallest = num;
                if (secondSmallest < smallest) {
                    int temp = smallest;
                    smallest = secondSmallest;
                    secondSmallest = temp;
                }
            }
        }
        return largest * secondLargest - smallest * secondSmallest;
    }
}