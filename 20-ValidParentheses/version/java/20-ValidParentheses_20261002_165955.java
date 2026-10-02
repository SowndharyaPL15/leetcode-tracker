// Last updated: 10/2/2026, 4:59:55 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for (char ch : s.toCharArray()) {
5            if (ch == '(' || ch == '{' || ch == '[') {
6                stack.push(ch);
7            } 
8            else if (ch == ')' || ch == '}' || ch == ']') {
9                if (stack.isEmpty()) {
10                    return false;
11                }
12                char top = stack.pop();
13                if ((ch == ')' && top != '(') || 
14                    (ch == '}' && top != '{') || 
15                    (ch == ']' && top != '[')) {
16                    return false; 
17                }
18            }
19        }
20        return stack.isEmpty();
21    }
22}