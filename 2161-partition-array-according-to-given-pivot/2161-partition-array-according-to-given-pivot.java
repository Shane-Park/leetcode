class Solution {
     public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        int pivotCount = 0;
        List<Integer> bigger = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                smaller.add(num);
            } else if (num == pivot) {
                pivotCount++;
            } else {
                bigger.add(num);
            }
        }
        for (int i = 0; i < pivotCount; i++) {
            smaller.add(pivot);
        }
        smaller.addAll(bigger);
        return smaller.stream().mapToInt(Integer::intValue).toArray();
    }
}