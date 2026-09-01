// Last updated: 9/1/2026, 11:45:43 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] transposed=new int[n][m];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                transposed[j][i]=matrix[i][j];
            }
        }
        return transposed;
    }
}