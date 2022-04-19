class Solution {
  public int[] kWeakestRows(int[][] mat, int k) {
        List<Row> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            list.add(new Row(i, Arrays.stream(mat[i]).sum()));
        }
        int[] answer = new int[k];
        Collections.sort(list);

        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i).index;
        }
        return answer;
    }
    
    class Row implements Comparable {
        int index;
        int sum;

        public Row(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }

        @Override
        public int compareTo(Object o) {
            Row r = (Row) o;
            if (r.sum == this.sum) {
                return Integer.compare(this.index, r.index);
            }
            return Integer.compare(this.sum, r.sum);
        }
    }
}