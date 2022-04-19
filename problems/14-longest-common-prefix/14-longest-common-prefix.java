class Solution {

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs, Comparator.comparingInt(String::length));

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(sb.toString())) {
                    return sb.substring(0, sb.length() - 1);
                }
            }
        }

        return sb.toString();

    }
}