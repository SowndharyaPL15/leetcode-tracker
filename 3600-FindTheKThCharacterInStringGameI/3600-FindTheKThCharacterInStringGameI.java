// Last updated: 7/9/2026, 9:49:34 AM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k - 1));
    }
}