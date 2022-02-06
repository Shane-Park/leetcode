class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        int cnt = 0;
        for (int i = 1; i < boxes.length(); i++) {
            if ((boxes.charAt(i) == '1')) {
                arr[0] += i;
                cnt++;
            }
        }

        for (int i = 1; i < boxes.length(); i++) {

            if (boxes.charAt(i - 1) == '1') {
                cnt--;
            }

            arr[i] = arr[i - 1] - cnt;

            if (boxes.charAt(i) == '1') {
                cnt--;
            }
        }

        return arr;
    }
}