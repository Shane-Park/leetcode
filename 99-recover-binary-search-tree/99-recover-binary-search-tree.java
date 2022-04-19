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

    public void recoverTree(TreeNode root) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        traverse(root, numbers, indexes, 0);
        Collections.sort(numbers);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put(indexes.get(i), numbers.get(i));
        }

        Collections.sort(indexes);
        TreeNode answer = new TreeNode(map.get(0));
        Map<Integer, TreeNode> treeMap = new HashMap<>();
        treeMap.put(0, answer);

        for (int i = 1; i < indexes.size(); i++) {
            Integer index = indexes.get(i);
            TreeNode tree = new TreeNode(map.get(index));
            treeMap.put(index, tree);
            TreeNode parent = treeMap.get((index - 1) / 2);
            if (index % 2 == 0) {
                parent.right = tree;
            } else {
                parent.left = tree;
            }
        }

        root.val = answer.val;
        root.left = answer.left;
        root.right = answer.right;
    }

    private void traverse(TreeNode root, List<Integer> list, List<Integer> indexes, int index) {
        if (root == null)
            return;
        traverse(root.left, list, indexes, index * 2 + 1);
        list.add(root.val);
        indexes.add(index);
        traverse(root.right, list, indexes, index * 2 + 2);
    }
}