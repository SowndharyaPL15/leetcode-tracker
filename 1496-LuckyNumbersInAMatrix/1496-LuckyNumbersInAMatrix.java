// Last updated: 7/9/2026, 9:52:31 AM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int minVal = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                result.add(minVal);
            }
        }
        return result;
    }
}
   