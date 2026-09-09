// Last updated: 9/9/2026, 2:14:02 PM
public class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        Solution solution = new Solution();
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            columnNumber = columnNumber * 26 + value;
        }
        return columnNumber;
    }
}

  