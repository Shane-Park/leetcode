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
  public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        add(root1, list);
        add(root2, list);
        list.sort(Comparator.comparingInt(integer -> integer));
        return list;
    }

    private void add(TreeNode tree, List<Integer> list) {
        if (tree == null)
            return;
        list.add(tree.val);
        if (tree.left != null) {
            add(tree.left, list);
        }
        if (tree.right != null) {
            add(tree.right, list);
        }
    }
}