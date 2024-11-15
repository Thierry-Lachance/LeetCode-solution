class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String s = Integer.toString(n);
        int sBase = 10; // Source Base Octal
        for(int b = 2; b < n-1; b++){
            String result = Integer.toString(Integer.parseInt(s, sBase), b);
            for(int i = 0; i <= (int)result.length()/2; i++){
                if(result.charAt(i) != result.charAt(result.length()-i-1))return false;
            }
        }
         return true;
    }
}
