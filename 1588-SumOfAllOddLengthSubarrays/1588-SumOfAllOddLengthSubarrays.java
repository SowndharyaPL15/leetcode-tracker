// Last updated: 9/9/2026, 2:03:45 PM
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