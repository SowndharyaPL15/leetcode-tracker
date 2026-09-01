// Last updated: 9/1/2026, 11:45:39 AM
class Solution {
    public int binaryGap(int n) {
        int max=0;
        int c=0;
        boolean found=false;
        while(n>0) {
            int bit=n%2;
            if(bit==1) {
                if(found) {
                    max=Math.max(max,c);
                }
                c=1;
                found=true;
            }else{
                if(found){
                    c++;
                }
            }
            n/=2;
        }
        return max;
    }
}