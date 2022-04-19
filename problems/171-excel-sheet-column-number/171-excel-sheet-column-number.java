class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = columnTitle.length() - 1, digit = 1; i >= 0; i--, digit *= 26) {
            sum += (columnTitle.charAt(i) - 'A' + 1) * digit;
        }
        return sum;
    }
}