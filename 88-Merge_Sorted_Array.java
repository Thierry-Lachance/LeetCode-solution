import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    Arrays.sort(nums1);
    int skipped = 0;
     for(int i = 0; i < n; i++){
         if(nums1[(i+skipped)] == 0){
            nums1[(i+skipped)] = nums2[(i)];
         }
         else{
             skipped++;
             i--;
         }
     }   
      Arrays.sort(nums1);
    }
}
