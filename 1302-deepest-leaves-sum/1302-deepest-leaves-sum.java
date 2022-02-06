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
    int maxDepth = 0;

    public int deepestLeavesSum(TreeNode root) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        travel(root, map, 0);
        List<Integer> list = map.get(maxDepth);
        return list.stream().mapToInt(Integer::intValue).sum();

    }

    private void travel(TreeNode node, Map<Integer, List<Integer>> map, int depth) {
        if (node.left == null && node.right == null) {
            if (depth >= maxDepth) {
                maxDepth = Math.max(maxDepth, depth);
                List<Integer> list = map.getOrDefault(depth, new ArrayList<>());
                list.add(node.val);
                map.put(depth, list);
            }
            return;
        }

        if (node.left != null)
            travel(node.left, map, depth + 1);
        if (node.right != null)
            travel(node.right, map, depth + 1);
    }
}