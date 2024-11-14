class Solution {
    public int smallestNumber(int n, int t) {
         for(int i = n;  1 < 2; i++){
            String number = Integer.toString(i);
            int numberToDivide = 1;
            char[] ch = new char[number.length()];

            for (int j = 0; j < number.length(); j++) {
                ch[j] = number.charAt(j);
            }
            for (int k = 0; k < ch.length; k++){
                numberToDivide = numberToDivide * Character.getNumericValue(ch[k]);
            }
            if((double)(numberToDivide % t) == 0)return i;
        }
    }
}
