// Last updated: 7/9/2026, 9:52:09 AM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int t=(i+1)*(n-i);
            int m=(t+1)/2;
            sum+=arr[i]*m;
        }
        return sum;
    }
}