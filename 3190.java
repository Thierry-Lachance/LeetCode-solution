class Solution {
    public int minimumOperations(int[] nums) {
        int total = 0;
        for(int i : nums){
            if(i % 3 != 0) total++;
        }
        return total;
    }
}
