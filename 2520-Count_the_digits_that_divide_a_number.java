class Solution {
    public int countDigits(int num) {
        String number = String.valueOf(num);
        char[] digits = number.toCharArray(); 
        int count = 0;
        for(int i = 0; i < digits.length; i++){
            if(num % Character.getNumericValue(digits[i]) == 0)count++;
        }
        return(count);
    }
}
