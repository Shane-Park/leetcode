class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] arr = new double[query_row + 2];
        arr[0] = poured;
        for (int i = 1; i <= query_row; i++) {
            for (int j = i; j >= 0; j--) {
                arr[j + 1] += arr[j] = Math.max(0, (arr[j] - 1) / 2);
            }
        }
        return Math.min(arr[query_glass], 1);
    }
}