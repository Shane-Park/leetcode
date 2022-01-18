class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int previous = 0;
        for (int i = 0; i < flowerbed.length && 0 < n; i++) {
            try {
                if (previous == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    previous = 1;
                } else {
                    previous = flowerbed[i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return n == 1;
            }

        }
        return n == 0;
    }
}