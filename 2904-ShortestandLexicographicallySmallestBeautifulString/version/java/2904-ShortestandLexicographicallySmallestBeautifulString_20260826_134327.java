// Last updated: 8/26/2026, 1:43:27 PM
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3       String ans ="";
4       int n = s.length();
5       int min = Integer.MAX_VALUE;
6       for(int i = 0; i < n; i++){
7        String temp ="";
8        int len = 0;
9        int c = 0;
10        for(int j = i; j < n; j++){
11            char ch = s.charAt(j);
12            temp += ch;
13            if(ch == '1')
14            c++;
15            len = j - i +1;
16            if(c==k){
17            if(min > len){
18                min = len;
19                ans = temp;
20            }
21            else if( len == min && temp.compareTo(ans)<0)
22                ans = temp;
23                break;
24            }
25         }
26       } 
27       return ans;
28    }
29}