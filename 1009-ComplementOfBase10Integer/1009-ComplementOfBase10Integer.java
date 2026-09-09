// Last updated: 9/9/2026, 2:07:39 PM
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