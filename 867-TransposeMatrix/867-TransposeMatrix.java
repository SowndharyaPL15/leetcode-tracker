// Last updated: 9/9/2026, 2:08:52 PM
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