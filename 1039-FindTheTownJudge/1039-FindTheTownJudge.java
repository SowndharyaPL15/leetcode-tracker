// Last updated: 9/1/2026, 11:44:59 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
       int a[]=new int[n+1];
       int b[]=new int[n+1];
       for(int c[]:trust){
        a[c[0]]++;
        b[c[1]]++;
       }
       for(int i=1;i<=n;i++){
            if(a[i]==0 && b[i]==n-1){
                return i;
            }
        }
       return -1;
    }
}