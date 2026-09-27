// Last updated: 9/27/2026, 7:42:08 PM
1import java.util.Stack;
2
3class Solution {
4    public String reverseParentheses(String s) {
5        Stack<StringBuilder> stack = new Stack<>();
6        StringBuilder current = new StringBuilder();
7        
8        for (char c : s.toCharArray()) {
9            if (c == '(') {
10                stack.push(current);
11                current = new StringBuilder();
12            } else if (c == ')') {
13                StringBuilder last = stack.pop();
14                current.reverse();
15                last.append(current);
16                current = last;
17            } else {
18                current.append(c);
19            }
20        }
21        
22        return current.toString();
23    }
24}