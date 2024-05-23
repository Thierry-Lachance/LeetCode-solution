class Solution {
    public boolean isSubsequence(String s, String t) {
        int gotFoundAt = -1;
        for(int i = 0; i < s.length(); i++){
            boolean gotFound = false;
            for(int y = (gotFoundAt +1); y < t.length(); y++){
                if(s.charAt(i) == t.charAt(y)){
                    gotFound = true;
                    gotFoundAt = y;
                    break;
                }
            }
            if(!gotFound)return false;
        }
        return true;
        
    }
}
