// Last updated: 7/9/2026, 9:53:29 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch); 
                }
                balance++; 
            } else if (ch == ')') {
                if (balance > 1) {
                    result.append(ch); 
                }
                balance--;
            }
        }
        return result.toString(); 
    }
}