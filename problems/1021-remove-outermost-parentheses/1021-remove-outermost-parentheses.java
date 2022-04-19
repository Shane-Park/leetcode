class Solution {
    public String removeOuterParentheses(String s) {
        List<String> list = new ArrayList<>();
        int left = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
                if (cnt == 0) {
                    list.add(s.substring(left, i + 1));
                    left = i + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str, 1, str.length() - 1);
        }

        return sb.toString();
    }
}