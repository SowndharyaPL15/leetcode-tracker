// Last updated: 7/9/2026, 9:48:29 AM
class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int res=0;
        for(int i=0;i<n;i++){
            int[] f = new int[26];
            int max =0;
            int d =0;
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                int idx= ch-'a';
                if(f[idx]==0){
                    d++;
                }
                f[idx]+=1;
                max=Math.max(max,f[idx]);
                if(max*d==j-i+1){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}