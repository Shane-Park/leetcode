class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> parents = new ArrayList<>();
        List<List<Integer>> children = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            parents.add(new ArrayList<>());
            children.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            children.get(edge[0]).add(edge[1]);
        }
        for (int i = 0; i < n; i++) {
            dfs(i, i, parents, children);
        }
        return parents;

    }

    private void dfs(int i, int cur, List<List<Integer>> parents, List<List<Integer>> children) {
        for (Integer child : children.get(cur)) {
            if (parents.get(child).size() == 0 || parents.get(child).get(parents.get(child).size() - 1) != i) {
                parents.get(child).add(i);
                dfs(i, child, parents, children);
            }
        }
    }
}