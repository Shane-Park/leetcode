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
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        add(root1, list1);
        add(root2, list2);

        List<Integer> answer = new ArrayList<>();
        int i1, i2;
        for (i1 = 0, i2 = 0; i1 < list1.size() && i2 < list2.size(); ) {
            if (list1.get(i1) > list2.get(i2)) {
                answer.add(list2.get(i2++));
            } else {
                answer.add(list1.get(i1++));
            }
        }
        if (i1 < list1.size()) {
            answer.addAll(list1.subList(i1, list1.size()));
        } else {
            answer.addAll(list2.subList(i2, list2.size()));
        }
        return answer;
    }

    private void add(TreeNode tree, List<Integer> list) {
        if (tree == null)
            return;
        add(tree.left, list);
        list.add(tree.val);
        add(tree.right, list);
    }
}