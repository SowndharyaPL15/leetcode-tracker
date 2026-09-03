// Last updated: 9/3/2026, 11:45:37 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int a=nums1[0],o=0;
4        for(int x:nums1){
5            a=Math.min(a,x);
6            o|=x&1;
7        }
8        return (a&1)==o;
9    }
10}