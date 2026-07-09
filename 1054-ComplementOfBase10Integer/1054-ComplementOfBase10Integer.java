// Last updated: 7/9/2026, 9:53:31 AM
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int b=32-Integer.numberOfLeadingZeros(n);
        int m=(1<<b)-1;
        return ~n & m;
    }
}