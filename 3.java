class Solution {
    public int lengthOfLongestSubstring(String s) {
        String passed = "";
        int start = 0;
        int best = 0;
        for(int i = 0; i < s.length(); i++){
           if(passed.contains(String.valueOf(s.charAt(i)))){
            if(passed.length() >= best)best = passed.length();
            passed = "";
            i = start;
            start++;
           }
           else{
            passed = passed + s.charAt(i);
           }
        }
        if(passed.length() >= best)best = passed.length();
        return best;
    }
}
