class Solution {
   public void nextPermutation(int[] nums) {
        nextPermutation(nums, 0, nums.length - 1);
    }

    private void nextPermutation(int[] nums, int from, int to) {
        if (isSortedReverse(nums, from, to)) {
            Arrays.sort(nums, from, to + 1);
            return;
        }

        if (from + 1 == to) {
            swap(nums, from, to);
            return;
        }

        if (isSortedReverse(nums, from + 1, to)) {
            // put next number on the from index
            int nextNumber = Integer.MAX_VALUE;
            int indexdNumber = nums[from];
            List<Integer> list = new ArrayList<>();
            list.add(indexdNumber);
            for (int i = from + 1; i <= to; i++) {
                if (nums[i] > indexdNumber) {
                    nextNumber = Math.min(nums[i], nextNumber);
                }
                list.add(nums[i]);
            }
            // then sort other numbers
            nums[from] = nextNumber;
            list.remove(Integer.valueOf(nextNumber));
            Collections.sort(list);
            for (int i = from + 1, j = 0; i <= to; i++, j++) {
                nums[i] = list.get(j);
            }

        } else {
            nextPermutation(nums, from + 1, to);
        }
    }

    private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

    private boolean isSortedReverse(int[] arr, int from, int to) {
        for (int i = from; i < to; i++) {
            if (arr[i] < arr[i + 1])
                return false;
        }
        return true;
    }
}