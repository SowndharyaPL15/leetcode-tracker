// Last updated: 7/9/2026, 9:51:54 AM
class Solution {
    public int concatenatedBinary(int n) {
        final int a=1_000_000_007;
        long m=0;
        long c=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){
                c++;
            }
            m=((m<<c)|i)%a;
        }
        return(int)m;
    }
}