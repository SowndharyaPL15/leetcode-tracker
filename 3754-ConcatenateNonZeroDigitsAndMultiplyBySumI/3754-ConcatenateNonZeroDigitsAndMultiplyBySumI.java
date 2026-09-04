// Last updated: 9/4/2026, 10:39:29 AM
class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        long place = 1;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                x = d * place + x;
                place *= 10;
                sum += d;
            }
            n /= 10;
        }
        return x * sum;
    }
}