class Solution {
    public boolean isPalindrome(String s) {
        String finalAns = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                finalAns = finalAns + s.charAt(i);
            }
        }
        finalAns = finalAns.toLowerCase();
        for (int i = 0; i < (finalAns.length() / 2); i++) {
            if (finalAns.charAt(i) != finalAns.charAt((finalAns.length() - 1 - i)))
                return false;
        }
        return true;
    }
}
