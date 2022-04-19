class Solution {
      public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < s.length(); i++) {
            int left = i % ((numRows - 1) * 2);
            int val = numRows - 1 - Math.abs(numRows - 1 - left);
            list.get(val).add(s.charAt(i));
        }

        StringBuffer sb = new StringBuffer();
        for (List<Character> characters : list) {
            for (Character character : characters) {
                sb.append(character);
            }
        }


        return sb.toString();
    }
}