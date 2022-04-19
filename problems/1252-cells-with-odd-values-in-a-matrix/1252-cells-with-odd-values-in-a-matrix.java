class Solution {
public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int[] index : indices) {
            for (int i = 0; i < m; i++) {
                arr[i][index[1]]++;
            }
            for (int i = 0; i < n; i++) {
                arr[index[0]][i]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 1)
                    sum++;
            }
        }
        return sum;
    }
}