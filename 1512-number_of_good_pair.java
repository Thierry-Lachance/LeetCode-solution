class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i =0; i < nums.length; i++){
            for(int y = i+1; y < nums.length; y++){
                if(nums[y] == nums[i])ans++;  
            }
            
            
        }
        return ans;
        
    }
}
