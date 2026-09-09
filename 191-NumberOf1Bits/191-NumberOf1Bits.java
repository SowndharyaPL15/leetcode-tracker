// Last updated: 9/9/2026, 2:13:40 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0) {
            count+=(n&1);
            n>>=1;
        }
        return count;
    }
}