// Last updated: 10/4/2026, 10:06:37 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int low = 0; 
4        int high = 0; 
5        for (char ch : s.toCharArray()) {
6            if (ch == '(') {
7                low++;
8                high++;
9            } else if (ch == ')') {
10                low--;
11                high--;
12            } else { 
13                low--; 
14                high++; 
15            }
16            if (high < 0) {
17                return false;
18            }
19            low = Math.max(low, 0);
20        }
21        return low == 0;
22    }
23}