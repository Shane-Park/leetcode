class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder(arr[0]);
        for (int i = 1; i < k; i++) {
            sb.append(" ").append(arr[i]);
        }
        return sb.toString();
    }
}