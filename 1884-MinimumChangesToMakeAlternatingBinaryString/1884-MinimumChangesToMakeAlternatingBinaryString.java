// Last updated: 7/9/2026, 9:51:46 AM
class Solution {
    public int minOperations(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            c+=(s.charAt(i)^i)&1;
        }
        return Math.min(c,n-c);
    }
}