// Last updated: 9/10/2026, 3:48:04 PM
1class Solution
2{
3    public int rearrangeCharacters(String s, String target)
4    {
5        int[] freq = new int[26], freq2 = new int[26];
6        for(char ch : s.toCharArray())
7            freq[ch-'a']++;
8        for(char ch : target.toCharArray())
9            freq2[ch-'a']++;
10
11        int min = Integer.MAX_VALUE;
12        for(char ch : target.toCharArray())
13            min = Math.min(min,freq[ch-'a']/freq2[ch-'a']);
14        
15        return min;
16    }
17}