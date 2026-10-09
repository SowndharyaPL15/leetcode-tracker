// Last updated: 10/9/2026, 11:22:49 PM
1class Solution {
2    public int minInsertions(String s) {
3        int insertions = 0, open = 0;
4        for (int i = 0; i < s.length(); i++) {
5            if (s.charAt(i) == '(') {
6                open++;
7            } else {
8                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
9                    i++; 
10                } else {
11                    insertions++; 
12                }
13                if (open > 0) {
14                    open--; 
15                } else {
16                    insertions++; 
17                }
18            }
19        }
20        return insertions + open * 2; 
21    }
22}