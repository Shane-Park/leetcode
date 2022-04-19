class Solution {
    static long total = 0;

    public List<Long> maximumEvenSplit(long finalSum) {
        total = finalSum;
        if (finalSum % 2 == 1) {
            return new ArrayList<>();
        }

        List<Long> list = new ArrayList<>();
        for(long h=2; finalSum>=h; h+=2) {
            list.add(h);
            finalSum -= h;
        }
        list.set(list.size() - 1, list.get(list.size() - 1) + finalSum);
        return list;

    }
}