class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitsSum = 0;
        for(int i = 0; i < nums.length; i++){
            elementSum = elementSum + nums[i];
            String num = Integer.toString(nums[i]);
            for(int j = 0; j < num.length(); j++){
                digitsSum = digitsSum + Integer.parseInt(String.valueOf(num.charAt(j)));
            }
        }
        return elementSum - digitsSum;
    }
}
