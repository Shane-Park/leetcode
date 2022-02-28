class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        Integer start = null;
        Integer before = null;
        for (int num : nums) {
            if (start == null) {
                start = num;
                before = num;
            } else if (num == before + 1) {
                before = num;
            } else if (Integer.compare(start, before) == 0) {
                list.add(String.valueOf(start));
                start = num;
                before = num;
            } else {
                list.add(start + "->" + before);
                start = num;
                before = num;
            }
        }

        if (start != null) {
            if (Integer.compare(start, before) == 0) {
                list.add(String.valueOf(start));
            } else {
                list.add(start + "->" + before);
            }
        }

        return list;
    }
}