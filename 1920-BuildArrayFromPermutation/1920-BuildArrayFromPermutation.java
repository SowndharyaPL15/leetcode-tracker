// Last updated: 9/9/2026, 12:37:17 PM
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