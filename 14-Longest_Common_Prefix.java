class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortestString = 201;
        for (int i = 0; i < strs.length; i++){
            if(strs[i].length() - 1 < shortestString){
                shortestString = strs[i].length() - 1;
            }
        }
        String prefixeAns = "";
        for(int i = 0; i <= shortestString; i++){
            char checking = strs[0].charAt(i);
            for(int g = 0; g < strs.length; g++){
                if(checking == strs[g].charAt(i)){
                    if(g == (strs.length - 1)){
                        prefixeAns = prefixeAns + checking;
                    }
                    
                }
                else{
                    return prefixeAns;
                }
            }
        }
        return prefixeAns;
    }
}