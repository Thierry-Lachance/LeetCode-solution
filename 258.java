class Solution {
    public int addDigits(int num) {
        String number = Integer.toString(num);
        while (true) {
            int total = 0;
            for (int i = 0; i < number.length(); i++) {
                total += Character.getNumericValue(number.charAt(i));
            }
            number = Integer.toString(total);
            if (number.length() == 1)
                return total;

        }
    }
}
