// Last updated: 10/9/2026, 11:21:40 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder result = new StringBuilder();
4        int balance = 0;
5        for (char ch : s.toCharArray()) {
6            if (ch == '(') {
7                if (balance > 0) {
8                    result.append(ch); 
9                }
10                balance++; 
11            } else if (ch == ')') {
12                if (balance > 1) {
13                    result.append(ch); 
14                }
15                balance--;
16            }
17        }
18        return result.toString(); 
19    }
20}