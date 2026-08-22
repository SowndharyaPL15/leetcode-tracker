// Last updated: 8/22/2026, 9:59:14 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int s=0,p=1,m=n;
4        while(n>0){
5            int d=n%10;
6            n/=10;
7            s+=d;
8            p*=d;
9        }
10        return m%(s+p)==0;
11    }
12}