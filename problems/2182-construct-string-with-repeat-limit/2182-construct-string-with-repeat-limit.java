class Solution {
 public String repeatLimitedString(String s, int repeatLimit) {
        int[] arr = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        int right = 'z' - 'a';
        int exRight = 0;
        boolean limit = false;
        while (right >= 0) {
            if (arr[right] > 0) {
                if (limit) {
                    sb.append((char) ('a' + right));
                    arr[right]--;
                    limit = false;
                    right = 'z' - 'a';
                    continue;
                }
                if (arr[right] > repeatLimit) {
                    limit = true;
                }
                for (int i = 0; i < arr[right] && i < repeatLimit; i++) {
                    sb.append((char) ('a' + right));
                }
                arr[right] -= Math.min(arr[right], repeatLimit);
                if (limit) {
                    right--;
                } else {
                    right = 'z' - 'a';
                }
            } else {
                right--;
            }

        }

        return sb.toString();
    }
}