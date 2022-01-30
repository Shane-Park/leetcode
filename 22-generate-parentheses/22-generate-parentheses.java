class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<>();
        set.add("()");
        for (int i = 1; i < n; i++) {
            set = make(set);
        }
        return set.stream().collect(Collectors.toList());
    }

    private Set<String> make(Set<String> set) {
        Set<String> temp = new HashSet<>();
        for (String s : set) {
            for (int i = 0; i < s.length(); i++) {
                temp.add(s.substring(0, i) + "()" + s.substring(i, s.length()));
            }
        }
        return temp;
    }
}