class Solution {
int max;

    public int longestPath(int[] parent, String s) {
        max = 0;
        List<List<Integer>> children = new ArrayList<>();
        for (int i = 0; i < parent.length; i++) {
            children.add(new ArrayList<>());
        }

        for (int i = 0; i < parent.length; i++) {
            if (parent[i] >= 0) {
                children.get(parent[i]).add(i);
            }
        }
        dfs(0, children, s);

        return max;

    }

    private int dfs(int i, List<List<Integer>> children, String s) {
        int max1 = 0;
        int max2 = 0;
        for (Integer child : children.get(i)) {
            int dfs = dfs(child, children, s);
            if (s.charAt(child) != s.charAt(i)) {
                max2 = Math.max(max2, dfs);
                if (max2 > max1) {
                    int temp = max1;
                    max1 = max2;
                    max2 = temp;
                }
            }
        }
        max = Math.max(max, max1 + max2 + 1);
        return max1 + 1;
    }
}