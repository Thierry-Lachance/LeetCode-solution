class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
               return i; 
            }
        }
        if(nums[0] > target){
            return 0;
        }
        for(int f = 0; f < nums.length; f++){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == (target - (1 - f))){
                    return (i+1-f/2);
                }
            }
        }
            
    return nums.length;
    }
}
