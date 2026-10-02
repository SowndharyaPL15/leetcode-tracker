// Last updated: 10/2/2026, 9:30:17 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> list = new ArrayList<String>();
4        backtrack(list, "", 0, 0, n);
5        return list;
6    }
7    public void backtrack(List<String> list, String str, int open, int close, int max){
8        if(str.length() == max*2){
9            list.add(str);
10            return;
11        }
12        if(open < max)
13            backtrack(list, str+"(", open+1, close, max);
14        if(close < open)
15            backtrack(list, str+")", open, close+1, max);
16    }
17
18}