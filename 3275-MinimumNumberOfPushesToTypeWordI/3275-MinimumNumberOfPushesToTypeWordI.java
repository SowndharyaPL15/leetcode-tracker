// Last updated: 9/1/2026, 11:38:15 AM
class Solution {
    public int minimumPushes(String A) {
        int q = A.length() >> 3;
        int r = A.length() & 7;
        return ((q << 2) + r) * (q + 1);
    }
}