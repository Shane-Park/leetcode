class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for (String dir : path.split("/")) {
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else {
                if (!dir.equals(".") && !dir.equals("..") && !dir.equals("")) {
                    stack.push(dir);
                }
            }
        }
        path = "";
        while (!stack.isEmpty()) {
            path = "/" + stack.pop() + path;
        }
        return path.length() == 0 ? "/" : path;
    }
}