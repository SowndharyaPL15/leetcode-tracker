// Last updated: 9/1/2026, 11:42:53 AM
class Solution {
    public int maxProduct(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                a=Math.max(a,(nums[i]-1)*(nums[j]-1));
            }
        }
        return a;
    }
}