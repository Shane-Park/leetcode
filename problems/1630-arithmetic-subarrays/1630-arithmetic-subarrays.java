class Solution {
public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> answer = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            answer.add(isValid(nums, l[i], r[i]));
        }
        return answer;
    }

    private Boolean isValid(int[] nums, int l, int r) {
        if (l == r)
            return true;

        int[] temp = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            temp[i - l] = nums[i];
        }
        Arrays.sort(temp);

        int gap = temp[1] - temp[0];
        for (int i = 1; i < temp.length - 1; i++) {
            if (temp[i + 1] - temp[i] != gap) {
                return false;
            }
        }
        return true;
    }
}