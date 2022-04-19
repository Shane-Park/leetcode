class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int i = k - 1;
        while (list.size() > 1) {
            list.remove(i);
            i = (i + k - 1) % list.size();
        }
        return list.get(0);
    }
}