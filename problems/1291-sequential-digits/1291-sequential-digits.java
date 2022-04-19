class Solution {
public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (check(i)) {
                list.add(i);
            }

            int length = (int) (Math.log10(i)) + 1;
            int first = i / (int) Math.pow(10, length - 1);
            if (first + length > 10) {
                i = getNext(length) - 1;
            } else {
                int temp = 0;
                for (int j = 0; j < length; j++) {
                    temp += (first - 1 + length - j) * Math.pow(10, j);
                }
                if (i < temp) {
                    i = temp - 1;
                } else {
                    i = (first + 1) * (int) Math.pow(10, length - 1);
                }
            }
        }
        return list;
    }

    private static int getNext(int length) {
        int temp = 0;
        for (int j = 0; j < length + 1; j++) {
            temp += (length + 1 - j) * Math.pow(10, j);
        }
        return temp;
    }

    private static boolean check(int n) {
        String str = String.valueOf(n);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1) + 1)
                return false;
        }
        return true;
    }
}