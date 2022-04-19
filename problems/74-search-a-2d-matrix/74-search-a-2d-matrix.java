class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            int mid = (left + right) / 2 + 1;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        int y = left;

        left = 0;
        right = matrix[0].length - 1;
        while (left < right) {
            int mid = (left + right) / 2 + 1;
            if (matrix[y][mid] == target) {
                return true;
            } else if (matrix[y][mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return matrix[y][left] == target;
    }
}