class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int howMany = 0;
            System.out.println(nums[i]);
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                   howMany++; 
                }
                else{
                    i = j-1;
                    break;
                }
            }
            if(howMany*2 >= nums.length){
                return nums[i];
            }
        }
        return 0;
    }
}
