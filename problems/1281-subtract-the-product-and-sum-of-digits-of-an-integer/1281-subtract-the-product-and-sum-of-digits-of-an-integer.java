class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            int num = (str.charAt(i) - 48);
            sum += num;
            mul *= num;
        }

        return mul - sum;

    }
}