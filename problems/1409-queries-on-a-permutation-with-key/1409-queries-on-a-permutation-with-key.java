class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int index = list.indexOf(query);
            list.remove(index);
            list.add(0, query);
            queries[i] = index;
        }
        return queries;
    }
}