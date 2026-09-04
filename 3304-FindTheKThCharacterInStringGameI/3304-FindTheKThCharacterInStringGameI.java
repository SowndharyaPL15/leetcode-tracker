// Last updated: 9/4/2026, 10:46:04 AM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k - 1));
    }
}