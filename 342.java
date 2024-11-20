class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n >= 4) {
            while (n > 1) {
                if (n % 4 != 0)
                    return false;
                else
                    n = n / 4;

            }
            return true;
        }
        return false;

    }
}
