// Last updated: 9/9/2026, 12:37:08 PM
class Solution {
    public int findGCD(int[] nums) {
        int mn = 1001, mx = 0;

        for (int num : nums) {
            if (num < mn)
                mn = num;
            if (num > mx)
                mx = num;
        }

        return gcd(mn, mx);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}