class Solution {
 public String minRemoveToMakeValid(String s) {
        StringBuffer sb = new StringBuffer();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')' && cnt > 0) {
                cnt--;
            } else if (c == ')' && cnt == 0) {
                continue;
            } else if (c == '(') {
                cnt++;
            }
            sb.append(c);
        }
        int index = sb.length() - 1;
        while (cnt > 0) {
            if (sb.charAt(index) == '(') {
                sb.deleteCharAt(index);
                cnt--;
            }
            index--;
        }
        return sb.toString();
    }
}