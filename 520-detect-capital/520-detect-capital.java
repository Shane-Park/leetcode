class Solution {
public static boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        // if first Charater is a Capital Letter
        char[] arr = word.toCharArray();
        if (word.charAt(0) < 'a') {
            if (word.charAt(1) < 'a') {
                for (int i=2; i<arr.length; i++) {
                    if ('a' <= arr[i]) {
                        return false;
                    }
                }
            } else {
                for (int i=2; i<arr.length; i++) {
                    if (arr[i] < 'a') {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 1; i <arr.length; i++) {
                if (arr[i] < 'a') {
                    return false;
                }
            }
        }
        return true;
    }
}