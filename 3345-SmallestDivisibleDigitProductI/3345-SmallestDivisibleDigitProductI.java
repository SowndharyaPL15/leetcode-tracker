// Last updated: 9/4/2026, 10:45:42 AM
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