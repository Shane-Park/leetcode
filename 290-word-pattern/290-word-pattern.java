class Solution {
public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if(pattern.length() != arr.length)
            return false;

        Map<String, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Character saved = map.get(arr[i]);
            if (saved == null) {
                map.put(arr[i], pattern.charAt(i));
                if (!set.add(pattern.charAt(i))) {
                    return false;
                }
            } else {
                if (saved != pattern.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}