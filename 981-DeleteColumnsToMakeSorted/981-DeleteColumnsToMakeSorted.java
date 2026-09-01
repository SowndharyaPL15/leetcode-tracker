// Last updated: 9/1/2026, 11:45:08 AM
class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int deleteCount = 0;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows - 1; row++) {
                if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    deleteCount++;
                    break; 
                }
            }
        }
        return deleteCount;
    }
}
