// Last updated: 7/27/2026, 2:54:43 PM
1class Solution {
2   public List<String> commonChars(String[] A) {
3        int[] last = count(A[0]);
4        for (int i = 1; i < A.length; i++) {
5            last = intersection(last, count(A[i]));
6        }
7        List<String> arr = new ArrayList<>();
8        for (int i = 0; i < 26; i++) {
9            if (last[i] != 0) {
10                char a = 'a';
11                a += i;
12                String s = String.valueOf(a);
13                while (last[i] > 0) {
14                    arr.add(s);
15                    last[i]--;
16                }
17            }
18        }
19        return arr;
20    }
21    int[] intersection(int[] a, int[] b) {
22        int[] t = new int[26];
23        for (int i = 0; i < 26; i++) {
24            t[i] = Math.min(a[i], b[i]);
25        }
26        return t;
27    }
28    int[] count(String str) {
29        int[] t = new int[26];
30        for (char c : str.toCharArray()) t[c - 'a']++;
31        return t;
32    }
33}