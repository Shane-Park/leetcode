class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> in = new HashSet<>();
        Set<String> out = new HashSet<>();
        for (List<String> path : paths) {
            in.add(path.get(0));
            out.add(path.get(1));
        }
        out.removeAll(in);
        return out.stream().collect(Collectors.toList()).get(0);
    }
}