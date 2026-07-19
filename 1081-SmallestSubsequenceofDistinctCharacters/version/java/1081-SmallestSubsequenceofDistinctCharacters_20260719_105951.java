// Last updated: 7/19/2026, 10:59:51 AM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] freq = new int[27];
4        boolean[] seen = new boolean[27];
5        Stack<Character> stack = new Stack<>();
6        for (int i = 0; i < s.length(); i++)
7            freq[s.charAt(i) & 31]++;
8        for (int i = 0; i < s.length(); i++) {
9            char c = s.charAt(i);
10            int x = c & 31;
11            freq[x]--;
12            if (seen[x])
13                continue;
14            while (!stack.isEmpty()) {
15                if (stack.peek() <= c)
16                    break;
17                if (freq[stack.peek() & 31] == 0)
18                    break;
19                seen[stack.peek() & 31] = false;
20                stack.pop();
21            }
22            stack.push(c);
23            seen[x] = true;
24        }
25        StringBuilder res = new StringBuilder();
26        for (char c : stack)
27            res.append(c);
28        return res.toString();
29    }
30}