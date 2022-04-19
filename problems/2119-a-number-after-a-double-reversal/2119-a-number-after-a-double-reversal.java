class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == getReverse(getReverse(num));
    }

    private int getReverse(int num) {
        return Integer.parseInt(new StringBuffer(num + "").reverse().toString());
    }
}