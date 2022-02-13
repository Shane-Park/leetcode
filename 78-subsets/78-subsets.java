class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int length = (int) Math.pow(2, nums.length);
        int binaryLength = (int) (Math.log(length) / Math.log(2));
        for (int i = 0; i < length; i++) {
            String binary = String.format("%" + binaryLength + "s", Integer.toBinaryString(i));
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    temp.add(nums[j]);
                }
            }
            list.add(temp);
        }

        return list;

    }
}