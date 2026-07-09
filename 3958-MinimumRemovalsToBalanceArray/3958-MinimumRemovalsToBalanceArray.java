// Last updated: 7/9/2026, 9:48:55 AM
class Solution {
    public int minRemoval(int[] nums, int k) {
        int a=nums.length;
        Arrays.sort(nums);
        int n=0,max=1;
        for(int i=0;i<a;i++){
            while((long)nums[i]>(long)nums[n]*k){
                n++;
            }
            max=Math.max(max,i-n+1);
        }
        return a-max;
    }
}