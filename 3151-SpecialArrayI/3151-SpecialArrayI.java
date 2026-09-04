// Last updated: 9/4/2026, 10:47:06 AM
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