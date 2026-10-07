// Last updated: 10/7/2026, 2:44:24 PM
1class Solution {
2    public List<String> removeInvalidParentheses(String s) {
3        List<String> ans = new ArrayList<>();
4        remove(s, ans, 0, 0, new char[]{'(', ')'});
5        return ans;
6    }
7
8    void remove(String s, List<String> ans, int i, int j, char[] p) {
9        int count = 0;
10
11        for (int k = i; k < s.length(); k++) {
12            if (s.charAt(k) == p[0]) count++;
13            if (s.charAt(k) == p[1]) count--;
14
15            if (count < 0) {
16                for (int x = j; x <= k; x++) {
17                    if (s.charAt(x) == p[1] &&
18                        (x == j || s.charAt(x - 1) != p[1])) {
19
20                        remove(s.substring(0, x) +
21                               s.substring(x + 1),
22                               ans, k, x, p);
23                    }
24                }
25                return;
26            }
27        }
28
29        String rev = new StringBuilder(s).reverse().toString();
30
31        if (p[0] == '(')
32            remove(rev, ans, 0, 0, new char[]{')', '('});
33        else
34            ans.add(rev);
35    }
36}