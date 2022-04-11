class Solution {
public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        final int HEIGHT = grid.length;
        final int WIDTH = grid[0].length;
        final int SIZE = HEIGHT * WIDTH;
        int[] arr = new int[SIZE];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                arr[WIDTH * i + j] = grid[i][j];
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < HEIGHT; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < WIDTH; j++) {
                list.add(arr[(WIDTH * i + j + SIZE - (k % SIZE)) % SIZE]);
            }
            result.add(list);
        }
        return result;
    }
}