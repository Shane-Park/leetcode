class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[100001];
        for (int num : nums) {
            if(arr[num]++ == 1)
                return num;
        }
        return -1;
    }
}