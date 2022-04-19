class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        set.add(edges[0][0]);
        set.add(edges[0][1]);
        return set.add(edges[1][0]) ? edges[1][1] : edges[1][0];
    }
}