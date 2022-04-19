
class FindElements {

    TreeNode root;

    public FindElements(TreeNode root) {
        this.root = root;
        root.val = 0;
//        fix(root);
    }

    private void fix(TreeNode node) {
        if (node.left != null) {
            node.left.val = node.val * 2 + 1;
        }
        if (node.right != null) {
            node.right.val = node.val * 2 + 2;
        }
    }

    public boolean find(int target) {
        return find(root, target);
    }

    private boolean find(TreeNode root, int target) {
        TreeNode cur = root;
        Stack<Integer> stack = new Stack<>();
        while (target > 0) {
            stack.push((target - 1) % 2);
            target = (target - 1) / 2;
        }

        while (!stack.isEmpty() && cur != null) {
            Integer pop = stack.pop();
            if (pop == 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }


        return stack.isEmpty() && cur != null;
    }

}
