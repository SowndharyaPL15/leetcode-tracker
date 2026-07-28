// Last updated: 7/28/2026, 7:33:30 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int n = s.length(), j = 0;
4        int[] freq = new int[26];
5        char[] chars = s.toCharArray();
6        for (int i = 0; i < n >> 1; i++)
7            freq[(chars[i] & 31) - 1]++;
8        for (int i = 0; i < 26; i++) {
9            while (freq[i]-- > 0) {
10                chars[j] = (char) (97 + i);
11                chars[n - 1 - j++] = (char) (97 + i);
12            }
13        }
14        return new String(chars);
15    }
16}