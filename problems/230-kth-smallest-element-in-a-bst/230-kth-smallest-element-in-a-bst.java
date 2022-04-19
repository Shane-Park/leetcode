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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = traverse(root);
        return list.get(k - 1);
    }

    private List<Integer> traverse(TreeNode node) {
        if (node == null)
            return Collections.EMPTY_LIST;
        List<Integer> list = new ArrayList<>();
        list.addAll(traverse(node.left));
        list.add(node.val);
        list.addAll(traverse(node.right));
        return list;
    }
}