import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int nOf101 = 0;
         Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                if(nums[i] != 101){
                    nums[i] = 101;
                    Arrays.sort(nums);
                    i--;
                } 
            } 
        }
        nOf101 = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 101){
                nOf101++;
            }
        }
        Arrays.sort(nums);
        nums = new int[nums.length-nOf101];
        return nums.length;
    }
}