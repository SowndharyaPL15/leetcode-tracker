// Last updated: 9/9/2026, 2:14:08 PM
public class Solution {
    public String convertToTitle(int columnNumber) {
        Solution solution = new Solution(); 
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; 
            result.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}

