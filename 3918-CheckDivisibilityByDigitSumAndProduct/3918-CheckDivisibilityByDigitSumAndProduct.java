// Last updated: 9/1/2026, 11:35:02 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1,m=n;
        while(n>0){
            int d=n%10;
            n/=10;
            s+=d;
            p*=d;
        }
        return m%(s+p)==0;
    }
}