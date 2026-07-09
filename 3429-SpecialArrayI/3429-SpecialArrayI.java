// Last updated: 7/9/2026, 9:49:43 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
       for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2 ==nums[i+1]%2){
                return false;
            }
       } 
       return true;
    }
}