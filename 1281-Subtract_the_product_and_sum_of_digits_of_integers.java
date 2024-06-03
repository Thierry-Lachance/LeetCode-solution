class Solution {
    public int subtractProductAndSum(int n) {
       String number = Integer.toString(n);
       int countMultiply = 1;
       int countAdded = 0;
       for(int i = 0; i < number.length(); i++){
        countMultiply = countMultiply * Character.getNumericValue(number.charAt(i));
        countAdded = countAdded + Character.getNumericValue(number.charAt(i));  
       }
       return(countMultiply - countAdded);
    }
}
