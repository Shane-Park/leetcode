class Solution {
public static boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        try {
            for (char c : s.toCharArray()) {
                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(c);
                        break;
                    case ')':
                        if (stack.pop() != '(')
                            return false;
                        break;
                    case ']':
                        if (stack.pop() != '[')
                            return false;
                        break;
                    case '}':
                        if (stack.pop() != '{')
                            return false;
                        break;
                }
            }
        } catch (Exception e) {
            return false;
        }

        return stack.empty();

    }
}