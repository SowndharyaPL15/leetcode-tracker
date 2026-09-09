// Last updated: 9/9/2026, 2:11:04 PM
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>res=new ArrayList<>();
        for (int i=0;i<12;i++) {
            for (int j=0;j<60;j++) {
                int t=Integer.bitCount(i)+Integer.bitCount(j);
                if (t==turnedOn) {
                    String time=i+":"+(j<10?"0"+j:j);
                    res.add(time);
                }
            }
        }
        return res;
    }
}