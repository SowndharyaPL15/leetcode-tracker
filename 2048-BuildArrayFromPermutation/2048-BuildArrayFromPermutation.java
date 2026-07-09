// Last updated: 7/9/2026, 9:51:18 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[nums[i]];
        }
        return a;
    }
}