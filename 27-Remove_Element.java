class Solution {
    public int removeElement(int[] nums, int val) {
       int nOf101 = 0;
         Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                    nums[i] = 101;
                    Arrays.sort(nums);
                    i--;
            } 
        }
        nOf101 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 101){
                nOf101++;
            }
        }
        Arrays.sort(nums);
        nums = new int[nums.length-nOf101];
        return nums.length;
        
    }
}
