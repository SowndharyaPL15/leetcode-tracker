// Last updated: 7/9/2026, 9:52:47 AM
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) continue;
                open--;
            }
            sb.append(c);
        }
        StringBuilder result = new StringBuilder();
        int openToRemove = open;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && openToRemove > 0) {
                openToRemove--;
                continue;
            }
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }
}