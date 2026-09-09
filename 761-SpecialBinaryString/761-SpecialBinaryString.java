// Last updated: 9/9/2026, 2:09:13 PM
class Solution {
    public String makeLargestSpecial(String s) {
        int c=0;
        int i=0;
        List<String> r = new ArrayList<>();
        for(int j=0;j<s.length();j++) {
            if(s.charAt(j)=='1'){
                 c++;
            }
            else{
                c--;
            }
            if(c==0){
                r.add('1'+makeLargestSpecial(s.substring(i+1,j))+'0');
                i=j+1;
            }
        }
        Collections.sort(r,Collections.reverseOrder());
        return String.join("",r);
    }
}