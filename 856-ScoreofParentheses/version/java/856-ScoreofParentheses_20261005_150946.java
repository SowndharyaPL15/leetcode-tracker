// Last updated: 10/5/2026, 3:09:46 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> stack = new Stack<>();
4        int score = 0;
5        for (char ch : s.toCharArray()) {
6            if (ch == '(') {
7                stack.push(score); 
8                score = 0; 
9            } else {
10
11                score = stack.pop() + Math.max(2 * score, 1); 
12            }
13        }
14        return score; 
15    }
16}