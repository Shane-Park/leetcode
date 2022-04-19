class Solution {
public String removeKdigits(String num, int k) {
        if (num.length() <= k)
            return "0";

        Stack<Character> stack = new Stack();
        int i = 0;
        while (i < num.length()) {
            while (!stack.isEmpty() && k > 0 && num.charAt(i) < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i++));
        }

        for (int j = 0; j < k; j++) {
            stack.pop();
        }

        StringBuffer sb = new StringBuffer();
        for (Character c : stack) {
            sb.append(c);
        }

        for (int j = 0; j < sb.length() - 1; j++) {
            if (sb.charAt(j) == '0') {
                sb.deleteCharAt(j--);
            } else {
                break;
            }
        }

        return sb.toString();

    }
}