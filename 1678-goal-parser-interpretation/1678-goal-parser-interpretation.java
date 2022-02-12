class Solution {
    public String interpret(String command) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i++;
                } else {
                    sb.append("al");
                    i += 3;
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}