// Last updated: 9/9/2026, 2:09:10 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for (int i=left;i<=right;i++) {
            int a=Integer.bitCount(i);
            if (p(a)) {
                c++;
            }
        }
        return c;
    }
    private boolean p(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2;i*i <= n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}