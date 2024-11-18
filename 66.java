import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                break;
            } else if (digits[i] == 9 && i > 0) {
                digits[i] = 0;
            } else if (digits[i] == 9 && i == 0) {
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;

                for (int j = 1; j <= digits.length; j++) {
                    arr[i + 1] = digits[i];
                }
                arr[i + 1] = 0;
                return arr;
            }
        }

        return digits;
    }
}
