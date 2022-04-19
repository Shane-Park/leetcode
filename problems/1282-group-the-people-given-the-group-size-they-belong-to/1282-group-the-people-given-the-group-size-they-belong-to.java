class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            List<Integer> value = map.getOrDefault(size, new ArrayList<>());
            value.add(i);
            if (value.size() == size) {
                list.add(value);
                map.remove(size);
            } else {
                map.put(size, value);
            }
        }
        return list;
    }
}