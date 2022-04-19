class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(o -> o.charAt(o.length() - 1)));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.setCharAt(sb.length() - 1, ' ');
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}