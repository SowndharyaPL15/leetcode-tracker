// Last updated: 9/9/2026, 1:58:52 PM
1class Solution {
2    public boolean isNumber(String s) {
3        boolean isdot = false, ise = false, nums = false;
4        for (int i = 0; i < s.length(); i++) {
5            char c = s.charAt(i);
6            if (Character.isDigit(c)) nums = true;
7            else if (c == '+' || c == '-') {
8                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
9            } 
10            else if (c == 'e' || c == 'E') {
11                if (ise || !nums) return false;
12                ise = true;
13                nums = false;
14            } 
15            else if (c == '.') {
16                if (isdot || ise) return false;
17                isdot = true;
18            } 
19            else return false;
20        }
21        return nums;
22    }
23}