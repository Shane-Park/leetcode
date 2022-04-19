class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');

        k -= n;

        int index = n - 1;
        while (k > 0) {
            int process = Math.min(k, 'z' - 'a');
            arr[index] += process;
            index--;
            k -= process;
        }

        return String.valueOf(arr);
    }
}