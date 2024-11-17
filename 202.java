import java.util.ArrayList;

class Solution {
    public boolean isHappy(int n) {
        String number = Integer.toString(n);
        ArrayList<Integer> passed = new ArrayList<Integer>();

        while (true) {
            int total = 0;
            for (int i = 0; i < number.length(); i++) {
                total += Math.pow(Character.getNumericValue(number.charAt(i)), 2);
            }
            passed.add(Integer.valueOf(number));
            if (total == 1)
                return true;
            for (int i = 0; i < passed.size(); i++) {
                if (total == passed.get(i))
                    return false;
            }
            number = Integer.toString(total);
        }
    }
}
