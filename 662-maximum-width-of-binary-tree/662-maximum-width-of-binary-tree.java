/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
 public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        Map<Integer, MinMaxPair> map = new HashMap<>();

        dfs(root, map, 0, 0);

        int max = 0;
        for (MinMaxPair minMaxPair : map.values()) {
            if (minMaxPair.min != null && minMaxPair.max != null) {
                max = Math.max(max, minMaxPair.max - minMaxPair.min + 1);
            }
        }

        return max;

    }

    private void dfs(TreeNode root, Map<Integer, MinMaxPair> map, int num, int depth) {
        if (root == null)
            return;
        MinMaxPair minMaxPair = map.getOrDefault(depth, new MinMaxPair());
        if (minMaxPair.min == null || minMaxPair.min > num) {
            minMaxPair.min = num;
        }
        if (minMaxPair.max == null || minMaxPair.max < num) {
            minMaxPair.max = num;
        }
        map.put(depth, minMaxPair);

        dfs(root.left, map, num * 2 + 1, depth + 1);
        dfs(root.right, map, num * 2 + 2, depth + 1);

    }


    static class MinMaxPair {
        Integer min;
        Integer max;

        @Override
        public String toString() {
            return "MinMaxPair{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }
    }
}