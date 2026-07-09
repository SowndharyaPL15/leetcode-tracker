// Last updated: 7/9/2026, 9:51:41 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String a[]=s.split(" ");
        String b="";
        for(int i=0;i<k;i++){
            b+=a[i];
            if(i<k-1){
                b+=" ";
            }
        }
        return b;
    }
}