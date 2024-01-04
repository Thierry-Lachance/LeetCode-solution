class Solution {
    public int[] twoSum(int[] nums, int target) {
       int numsSize = nums.length;
        for(int i = 0; i < numsSize; i++ ){
            for(int g = i + 1; g < numsSize; g++ ){
                int number = nums[i] + nums[g];
                if(number == target){
                    int[] returnValue = {i,g};
                    return returnValue; 
                }
        } 
        } 
        return null;
    }
}