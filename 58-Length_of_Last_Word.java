class Solution {
    public int lengthOfLastWord(String s) {
        int wordLength = 0;
        for(int i = (s.length()-1); i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(wordLength > 0){
                    break;
                }
            }
            else{
                wordLength++;
            }
        }
        return wordLength;
    }
}
