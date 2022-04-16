class Solution {
   public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i))
                list.add(i);
        }
        return list;
    }

    private boolean selfDividing(int num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            if (n == 0 || num % n != 0)
                return false;
        }
        return true;
    }
}