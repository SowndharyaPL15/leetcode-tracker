// Last updated: 10/3/2026, 11:02:48 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        int maxLength = 0;
4        Stack<Integer> stack = new Stack<>();
5        stack.push(-1); 
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '(') {
8                stack.push(i); 
9            } else {
10                stack.pop(); 
11                if (stack.isEmpty()) {
12                    stack.push(i);  
13                } else {
14                    maxLength = Math.max(maxLength, i - stack.peek()); 
15                }
16            }
17        }
18        return maxLength;
19    }
20}