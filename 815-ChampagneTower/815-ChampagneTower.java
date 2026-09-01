// Last updated: 9/1/2026, 11:45:55 AM
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] t=new double[102][102];
        t[0][0]=(double)poured;
        for(int r=0;r<=query_row;r++) {
            for(int c=0;c<=r;c++) {
                if(t[r][c]>1.0) {
                    double e=(t[r][c]-1.0)/2.0;
                    t[r][c]=1.0;
                    t[r+1][c]+=e;
                    t[r+1][c+1]+=e;
                }
            }
        }
        return t[query_row][query_glass];
    }
}