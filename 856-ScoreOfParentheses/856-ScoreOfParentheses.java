// Last updated: 9/9/2026, 2:08:47 PM
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(score); 
                score = 0; 
            } else {

                score = stack.pop() + Math.max(2 * score, 1); 
            }
        }
        return score; 
    }
}