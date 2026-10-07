// Last updated: 10/7/2026, 1:51:21 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int balance = 0; 
4        int moves = 0;  
5        for (char ch : s.toCharArray()) {
6            if (ch == '(') {
7                balance++;
8            } else {
9                balance--; 
10            }
11            if (balance < 0) {
12                moves++; 
13                balance = 0; 
14            }
15        }
16        return moves + balance; 
17    }
18}