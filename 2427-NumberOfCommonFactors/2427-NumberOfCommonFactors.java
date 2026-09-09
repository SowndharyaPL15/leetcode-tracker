// Last updated: 9/9/2026, 12:36:03 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int l=Math.min(a,b);
        for(int i=1;i<=l;i++){
            if(a % i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}