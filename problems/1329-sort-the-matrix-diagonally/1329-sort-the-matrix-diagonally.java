class Solution {
     public int[][] diagonalSort(int[][] mat) {
        // GO UP
        for (int i = mat.length - 1; i > 0; i--) {
            List<Integer> list = new ArrayList<>();
            int i2 = i;
            for (int j = 0; j < mat[0].length && i2 < mat.length; i2++, j++) {
                list.add(mat[i2][j]);
            }
            i2 = i;
            Collections.sort(list);
            for (int j = 0; j < mat[0].length && i2 < mat.length; i2++, j++) {
                mat[i2][j] = list.get(j);
            }
        }

        // GO RIGHT
        for (int j = 0; j < mat[0].length; j++) {
            List<Integer> list = new ArrayList<>();
            int j2 = j;
            for (int i = 0; j2 < mat[0].length && i < mat.length; i++, j2++) {
                list.add(mat[i][j2]);
            }
            j2 = j;
            Collections.sort(list);
            for (int i = 0; j2 < mat[0].length && i < mat.length; i++, j2++) {
                mat[i][j2] = list.get(i);
            }
        }

        return mat;
    }
}