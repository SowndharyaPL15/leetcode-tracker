// Last updated: 9/1/2026, 11:45:50 AM
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