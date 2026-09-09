// Last updated: 9/9/2026, 2:08:05 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0; 
        int moves = 0;  
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else {
                balance--; 
            }
            if (balance < 0) {
                moves++; 
                balance = 0; 
            }
        }
        return moves + balance; 
    }
}