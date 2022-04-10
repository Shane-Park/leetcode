class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    Integer pop = stack.pop();
                    Integer peek = stack.peek();
                    stack.push(pop);
                    stack.push(pop + peek);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }
        return stack.stream().mapToInt(Integer::valueOf).sum();
    }
}