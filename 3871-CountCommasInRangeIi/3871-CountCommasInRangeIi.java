// Last updated: 9/9/2026, 12:32:31 PM
class Solution {
    private static final long[] pow1000 = { 1000L, 1000000L, 1000000000L, 1000000000000L, 1000000000000000L, 1000000000000000000L };
    
    public long countCommas(long n) {
        int k = 0;        
        for (long p : pow1000) if (n >= p) k++;
        
        return k * (n + 1) - (pow1000[k] - 1000) / 999;
    }
}