class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        int numberOfRun = number.length()/2;
        for(int i = 0;i <= numberOfRun; i++){
            if(number.charAt(i) != number.charAt(number.length()-i-1)){
                return false;
            }    
        }
        return true;
    }
}