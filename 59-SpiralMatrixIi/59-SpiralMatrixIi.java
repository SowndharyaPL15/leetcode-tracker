// Last updated: 9/9/2026, 2:17:01 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int value=1;
        int[][] matrix=new int[n][n];
        
        for(int row=0;row<(n+1)/2;row++) {  
            for(int col=row;col<n-row;col++) {  
                matrix[row][col]=value++;
            } 
            for(int col=row+1;col<n-row;col++) {  
                matrix[col][n-row-1]=value++;
            } 
            for(int col=n-row-2;col>=row;col--) {  
                matrix[n-row-1][col]=value++;
            } 
            for(int col=n-row-2;col>row;col--) {   
                matrix[col][row]=value++;
            } 
        }
        for(int row=0;row<n;row++) {
            for(int col=0;col<n;col++) {
                System.out.print(matrix[row][col]+"\t");
            }
            System.out.println();
        }
        
        return matrix; 
    }
}