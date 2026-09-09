// Last updated: 9/9/2026, 2:12:25 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                 return nums[i];
            }
        }
        return -1;
    }
}