// Last updated: 9/9/2026, 2:13:46 PM
class Solution {
    public int reverseBits(int n) {
        int r=0;
        for(int i=0;i<32;i++){
            r<<=1;
            r|=(n&1);
            n>>>=1;
        }
        return r;
        
    }
}