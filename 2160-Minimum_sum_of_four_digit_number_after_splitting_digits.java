class Solution {
    public int minimumSum(int num) {
        char[] chary = String.valueOf(num).toCharArray();
        Arrays.sort(chary);
        return(Character.getNumericValue(chary[0])*10 + Character.getNumericValue(chary[2])
         + Character.getNumericValue(chary[1])*10 + Character.getNumericValue(chary[3]));
    }
}
