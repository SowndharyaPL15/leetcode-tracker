// Last updated: 9/4/2026, 10:45:35 AM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int m=nums[i];
            if(m==0){
                a[i]=0;
            }
            int idx=((i+m)%n+n)%n;
            a[i]=nums[idx];
        }
        return a;
    }
}