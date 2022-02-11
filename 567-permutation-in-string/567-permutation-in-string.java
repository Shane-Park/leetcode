class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] arr = new int['z' - 'a' + 1];
        int[] temp = new int['z' - 'a' + 1];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            temp[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(arr, temp)) {
            return true;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            temp[s2.charAt(i) - 'a']--;
            temp[s2.charAt(i + s1.length()) - 'a']++;
            if (Arrays.equals(arr, temp)) {
                return true;
            }
        }
        return false;
    }
}