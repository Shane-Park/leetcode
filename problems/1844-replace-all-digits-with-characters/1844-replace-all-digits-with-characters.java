class Solution {
    public String replaceDigits(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length() - 1; i += 2) {
            sb.append(s.charAt(i));
            sb.append((char) (s.charAt(i) + s.charAt(i + 1) - '0'));
        }
        return sb.toString() + ((s.length() % 2 == 0) ? "" : s.charAt(sb.length()));
    }
}