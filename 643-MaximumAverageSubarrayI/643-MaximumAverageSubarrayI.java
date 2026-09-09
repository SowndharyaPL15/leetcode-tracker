// Last updated: 9/9/2026, 2:09:43 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return (double)max/k;
    }
}