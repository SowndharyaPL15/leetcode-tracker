// Last updated: 8/24/2026, 2:26:49 PM
1class Solution
2{
3    boolean isPalindrome(String s)
4    {
5        String s2 = new StringBuilder(s).reverse().toString();
6        return s.equals(s2);
7    }
8
9    void getAllParts(String s, List<List<String>> ans, List<String> parts)
10    {
11        if (s.length() == 0)
12        {
13            ans.add(new ArrayList<>(parts));  
14            return;
15        }
16        for (int i = 0; i < s.length(); i++)
17        {
18            String part = s.substring(0, i + 1);
19            if (isPalindrome(part))
20            {
21                parts.add(part);
22                getAllParts(s.substring(i + 1), ans, parts);
23                parts.remove(parts.size() - 1);  
24            }
25        }
26    }
27
28    public List<List<String>> partition(String s)
29    {
30        List<List<String>> ans = new ArrayList<>();
31        List<String> parts = new ArrayList<>();
32        getAllParts(s, ans, parts);
33        return ans;
34    }
35}