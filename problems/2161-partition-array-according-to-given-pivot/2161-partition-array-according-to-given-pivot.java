class Solution {
   public int[] pivotArray(int[] nums, int pivot) {
        int[] answer = new int[nums.length];
        int index = 0;
        int pivotCount = 0;
        List<Integer> bigger = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                answer[index++] = num;
            } else if (num == pivot) {
                pivotCount++;
            } else {
                bigger.add(num);
            }
        }
        for (int i = 0; i < pivotCount; i++) {
            answer[index++] = pivot;
        }

        for (Integer integer : bigger) {
            answer[index++] = integer;
        }

        return answer;
    }
}