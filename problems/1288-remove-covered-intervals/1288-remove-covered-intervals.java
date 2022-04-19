class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        loop:
        for (int[] interval : intervals) {
            for (int i = 0; i < list.size(); i++) {
                int[] ints = list.get(i);
                if (ints[0] <= interval[0] && interval[1] <= ints[1]) {
                    continue loop;
                } else if (interval[0] <= ints[0] && ints[1] <= interval[1]) {
                    list.remove(i--);
                }
            }
            list.add(interval);
        }
        return list.size();
    }
}