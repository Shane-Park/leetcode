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
   public TreeNode bstToGst(TreeNode root) {
        Queue<Integer> q = new PriorityQueue();
        Map<Integer, Integer> map = new HashMap<>();
        traverse(root, q);
        int sum = 0;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            sum -= poll;
            map.put(-poll, sum);
        }

        replaceDfs(root, map);

        return root;

    }

    private void replaceDfs(TreeNode root, Map<Integer, Integer> map) {
        if (root == null)
            return;
        root.val = map.get(root.val);
        replaceDfs(root.left, map);
        replaceDfs(root.right, map);
    }

    private void traverse(TreeNode root, Queue<Integer> q) {
        if (root == null)
            return;
        q.offer(-root.val);
        traverse(root.left, q);
        traverse(root.right, q);
    }
}