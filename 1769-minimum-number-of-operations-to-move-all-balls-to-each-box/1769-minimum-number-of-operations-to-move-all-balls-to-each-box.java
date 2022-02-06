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

        int cnt2 = 0;
        for (int i = 1; i < boxes.length(); i++) {

            if (boxes.charAt(i - 1) == '1') {
                cnt2++;
            }
            
            arr[i] = arr[i - 1] - cnt + cnt2;

            if (boxes.charAt(i) == '1') {
                cnt--;
            }
        }

        return arr;
    }
}