// Last updated: 9/9/2026, 2:02:33 PM
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