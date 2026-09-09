// Last updated: 9/9/2026, 2:10:38 PM
class Solution {
    public int countSegments(String s) {
        if (s == null||s.length()==0) {
            return 0;
        }
        String[] segments=s.trim().split("\\s+");
        return segments.length==1 && segments[0].isEmpty()?0:segments.length;
    }
}
