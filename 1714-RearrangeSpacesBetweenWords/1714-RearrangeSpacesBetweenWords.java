// Last updated: 7/9/2026, 9:52:06 AM
class Solution {
    public String reorderSpaces(String text) {
        int c=0;
        for(char ch:text.toCharArray()){
            if(ch==' '){
                c++;
            }
        }
        String a[]=text.trim().split("\\s+");
        int m=a.length;
        if(m == 1) {
            return a[0] + " ".repeat(c);
        }
        int b=c/(m-1);
        int d=c%(m-1);
        StringBuilder sb = new StringBuilder();
        String g = " ".repeat(b);
        for (int i = 0; i < m; i++) {
            sb.append(a[i]);
            if (i < m - 1) {
                sb.append(g);
            }
        }
        sb.append(" ".repeat(d));
        return sb.toString();
    }
}