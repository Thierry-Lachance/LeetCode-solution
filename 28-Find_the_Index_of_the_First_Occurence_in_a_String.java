class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0) && (haystack.length()) >= (needle.length()+i)){
                for(int f = 0; f < needle.length(); f++){
                    if(haystack.charAt(i+f) == needle.charAt(f)){
                        if(f == (needle.length()-1)){
                            return i;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return -1;
    }
}
