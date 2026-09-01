// Last updated: 9/1/2026, 11:36:38 AM
class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int x = n;
            while (x > 0) {
                product *= (x % 10);
                x /= 10;
            }
            if (product % t == 0)
                return n;
            n++;
        }
    }
}