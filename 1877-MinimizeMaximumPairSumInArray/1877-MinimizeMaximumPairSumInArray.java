// Last updated: 9/9/2026, 12:37:45 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0,i=0,j=nums.length-1;
        while(i<j){
            max=Math.max(max,nums[i]+nums[j]);
            i++;j--;
        }
        return max;
    }
}