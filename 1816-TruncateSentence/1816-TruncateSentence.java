// Last updated: 9/9/2026, 2:02:21 PM
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