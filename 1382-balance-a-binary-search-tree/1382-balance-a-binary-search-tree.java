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
public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfsAdd(root, list);
        Collections.sort(list);
        return listToTreeNode(list);
    }

    private TreeNode listToTreeNode(List<Integer> list) {
        if (list.isEmpty())
            return null;
        if (list.size() == 1)
            return new TreeNode(list.get(0));
        if (list.size() == 2) {
            TreeNode result = new TreeNode(list.get(0));
            result.right = new TreeNode(list.get(1));
        }

        int midIndex = list.size() / 2;
        TreeNode result = new TreeNode(list.get(midIndex));
        List<Integer> sub1 = list.subList(0, midIndex);
        List<Integer> sub2 = list.subList(midIndex + 1, list.size());
        result.left = listToTreeNode(sub1);
        result.right = listToTreeNode(sub2);
        return result;
    }

    private void dfsAdd(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        list.add(node.val);
        dfsAdd(node.left, list);
        dfsAdd(node.right, list);
    }
}