// Last updated: 9/1/2026, 11:45:37 AM
// class Solution {
//     public boolean reorderedPowerOf2(int n) {
        
//     }
// }

class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] count = cnt(n);
        for (int i = 1; i > 0; i <<= 1){
            if (same(count, cnt(i))){
                return true;
            }
        }
        return false;
    }
    private int[] cnt(int x) {
        int[] c = new int[10];
        while (x > 0) { 
            c[x % 10]++;
            x /= 10;
        }
        return c;
    }
    private boolean same(int[] a, int[] b) {
        for (int i = 0; i < 10; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
