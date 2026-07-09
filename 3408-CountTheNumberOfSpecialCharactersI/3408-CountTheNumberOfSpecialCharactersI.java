// Last updated: 7/9/2026, 9:49:46 AM
class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> s = new HashSet<>();
        for (char c : word.toCharArray()) {
            s.add(c);
        }
        int ans = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.contains(c) && s.contains((char) (c - 'a' + 'A'))) {
                ans++;
            }
        }
        return ans;
    }
}