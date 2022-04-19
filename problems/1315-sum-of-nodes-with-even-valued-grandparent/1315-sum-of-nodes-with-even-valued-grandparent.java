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
    public int sumEvenGrandparent(TreeNode root) {
        return traverse(root, false, false);
    }

    private int traverse(TreeNode root, boolean parentIsEven, boolean grandParentIsEven) {
        int sum = 0;
        if (grandParentIsEven) {
            sum += root.val;
        }

        if (root.left != null) {
            sum += traverse(root.left, root.val % 2 == 0, parentIsEven);
        }
        if (root.right != null) {
            sum += traverse(root.right, root.val % 2 == 0, parentIsEven);

        }
        return sum;

    }
}