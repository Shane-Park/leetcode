class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }

        int[] temp = new int['z' - 'a' + 1];
        int[] answer = new int['z' - 'a' + 1];

        for (int i = 0; i < p.length(); i++) {
            answer[p.charAt(i) - 'a']++;
            temp[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(answer, temp)) {
            list.add(0);
        }

        for (int i = 1; i <= s.length() - p.length(); i++) {
            temp[s.charAt(i - 1) - 'a']--;
            temp[s.charAt(i + p.length() - 1) - 'a']++;
            if (Arrays.equals(answer, temp)) {
                list.add(i);
            }
        }


        return list;

    }
}